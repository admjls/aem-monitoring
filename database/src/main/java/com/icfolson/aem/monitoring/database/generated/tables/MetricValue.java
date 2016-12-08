/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables;


import com.icfolson.aem.monitoring.database.generated.Keys;
import com.icfolson.aem.monitoring.database.generated.Monitoring;
import com.icfolson.aem.monitoring.database.generated.tables.records.MetricValueRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class MetricValue extends TableImpl<MetricValueRecord> {

    private static final long serialVersionUID = 1438376319;

    /**
     * The reference instance of <code>MONITORING.METRIC_VALUE</code>
     */
    public static final MetricValue METRIC_VALUE = new MetricValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetricValueRecord> getRecordType() {
        return MetricValueRecord.class;
    }

    /**
     * The column <code>MONITORING.METRIC_VALUE.COUNTER_VALUE_ID</code>.
     */
    public final TableField<MetricValueRecord, Long> COUNTER_VALUE_ID = createField("COUNTER_VALUE_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR MONITORING.SYSTEM_SEQUENCE_98728855_9885_43B2_BF93_50A3899BC107)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>MONITORING.METRIC_VALUE.SYSTEM_ID</code>.
     */
    public final TableField<MetricValueRecord, UUID> SYSTEM_ID = createField("SYSTEM_ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>MONITORING.METRIC_VALUE.METRIC_NAME</code>.
     */
    public final TableField<MetricValueRecord, String> METRIC_NAME = createField("METRIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>MONITORING.METRIC_VALUE.TIME</code>.
     */
    public final TableField<MetricValueRecord, Long> TIME = createField("TIME", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>MONITORING.METRIC_VALUE.METRIC_VALUE</code>.
     */
    public final TableField<MetricValueRecord, Float> METRIC_VALUE_ = createField("METRIC_VALUE", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>MONITORING.METRIC_VALUE</code> table reference
     */
    public MetricValue() {
        this("METRIC_VALUE", null);
    }

    /**
     * Create an aliased <code>MONITORING.METRIC_VALUE</code> table reference
     */
    public MetricValue(String alias) {
        this(alias, METRIC_VALUE);
    }

    private MetricValue(String alias, Table<MetricValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private MetricValue(String alias, Table<MetricValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Monitoring.MONITORING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MetricValueRecord, Long> getIdentity() {
        return Keys.IDENTITY_METRIC_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MetricValueRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_36;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MetricValueRecord>> getKeys() {
        return Arrays.<UniqueKey<MetricValueRecord>>asList(Keys.CONSTRAINT_36);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MetricValueRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MetricValueRecord, ?>>asList(Keys.CONSTRAINT_368);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValue as(String alias) {
        return new MetricValue(alias, this);
    }

    /**
     * Rename this table
     */
    public MetricValue rename(String name) {
        return new MetricValue(name, null);
    }
}