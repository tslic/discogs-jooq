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

import tslic.discogs.tables.LabelUrls;


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
public class LabelUrlsRecord extends UpdatableRecordImpl<LabelUrlsRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -1342466068;

    /**
     * Setter for <code>discogs.label_urls.label_id</code>.
     */
    public LabelUrlsRecord setLabelId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_urls.label_id</code>.
     */
    public Integer getLabelId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.label_urls.ofst</code>.
     */
    public LabelUrlsRecord setOfst(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_urls.ofst</code>.
     */
    public Integer getOfst() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>discogs.label_urls.url</code>.
     */
    public LabelUrlsRecord setUrl(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_urls.url</code>.
     */
    public String getUrl() {
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
        return LabelUrls.LABEL_URLS.LABEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LabelUrls.LABEL_URLS.OFST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LabelUrls.LABEL_URLS.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLabelId();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLabelId();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelUrlsRecord value1(Integer value) {
        setLabelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelUrlsRecord value2(Integer value) {
        setOfst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelUrlsRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelUrlsRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LabelUrlsRecord
     */
    public LabelUrlsRecord() {
        super(LabelUrls.LABEL_URLS);
    }

    /**
     * Create a detached, initialised LabelUrlsRecord
     */
    public LabelUrlsRecord(Integer labelId, Integer ofst, String url) {
        super(LabelUrls.LABEL_URLS);

        set(0, labelId);
        set(1, ofst);
        set(2, url);
    }
}