/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import tslic.discogs.tables.ReleaseExtraArtistMaps;


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
public class ReleaseExtraArtistMapsRecord extends UpdatableRecordImpl<ReleaseExtraArtistMapsRecord> implements Record8<Integer, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1318427204;

    /**
     * Setter for <code>discogs.release_extra_artist_maps.release_id</code>.
     */
    public ReleaseExtraArtistMapsRecord setReleaseId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.release_id</code>.
     */
    public Integer getReleaseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.ofst</code>.
     */
    public ReleaseExtraArtistMapsRecord setOfst(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.ofst</code>.
     */
    public Integer getOfst() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.artist_id</code>.
     */
    public ReleaseExtraArtistMapsRecord setArtistId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.artist_id</code>.
     */
    public Integer getArtistId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.anv</code>.
     */
    public ReleaseExtraArtistMapsRecord setAnv(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.anv</code>.
     */
    public String getAnv() {
        return (String) get(3);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.join_relation</code>.
     */
    public ReleaseExtraArtistMapsRecord setJoinRelation(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.join_relation</code>.
     */
    public String getJoinRelation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.name</code>.
     */
    public ReleaseExtraArtistMapsRecord setName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.role</code>.
     */
    public ReleaseExtraArtistMapsRecord setRole(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.role</code>.
     */
    public String getRole() {
        return (String) get(6);
    }

    /**
     * Setter for <code>discogs.release_extra_artist_maps.tracks</code>.
     */
    public ReleaseExtraArtistMapsRecord setTracks(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_extra_artist_maps.tracks</code>.
     */
    public String getTracks() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.OFST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.ARTIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.ANV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.JOIN_RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS.TRACKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getOfst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getArtistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAnv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getJoinRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTracks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOfst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getArtistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAnv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJoinRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTracks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value1(Integer value) {
        setReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value2(Integer value) {
        setOfst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value3(Integer value) {
        setArtistId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value4(String value) {
        setAnv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value5(String value) {
        setJoinRelation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value7(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord value8(String value) {
        setTracks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseExtraArtistMapsRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReleaseExtraArtistMapsRecord
     */
    public ReleaseExtraArtistMapsRecord() {
        super(ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS);
    }

    /**
     * Create a detached, initialised ReleaseExtraArtistMapsRecord
     */
    public ReleaseExtraArtistMapsRecord(Integer releaseId, Integer ofst, Integer artistId, String anv, String joinRelation, String name, String role, String tracks) {
        super(ReleaseExtraArtistMaps.RELEASE_EXTRA_ARTIST_MAPS);

        set(0, releaseId);
        set(1, ofst);
        set(2, artistId);
        set(3, anv);
        set(4, joinRelation);
        set(5, name);
        set(6, role);
        set(7, tracks);
    }
}
