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
import tslic.discogs.tables.records.ReleaseVideosRecord;


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
public class ReleaseVideos extends TableImpl<ReleaseVideosRecord> {

    private static final long serialVersionUID = -1708720299;

    /**
     * The reference instance of <code>discogs.release_videos</code>
     */
    public static final ReleaseVideos RELEASE_VIDEOS = new ReleaseVideos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleaseVideosRecord> getRecordType() {
        return ReleaseVideosRecord.class;
    }

    /**
     * The column <code>discogs.release_videos.release_id</code>.
     */
    public final TableField<ReleaseVideosRecord, Integer> RELEASE_ID = createField("release_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.release_videos.ofst</code>.
     */
    public final TableField<ReleaseVideosRecord, Integer> OFST = createField("ofst", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>discogs.release_videos.src</code>.
     */
    public final TableField<ReleaseVideosRecord, String> SRC = createField("src", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>discogs.release_videos.description</code>.
     */
    public final TableField<ReleaseVideosRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.release_videos.duration</code>.
     */
    public final TableField<ReleaseVideosRecord, String> DURATION = createField("duration", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>discogs.release_videos.embed</code>.
     */
    public final TableField<ReleaseVideosRecord, Boolean> EMBED = createField("embed", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>discogs.release_videos.title</code>.
     */
    public final TableField<ReleaseVideosRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>discogs.release_videos</code> table reference
     */
    public ReleaseVideos() {
        this(DSL.name("release_videos"), null);
    }

    /**
     * Create an aliased <code>discogs.release_videos</code> table reference
     */
    public ReleaseVideos(String alias) {
        this(DSL.name(alias), RELEASE_VIDEOS);
    }

    /**
     * Create an aliased <code>discogs.release_videos</code> table reference
     */
    public ReleaseVideos(Name alias) {
        this(alias, RELEASE_VIDEOS);
    }

    private ReleaseVideos(Name alias, Table<ReleaseVideosRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReleaseVideos(Name alias, Table<ReleaseVideosRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReleaseVideos(Table<O> child, ForeignKey<O, ReleaseVideosRecord> key) {
        super(child, key, RELEASE_VIDEOS);
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
        return Arrays.<Index>asList(Indexes.RELEASE_VIDEOS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReleaseVideosRecord> getPrimaryKey() {
        return Keys.RELEASE_VIDEOS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReleaseVideosRecord>> getKeys() {
        return Arrays.<UniqueKey<ReleaseVideosRecord>>asList(Keys.RELEASE_VIDEOS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReleaseVideosRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReleaseVideosRecord, ?>>asList(Keys.RELEASE_VIDEOS__RELEASES_ID_FKEY);
    }

    public Releases releases() {
        return new Releases(this, Keys.RELEASE_VIDEOS__RELEASES_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseVideos as(String alias) {
        return new ReleaseVideos(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseVideos as(Name alias) {
        return new ReleaseVideos(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseVideos rename(String name) {
        return new ReleaseVideos(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseVideos rename(Name name) {
        return new ReleaseVideos(name, null);
    }
}
