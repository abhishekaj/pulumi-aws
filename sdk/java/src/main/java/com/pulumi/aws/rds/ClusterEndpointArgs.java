// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    @Import(name="clusterEndpointIdentifier", required=true)
    private Output<String> clusterEndpointIdentifier;

    /**
     * @return The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    public Output<String> clusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier;
    }

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The type of the endpoint. One of: READER , ANY .
     * 
     */
    @Import(name="customEndpointType", required=true)
    private Output<String> customEndpointType;

    /**
     * @return The type of the endpoint. One of: READER , ANY .
     * 
     */
    public Output<String> customEndpointType() {
        return this.customEndpointType;
    }

    /**
     * List of DB instance identifiers that aren&#39;t part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
     * 
     */
    @Import(name="excludedMembers")
    private @Nullable Output<List<String>> excludedMembers;

    /**
     * @return List of DB instance identifiers that aren&#39;t part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
     * 
     */
    public Optional<Output<List<String>>> excludedMembers() {
        return Optional.ofNullable(this.excludedMembers);
    }

    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
     * 
     */
    @Import(name="staticMembers")
    private @Nullable Output<List<String>> staticMembers;

    /**
     * @return List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
     * 
     */
    public Optional<Output<List<String>>> staticMembers() {
        return Optional.ofNullable(this.staticMembers);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterEndpointArgs() {}

    private ClusterEndpointArgs(ClusterEndpointArgs $) {
        this.clusterEndpointIdentifier = $.clusterEndpointIdentifier;
        this.clusterIdentifier = $.clusterIdentifier;
        this.customEndpointType = $.customEndpointType;
        this.excludedMembers = $.excludedMembers;
        this.staticMembers = $.staticMembers;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEndpointArgs $;

        public Builder() {
            $ = new ClusterEndpointArgs();
        }

        public Builder(ClusterEndpointArgs defaults) {
            $ = new ClusterEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterEndpointIdentifier The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder clusterEndpointIdentifier(Output<String> clusterEndpointIdentifier) {
            $.clusterEndpointIdentifier = clusterEndpointIdentifier;
            return this;
        }

        /**
         * @param clusterEndpointIdentifier The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder clusterEndpointIdentifier(String clusterEndpointIdentifier) {
            return clusterEndpointIdentifier(Output.of(clusterEndpointIdentifier));
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param customEndpointType The type of the endpoint. One of: READER , ANY .
         * 
         * @return builder
         * 
         */
        public Builder customEndpointType(Output<String> customEndpointType) {
            $.customEndpointType = customEndpointType;
            return this;
        }

        /**
         * @param customEndpointType The type of the endpoint. One of: READER , ANY .
         * 
         * @return builder
         * 
         */
        public Builder customEndpointType(String customEndpointType) {
            return customEndpointType(Output.of(customEndpointType));
        }

        /**
         * @param excludedMembers List of DB instance identifiers that aren&#39;t part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
         * 
         * @return builder
         * 
         */
        public Builder excludedMembers(@Nullable Output<List<String>> excludedMembers) {
            $.excludedMembers = excludedMembers;
            return this;
        }

        /**
         * @param excludedMembers List of DB instance identifiers that aren&#39;t part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
         * 
         * @return builder
         * 
         */
        public Builder excludedMembers(List<String> excludedMembers) {
            return excludedMembers(Output.of(excludedMembers));
        }

        /**
         * @param excludedMembers List of DB instance identifiers that aren&#39;t part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
         * 
         * @return builder
         * 
         */
        public Builder excludedMembers(String... excludedMembers) {
            return excludedMembers(List.of(excludedMembers));
        }

        /**
         * @param staticMembers List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
         * 
         * @return builder
         * 
         */
        public Builder staticMembers(@Nullable Output<List<String>> staticMembers) {
            $.staticMembers = staticMembers;
            return this;
        }

        /**
         * @param staticMembers List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
         * 
         * @return builder
         * 
         */
        public Builder staticMembers(List<String> staticMembers) {
            return staticMembers(Output.of(staticMembers));
        }

        /**
         * @param staticMembers List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
         * 
         * @return builder
         * 
         */
        public Builder staticMembers(String... staticMembers) {
            return staticMembers(List.of(staticMembers));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterEndpointArgs build() {
            $.clusterEndpointIdentifier = Objects.requireNonNull($.clusterEndpointIdentifier, "expected parameter 'clusterEndpointIdentifier' to be non-null");
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            $.customEndpointType = Objects.requireNonNull($.customEndpointType, "expected parameter 'customEndpointType' to be non-null");
            return $;
        }
    }

}