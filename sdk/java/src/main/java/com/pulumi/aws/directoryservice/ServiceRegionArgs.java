// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRegionArgs Empty = new ServiceRegionArgs();

    /**
     * The number of domain controllers desired in the replicated directory. Minimum value of `2`.
     * 
     */
    @Import(name="desiredNumberOfDomainControllers")
    private @Nullable Output<Integer> desiredNumberOfDomainControllers;

    /**
     * @return The number of domain controllers desired in the replicated directory. Minimum value of `2`.
     * 
     */
    public Optional<Output<Integer>> desiredNumberOfDomainControllers() {
        return Optional.ofNullable(this.desiredNumberOfDomainControllers);
    }

    /**
     * The identifier of the directory to which you want to add Region replication.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The identifier of the directory to which you want to add Region replication.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * The name of the Region where you want to add domain controllers for replication.
     * 
     */
    @Import(name="regionName", required=true)
    private Output<String> regionName;

    /**
     * @return The name of the Region where you want to add domain controllers for replication.
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * VPC information in the replicated Region. Detailed below.
     * 
     */
    @Import(name="vpcSettings", required=true)
    private Output<ServiceRegionVpcSettingsArgs> vpcSettings;

    /**
     * @return VPC information in the replicated Region. Detailed below.
     * 
     */
    public Output<ServiceRegionVpcSettingsArgs> vpcSettings() {
        return this.vpcSettings;
    }

    private ServiceRegionArgs() {}

    private ServiceRegionArgs(ServiceRegionArgs $) {
        this.desiredNumberOfDomainControllers = $.desiredNumberOfDomainControllers;
        this.directoryId = $.directoryId;
        this.regionName = $.regionName;
        this.tags = $.tags;
        this.vpcSettings = $.vpcSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegionArgs $;

        public Builder() {
            $ = new ServiceRegionArgs();
        }

        public Builder(ServiceRegionArgs defaults) {
            $ = new ServiceRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredNumberOfDomainControllers The number of domain controllers desired in the replicated directory. Minimum value of `2`.
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberOfDomainControllers(@Nullable Output<Integer> desiredNumberOfDomainControllers) {
            $.desiredNumberOfDomainControllers = desiredNumberOfDomainControllers;
            return this;
        }

        /**
         * @param desiredNumberOfDomainControllers The number of domain controllers desired in the replicated directory. Minimum value of `2`.
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberOfDomainControllers(Integer desiredNumberOfDomainControllers) {
            return desiredNumberOfDomainControllers(Output.of(desiredNumberOfDomainControllers));
        }

        /**
         * @param directoryId The identifier of the directory to which you want to add Region replication.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The identifier of the directory to which you want to add Region replication.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param regionName The name of the Region where you want to add domain controllers for replication.
         * 
         * @return builder
         * 
         */
        public Builder regionName(Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName The name of the Region where you want to add domain controllers for replication.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcSettings VPC information in the replicated Region. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcSettings(Output<ServiceRegionVpcSettingsArgs> vpcSettings) {
            $.vpcSettings = vpcSettings;
            return this;
        }

        /**
         * @param vpcSettings VPC information in the replicated Region. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcSettings(ServiceRegionVpcSettingsArgs vpcSettings) {
            return vpcSettings(Output.of(vpcSettings));
        }

        public ServiceRegionArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            $.regionName = Objects.requireNonNull($.regionName, "expected parameter 'regionName' to be non-null");
            $.vpcSettings = Objects.requireNonNull($.vpcSettings, "expected parameter 'vpcSettings' to be non-null");
            return $;
        }
    }

}
