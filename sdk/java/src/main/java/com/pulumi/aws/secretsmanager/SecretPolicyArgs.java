// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretPolicyArgs Empty = new SecretPolicyArgs();

    /**
     * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
     * 
     */
    @Import(name="blockPublicPolicy")
    private @Nullable Output<Boolean> blockPublicPolicy;

    /**
     * @return Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
     * 
     */
    public Optional<Output<Boolean>> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     * Secret ARN.
     * 
     */
    @Import(name="secretArn", required=true)
    private Output<String> secretArn;

    /**
     * @return Secret ARN.
     * 
     */
    public Output<String> secretArn() {
        return this.secretArn;
    }

    private SecretPolicyArgs() {}

    private SecretPolicyArgs(SecretPolicyArgs $) {
        this.blockPublicPolicy = $.blockPublicPolicy;
        this.policy = $.policy;
        this.secretArn = $.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretPolicyArgs $;

        public Builder() {
            $ = new SecretPolicyArgs();
        }

        public Builder(SecretPolicyArgs defaults) {
            $ = new SecretPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            $.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(Boolean blockPublicPolicy) {
            return blockPublicPolicy(Output.of(blockPublicPolicy));
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param secretArn Secret ARN.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn Secret ARN.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public SecretPolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.secretArn = Objects.requireNonNull($.secretArn, "expected parameter 'secretArn' to be non-null");
            return $;
        }
    }

}