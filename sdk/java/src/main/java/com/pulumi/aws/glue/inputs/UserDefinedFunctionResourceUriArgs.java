// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UserDefinedFunctionResourceUriArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserDefinedFunctionResourceUriArgs Empty = new UserDefinedFunctionResourceUriArgs();

    /**
     * The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The URI for accessing the resource.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI for accessing the resource.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private UserDefinedFunctionResourceUriArgs() {}

    private UserDefinedFunctionResourceUriArgs(UserDefinedFunctionResourceUriArgs $) {
        this.resourceType = $.resourceType;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDefinedFunctionResourceUriArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDefinedFunctionResourceUriArgs $;

        public Builder() {
            $ = new UserDefinedFunctionResourceUriArgs();
        }

        public Builder(UserDefinedFunctionResourceUriArgs defaults) {
            $ = new UserDefinedFunctionResourceUriArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceType The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param uri The URI for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public UserDefinedFunctionResourceUriArgs build() {
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}