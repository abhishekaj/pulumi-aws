// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricAlarmMetricQueryMetric {
    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private @Nullable Map<String,String> dimensions;
    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private String metricName;
    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private @Nullable String namespace;
    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    private Integer period;
    /**
     * @return The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    private String stat;
    /**
     * @return The unit for this metric.
     * 
     */
    private @Nullable String unit;

    private MetricAlarmMetricQueryMetric() {}
    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Map<String,String> dimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    public String stat() {
        return this.stat;
    }
    /**
     * @return The unit for this metric.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmMetricQueryMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> dimensions;
        private String metricName;
        private @Nullable String namespace;
        private Integer period;
        private String stat;
        private @Nullable String unit;
        public Builder() {}
        public Builder(MetricAlarmMetricQueryMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.period = defaults.period;
    	      this.stat = defaults.stat;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        @CustomType.Setter
        public Builder stat(String stat) {
            this.stat = Objects.requireNonNull(stat);
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public MetricAlarmMetricQueryMetric build() {
            final var o = new MetricAlarmMetricQueryMetric();
            o.dimensions = dimensions;
            o.metricName = metricName;
            o.namespace = namespace;
            o.period = period;
            o.stat = stat;
            o.unit = unit;
            return o;
        }
    }
}