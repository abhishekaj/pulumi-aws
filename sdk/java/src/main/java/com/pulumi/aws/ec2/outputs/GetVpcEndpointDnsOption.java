// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcEndpointDnsOption {
    private String dnsRecordIpType;

    private GetVpcEndpointDnsOption() {}
    public String dnsRecordIpType() {
        return this.dnsRecordIpType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointDnsOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dnsRecordIpType;
        public Builder() {}
        public Builder(GetVpcEndpointDnsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecordIpType = defaults.dnsRecordIpType;
        }

        @CustomType.Setter
        public Builder dnsRecordIpType(String dnsRecordIpType) {
            this.dnsRecordIpType = Objects.requireNonNull(dnsRecordIpType);
            return this;
        }
        public GetVpcEndpointDnsOption build() {
            final var o = new GetVpcEndpointDnsOption();
            o.dnsRecordIpType = dnsRecordIpType;
            return o;
        }
    }
}
