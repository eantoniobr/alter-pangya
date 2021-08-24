package work.fking.pangya.game.packet.inbound;

import io.netty.buffer.ByteBuf;
import work.fking.pangya.game.packet.handler.Unknown320PacketHandler;
import work.fking.pangya.networking.protocol.InboundPacket;
import work.fking.pangya.networking.protocol.PacketHandledBy;
import work.fking.pangya.networking.protocol.PacketId;

@PacketId(0x140)
@PacketHandledBy(Unknown320PacketHandler.class)
public record Unknown320Packet() implements InboundPacket {

    public static InboundPacket decode(ByteBuf buffer) {
        // sent when the shop is open
        return new Unknown320Packet();
    }
}
