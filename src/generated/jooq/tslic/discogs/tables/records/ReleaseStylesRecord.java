/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import tslic.discogs.tables.ReleaseStyles;


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
public class ReleaseStylesRecord extends UpdatableRecordImpl<ReleaseStylesRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -1784883456;

    /**
     * Setter for <code>discogs.release_styles.release_id</code>.
     */
    public ReleaseStylesRecord setReleaseId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_styles.release_id</code>.
     */
    public Integer getReleaseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.release_styles.ofst</code>.
     */
    public ReleaseStylesRecord setOfst(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_styles.ofst</code>.
     */
    public Integer getOfst() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>discogs.release_styles.style</code>.
     */
    public ReleaseStylesRecord setStyle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>discogs.release_styles.style</code>.
     */
    public String getStyle() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReleaseStyles.RELEASE_STYLES.RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReleaseStyles.RELEASE_STYLES.OFST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReleaseStyles.RELEASE_STYLES.STYLE;
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
        return getStyle();
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
        return getStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseStylesRecord value1(Integer value) {
        setReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseStylesRecord value2(Integer value) {
        setOfst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseStylesRecord value3(String value) {
        setStyle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReleaseStylesRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReleaseStylesRecord
     */
    public ReleaseStylesRecord() {
        super(ReleaseStyles.RELEASE_STYLES);
    }

    /**
     * Create a detached, initialised ReleaseStylesRecord
     */
    public ReleaseStylesRecord(Integer releaseId, Integer ofst, String style) {
        super(ReleaseStyles.RELEASE_STYLES);

        set(0, releaseId);
        set(1, ofst);
        set(2, style);
    }
}
