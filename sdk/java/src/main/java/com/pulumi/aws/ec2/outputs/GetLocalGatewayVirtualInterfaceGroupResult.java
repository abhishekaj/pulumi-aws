// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayVirtualInterfaceGroupResult {
    private @Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters;
    private String id;
    private String localGatewayId;
    /**
     * @return Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
     */
    private List<String> localGatewayVirtualInterfaceIds;
    private Map<String,String> tags;

    private GetLocalGatewayVirtualInterfaceGroupResult() {}
    public List<GetLocalGatewayVirtualInterfaceGroupFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    public String localGatewayId() {
        return this.localGatewayId;
    }
    /**
     * @return Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
     */
    public List<String> localGatewayVirtualInterfaceIds() {
        return this.localGatewayVirtualInterfaceIds;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters;
        private String id;
        private String localGatewayId;
        private List<String> localGatewayVirtualInterfaceIds;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetLocalGatewayVirtualInterfaceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayVirtualInterfaceIds = defaults.localGatewayVirtualInterfaceIds;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayVirtualInterfaceGroupFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayVirtualInterfaceIds(List<String> localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
            return this;
        }
        public Builder localGatewayVirtualInterfaceIds(String... localGatewayVirtualInterfaceIds) {
            return localGatewayVirtualInterfaceIds(List.of(localGatewayVirtualInterfaceIds));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupResult build() {
            final var o = new GetLocalGatewayVirtualInterfaceGroupResult();
            o.filters = filters;
            o.id = id;
            o.localGatewayId = localGatewayId;
            o.localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds;
            o.tags = tags;
            return o;
        }
    }
}