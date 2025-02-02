// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCacheNode {
    private @Nullable String address;
    /**
     * @return Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     * 
     */
    private @Nullable String availabilityZone;
    private @Nullable String id;
    /**
     * @return The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`. Changing this value will re-create the resource.
     * 
     */
    private @Nullable Integer port;

    private ClusterCacheNode() {}
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`. Changing this value will re-create the resource.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCacheNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String availabilityZone;
        private @Nullable String id;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ClusterCacheNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.id = defaults.id;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public ClusterCacheNode build() {
            final var o = new ClusterCacheNode();
            o.address = address;
            o.availabilityZone = availabilityZone;
            o.id = id;
            o.port = port;
            return o;
        }
    }
}
