// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowTriggerConfigTriggerProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowTriggerConfig {
    /**
     * @return Configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
     * 
     */
    private @Nullable FlowTriggerConfigTriggerProperties triggerProperties;
    /**
     * @return Type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
     * 
     */
    private String triggerType;

    private FlowTriggerConfig() {}
    /**
     * @return Configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
     * 
     */
    public Optional<FlowTriggerConfigTriggerProperties> triggerProperties() {
        return Optional.ofNullable(this.triggerProperties);
    }
    /**
     * @return Type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
     * 
     */
    public String triggerType() {
        return this.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FlowTriggerConfigTriggerProperties triggerProperties;
        private String triggerType;
        public Builder() {}
        public Builder(FlowTriggerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        @CustomType.Setter
        public Builder triggerProperties(@Nullable FlowTriggerConfigTriggerProperties triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }
        @CustomType.Setter
        public Builder triggerType(String triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }
        public FlowTriggerConfig build() {
            final var o = new FlowTriggerConfig();
            o.triggerProperties = triggerProperties;
            o.triggerType = triggerType;
            return o;
        }
    }
}