package work.fking.pangya.game.packet.handler

import io.netty.buffer.ByteBuf
import work.fking.pangya.game.GameServer
import work.fking.pangya.game.net.ClientPacketHandler
import work.fking.pangya.game.packet.outbound.UserStatisticsReplies
import work.fking.pangya.game.player.Player

class UserProfileRequestPacketHandler : ClientPacketHandler {

    override fun handle(server: GameServer, player: Player, packet: ByteBuf) {
        val playerUid = packet.readIntLE()
        val type = packet.readByte()

        if (type.toInt() == 5) {
            player.write(UserStatisticsReplies.username(type.toInt(), player))
            player.write(UserStatisticsReplies.character(player))
            player.write(UserStatisticsReplies.equipment(type.toInt(), player))
        }
        player.write(UserStatisticsReplies.userStatistic(type.toInt(), playerUid))
        player.write(UserStatisticsReplies.courseStatistic(type.toInt(), playerUid))
        player.write(UserStatisticsReplies.trophies(type.toInt(), playerUid))
        player.write(UserStatisticsReplies.ack(true, type.toInt(), playerUid))
        player.flush()
    }
}