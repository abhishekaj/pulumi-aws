// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs;
import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs Empty = new FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs();

    /**
     * Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    @Import(name="aggregationConfig")
    private @Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs> aggregationConfig;

    /**
     * @return Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    public Optional<Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs>> aggregationConfig() {
        return Optional.ofNullable(this.aggregationConfig);
    }

    /**
     * File type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    @Import(name="fileType")
    private @Nullable Output<String> fileType;

    /**
     * @return File type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    public Optional<Output<String>> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    /**
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    @Import(name="prefixConfig")
    private @Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs> prefixConfig;

    /**
     * @return Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    public Optional<Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs>> prefixConfig() {
        return Optional.ofNullable(this.prefixConfig);
    }

    private FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs() {}

    private FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs $) {
        this.aggregationConfig = $.aggregationConfig;
        this.fileType = $.fileType;
        this.prefixConfig = $.prefixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs $;

        public Builder() {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs();
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs defaults) {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder aggregationConfig(@Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs> aggregationConfig) {
            $.aggregationConfig = aggregationConfig;
            return this;
        }

        /**
         * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder aggregationConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs aggregationConfig) {
            return aggregationConfig(Output.of(aggregationConfig));
        }

        /**
         * @param fileType File type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
         * 
         * @return builder
         * 
         */
        public Builder fileType(@Nullable Output<String> fileType) {
            $.fileType = fileType;
            return this;
        }

        /**
         * @param fileType File type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
         * 
         * @return builder
         * 
         */
        public Builder fileType(String fileType) {
            return fileType(Output.of(fileType));
        }

        /**
         * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder prefixConfig(@Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs> prefixConfig) {
            $.prefixConfig = prefixConfig;
            return this;
        }

        /**
         * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder prefixConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs prefixConfig) {
            return prefixConfig(Output.of(prefixConfig));
        }

        public FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs build() {
            return $;
        }
    }

}