// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFrameworkControlScope {
    /**
     * @return The ID of the only AWS resource that you want your control scope to contain.
     * 
     */
    private List<String> complianceResourceIds;
    /**
     * @return Describes whether the control scope includes one or more types of resources, such as EFS or RDS.
     * 
     */
    private List<String> complianceResourceTypes;
    /**
     * @return Tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
     * 
     */
    private Map<String,String> tags;

    private GetFrameworkControlScope() {}
    /**
     * @return The ID of the only AWS resource that you want your control scope to contain.
     * 
     */
    public List<String> complianceResourceIds() {
        return this.complianceResourceIds;
    }
    /**
     * @return Describes whether the control scope includes one or more types of resources, such as EFS or RDS.
     * 
     */
    public List<String> complianceResourceTypes() {
        return this.complianceResourceTypes;
    }
    /**
     * @return Tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrameworkControlScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> complianceResourceIds;
        private List<String> complianceResourceTypes;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetFrameworkControlScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceIds = defaults.complianceResourceIds;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder complianceResourceIds(List<String> complianceResourceIds) {
            this.complianceResourceIds = Objects.requireNonNull(complianceResourceIds);
            return this;
        }
        public Builder complianceResourceIds(String... complianceResourceIds) {
            return complianceResourceIds(List.of(complianceResourceIds));
        }
        @CustomType.Setter
        public Builder complianceResourceTypes(List<String> complianceResourceTypes) {
            this.complianceResourceTypes = Objects.requireNonNull(complianceResourceTypes);
            return this;
        }
        public Builder complianceResourceTypes(String... complianceResourceTypes) {
            return complianceResourceTypes(List.of(complianceResourceTypes));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetFrameworkControlScope build() {
            final var o = new GetFrameworkControlScope();
            o.complianceResourceIds = complianceResourceIds;
            o.complianceResourceTypes = complianceResourceTypes;
            o.tags = tags;
            return o;
        }
    }
}