// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIndexUserTokenConfigurationJsonTokenTypeConfiguration {
    /**
     * @return The group attribute field.
     * 
     */
    private String groupAttributeField;
    /**
     * @return The user name attribute field.
     * 
     */
    private String userNameAttributeField;

    private GetIndexUserTokenConfigurationJsonTokenTypeConfiguration() {}
    /**
     * @return The group attribute field.
     * 
     */
    public String groupAttributeField() {
        return this.groupAttributeField;
    }
    /**
     * @return The user name attribute field.
     * 
     */
    public String userNameAttributeField() {
        return this.userNameAttributeField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexUserTokenConfigurationJsonTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupAttributeField;
        private String userNameAttributeField;
        public Builder() {}
        public Builder(GetIndexUserTokenConfigurationJsonTokenTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        @CustomType.Setter
        public Builder groupAttributeField(String groupAttributeField) {
            this.groupAttributeField = Objects.requireNonNull(groupAttributeField);
            return this;
        }
        @CustomType.Setter
        public Builder userNameAttributeField(String userNameAttributeField) {
            this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField);
            return this;
        }
        public GetIndexUserTokenConfigurationJsonTokenTypeConfiguration build() {
            final var o = new GetIndexUserTokenConfigurationJsonTokenTypeConfiguration();
            o.groupAttributeField = groupAttributeField;
            o.userNameAttributeField = userNameAttributeField;
            return o;
        }
    }
}