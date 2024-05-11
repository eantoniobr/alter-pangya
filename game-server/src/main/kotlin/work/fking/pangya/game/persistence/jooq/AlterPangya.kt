/*
 * This file is generated by jOOQ.
 */
package work.fking.pangya.game.persistence.jooq


import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl

import work.fking.pangya.game.persistence.jooq.tables.Account
import work.fking.pangya.game.persistence.jooq.tables.Achievement
import work.fking.pangya.game.persistence.jooq.tables.AchievementMilestone
import work.fking.pangya.game.persistence.jooq.tables.FlywaySchemaHistory
import work.fking.pangya.game.persistence.jooq.tables.PlayerAchievement
import work.fking.pangya.game.persistence.jooq.tables.PlayerAchievementMilestone
import work.fking.pangya.game.persistence.jooq.tables.PlayerCaddie
import work.fking.pangya.game.persistence.jooq.tables.PlayerCharacter
import work.fking.pangya.game.persistence.jooq.tables.PlayerEquipment
import work.fking.pangya.game.persistence.jooq.tables.PlayerInventoryCard
import work.fking.pangya.game.persistence.jooq.tables.PlayerInventoryItem
import work.fking.pangya.game.persistence.jooq.tables.PlayerStatistics


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AlterPangya : SchemaImpl("alter_pangya", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>alter_pangya</code>
         */
        val ALTER_PANGYA: AlterPangya = AlterPangya()
    }

    /**
     * The table <code>alter_pangya.account</code>.
     */
    val ACCOUNT: Account get() = Account.ACCOUNT

    /**
     * The table <code>alter_pangya.achievement</code>.
     */
    val ACHIEVEMENT: Achievement get() = Achievement.ACHIEVEMENT

    /**
     * The table <code>alter_pangya.achievement_milestone</code>.
     */
    val ACHIEVEMENT_MILESTONE: AchievementMilestone get() = AchievementMilestone.ACHIEVEMENT_MILESTONE

    /**
     * The table <code>alter_pangya.flyway_schema_history</code>.
     */
    val FLYWAY_SCHEMA_HISTORY: FlywaySchemaHistory get() = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY

    /**
     * The table <code>alter_pangya.player_achievement</code>.
     */
    val PLAYER_ACHIEVEMENT: PlayerAchievement get() = PlayerAchievement.PLAYER_ACHIEVEMENT

    /**
     * The table <code>alter_pangya.player_achievement_milestone</code>.
     */
    val PLAYER_ACHIEVEMENT_MILESTONE: PlayerAchievementMilestone get() = PlayerAchievementMilestone.PLAYER_ACHIEVEMENT_MILESTONE

    /**
     * The table <code>alter_pangya.player_caddie</code>.
     */
    val PLAYER_CADDIE: PlayerCaddie get() = PlayerCaddie.PLAYER_CADDIE

    /**
     * The table <code>alter_pangya.player_character</code>.
     */
    val PLAYER_CHARACTER: PlayerCharacter get() = PlayerCharacter.PLAYER_CHARACTER

    /**
     * The table <code>alter_pangya.player_equipment</code>.
     */
    val PLAYER_EQUIPMENT: PlayerEquipment get() = PlayerEquipment.PLAYER_EQUIPMENT

    /**
     * The table <code>alter_pangya.player_inventory_card</code>.
     */
    val PLAYER_INVENTORY_CARD: PlayerInventoryCard get() = PlayerInventoryCard.PLAYER_INVENTORY_CARD

    /**
     * The table <code>alter_pangya.player_inventory_item</code>.
     */
    val PLAYER_INVENTORY_ITEM: PlayerInventoryItem get() = PlayerInventoryItem.PLAYER_INVENTORY_ITEM

    /**
     * The table <code>alter_pangya.player_statistics</code>.
     */
    val PLAYER_STATISTICS: PlayerStatistics get() = PlayerStatistics.PLAYER_STATISTICS

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Account.ACCOUNT,
        Achievement.ACHIEVEMENT,
        AchievementMilestone.ACHIEVEMENT_MILESTONE,
        FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
        PlayerAchievement.PLAYER_ACHIEVEMENT,
        PlayerAchievementMilestone.PLAYER_ACHIEVEMENT_MILESTONE,
        PlayerCaddie.PLAYER_CADDIE,
        PlayerCharacter.PLAYER_CHARACTER,
        PlayerEquipment.PLAYER_EQUIPMENT,
        PlayerInventoryCard.PLAYER_INVENTORY_CARD,
        PlayerInventoryItem.PLAYER_INVENTORY_ITEM,
        PlayerStatistics.PLAYER_STATISTICS
    )
}