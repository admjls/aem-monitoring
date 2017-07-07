/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables.records;


import com.icfolson.aem.monitoring.database.generated.tables.CounterValue;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class CounterValueRecord extends TableRecordImpl<CounterValueRecord> implements Record4<Short, Short, Long, Integer> {

    private static final long serialVersionUID = -1294074966;

    /**
     * Setter for <code>MONITORING.COUNTER_VALUE.COUNTER_ID</code>.
     */
    public void setCounterId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>MONITORING.COUNTER_VALUE.COUNTER_ID</code>.
     */
    public Short getCounterId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>MONITORING.COUNTER_VALUE.SYSTEM_ID</code>.
     */
    public void setSystemId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>MONITORING.COUNTER_VALUE.SYSTEM_ID</code>.
     */
    public Short getSystemId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>MONITORING.COUNTER_VALUE.TIME</code>.
     */
    public void setTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>MONITORING.COUNTER_VALUE.TIME</code>.
     */
    public Long getTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>MONITORING.COUNTER_VALUE.INCREMENT_VALUE</code>.
     */
    public void setIncrementValue(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>MONITORING.COUNTER_VALUE.INCREMENT_VALUE</code>.
     */
    public Integer getIncrementValue() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Short, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Short, Long, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return CounterValue.COUNTER_VALUE.COUNTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return CounterValue.COUNTER_VALUE.SYSTEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return CounterValue.COUNTER_VALUE.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CounterValue.COUNTER_VALUE.INCREMENT_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getCounterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIncrementValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValueRecord value1(Short value) {
        setCounterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValueRecord value2(Short value) {
        setSystemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValueRecord value3(Long value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValueRecord value4(Integer value) {
        setIncrementValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValueRecord values(Short value1, Short value2, Long value3, Integer value4) {
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
     * Create a detached CounterValueRecord
     */
    public CounterValueRecord() {
        super(CounterValue.COUNTER_VALUE);
    }

    /**
     * Create a detached, initialised CounterValueRecord
     */
    public CounterValueRecord(Short counterId, Short systemId, Long time, Integer incrementValue) {
        super(CounterValue.COUNTER_VALUE);

        set(0, counterId);
        set(1, systemId);
        set(2, time);
        set(3, incrementValue);
    }
}
