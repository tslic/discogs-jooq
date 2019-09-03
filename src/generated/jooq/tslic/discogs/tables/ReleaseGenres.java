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
import tslic.discogs.tables.records.ReleaseGenresRecord;


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
public class ReleaseGenres extends TableImpl<ReleaseGenresRecord> {

    private static final long serialVersionUID = 1702902724;

    /**
     * The reference instance of <code>discogs.release_genres</code>
     */
    public static final ReleaseGenres RELEASE_GENRES = new ReleaseGenres();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleaseGenresRecord> getRecordType() {
        return ReleaseGenresRecord.class;
    }

    /**
     * The column <code>discogs.release_genres.release_id</code>.
     */
    public final TableField<ReleaseGenresRecord, Integer> RELEASE_ID = createField("release_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.release_genres.ofst</code>.
     */
    public final TableField<ReleaseGenresRecord, Integer> OFST = createField("ofst", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.release_genres.genre</code>.
     */
    public final TableField<ReleaseGenresRecord, String> GENRE = createField("genre", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>discogs.release_genres</code> table reference
     */
    public ReleaseGenres() {
        this(DSL.name("release_genres"), null);
    }

    /**
     * Create an aliased <code>discogs.release_genres</code> table reference
     */
    public ReleaseGenres(String alias) {
        this(DSL.name(alias), RELEASE_GENRES);
    }

    /**
     * Create an aliased <code>discogs.release_genres</code> table reference
     */
    public ReleaseGenres(Name alias) {
        this(alias, RELEASE_GENRES);
    }

    private ReleaseGenres(Name alias, Table<ReleaseGenresRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReleaseGenres(Name alias, Table<ReleaseGenresRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReleaseGenres(Table<O> child, ForeignKey<O, ReleaseGenresRecord> key) {
        super(child, key, RELEASE_GENRES);
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
        return Arrays.<Index>asList(Indexes.RELEASE_GENRES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReleaseGenresRecord> getPrimaryKey() {
        return Keys.RELEASE_GENRES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReleaseGenresRecord>> getKeys() {
        return Arrays.<UniqueKey<ReleaseGenresRecord>>asList(Keys.RELEASE_GENRES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReleaseGenresRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReleaseGenresRecord, ?>>asList(Keys.RELEASE_GENRES__RELEASES_ID_FKEY);
    }

    public Releases releases() {
        return new Releases(this, Keys.RELEASE_GENRES__RELEASES_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseGenres as(String alias) {
        return new ReleaseGenres(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseGenres as(Name alias) {
        return new ReleaseGenres(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseGenres rename(String name) {
        return new ReleaseGenres(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseGenres rename(Name name) {
        return new ReleaseGenres(name, null);
    }
}