// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs;
import com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs;
import com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverState extends com.pulumi.resources.ResourceArgs {

    public static final ResolverState Empty = new ResolverState();

    /**
     * API ID for the GraphQL API.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return API ID for the GraphQL API.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
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
     * CachingConfig.
     * 
     */
    @Import(name="cachingConfig")
    private @Nullable Output<ResolverCachingConfigArgs> cachingConfig;

    /**
     * @return CachingConfig.
     * 
     */
    public Optional<Output<ResolverCachingConfigArgs>> cachingConfig() {
        return Optional.ofNullable(this.cachingConfig);
    }

    /**
     * Data source name.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Output<String> dataSource;

    /**
     * @return Data source name.
     * 
     */
    public Optional<Output<String>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * Field name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return Field name from the schema defined in the GraphQL API.
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @Import(name="maxBatchSize")
    private @Nullable Output<Integer> maxBatchSize;

    /**
     * @return Maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    public Optional<Output<Integer>> maxBatchSize() {
        return Optional.ofNullable(this.maxBatchSize);
    }

    /**
     * PipelineConfig.
     * 
     */
    @Import(name="pipelineConfig")
    private @Nullable Output<ResolverPipelineConfigArgs> pipelineConfig;

    /**
     * @return PipelineConfig.
     * 
     */
    public Optional<Output<ResolverPipelineConfigArgs>> pipelineConfig() {
        return Optional.ofNullable(this.pipelineConfig);
    }

    /**
     * Request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="requestTemplate")
    private @Nullable Output<String> requestTemplate;

    /**
     * @return Request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Optional<Output<String>> requestTemplate() {
        return Optional.ofNullable(this.requestTemplate);
    }

    /**
     * Response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="responseTemplate")
    private @Nullable Output<String> responseTemplate;

    /**
     * @return Response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Optional<Output<String>> responseTemplate() {
        return Optional.ofNullable(this.responseTemplate);
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @Import(name="syncConfig")
    private @Nullable Output<ResolverSyncConfigArgs> syncConfig;

    /**
     * @return Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    public Optional<Output<ResolverSyncConfigArgs>> syncConfig() {
        return Optional.ofNullable(this.syncConfig);
    }

    /**
     * Type name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type name from the schema defined in the GraphQL API.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResolverState() {}

    private ResolverState(ResolverState $) {
        this.apiId = $.apiId;
        this.arn = $.arn;
        this.cachingConfig = $.cachingConfig;
        this.dataSource = $.dataSource;
        this.field = $.field;
        this.kind = $.kind;
        this.maxBatchSize = $.maxBatchSize;
        this.pipelineConfig = $.pipelineConfig;
        this.requestTemplate = $.requestTemplate;
        this.responseTemplate = $.responseTemplate;
        this.syncConfig = $.syncConfig;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverState $;

        public Builder() {
            $ = new ResolverState();
        }

        public Builder(ResolverState defaults) {
            $ = new ResolverState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API ID for the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API ID for the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
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
         * @param cachingConfig CachingConfig.
         * 
         * @return builder
         * 
         */
        public Builder cachingConfig(@Nullable Output<ResolverCachingConfigArgs> cachingConfig) {
            $.cachingConfig = cachingConfig;
            return this;
        }

        /**
         * @param cachingConfig CachingConfig.
         * 
         * @return builder
         * 
         */
        public Builder cachingConfig(ResolverCachingConfigArgs cachingConfig) {
            return cachingConfig(Output.of(cachingConfig));
        }

        /**
         * @param dataSource Data source name.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(@Nullable Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource Data source name.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param field Field name from the schema defined in the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Field name from the schema defined in the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param kind Resolver type. Valid values are `UNIT` and `PIPELINE`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Resolver type. Valid values are `UNIT` and `PIPELINE`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param maxBatchSize Maximum batching size for a resolver. Valid values are between `0` and `2000`.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchSize(@Nullable Output<Integer> maxBatchSize) {
            $.maxBatchSize = maxBatchSize;
            return this;
        }

        /**
         * @param maxBatchSize Maximum batching size for a resolver. Valid values are between `0` and `2000`.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchSize(Integer maxBatchSize) {
            return maxBatchSize(Output.of(maxBatchSize));
        }

        /**
         * @param pipelineConfig PipelineConfig.
         * 
         * @return builder
         * 
         */
        public Builder pipelineConfig(@Nullable Output<ResolverPipelineConfigArgs> pipelineConfig) {
            $.pipelineConfig = pipelineConfig;
            return this;
        }

        /**
         * @param pipelineConfig PipelineConfig.
         * 
         * @return builder
         * 
         */
        public Builder pipelineConfig(ResolverPipelineConfigArgs pipelineConfig) {
            return pipelineConfig(Output.of(pipelineConfig));
        }

        /**
         * @param requestTemplate Request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
         * 
         * @return builder
         * 
         */
        public Builder requestTemplate(@Nullable Output<String> requestTemplate) {
            $.requestTemplate = requestTemplate;
            return this;
        }

        /**
         * @param requestTemplate Request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
         * 
         * @return builder
         * 
         */
        public Builder requestTemplate(String requestTemplate) {
            return requestTemplate(Output.of(requestTemplate));
        }

        /**
         * @param responseTemplate Response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplate(@Nullable Output<String> responseTemplate) {
            $.responseTemplate = responseTemplate;
            return this;
        }

        /**
         * @param responseTemplate Response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplate(String responseTemplate) {
            return responseTemplate(Output.of(responseTemplate));
        }

        /**
         * @param syncConfig Describes a Sync configuration for a resolver. See Sync Config.
         * 
         * @return builder
         * 
         */
        public Builder syncConfig(@Nullable Output<ResolverSyncConfigArgs> syncConfig) {
            $.syncConfig = syncConfig;
            return this;
        }

        /**
         * @param syncConfig Describes a Sync configuration for a resolver. See Sync Config.
         * 
         * @return builder
         * 
         */
        public Builder syncConfig(ResolverSyncConfigArgs syncConfig) {
            return syncConfig(Output.of(syncConfig));
        }

        /**
         * @param type Type name from the schema defined in the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type name from the schema defined in the GraphQL API.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ResolverState build() {
            return $;
        }
    }

}