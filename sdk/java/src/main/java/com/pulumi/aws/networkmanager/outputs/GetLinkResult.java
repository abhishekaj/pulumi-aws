// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.aws.networkmanager.outputs.GetLinkBandwidth;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLinkResult {
    /**
     * @return ARN of the link.
     * 
     */
    private String arn;
    /**
     * @return Upload speed and download speed of the link as documented below
     * 
     */
    private List<GetLinkBandwidth> bandwidths;
    /**
     * @return Description of the link.
     * 
     */
    private String description;
    private String globalNetworkId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String linkId;
    /**
     * @return Provider of the link.
     * 
     */
    private String providerName;
    /**
     * @return ID of the site.
     * 
     */
    private String siteId;
    /**
     * @return Key-value tags for the link.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Type of the link.
     * 
     */
    private String type;

    private GetLinkResult() {}
    /**
     * @return ARN of the link.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Upload speed and download speed of the link as documented below
     * 
     */
    public List<GetLinkBandwidth> bandwidths() {
        return this.bandwidths;
    }
    /**
     * @return Description of the link.
     * 
     */
    public String description() {
        return this.description;
    }
    public String globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String linkId() {
        return this.linkId;
    }
    /**
     * @return Provider of the link.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    /**
     * @return ID of the site.
     * 
     */
    public String siteId() {
        return this.siteId;
    }
    /**
     * @return Key-value tags for the link.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Type of the link.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<GetLinkBandwidth> bandwidths;
        private String description;
        private String globalNetworkId;
        private String id;
        private String linkId;
        private String providerName;
        private String siteId;
        private Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bandwidths = defaults.bandwidths;
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.id = defaults.id;
    	      this.linkId = defaults.linkId;
    	      this.providerName = defaults.providerName;
    	      this.siteId = defaults.siteId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder bandwidths(List<GetLinkBandwidth> bandwidths) {
            this.bandwidths = Objects.requireNonNull(bandwidths);
            return this;
        }
        public Builder bandwidths(GetLinkBandwidth... bandwidths) {
            return bandwidths(List.of(bandwidths));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder linkId(String linkId) {
            this.linkId = Objects.requireNonNull(linkId);
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder siteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
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
        public GetLinkResult build() {
            final var o = new GetLinkResult();
            o.arn = arn;
            o.bandwidths = bandwidths;
            o.description = description;
            o.globalNetworkId = globalNetworkId;
            o.id = id;
            o.linkId = linkId;
            o.providerName = providerName;
            o.siteId = siteId;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}