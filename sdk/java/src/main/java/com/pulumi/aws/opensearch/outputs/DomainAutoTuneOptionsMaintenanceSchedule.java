// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.aws.opensearch.outputs.DomainAutoTuneOptionsMaintenanceScheduleDuration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainAutoTuneOptionsMaintenanceSchedule {
    /**
     * @return A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    private String cronExpressionForRecurrence;
    /**
     * @return Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * 
     */
    private DomainAutoTuneOptionsMaintenanceScheduleDuration duration;
    /**
     * @return Date and time at which to start the Auto-Tune maintenance schedule in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private String startAt;

    private DomainAutoTuneOptionsMaintenanceSchedule() {}
    /**
     * @return A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    public String cronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }
    /**
     * @return Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * 
     */
    public DomainAutoTuneOptionsMaintenanceScheduleDuration duration() {
        return this.duration;
    }
    /**
     * @return Date and time at which to start the Auto-Tune maintenance schedule in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public String startAt() {
        return this.startAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsMaintenanceSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cronExpressionForRecurrence;
        private DomainAutoTuneOptionsMaintenanceScheduleDuration duration;
        private String startAt;
        public Builder() {}
        public Builder(DomainAutoTuneOptionsMaintenanceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpressionForRecurrence = defaults.cronExpressionForRecurrence;
    	      this.duration = defaults.duration;
    	      this.startAt = defaults.startAt;
        }

        @CustomType.Setter
        public Builder cronExpressionForRecurrence(String cronExpressionForRecurrence) {
            this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence);
            return this;
        }
        @CustomType.Setter
        public Builder duration(DomainAutoTuneOptionsMaintenanceScheduleDuration duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder startAt(String startAt) {
            this.startAt = Objects.requireNonNull(startAt);
            return this;
        }
        public DomainAutoTuneOptionsMaintenanceSchedule build() {
            final var o = new DomainAutoTuneOptionsMaintenanceSchedule();
            o.cronExpressionForRecurrence = cronExpressionForRecurrence;
            o.duration = duration;
            o.startAt = startAt;
            return o;
        }
    }
}