// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.aws.cognito.outputs.UserPoolSchemaNumberAttributeConstraints;
import com.pulumi.aws.cognito.outputs.UserPoolSchemaStringAttributeConstraints;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolSchema {
    /**
     * @return Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    private String attributeDataType;
    /**
     * @return Whether the attribute type is developer only.
     * 
     */
    private @Nullable Boolean developerOnlyAttribute;
    /**
     * @return Whether the attribute can be changed once it has been created.
     * 
     */
    private @Nullable Boolean mutable;
    /**
     * @return Name of the attribute.
     * 
     */
    private String name;
    /**
     * @return Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    private @Nullable UserPoolSchemaNumberAttributeConstraints numberAttributeConstraints;
    /**
     * @return Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    private @Nullable Boolean required;
    /**
     * @return Constraints for an attribute of the string type. Detailed below.
     * 
     */
    private @Nullable UserPoolSchemaStringAttributeConstraints stringAttributeConstraints;

    private UserPoolSchema() {}
    /**
     * @return Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    public String attributeDataType() {
        return this.attributeDataType;
    }
    /**
     * @return Whether the attribute type is developer only.
     * 
     */
    public Optional<Boolean> developerOnlyAttribute() {
        return Optional.ofNullable(this.developerOnlyAttribute);
    }
    /**
     * @return Whether the attribute can be changed once it has been created.
     * 
     */
    public Optional<Boolean> mutable() {
        return Optional.ofNullable(this.mutable);
    }
    /**
     * @return Name of the attribute.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    public Optional<UserPoolSchemaNumberAttributeConstraints> numberAttributeConstraints() {
        return Optional.ofNullable(this.numberAttributeConstraints);
    }
    /**
     * @return Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    /**
     * @return Constraints for an attribute of the string type. Detailed below.
     * 
     */
    public Optional<UserPoolSchemaStringAttributeConstraints> stringAttributeConstraints() {
        return Optional.ofNullable(this.stringAttributeConstraints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attributeDataType;
        private @Nullable Boolean developerOnlyAttribute;
        private @Nullable Boolean mutable;
        private String name;
        private @Nullable UserPoolSchemaNumberAttributeConstraints numberAttributeConstraints;
        private @Nullable Boolean required;
        private @Nullable UserPoolSchemaStringAttributeConstraints stringAttributeConstraints;
        public Builder() {}
        public Builder(UserPoolSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDataType = defaults.attributeDataType;
    	      this.developerOnlyAttribute = defaults.developerOnlyAttribute;
    	      this.mutable = defaults.mutable;
    	      this.name = defaults.name;
    	      this.numberAttributeConstraints = defaults.numberAttributeConstraints;
    	      this.required = defaults.required;
    	      this.stringAttributeConstraints = defaults.stringAttributeConstraints;
        }

        @CustomType.Setter
        public Builder attributeDataType(String attributeDataType) {
            this.attributeDataType = Objects.requireNonNull(attributeDataType);
            return this;
        }
        @CustomType.Setter
        public Builder developerOnlyAttribute(@Nullable Boolean developerOnlyAttribute) {
            this.developerOnlyAttribute = developerOnlyAttribute;
            return this;
        }
        @CustomType.Setter
        public Builder mutable(@Nullable Boolean mutable) {
            this.mutable = mutable;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder numberAttributeConstraints(@Nullable UserPoolSchemaNumberAttributeConstraints numberAttributeConstraints) {
            this.numberAttributeConstraints = numberAttributeConstraints;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder stringAttributeConstraints(@Nullable UserPoolSchemaStringAttributeConstraints stringAttributeConstraints) {
            this.stringAttributeConstraints = stringAttributeConstraints;
            return this;
        }
        public UserPoolSchema build() {
            final var o = new UserPoolSchema();
            o.attributeDataType = attributeDataType;
            o.developerOnlyAttribute = developerOnlyAttribute;
            o.mutable = mutable;
            o.name = name;
            o.numberAttributeConstraints = numberAttributeConstraints;
            o.required = required;
            o.stringAttributeConstraints = stringAttributeConstraints;
            return o;
        }
    }
}