/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tslic.discogs.Discogs;
import tslic.discogs.Indexes;
import tslic.discogs.Keys;
import tslic.discogs.tables.records.LabelsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Labels extends TableImpl<LabelsRecord> {

    private static final long serialVersionUID = -469704047;

    /**
     * The reference instance of <code>discogs.labels</code>
     */
    public static final Labels LABELS = new Labels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LabelsRecord> getRecordType() {
        return LabelsRecord.class;
    }

    /**
     * The column <code>discogs.labels.id</code>.
     */
    public final TableField<LabelsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.labels.contact_info</code>.
     */
    public final TableField<LabelsRecord, String> CONTACT_INFO = createField("contact_info", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>discogs.labels.data_quality</code>.
     */
    public final TableField<LabelsRecord, String> DATA_QUALITY = createField("data_quality", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.labels.name</code>.
     */
    public final TableField<LabelsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.labels.profile</code>.
     */
    public final TableField<LabelsRecord, String> PROFILE = createField("profile", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>discogs.labels</code> table reference
     */
    public Labels() {
        this(DSL.name("labels"), null);
    }

    /**
     * Create an aliased <code>discogs.labels</code> table reference
     */
    public Labels(String alias) {
        this(DSL.name(alias), LABELS);
    }

    /**
     * Create an aliased <code>discogs.labels</code> table reference
     */
    public Labels(Name alias) {
        this(alias, LABELS);
    }

    private Labels(Name alias, Table<LabelsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Labels(Name alias, Table<LabelsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Labels(Table<O> child, ForeignKey<O, LabelsRecord> key) {
        super(child, key, LABELS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Discogs.DISCOGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LABELS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LabelsRecord> getPrimaryKey() {
        return Keys.LABELS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LabelsRecord>> getKeys() {
        return Arrays.<UniqueKey<LabelsRecord>>asList(Keys.LABELS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Labels as(String alias) {
        return new Labels(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Labels as(Name alias) {
        return new Labels(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Labels rename(String name) {
        return new Labels(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Labels rename(Name name) {
        return new Labels(name, null);
    }
}
