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
import tslic.discogs.tables.records.ArtistAliasesRecord;


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
public class ArtistAliases extends TableImpl<ArtistAliasesRecord> {

    private static final long serialVersionUID = -983317287;

    /**
     * The reference instance of <code>discogs.artist_aliases</code>
     */
    public static final ArtistAliases ARTIST_ALIASES = new ArtistAliases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArtistAliasesRecord> getRecordType() {
        return ArtistAliasesRecord.class;
    }

    /**
     * The column <code>discogs.artist_aliases.artist_id</code>.
     */
    public final TableField<ArtistAliasesRecord, Integer> ARTIST_ID = createField("artist_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.artist_aliases.ofst</code>.
     */
    public final TableField<ArtistAliasesRecord, Integer> OFST = createField("ofst", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.artist_aliases.artist2_id</code>.
     */
    public final TableField<ArtistAliasesRecord, Integer> ARTIST2_ID = createField("artist2_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>discogs.artist_aliases.name</code>.
     */
    public final TableField<ArtistAliasesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>discogs.artist_aliases</code> table reference
     */
    public ArtistAliases() {
        this(DSL.name("artist_aliases"), null);
    }

    /**
     * Create an aliased <code>discogs.artist_aliases</code> table reference
     */
    public ArtistAliases(String alias) {
        this(DSL.name(alias), ARTIST_ALIASES);
    }

    /**
     * Create an aliased <code>discogs.artist_aliases</code> table reference
     */
    public ArtistAliases(Name alias) {
        this(alias, ARTIST_ALIASES);
    }

    private ArtistAliases(Name alias, Table<ArtistAliasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ArtistAliases(Name alias, Table<ArtistAliasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ArtistAliases(Table<O> child, ForeignKey<O, ArtistAliasesRecord> key) {
        super(child, key, ARTIST_ALIASES);
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
        return Arrays.<Index>asList(Indexes.ARTIST_ALIASES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ArtistAliasesRecord> getPrimaryKey() {
        return Keys.ARTIST_ALIASES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ArtistAliasesRecord>> getKeys() {
        return Arrays.<UniqueKey<ArtistAliasesRecord>>asList(Keys.ARTIST_ALIASES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ArtistAliasesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ArtistAliasesRecord, ?>>asList(Keys.ARTIST_ALIASES__ARTISTS_ID_FKEY);
    }

    public Artists artists() {
        return new Artists(this, Keys.ARTIST_ALIASES__ARTISTS_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtistAliases as(String alias) {
        return new ArtistAliases(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtistAliases as(Name alias) {
        return new ArtistAliases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ArtistAliases rename(String name) {
        return new ArtistAliases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ArtistAliases rename(Name name) {
        return new ArtistAliases(name, null);
    }
}
