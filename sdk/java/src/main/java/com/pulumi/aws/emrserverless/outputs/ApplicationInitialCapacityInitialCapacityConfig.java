// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrserverless.outputs;

import com.pulumi.aws.emrserverless.outputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationInitialCapacityInitialCapacityConfig {
    /**
     * @return The resource configuration of the initial capacity configuration.
     * 
     */
    private @Nullable ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration workerConfiguration;
    /**
     * @return The number of workers in the initial capacity configuration.
     * 
     */
    private Integer workerCount;

    private ApplicationInitialCapacityInitialCapacityConfig() {}
    /**
     * @return The resource configuration of the initial capacity configuration.
     * 
     */
    public Optional<ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration> workerConfiguration() {
        return Optional.ofNullable(this.workerConfiguration);
    }
    /**
     * @return The number of workers in the initial capacity configuration.
     * 
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInitialCapacityInitialCapacityConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration workerConfiguration;
        private Integer workerCount;
        public Builder() {}
        public Builder(ApplicationInitialCapacityInitialCapacityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workerConfiguration = defaults.workerConfiguration;
    	      this.workerCount = defaults.workerCount;
        }

        @CustomType.Setter
        public Builder workerConfiguration(@Nullable ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration workerConfiguration) {
            this.workerConfiguration = workerConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder workerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }
        public ApplicationInitialCapacityInitialCapacityConfig build() {
            final var o = new ApplicationInitialCapacityInitialCapacityConfig();
            o.workerConfiguration = workerConfiguration;
            o.workerCount = workerCount;
            return o;
        }
    }
}