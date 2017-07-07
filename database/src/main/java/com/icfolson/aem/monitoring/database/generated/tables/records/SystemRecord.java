/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables.records;


import com.icfolson.aem.monitoring.database.generated.tables.System;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemRecord extends UpdatableRecordImpl<SystemRecord> implements Record2<Short, String> {

    private static final long serialVersionUID = 2043167719;

    /**
     * Setter for <code>MONITORING.SYSTEM.SYSTEM_ID</code>.
     */
    public void setSystemId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>MONITORING.SYSTEM.SYSTEM_ID</code>.
     */
    public Short getSystemId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>MONITORING.SYSTEM.REPOSITORY_UUID</code>.
     */
    public void setRepositoryUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MONITORING.SYSTEM.REPOSITORY_UUID</code>.
     */
    public String getRepositoryUuid() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return System.SYSTEM.SYSTEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return System.SYSTEM.REPOSITORY_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRepositoryUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRecord value1(Short value) {
        setSystemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRecord value2(String value) {
        setRepositoryUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRecord values(Short value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemRecord
     */
    public SystemRecord() {
        super(System.SYSTEM);
    }

    /**
     * Create a detached, initialised SystemRecord
     */
    public SystemRecord(Short systemId, String repositoryUuid) {
        super(System.SYSTEM);

        set(0, systemId);
        set(1, repositoryUuid);
    }
}
