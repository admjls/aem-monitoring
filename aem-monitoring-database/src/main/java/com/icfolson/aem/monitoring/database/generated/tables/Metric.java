/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables;


import com.icfolson.aem.monitoring.database.generated.Keys;
import com.icfolson.aem.monitoring.database.generated.Monitoring;
import com.icfolson.aem.monitoring.database.generated.tables.records.MetricRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Metric extends TableImpl<MetricRecord> {

    private static final long serialVersionUID = 21297753;

    /**
     * The reference instance of <code>MONITORING.METRIC</code>
     */
    public static final Metric METRIC = new Metric();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetricRecord> getRecordType() {
        return MetricRecord.class;
    }

    /**
     * The column <code>MONITORING.METRIC.METRIC_ID</code>.
     */
    public final TableField<MetricRecord, Short> METRIC_ID = createField("METRIC_ID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR MONITORING.SYSTEM_SEQUENCE_14601CFC_5160_45D7_89A2_1F6306B6A01C)", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>MONITORING.METRIC.METRIC_NAME</code>.
     */
    public final TableField<MetricRecord, String> METRIC_NAME = createField("METRIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * Create a <code>MONITORING.METRIC</code> table reference
     */
    public Metric() {
        this("METRIC", null);
    }

    /**
     * Create an aliased <code>MONITORING.METRIC</code> table reference
     */
    public Metric(String alias) {
        this(alias, METRIC);
    }

    private Metric(String alias, Table<MetricRecord> aliased) {
        this(alias, aliased, null);
    }

    private Metric(String alias, Table<MetricRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MetricRecord, Short> getIdentity() {
        return Keys.IDENTITY_METRIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MetricRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MetricRecord>> getKeys() {
        return Arrays.<UniqueKey<MetricRecord>>asList(Keys.CONSTRAINT_8, Keys.UNIQUE_METRIC_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metric as(String alias) {
        return new Metric(alias, this);
    }

    /**
     * Rename this table
     */
    public Metric rename(String name) {
        return new Metric(name, null);
    }
}