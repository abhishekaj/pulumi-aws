// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transcribe.inputs;

import com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LanguageModelState extends com.pulumi.resources.ResourceArgs {

    public static final LanguageModelState Empty = new LanguageModelState();

    /**
     * ARN of the LanguageModel.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the LanguageModel.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of reference base model.
     * 
     */
    @Import(name="baseModelName")
    private @Nullable Output<String> baseModelName;

    /**
     * @return Name of reference base model.
     * 
     */
    public Optional<Output<String>> baseModelName() {
        return Optional.ofNullable(this.baseModelName);
    }

    /**
     * The input data config for the LanguageModel. See Input Data Config for more details.
     * 
     */
    @Import(name="inputDataConfig")
    private @Nullable Output<LanguageModelInputDataConfigArgs> inputDataConfig;

    /**
     * @return The input data config for the LanguageModel. See Input Data Config for more details.
     * 
     */
    public Optional<Output<LanguageModelInputDataConfigArgs>> inputDataConfig() {
        return Optional.ofNullable(this.inputDataConfig);
    }

    /**
     * The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * The model name.
     * 
     */
    @Import(name="modelName")
    private @Nullable Output<String> modelName;

    /**
     * @return The model name.
     * 
     */
    public Optional<Output<String>> modelName() {
        return Optional.ofNullable(this.modelName);
    }

    /**
     * A map of tags to assign to the LanguageModel. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the LanguageModel. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private LanguageModelState() {}

    private LanguageModelState(LanguageModelState $) {
        this.arn = $.arn;
        this.baseModelName = $.baseModelName;
        this.inputDataConfig = $.inputDataConfig;
        this.languageCode = $.languageCode;
        this.modelName = $.modelName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LanguageModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LanguageModelState $;

        public Builder() {
            $ = new LanguageModelState();
        }

        public Builder(LanguageModelState defaults) {
            $ = new LanguageModelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the LanguageModel.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the LanguageModel.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param baseModelName Name of reference base model.
         * 
         * @return builder
         * 
         */
        public Builder baseModelName(@Nullable Output<String> baseModelName) {
            $.baseModelName = baseModelName;
            return this;
        }

        /**
         * @param baseModelName Name of reference base model.
         * 
         * @return builder
         * 
         */
        public Builder baseModelName(String baseModelName) {
            return baseModelName(Output.of(baseModelName));
        }

        /**
         * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder inputDataConfig(@Nullable Output<LanguageModelInputDataConfigArgs> inputDataConfig) {
            $.inputDataConfig = inputDataConfig;
            return this;
        }

        /**
         * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder inputDataConfig(LanguageModelInputDataConfigArgs inputDataConfig) {
            return inputDataConfig(Output.of(inputDataConfig));
        }

        /**
         * @param languageCode The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param modelName The model name.
         * 
         * @return builder
         * 
         */
        public Builder modelName(@Nullable Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param modelName The model name.
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param tags A map of tags to assign to the LanguageModel. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the LanguageModel. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public LanguageModelState build() {
            return $;
        }
    }

}