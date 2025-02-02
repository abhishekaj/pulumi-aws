// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDnsNamespaceResult {
    /**
     * @return ARN of the namespace.
     * 
     */
    private String arn;
    /**
     * @return Description of the namespace.
     * 
     */
    private String description;
    /**
     * @return ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    private String hostedZone;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Map of tags for the resource.
     * 
     */
    private Map<String,String> tags;
    private String type;

    private GetDnsNamespaceResult() {}
    /**
     * @return ARN of the namespace.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Description of the namespace.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    public String hostedZone() {
        return this.hostedZone;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Map of tags for the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsNamespaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private String hostedZone;
        private String id;
        private String name;
        private Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetDnsNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.hostedZone = defaults.hostedZone;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder hostedZone(String hostedZone) {
            this.hostedZone = Objects.requireNonNull(hostedZone);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDnsNamespaceResult build() {
            final var o = new GetDnsNamespaceResult();
            o.arn = arn;
            o.description = description;
            o.hostedZone = hostedZone;
            o.id = id;
            o.name = name;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
