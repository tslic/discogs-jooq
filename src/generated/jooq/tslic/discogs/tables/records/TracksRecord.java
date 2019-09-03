/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import tslic.discogs.tables.Tracks;


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
public class TracksRecord extends UpdatableRecordImpl<TracksRecord> implements Record5<Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 785802253;

    /**
     * Setter for <code>discogs.tracks.release_id</code>.
     */
    public TracksRecord setReleaseId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.tracks.release_id</code>.
     */
    public Integer getReleaseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.tracks.ofst</code>.
     */
    public TracksRecord setOfst(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.tracks.ofst</code>.
     */
    public Integer getOfst() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>discogs.tracks.title</code>.
     */
    public TracksRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>discogs.tracks.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>discogs.tracks.duration</code>.
     */
    public TracksRecord setDuration(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>discogs.tracks.duration</code>.
     */
    public String getDuration() {
        return (String) get(3);
    }

    /**
     * Setter for <code>discogs.tracks.position</code>.
     */
    public TracksRecord setPosition(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>discogs.tracks.position</code>.
     */
    public String getPosition() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tracks.TRACKS.RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Tracks.TRACKS.OFST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tracks.TRACKS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tracks.TRACKS.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tracks.TRACKS.POSITION;
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
    public String component3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPosition();
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
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord value1(Integer value) {
        setReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord value2(Integer value) {
        setOfst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord value4(String value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord value5(String value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TracksRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TracksRecord
     */
    public TracksRecord() {
        super(Tracks.TRACKS);
    }

    /**
     * Create a detached, initialised TracksRecord
     */
    public TracksRecord(Integer releaseId, Integer ofst, String title, String duration, String position) {
        super(Tracks.TRACKS);

        set(0, releaseId);
        set(1, ofst);
        set(2, title);
        set(3, duration);
        set(4, position);
    }
}