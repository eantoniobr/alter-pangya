package work.fking.pangya.game;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import work.fking.pangya.common.Rand;
import work.fking.pangya.game.packet.outbound.HelloPacket;
import work.fking.pangya.networking.crypt.PangCrypt;
import work.fking.pangya.networking.protocol.InboundPacketDispatcher;
import work.fking.pangya.networking.protocol.Protocol;
import work.fking.pangya.networking.protocol.ProtocolDecoder;
import work.fking.pangya.networking.protocol.ProtocolEncoder;

import java.nio.ByteOrder;

@Sharable
public class HelloHandler extends ChannelInboundHandlerAdapter {

    private static final Logger LOGGER = LogManager.getLogger(HelloHandler.class);

    private final Protocol protocol;
    private final InboundPacketDispatcher packetDispatcher;

    private HelloHandler(Protocol protocol, InboundPacketDispatcher packetDispatcher) {
        this.protocol = protocol;
        this.packetDispatcher = packetDispatcher;
    }

    public static HelloHandler create(Protocol protocol, InboundPacketDispatcher packetDispatcher) {
        return new HelloHandler(protocol, packetDispatcher);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        int cryptKey = Rand.maxInclusive(PangCrypt.CRYPT_KEY_MAX);
        LOGGER.debug("New connection from {}, selected cryptKey={}", ctx.channel().remoteAddress(), cryptKey);
        ctx.writeAndFlush(HelloPacket.create(cryptKey));
        reorderPipeline(ctx.pipeline(), cryptKey);
    }

    private void reorderPipeline(ChannelPipeline pipeline, int cryptKey) {
        pipeline.remove(this);
        pipeline.replace("encoder", "encoder", ProtocolEncoder.create(cryptKey));
        pipeline.addLast("framer", new LengthFieldBasedFrameDecoder(ByteOrder.LITTLE_ENDIAN, 10000, 1, 2, 1, 0, true));
        pipeline.addLast("decoder", ProtocolDecoder.create(protocol, cryptKey));
        pipeline.addLast("packetDispatcher", packetDispatcher);
    }
}
