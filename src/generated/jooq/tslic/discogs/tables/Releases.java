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
import tslic.discogs.tables.records.ReleasesRecord;


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
public class Releases extends TableImpl<ReleasesRecord> {

    private static final long serialVersionUID = 188927709;

    /**
     * The reference instance of <code>discogs.releases</code>
     */
    public static final Releases RELEASES = new Releases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleasesRecord> getRecordType() {
        return ReleasesRecord.class;
    }

    /**
     * The column <code>discogs.releases.id</code>.
     */
    public final TableField<ReleasesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.releases.country</code>.
     */
    public final TableField<ReleasesRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.releases.data_quality</code>.
     */
    public final TableField<ReleasesRecord, String> DATA_QUALITY = createField("data_quality", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.releases.master_id</code>.
     */
    public final TableField<ReleasesRecord, Integer> MASTER_ID = createField("master_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>discogs.releases.notes</code>.
     */
    public final TableField<ReleasesRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>discogs.releases.released</code>.
     */
    public final TableField<ReleasesRecord, String> RELEASED = createField("released", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.releases.status</code>.
     */
    public final TableField<ReleasesRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>discogs.releases.title</code>.
     */
    public final TableField<ReleasesRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>discogs.releases</code> table reference
     */
    public Releases() {
        this(DSL.name("releases"), null);
    }

    /**
     * Create an aliased <code>discogs.releases</code> table reference
     */
    public Releases(String alias) {
        this(DSL.name(alias), RELEASES);
    }

    /**
     * Create an aliased <code>discogs.releases</code> table reference
     */
    public Releases(Name alias) {
        this(alias, RELEASES);
    }

    private Releases(Name alias, Table<ReleasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Releases(Name alias, Table<ReleasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Releases(Table<O> child, ForeignKey<O, ReleasesRecord> key) {
        super(child, key, RELEASES);
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
        return Arrays.<Index>asList(Indexes.RELEASES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReleasesRecord> getPrimaryKey() {
        return Keys.RELEASES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReleasesRecord>> getKeys() {
        return Arrays.<UniqueKey<ReleasesRecord>>asList(Keys.RELEASES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Releases as(String alias) {
        return new Releases(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Releases as(Name alias) {
        return new Releases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Releases rename(String name) {
        return new Releases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Releases rename(Name name) {
        return new Releases(name, null);
    }
}
