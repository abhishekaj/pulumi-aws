// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs;
import com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketWebsiteConfigurationV2RoutingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteConfigurationV2RoutingRuleArgs Empty = new BucketWebsiteConfigurationV2RoutingRuleArgs();

    /**
     * A configuration block for describing a condition that must be met for the specified redirect to apply detailed below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<BucketWebsiteConfigurationV2RoutingRuleConditionArgs> condition;

    /**
     * @return A configuration block for describing a condition that must be met for the specified redirect to apply detailed below.
     * 
     */
    public Optional<Output<BucketWebsiteConfigurationV2RoutingRuleConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * A configuration block for redirect information detailed below.
     * 
     */
    @Import(name="redirect", required=true)
    private Output<BucketWebsiteConfigurationV2RoutingRuleRedirectArgs> redirect;

    /**
     * @return A configuration block for redirect information detailed below.
     * 
     */
    public Output<BucketWebsiteConfigurationV2RoutingRuleRedirectArgs> redirect() {
        return this.redirect;
    }

    private BucketWebsiteConfigurationV2RoutingRuleArgs() {}

    private BucketWebsiteConfigurationV2RoutingRuleArgs(BucketWebsiteConfigurationV2RoutingRuleArgs $) {
        this.condition = $.condition;
        this.redirect = $.redirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketWebsiteConfigurationV2RoutingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketWebsiteConfigurationV2RoutingRuleArgs $;

        public Builder() {
            $ = new BucketWebsiteConfigurationV2RoutingRuleArgs();
        }

        public Builder(BucketWebsiteConfigurationV2RoutingRuleArgs defaults) {
            $ = new BucketWebsiteConfigurationV2RoutingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition A configuration block for describing a condition that must be met for the specified redirect to apply detailed below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<BucketWebsiteConfigurationV2RoutingRuleConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition A configuration block for describing a condition that must be met for the specified redirect to apply detailed below.
         * 
         * @return builder
         * 
         */
        public Builder condition(BucketWebsiteConfigurationV2RoutingRuleConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param redirect A configuration block for redirect information detailed below.
         * 
         * @return builder
         * 
         */
        public Builder redirect(Output<BucketWebsiteConfigurationV2RoutingRuleRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        /**
         * @param redirect A configuration block for redirect information detailed below.
         * 
         * @return builder
         * 
         */
        public Builder redirect(BucketWebsiteConfigurationV2RoutingRuleRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public BucketWebsiteConfigurationV2RoutingRuleArgs build() {
            $.redirect = Objects.requireNonNull($.redirect, "expected parameter 'redirect' to be non-null");
            return $;
        }
    }

}