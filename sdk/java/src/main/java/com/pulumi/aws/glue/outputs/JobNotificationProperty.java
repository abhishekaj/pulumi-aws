// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNotificationProperty {
    /**
     * @return After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    private @Nullable Integer notifyDelayAfter;

    private JobNotificationProperty() {}
    /**
     * @return After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    public Optional<Integer> notifyDelayAfter() {
        return Optional.ofNullable(this.notifyDelayAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNotificationProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer notifyDelayAfter;
        public Builder() {}
        public Builder(JobNotificationProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifyDelayAfter = defaults.notifyDelayAfter;
        }

        @CustomType.Setter
        public Builder notifyDelayAfter(@Nullable Integer notifyDelayAfter) {
            this.notifyDelayAfter = notifyDelayAfter;
            return this;
        }
        public JobNotificationProperty build() {
            final var o = new JobNotificationProperty();
            o.notifyDelayAfter = notifyDelayAfter;
            return o;
        }
    }
}