// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFleetInstanceTypeConfigEbsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFleetInstanceTypeConfigEbsConfigArgs Empty = new InstanceFleetInstanceTypeConfigEbsConfigArgs();

    /**
     * The number of I/O operations per second (IOPS) that the volume supports
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return The number of I/O operations per second (IOPS) that the volume supports
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * The volume size, in gibibytes (GiB).
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The volume size, in gibibytes (GiB).
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
     * 
     */
    @Import(name="volumesPerInstance")
    private @Nullable Output<Integer> volumesPerInstance;

    /**
     * @return The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
     * 
     */
    public Optional<Output<Integer>> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    private InstanceFleetInstanceTypeConfigEbsConfigArgs() {}

    private InstanceFleetInstanceTypeConfigEbsConfigArgs(InstanceFleetInstanceTypeConfigEbsConfigArgs $) {
        this.iops = $.iops;
        this.size = $.size;
        this.type = $.type;
        this.volumesPerInstance = $.volumesPerInstance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFleetInstanceTypeConfigEbsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFleetInstanceTypeConfigEbsConfigArgs $;

        public Builder() {
            $ = new InstanceFleetInstanceTypeConfigEbsConfigArgs();
        }

        public Builder(InstanceFleetInstanceTypeConfigEbsConfigArgs defaults) {
            $ = new InstanceFleetInstanceTypeConfigEbsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iops The number of I/O operations per second (IOPS) that the volume supports
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops The number of I/O operations per second (IOPS) that the volume supports
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param size The volume size, in gibibytes (GiB).
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The volume size, in gibibytes (GiB).
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param type The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param volumesPerInstance The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(@Nullable Output<Integer> volumesPerInstance) {
            $.volumesPerInstance = volumesPerInstance;
            return this;
        }

        /**
         * @param volumesPerInstance The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(Integer volumesPerInstance) {
            return volumesPerInstance(Output.of(volumesPerInstance));
        }

        public InstanceFleetInstanceTypeConfigEbsConfigArgs build() {
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}