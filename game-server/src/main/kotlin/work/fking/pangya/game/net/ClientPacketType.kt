package work.fking.pangya.game.net

import work.fking.pangya.game.packet.handler.EquipmentUpdatePacketHandler
import work.fking.pangya.game.packet.handler.JoinLobbyPacketHandler
import work.fking.pangya.game.packet.handler.LeaveLobbyPacketHandler
import work.fking.pangya.game.packet.handler.LockerInventoryRequestPacketHandler
import work.fking.pangya.game.packet.handler.LoginBonusClaimPacketHandler
import work.fking.pangya.game.packet.handler.LoginBonusStatusPacketHandler
import work.fking.pangya.game.packet.handler.MyRoomOpenPacketHandler
import work.fking.pangya.game.packet.handler.MyRoomOpenedPacketHandler
import work.fking.pangya.game.packet.handler.PapelShopPlayPacketHandler
import work.fking.pangya.game.packet.handler.RareShopOpenPacketHandler
import work.fking.pangya.game.packet.handler.SelectChannelPacketHandler
import work.fking.pangya.game.packet.handler.UpdateChatMacrosPacketHandler
import work.fking.pangya.game.packet.handler.UserProfileRequestPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerHoleFinishPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchFinishPlayerPreviewPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchHoleStartPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerRotateAimPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerShotCommitPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerTurnEndPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerShotStartPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerShotSyncPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchPlayerUseItemPacketHandler
import work.fking.pangya.game.packet.handler.match.MatchTourneyShotPacketHandler
import work.fking.pangya.game.packet.handler.match.StartGamePacketHandler
import work.fking.pangya.game.packet.handler.room.CreateRoomPacketHandler
import work.fking.pangya.game.packet.handler.room.LeaveRoomPacketHandler
import work.fking.pangya.game.packet.handler.room.RoomSettingsUpdatePacketHandler

enum class ClientPacketType(
    private val id: Int,
    private val handler: ClientPacketHandler = ClientPacketHandler { _, _, _ -> }
) {
    SELECT_CHANNEL(0x4, SelectChannelPacketHandler()),
    MATCH_FINAL_STATS(0x6),
    ROOM_CREATE(0x8, CreateRoomPacketHandler()),
    ROOM_SETTINGS_UPDATE(0xa, RoomSettingsUpdatePacketHandler()),
    EQUIPMENT_UPDATE_IN_LOBBY(0xb, EquipmentUpdatePacketHandler()),
    EQUIPMENT_UPDATE_IN_GAME_ROOM(0xc, EquipmentUpdatePacketHandler()),
    START_MATCH(0xe, StartGamePacketHandler()),
    ROOM_LEAVE(0xf, LeaveRoomPacketHandler()),
    MATCH_HOLE_LOAD_FINISHED(0x11),
    MATCH_PLAYER_SHOT_COMMIT(0x12, MatchPlayerShotCommitPacketHandler()),
    MATCH_PLAYER_ROTATE_AIM(0x13, MatchPlayerRotateAimPacketHandler()),
    MATCH_PLAYER_SHOT_START(0x14, MatchPlayerShotStartPacketHandler()),
    MATCH_PLAYER_POWER_TOGGLE(0x15),
    MATCH_PLAYER_CHANGE_CLUB(0x16),
    MATCH_PLAYER_USE_ITEM(0x17, MatchPlayerUseItemPacketHandler()),
    MATCH_HOLE_START(0x1a, MatchHoleStartPacketHandler()),
    MATCH_PLAYER_SHOT_SYNC(0x1b, MatchPlayerShotSyncPacketHandler()),
    MATCH_PLAYER_SHOT_END(0x1c, MatchPlayerTurnEndPacketHandler()),
    EQUIPMENT_UPDATE_IN_MY_ROOM(0x20, EquipmentUpdatePacketHandler()),
    MATCH_PLAYER_TURN_START(0x22),
    USER_PROFILE_REQUEST(0x2f, UserProfileRequestPacketHandler()),
    MATCH_PLAYER_HOLE_FINISH(0x31, MatchPlayerHoleFinishPacketHandler()),
    MATCH_FINISH_PLAYER_PREVIEW(0x34, MatchFinishPlayerPreviewPacketHandler()),
    MATCH_PLAYER_SHOT_ARROW(0x42),
    PLAYER_LOAD_PROGRESS(0x48),
    LOUNGE_USER_ACTION(0x63),
    UPDATE_MACROS(0x69, UpdateChatMacrosPacketHandler()),
    JOIN_LOBBY(0x81, JoinLobbyPacketHandler()),
    LEAVE_LOBBY(0x82, LeaveLobbyPacketHandler()),
    RARE_SHOP_OPEN(0x98, RareShopOpenPacketHandler()),
    MY_ROOM_OPEN(0xb5, MyRoomOpenPacketHandler()),
    MY_ROOM_OPENED(0xb7, MyRoomOpenedPacketHandler()),
    UNKNOWN_9C(0x9c),
    UNKNOWN_C1(0xC1),
    LOCKER_INVENTORY_REQUEST(0xd3, LockerInventoryRequestPacketHandler()),
    UNKNOWN_140(0x140),
    ACHIEVEMENT_STATUS_REQUEST(0x157),
    MATCH_PLAYER_TOURNEY_SHOT(0x12f, MatchTourneyShotPacketHandler()),
    PAPEL_SHOP_PLAY(0x14b, PapelShopPlayPacketHandler()),
    LOGIN_BONUS_INFO(0x16e, LoginBonusStatusPacketHandler()),
    LOGIN_BONUS_CLAIM(0x16f, LoginBonusClaimPacketHandler());

    fun id(): Int {
        return id
    }

    fun handler(): ClientPacketHandler {
        return handler
    }
}