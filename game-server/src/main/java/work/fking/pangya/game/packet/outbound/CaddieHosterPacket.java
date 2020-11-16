package work.fking.pangya.game.packet.outbound;

import io.netty.buffer.ByteBuf;
import work.fking.pangya.networking.protocol.OutboundPacket;

public class CaddieHosterPacket implements OutboundPacket {

    private static final int ID = 112;

    @Override
    public void encode(ByteBuf target) {
        target.writeShortLE(ID);

        target.writeShortLE(0); // count
        target.writeShortLE(0); // count

        // caddie
        //        target.writeIntLE(0);
        //        target.writeIntLE(0);
    }
}