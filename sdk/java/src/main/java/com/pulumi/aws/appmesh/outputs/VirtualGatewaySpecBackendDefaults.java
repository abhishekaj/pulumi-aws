// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicy;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaults {
    /**
     * @return Default client policy for virtual gateway backends.
     * 
     */
    private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy;

    private VirtualGatewaySpecBackendDefaults() {}
    /**
     * @return Default client policy for virtual gateway backends.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicy> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaults defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy;
        public Builder() {}
        public Builder(VirtualGatewaySpecBackendDefaults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
        }

        @CustomType.Setter
        public Builder clientPolicy(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }
        public VirtualGatewaySpecBackendDefaults build() {
            final var o = new VirtualGatewaySpecBackendDefaults();
            o.clientPolicy = clientPolicy;
            return o;
        }
    }
}