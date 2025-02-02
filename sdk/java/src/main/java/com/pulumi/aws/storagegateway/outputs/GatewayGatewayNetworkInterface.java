// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayGatewayNetworkInterface {
    /**
     * @return The Internet Protocol version 4 (IPv4) address of the interface.
     * 
     */
    private @Nullable String ipv4Address;

    private GatewayGatewayNetworkInterface() {}
    /**
     * @return The Internet Protocol version 4 (IPv4) address of the interface.
     * 
     */
    public Optional<String> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGatewayNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipv4Address;
        public Builder() {}
        public Builder(GatewayGatewayNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
        }

        @CustomType.Setter
        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }
        public GatewayGatewayNetworkInterface build() {
            final var o = new GatewayGatewayNetworkInterface();
            o.ipv4Address = ipv4Address;
            return o;
        }
    }
}
