// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineThumbnailConfigPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineThumbnailConfigPermissionArgs Empty = new PipelineThumbnailConfigPermissionArgs();

    /**
     * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    @Import(name="accesses")
    private @Nullable Output<List<String>> accesses;

    /**
     * @return The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    public Optional<Output<List<String>>> accesses() {
        return Optional.ofNullable(this.accesses);
    }

    /**
     * The AWS user or group that you want to have access to thumbnail files.
     * 
     */
    @Import(name="grantee")
    private @Nullable Output<String> grantee;

    /**
     * @return The AWS user or group that you want to have access to thumbnail files.
     * 
     */
    public Optional<Output<String>> grantee() {
        return Optional.ofNullable(this.grantee);
    }

    /**
     * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    @Import(name="granteeType")
    private @Nullable Output<String> granteeType;

    /**
     * @return Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    public Optional<Output<String>> granteeType() {
        return Optional.ofNullable(this.granteeType);
    }

    private PipelineThumbnailConfigPermissionArgs() {}

    private PipelineThumbnailConfigPermissionArgs(PipelineThumbnailConfigPermissionArgs $) {
        this.accesses = $.accesses;
        this.grantee = $.grantee;
        this.granteeType = $.granteeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineThumbnailConfigPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineThumbnailConfigPermissionArgs $;

        public Builder() {
            $ = new PipelineThumbnailConfigPermissionArgs();
        }

        public Builder(PipelineThumbnailConfigPermissionArgs defaults) {
            $ = new PipelineThumbnailConfigPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accesses The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
         * 
         * @return builder
         * 
         */
        public Builder accesses(@Nullable Output<List<String>> accesses) {
            $.accesses = accesses;
            return this;
        }

        /**
         * @param accesses The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
         * 
         * @return builder
         * 
         */
        public Builder accesses(List<String> accesses) {
            return accesses(Output.of(accesses));
        }

        /**
         * @param accesses The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
         * 
         * @return builder
         * 
         */
        public Builder accesses(String... accesses) {
            return accesses(List.of(accesses));
        }

        /**
         * @param grantee The AWS user or group that you want to have access to thumbnail files.
         * 
         * @return builder
         * 
         */
        public Builder grantee(@Nullable Output<String> grantee) {
            $.grantee = grantee;
            return this;
        }

        /**
         * @param grantee The AWS user or group that you want to have access to thumbnail files.
         * 
         * @return builder
         * 
         */
        public Builder grantee(String grantee) {
            return grantee(Output.of(grantee));
        }

        /**
         * @param granteeType Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
         * 
         * @return builder
         * 
         */
        public Builder granteeType(@Nullable Output<String> granteeType) {
            $.granteeType = granteeType;
            return this;
        }

        /**
         * @param granteeType Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
         * 
         * @return builder
         * 
         */
        public Builder granteeType(String granteeType) {
            return granteeType(Output.of(granteeType));
        }

        public PipelineThumbnailConfigPermissionArgs build() {
            return $;
        }
    }

}