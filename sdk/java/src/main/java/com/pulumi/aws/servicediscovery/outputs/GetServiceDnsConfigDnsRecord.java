// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceDnsConfigDnsRecord {
    /**
     * @return Amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * 
     */
    private Integer ttl;
    /**
     * @return The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    private String type;

    private GetServiceDnsConfigDnsRecord() {}
    /**
     * @return Amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }
    /**
     * @return The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceDnsConfigDnsRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ttl;
        private String type;
        public Builder() {}
        public Builder(GetServiceDnsConfigDnsRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceDnsConfigDnsRecord build() {
            final var o = new GetServiceDnsConfigDnsRecord();
            o.ttl = ttl;
            o.type = type;
            return o;
        }
    }
}