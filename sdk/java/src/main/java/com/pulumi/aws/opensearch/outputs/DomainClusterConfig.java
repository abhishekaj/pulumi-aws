// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.aws.opensearch.outputs.DomainClusterConfigColdStorageOptions;
import com.pulumi.aws.opensearch.outputs.DomainClusterConfigZoneAwarenessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainClusterConfig {
    /**
     * @return Configuration block containing cold storage configuration. Detailed below.
     * 
     */
    private @Nullable DomainClusterConfigColdStorageOptions coldStorageOptions;
    /**
     * @return Number of dedicated main nodes in the cluster.
     * 
     */
    private @Nullable Integer dedicatedMasterCount;
    /**
     * @return Whether dedicated main nodes are enabled for the cluster.
     * 
     */
    private @Nullable Boolean dedicatedMasterEnabled;
    /**
     * @return Instance type of the dedicated main nodes in the cluster.
     * 
     */
    private @Nullable String dedicatedMasterType;
    /**
     * @return Number of instances in the cluster.
     * 
     */
    private @Nullable Integer instanceCount;
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    private @Nullable Integer warmCount;
    /**
     * @return Whether to enable warm storage.
     * 
     */
    private @Nullable Boolean warmEnabled;
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes. Valid values are `ultrawarm1.medium.search`, `ultrawarm1.large.search` and `ultrawarm1.xlarge.search`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    private @Nullable String warmType;
    /**
     * @return Configuration block containing zone awareness settings. Detailed below.
     * 
     */
    private @Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig;
    /**
     * @return Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
     */
    private @Nullable Boolean zoneAwarenessEnabled;

    private DomainClusterConfig() {}
    /**
     * @return Configuration block containing cold storage configuration. Detailed below.
     * 
     */
    public Optional<DomainClusterConfigColdStorageOptions> coldStorageOptions() {
        return Optional.ofNullable(this.coldStorageOptions);
    }
    /**
     * @return Number of dedicated main nodes in the cluster.
     * 
     */
    public Optional<Integer> dedicatedMasterCount() {
        return Optional.ofNullable(this.dedicatedMasterCount);
    }
    /**
     * @return Whether dedicated main nodes are enabled for the cluster.
     * 
     */
    public Optional<Boolean> dedicatedMasterEnabled() {
        return Optional.ofNullable(this.dedicatedMasterEnabled);
    }
    /**
     * @return Instance type of the dedicated main nodes in the cluster.
     * 
     */
    public Optional<String> dedicatedMasterType() {
        return Optional.ofNullable(this.dedicatedMasterType);
    }
    /**
     * @return Number of instances in the cluster.
     * 
     */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    public Optional<Integer> warmCount() {
        return Optional.ofNullable(this.warmCount);
    }
    /**
     * @return Whether to enable warm storage.
     * 
     */
    public Optional<Boolean> warmEnabled() {
        return Optional.ofNullable(this.warmEnabled);
    }
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes. Valid values are `ultrawarm1.medium.search`, `ultrawarm1.large.search` and `ultrawarm1.xlarge.search`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    public Optional<String> warmType() {
        return Optional.ofNullable(this.warmType);
    }
    /**
     * @return Configuration block containing zone awareness settings. Detailed below.
     * 
     */
    public Optional<DomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfig() {
        return Optional.ofNullable(this.zoneAwarenessConfig);
    }
    /**
     * @return Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
     */
    public Optional<Boolean> zoneAwarenessEnabled() {
        return Optional.ofNullable(this.zoneAwarenessEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DomainClusterConfigColdStorageOptions coldStorageOptions;
        private @Nullable Integer dedicatedMasterCount;
        private @Nullable Boolean dedicatedMasterEnabled;
        private @Nullable String dedicatedMasterType;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private @Nullable String warmType;
        private @Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig;
        private @Nullable Boolean zoneAwarenessEnabled;
        public Builder() {}
        public Builder(DomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageOptions = defaults.coldStorageOptions;
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        @CustomType.Setter
        public Builder coldStorageOptions(@Nullable DomainClusterConfigColdStorageOptions coldStorageOptions) {
            this.coldStorageOptions = coldStorageOptions;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }
        @CustomType.Setter
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = warmCount;
            return this;
        }
        @CustomType.Setter
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder warmType(@Nullable String warmType) {
            this.warmType = warmType;
            return this;
        }
        @CustomType.Setter
        public Builder zoneAwarenessConfig(@Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }
        @CustomType.Setter
        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }
        public DomainClusterConfig build() {
            final var o = new DomainClusterConfig();
            o.coldStorageOptions = coldStorageOptions;
            o.dedicatedMasterCount = dedicatedMasterCount;
            o.dedicatedMasterEnabled = dedicatedMasterEnabled;
            o.dedicatedMasterType = dedicatedMasterType;
            o.instanceCount = instanceCount;
            o.instanceType = instanceType;
            o.warmCount = warmCount;
            o.warmEnabled = warmEnabled;
            o.warmType = warmType;
            o.zoneAwarenessConfig = zoneAwarenessConfig;
            o.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return o;
        }
    }
}