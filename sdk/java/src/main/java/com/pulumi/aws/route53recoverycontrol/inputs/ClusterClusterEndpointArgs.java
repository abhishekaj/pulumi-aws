// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterEndpointArgs Empty = new ClusterClusterEndpointArgs();

    /**
     * Cluster endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Cluster endpoint.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Region of the endpoint.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region of the endpoint.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ClusterClusterEndpointArgs() {}

    private ClusterClusterEndpointArgs(ClusterClusterEndpointArgs $) {
        this.endpoint = $.endpoint;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterEndpointArgs $;

        public Builder() {
            $ = new ClusterClusterEndpointArgs();
        }

        public Builder(ClusterClusterEndpointArgs defaults) {
            $ = new ClusterClusterEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint Cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param region Region of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ClusterClusterEndpointArgs build() {
            return $;
        }
    }

}