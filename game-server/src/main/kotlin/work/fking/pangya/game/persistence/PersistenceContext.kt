package work.fking.pangya.game.persistence

import org.jooq.DSLContext

data class PersistenceContext(
    val jooq: DSLContext?,
    val playerRepository: PlayerRepository = InMemoryPlayerRepository(),
    val characterRepository: CharacterRepository = InMemoryCharacterRepository(),
    val caddieRepository: CaddieRepository = InMemoryCaddieRepository(),
    val inventoryRepository: InventoryRepository = InMemoryInventoryRepository(),
    val equipmentRepository: EquipmentRepository = InMemoryEquipmentRepository(),
    val statisticsRepository: StatisticsRepository = InMemoryStatisticsRepository(),
    val achievementsRepository: AchievementsRepository = InMemoryAchievementsRepository()
) {

    /**
     * Returns a transactional context without an active transaction.
     */
    fun noTxContext() = TransactionalContext(jooq)

    /**
     * Returns a transactional context with an active transaction.
     */
    fun transactional(transactional: (txContext: TransactionalContext) -> Unit) {
        if (jooq != null) {
            jooq.transaction { tx -> transactional(TransactionalContext(tx.dsl())) }
        } else {
            transactional(TransactionalContext())
        }
    }
}

data class TransactionalContext(private val jooq: DSLContext? = null) {
    fun jooq(): DSLContext = jooq ?: throw IllegalStateException("no jooq context available")
}