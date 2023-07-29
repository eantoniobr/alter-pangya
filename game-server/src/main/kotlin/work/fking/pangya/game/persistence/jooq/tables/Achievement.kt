/*
 * This file is generated by jOOQ.
 */
package work.fking.pangya.game.persistence.jooq.tables


import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import work.fking.pangya.game.persistence.jooq.Public
import work.fking.pangya.game.persistence.jooq.keys.ACHIEVEMENT_PKEY
import work.fking.pangya.game.persistence.jooq.tables.records.AchievementRecord


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Achievement(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, AchievementRecord>?,
    aliased: Table<AchievementRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<AchievementRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.achievement</code>
         */
        val ACHIEVEMENT: Achievement = Achievement()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<AchievementRecord> = AchievementRecord::class.java

    /**
     * The column <code>public.achievement.iff_id</code>.
     */
    val IFF_ID: TableField<AchievementRecord, Int?> = createField(DSL.name("iff_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.achievement.completed_with_milestone</code>.
     */
    val COMPLETED_WITH_MILESTONE: TableField<AchievementRecord, Int?> = createField(DSL.name("completed_with_milestone"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.achievement.category</code>.
     */
    val CATEGORY: TableField<AchievementRecord, Int?> = createField(DSL.name("category"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<AchievementRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<AchievementRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.achievement</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.achievement</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.achievement</code> table reference
     */
    constructor(): this(DSL.name("achievement"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, AchievementRecord>): this(Internal.createPathAlias(child, key), child, key, ACHIEVEMENT, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<AchievementRecord> = ACHIEVEMENT_PKEY
    override fun `as`(alias: String): Achievement = Achievement(DSL.name(alias), this)
    override fun `as`(alias: Name): Achievement = Achievement(alias, this)
    override fun `as`(alias: Table<*>): Achievement = Achievement(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Achievement = Achievement(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Achievement = Achievement(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Achievement = Achievement(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<Int?, Int?, Int?> = super.fieldsRow() as Row3<Int?, Int?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
