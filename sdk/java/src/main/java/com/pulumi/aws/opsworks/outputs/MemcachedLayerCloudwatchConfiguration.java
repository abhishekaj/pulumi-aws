// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.aws.opsworks.outputs.MemcachedLayerCloudwatchConfigurationLogStream;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MemcachedLayerCloudwatchConfiguration {
    private @Nullable Boolean enabled;
    private @Nullable List<MemcachedLayerCloudwatchConfigurationLogStream> logStreams;

    private MemcachedLayerCloudwatchConfiguration() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<MemcachedLayerCloudwatchConfigurationLogStream> logStreams() {
        return this.logStreams == null ? List.of() : this.logStreams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemcachedLayerCloudwatchConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<MemcachedLayerCloudwatchConfigurationLogStream> logStreams;
        public Builder() {}
        public Builder(MemcachedLayerCloudwatchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder logStreams(@Nullable List<MemcachedLayerCloudwatchConfigurationLogStream> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public Builder logStreams(MemcachedLayerCloudwatchConfigurationLogStream... logStreams) {
            return logStreams(List.of(logStreams));
        }
        public MemcachedLayerCloudwatchConfiguration build() {
            final var o = new MemcachedLayerCloudwatchConfiguration();
            o.enabled = enabled;
            o.logStreams = logStreams;
            return o;
        }
    }
}