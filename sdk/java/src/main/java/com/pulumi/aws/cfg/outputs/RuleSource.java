// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.aws.cfg.outputs.RuleSourceCustomPolicyDetails;
import com.pulumi.aws.cfg.outputs.RuleSourceSourceDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSource {
    /**
     * @return Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * 
     */
    private @Nullable RuleSourceCustomPolicyDetails customPolicyDetails;
    /**
     * @return Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the [`aws.lambda.Permission` resource](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html).
     * 
     */
    private String owner;
    /**
     * @return Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * 
     */
    private @Nullable List<RuleSourceSourceDetail> sourceDetails;
    /**
     * @return For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the [`arn` attribute of the `aws.lambda.Function` resource](https://www.terraform.io/docs/providers/aws/r/lambda_function.html#arn).
     * 
     */
    private @Nullable String sourceIdentifier;

    private RuleSource() {}
    /**
     * @return Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * 
     */
    public Optional<RuleSourceCustomPolicyDetails> customPolicyDetails() {
        return Optional.ofNullable(this.customPolicyDetails);
    }
    /**
     * @return Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS`, `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g., via the [`aws.lambda.Permission` resource](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html).
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * 
     */
    public List<RuleSourceSourceDetail> sourceDetails() {
        return this.sourceDetails == null ? List.of() : this.sourceDetails;
    }
    /**
     * @return For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the [`arn` attribute of the `aws.lambda.Function` resource](https://www.terraform.io/docs/providers/aws/r/lambda_function.html#arn).
     * 
     */
    public Optional<String> sourceIdentifier() {
        return Optional.ofNullable(this.sourceIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleSourceCustomPolicyDetails customPolicyDetails;
        private String owner;
        private @Nullable List<RuleSourceSourceDetail> sourceDetails;
        private @Nullable String sourceIdentifier;
        public Builder() {}
        public Builder(RuleSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPolicyDetails = defaults.customPolicyDetails;
    	      this.owner = defaults.owner;
    	      this.sourceDetails = defaults.sourceDetails;
    	      this.sourceIdentifier = defaults.sourceIdentifier;
        }

        @CustomType.Setter
        public Builder customPolicyDetails(@Nullable RuleSourceCustomPolicyDetails customPolicyDetails) {
            this.customPolicyDetails = customPolicyDetails;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDetails(@Nullable List<RuleSourceSourceDetail> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public Builder sourceDetails(RuleSourceSourceDetail... sourceDetails) {
            return sourceDetails(List.of(sourceDetails));
        }
        @CustomType.Setter
        public Builder sourceIdentifier(@Nullable String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public RuleSource build() {
            final var o = new RuleSource();
            o.customPolicyDetails = customPolicyDetails;
            o.owner = owner;
            o.sourceDetails = sourceDetails;
            o.sourceIdentifier = sourceIdentifier;
            return o;
        }
    }
}
