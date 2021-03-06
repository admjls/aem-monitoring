/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated;


import com.icfolson.aem.monitoring.database.generated.tables.Counter;
import com.icfolson.aem.monitoring.database.generated.tables.CounterValue;
import com.icfolson.aem.monitoring.database.generated.tables.Event;
import com.icfolson.aem.monitoring.database.generated.tables.EventProperty;
import com.icfolson.aem.monitoring.database.generated.tables.EventType;
import com.icfolson.aem.monitoring.database.generated.tables.Metric;
import com.icfolson.aem.monitoring.database.generated.tables.MetricValue;
import com.icfolson.aem.monitoring.database.generated.tables.System;
import com.icfolson.aem.monitoring.database.generated.tables.SystemProperty;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in MONITORING
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>MONITORING.SYSTEM</code>.
     */
    public static final System SYSTEM = com.icfolson.aem.monitoring.database.generated.tables.System.SYSTEM;

    /**
     * The table <code>MONITORING.SYSTEM_PROPERTY</code>.
     */
    public static final SystemProperty SYSTEM_PROPERTY = com.icfolson.aem.monitoring.database.generated.tables.SystemProperty.SYSTEM_PROPERTY;

    /**
     * The table <code>MONITORING.EVENT_TYPE</code>.
     */
    public static final EventType EVENT_TYPE = com.icfolson.aem.monitoring.database.generated.tables.EventType.EVENT_TYPE;

    /**
     * The table <code>MONITORING.EVENT</code>.
     */
    public static final Event EVENT = com.icfolson.aem.monitoring.database.generated.tables.Event.EVENT;

    /**
     * The table <code>MONITORING.EVENT_PROPERTY</code>.
     */
    public static final EventProperty EVENT_PROPERTY = com.icfolson.aem.monitoring.database.generated.tables.EventProperty.EVENT_PROPERTY;

    /**
     * The table <code>MONITORING.COUNTER</code>.
     */
    public static final Counter COUNTER = com.icfolson.aem.monitoring.database.generated.tables.Counter.COUNTER;

    /**
     * The table <code>MONITORING.COUNTER_VALUE</code>.
     */
    public static final CounterValue COUNTER_VALUE = com.icfolson.aem.monitoring.database.generated.tables.CounterValue.COUNTER_VALUE;

    /**
     * The table <code>MONITORING.METRIC</code>.
     */
    public static final Metric METRIC = com.icfolson.aem.monitoring.database.generated.tables.Metric.METRIC;

    /**
     * The table <code>MONITORING.METRIC_VALUE</code>.
     */
    public static final MetricValue METRIC_VALUE = com.icfolson.aem.monitoring.database.generated.tables.MetricValue.METRIC_VALUE;
}
