// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorKafkaClusterClientAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorKafkaClusterClientAuthenticationArgs Empty = new ConnectorKafkaClusterClientAuthenticationArgs();

    /**
     * The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    private ConnectorKafkaClusterClientAuthenticationArgs() {}

    private ConnectorKafkaClusterClientAuthenticationArgs(ConnectorKafkaClusterClientAuthenticationArgs $) {
        this.authenticationType = $.authenticationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorKafkaClusterClientAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorKafkaClusterClientAuthenticationArgs $;

        public Builder() {
            $ = new ConnectorKafkaClusterClientAuthenticationArgs();
        }

        public Builder(ConnectorKafkaClusterClientAuthenticationArgs defaults) {
            $ = new ConnectorKafkaClusterClientAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public ConnectorKafkaClusterClientAuthenticationArgs build() {
            return $;
        }
    }

}