package work.fking.pangya.login.packet.inbound;

import io.netty.buffer.ByteBuf;
import work.fking.pangya.login.packet.handler.CheckNicknamePacketHandler;
import work.fking.pangya.networking.protocol.InboundPacket;
import work.fking.pangya.networking.protocol.Packet;
import work.fking.pangya.networking.protocol.PacketFactory;
import work.fking.pangya.networking.protocol.ProtocolUtils;

@Packet(id = 0x7, handledBy = CheckNicknamePacketHandler.class)
public record CheckNicknamePacket(String nickname) implements InboundPacket {

    @PacketFactory
    public static InboundPacket decode(ByteBuf buffer) {
        String nickname = ProtocolUtils.readPString(buffer);

        return new CheckNicknamePacket(nickname);
    }
}
