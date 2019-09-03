/*
 * This file is generated by jOOQ.
 */
package tslic.discogs.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import tslic.discogs.tables.Masters;


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
public class MastersRecord extends UpdatableRecordImpl<MastersRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -836831728;

    /**
     * Setter for <code>discogs.masters.id</code>.
     */
    public MastersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>discogs.masters.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>discogs.masters.main_release_id</code>.
     */
    public MastersRecord setMainReleaseId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>discogs.masters.main_release_id</code>.
     */
    public Integer getMainReleaseId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Masters.MASTERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Masters.MASTERS.MAIN_RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMainReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMainReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MastersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MastersRecord value2(Integer value) {
        setMainReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MastersRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MastersRecord
     */
    public MastersRecord() {
        super(Masters.MASTERS);
    }

    /**
     * Create a detached, initialised MastersRecord
     */
    public MastersRecord(Integer id, Integer mainReleaseId) {
        super(Masters.MASTERS);

        set(0, id);
        set(1, mainReleaseId);
    }
}
