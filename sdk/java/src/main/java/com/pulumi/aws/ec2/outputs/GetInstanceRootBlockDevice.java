// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceRootBlockDevice {
    /**
     * @return If the root block device will be deleted on termination.
     * 
     */
    private Boolean deleteOnTermination;
    /**
     * @return Physical name of the device.
     * 
     */
    private String deviceName;
    /**
     * @return If the EBS volume is encrypted.
     * 
     */
    private Boolean encrypted;
    /**
     * @return `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
     * 
     */
    private Integer iops;
    private String kmsKeyId;
    /**
     * @return Map of tags assigned to the Instance.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Throughput of the volume, in MiB/s.
     * 
     */
    private Integer throughput;
    private String volumeId;
    /**
     * @return Size of the volume, in GiB.
     * 
     */
    private Integer volumeSize;
    /**
     * @return Type of the volume.
     * 
     */
    private String volumeType;

    private GetInstanceRootBlockDevice() {}
    /**
     * @return If the root block device will be deleted on termination.
     * 
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * @return Physical name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return If the EBS volume is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return Map of tags assigned to the Instance.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Throughput of the volume, in MiB/s.
     * 
     */
    public Integer throughput() {
        return this.throughput;
    }
    public String volumeId() {
        return this.volumeId;
    }
    /**
     * @return Size of the volume, in GiB.
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * @return Type of the volume.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceRootBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private String kmsKeyId;
        private Map<String,String> tags;
        private Integer throughput;
        private String volumeId;
        private Integer volumeSize;
        private String volumeType;
        public Builder() {}
        public Builder(GetInstanceRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        @CustomType.Setter
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder throughput(Integer throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        @CustomType.Setter
        public Builder volumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetInstanceRootBlockDevice build() {
            final var o = new GetInstanceRootBlockDevice();
            o.deleteOnTermination = deleteOnTermination;
            o.deviceName = deviceName;
            o.encrypted = encrypted;
            o.iops = iops;
            o.kmsKeyId = kmsKeyId;
            o.tags = tags;
            o.throughput = throughput;
            o.volumeId = volumeId;
            o.volumeSize = volumeSize;
            o.volumeType = volumeType;
            return o;
        }
    }
}