// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanState extends com.pulumi.resources.ResourceArgs {

    public static final UsagePlanState Empty = new UsagePlanState();

    /**
     * Associated API stages of the usage plan.
     * 
     */
    @Import(name="apiStages")
    private @Nullable Output<List<UsagePlanApiStageArgs>> apiStages;

    /**
     * @return Associated API stages of the usage plan.
     * 
     */
    public Optional<Output<List<UsagePlanApiStageArgs>>> apiStages() {
        return Optional.ofNullable(this.apiStages);
    }

    /**
     * ARN
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Description of a usage plan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of a usage plan.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the usage plan.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the usage plan.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    @Import(name="productCode")
    private @Nullable Output<String> productCode;

    /**
     * @return AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    public Optional<Output<String>> productCode() {
        return Optional.ofNullable(this.productCode);
    }

    /**
     * The quota settings of the usage plan.
     * 
     */
    @Import(name="quotaSettings")
    private @Nullable Output<UsagePlanQuotaSettingsArgs> quotaSettings;

    /**
     * @return The quota settings of the usage plan.
     * 
     */
    public Optional<Output<UsagePlanQuotaSettingsArgs>> quotaSettings() {
        return Optional.ofNullable(this.quotaSettings);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The throttling limits of the usage plan.
     * 
     */
    @Import(name="throttleSettings")
    private @Nullable Output<UsagePlanThrottleSettingsArgs> throttleSettings;

    /**
     * @return The throttling limits of the usage plan.
     * 
     */
    public Optional<Output<UsagePlanThrottleSettingsArgs>> throttleSettings() {
        return Optional.ofNullable(this.throttleSettings);
    }

    private UsagePlanState() {}

    private UsagePlanState(UsagePlanState $) {
        this.apiStages = $.apiStages;
        this.arn = $.arn;
        this.description = $.description;
        this.name = $.name;
        this.productCode = $.productCode;
        this.quotaSettings = $.quotaSettings;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.throttleSettings = $.throttleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanState $;

        public Builder() {
            $ = new UsagePlanState();
        }

        public Builder(UsagePlanState defaults) {
            $ = new UsagePlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiStages Associated API stages of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder apiStages(@Nullable Output<List<UsagePlanApiStageArgs>> apiStages) {
            $.apiStages = apiStages;
            return this;
        }

        /**
         * @param apiStages Associated API stages of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder apiStages(List<UsagePlanApiStageArgs> apiStages) {
            return apiStages(Output.of(apiStages));
        }

        /**
         * @param apiStages Associated API stages of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder apiStages(UsagePlanApiStageArgs... apiStages) {
            return apiStages(List.of(apiStages));
        }

        /**
         * @param arn ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Description of a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productCode AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
         * 
         * @return builder
         * 
         */
        public Builder productCode(@Nullable Output<String> productCode) {
            $.productCode = productCode;
            return this;
        }

        /**
         * @param productCode AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
         * 
         * @return builder
         * 
         */
        public Builder productCode(String productCode) {
            return productCode(Output.of(productCode));
        }

        /**
         * @param quotaSettings The quota settings of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder quotaSettings(@Nullable Output<UsagePlanQuotaSettingsArgs> quotaSettings) {
            $.quotaSettings = quotaSettings;
            return this;
        }

        /**
         * @param quotaSettings The quota settings of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder quotaSettings(UsagePlanQuotaSettingsArgs quotaSettings) {
            return quotaSettings(Output.of(quotaSettings));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param throttleSettings The throttling limits of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder throttleSettings(@Nullable Output<UsagePlanThrottleSettingsArgs> throttleSettings) {
            $.throttleSettings = throttleSettings;
            return this;
        }

        /**
         * @param throttleSettings The throttling limits of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder throttleSettings(UsagePlanThrottleSettingsArgs throttleSettings) {
            return throttleSettings(Output.of(throttleSettings));
        }

        public UsagePlanState build() {
            return $;
        }
    }

}