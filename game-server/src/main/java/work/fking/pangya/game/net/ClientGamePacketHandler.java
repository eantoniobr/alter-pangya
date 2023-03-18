package work.fking.pangya.game.net;

import io.netty.buffer.ByteBuf;
import work.fking.pangya.game.GameServer;
import work.fking.pangya.game.Player;

public interface ClientGamePacketHandler {

    void handle(GameServer server, Player player, ByteBuf packet);
}
