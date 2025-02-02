// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs;
import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs();

    /**
     * Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
     * 
     */
    @Import(name="orcSerDe")
    private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs> orcSerDe;

    /**
     * @return Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
     * 
     */
    public Optional<Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs>> orcSerDe() {
        return Optional.ofNullable(this.orcSerDe);
    }

    /**
     * Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
     * 
     */
    @Import(name="parquetSerDe")
    private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs> parquetSerDe;

    /**
     * @return Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
     * 
     */
    public Optional<Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs>> parquetSerDe() {
        return Optional.ofNullable(this.parquetSerDe);
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs() {}

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs $) {
        this.orcSerDe = $.orcSerDe;
        this.parquetSerDe = $.parquetSerDe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs();
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs defaults) {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orcSerDe Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
         * 
         * @return builder
         * 
         */
        public Builder orcSerDe(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs> orcSerDe) {
            $.orcSerDe = orcSerDe;
            return this;
        }

        /**
         * @param orcSerDe Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
         * 
         * @return builder
         * 
         */
        public Builder orcSerDe(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs orcSerDe) {
            return orcSerDe(Output.of(orcSerDe));
        }

        /**
         * @param parquetSerDe Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
         * 
         * @return builder
         * 
         */
        public Builder parquetSerDe(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs> parquetSerDe) {
            $.parquetSerDe = parquetSerDe;
            return this;
        }

        /**
         * @param parquetSerDe Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
         * 
         * @return builder
         * 
         */
        public Builder parquetSerDe(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs parquetSerDe) {
            return parquetSerDe(Output.of(parquetSerDe));
        }

        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs build() {
            return $;
        }
    }

}
