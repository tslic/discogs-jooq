/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import tslic.discogs.tables.LabelSublabels;


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
public class LabelSublabelsRecord extends UpdatableRecordImpl<LabelSublabelsRecord> implements Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 524971501;

    /**
     * Setter for <code>discogs.label_sublabels.label_id</code>.
     */
    public LabelSublabelsRecord setLabelId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_sublabels.label_id</code>.
     */
    public Integer getLabelId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.label_sublabels.ofst</code>.
     */
    public LabelSublabelsRecord setOfst(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_sublabels.ofst</code>.
     */
    public Integer getOfst() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>discogs.label_sublabels.label2_id</code>.
     */
    public LabelSublabelsRecord setLabel2Id(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_sublabels.label2_id</code>.
     */
    public Integer getLabel2Id() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>discogs.label_sublabels.name</code>.
     */
    public LabelSublabelsRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>discogs.label_sublabels.name</code>.
     */
    public String getName() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LabelSublabels.LABEL_SUBLABELS.LABEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LabelSublabels.LABEL_SUBLABELS.OFST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LabelSublabels.LABEL_SUBLABELS.LABEL2_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LabelSublabels.LABEL_SUBLABELS.NAME;
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
    public Integer component3() {
        return getLabel2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
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
    public Integer value3() {
        return getLabel2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelSublabelsRecord value1(Integer value) {
        setLabelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelSublabelsRecord value2(Integer value) {
        setOfst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelSublabelsRecord value3(Integer value) {
        setLabel2Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelSublabelsRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LabelSublabelsRecord values(Integer value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LabelSublabelsRecord
     */
    public LabelSublabelsRecord() {
        super(LabelSublabels.LABEL_SUBLABELS);
    }

    /**
     * Create a detached, initialised LabelSublabelsRecord
     */
    public LabelSublabelsRecord(Integer labelId, Integer ofst, Integer label2Id, String name) {
        super(LabelSublabels.LABEL_SUBLABELS);

        set(0, labelId);
        set(1, ofst);
        set(2, label2Id);
        set(3, name);
    }
}
