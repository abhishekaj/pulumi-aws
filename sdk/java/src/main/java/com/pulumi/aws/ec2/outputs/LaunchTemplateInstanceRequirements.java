// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsAcceleratorCount;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMib;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbps;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsMemoryGibPerVcpu;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsMemoryMib;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsNetworkInterfaceCount;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsTotalLocalStorageGb;
import com.pulumi.aws.ec2.outputs.LaunchTemplateInstanceRequirementsVcpuCount;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateInstanceRequirements {
    /**
     * @return Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsAcceleratorCount acceleratorCount;
    /**
     * @return List of accelerator manufacturer names. Default is any manufacturer.
     * 
     */
    private @Nullable List<String> acceleratorManufacturers;
    /**
     * @return List of accelerator names. Default is any acclerator.
     * 
     */
    private @Nullable List<String> acceleratorNames;
    /**
     * @return Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMib acceleratorTotalMemoryMib;
    /**
     * @return List of accelerator types. Default is any accelerator type.
     * 
     */
    private @Nullable List<String> acceleratorTypes;
    /**
     * @return Indicate whether bare metal instace types should be `included`, `excluded`, or `required`. Default is `excluded`.
     * 
     */
    private @Nullable String bareMetal;
    /**
     * @return Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbps baselineEbsBandwidthMbps;
    /**
     * @return Indicate whether burstable performance instance types should be `included`, `excluded`, or `required`. Default is `excluded`.
     * 
     */
    private @Nullable String burstablePerformance;
    /**
     * @return List of CPU manufacturer names. Default is any manufacturer.
     * 
     */
    private @Nullable List<String> cpuManufacturers;
    /**
     * @return List of instance types to exclude. You can use strings with one or more wild cards, represented by an asterisk (\*). The following are examples: `c5*`, `m5a.*`, `r*`, `*3*`. For example, if you specify `c5*`, you are excluding the entire C5 instance family, which includes all C5a and C5n instance types. If you specify `m5a.*`, you are excluding all the M5a instance types, but not the M5n instance types. Maximum of 400 entries in the list; each entry is limited to 30 characters. Default is no excluded instance types.
     * 
     */
    private @Nullable List<String> excludedInstanceTypes;
    /**
     * @return List of instance generation names. Default is any generation.
     * 
     */
    private @Nullable List<String> instanceGenerations;
    /**
     * @return Indicate whether instance types with local storage volumes are `included`, `excluded`, or `required`. Default is `included`.
     * 
     */
    private @Nullable String localStorage;
    /**
     * @return List of local storage type names. Default any storage type.
     * 
     */
    private @Nullable List<String> localStorageTypes;
    /**
     * @return Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsMemoryGibPerVcpu memoryGibPerVcpu;
    /**
     * @return Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * 
     */
    private LaunchTemplateInstanceRequirementsMemoryMib memoryMib;
    /**
     * @return Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsNetworkInterfaceCount networkInterfaceCount;
    /**
     * @return The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999. Default is 20.
     * 
     */
    private @Nullable Integer onDemandMaxPricePercentageOverLowestPrice;
    /**
     * @return Indicate whether instance types must support On-Demand Instance Hibernation, either `true` or `false`. Default is `false`.
     * 
     */
    private @Nullable Boolean requireHibernateSupport;
    /**
     * @return The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999. Default is 100.
     * 
     */
    private @Nullable Integer spotMaxPricePercentageOverLowestPrice;
    /**
     * @return Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * 
     */
    private @Nullable LaunchTemplateInstanceRequirementsTotalLocalStorageGb totalLocalStorageGb;
    /**
     * @return Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * 
     */
    private LaunchTemplateInstanceRequirementsVcpuCount vcpuCount;

    private LaunchTemplateInstanceRequirements() {}
    /**
     * @return Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsAcceleratorCount> acceleratorCount() {
        return Optional.ofNullable(this.acceleratorCount);
    }
    /**
     * @return List of accelerator manufacturer names. Default is any manufacturer.
     * 
     */
    public List<String> acceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? List.of() : this.acceleratorManufacturers;
    }
    /**
     * @return List of accelerator names. Default is any acclerator.
     * 
     */
    public List<String> acceleratorNames() {
        return this.acceleratorNames == null ? List.of() : this.acceleratorNames;
    }
    /**
     * @return Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMib> acceleratorTotalMemoryMib() {
        return Optional.ofNullable(this.acceleratorTotalMemoryMib);
    }
    /**
     * @return List of accelerator types. Default is any accelerator type.
     * 
     */
    public List<String> acceleratorTypes() {
        return this.acceleratorTypes == null ? List.of() : this.acceleratorTypes;
    }
    /**
     * @return Indicate whether bare metal instace types should be `included`, `excluded`, or `required`. Default is `excluded`.
     * 
     */
    public Optional<String> bareMetal() {
        return Optional.ofNullable(this.bareMetal);
    }
    /**
     * @return Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbps> baselineEbsBandwidthMbps() {
        return Optional.ofNullable(this.baselineEbsBandwidthMbps);
    }
    /**
     * @return Indicate whether burstable performance instance types should be `included`, `excluded`, or `required`. Default is `excluded`.
     * 
     */
    public Optional<String> burstablePerformance() {
        return Optional.ofNullable(this.burstablePerformance);
    }
    /**
     * @return List of CPU manufacturer names. Default is any manufacturer.
     * 
     */
    public List<String> cpuManufacturers() {
        return this.cpuManufacturers == null ? List.of() : this.cpuManufacturers;
    }
    /**
     * @return List of instance types to exclude. You can use strings with one or more wild cards, represented by an asterisk (\*). The following are examples: `c5*`, `m5a.*`, `r*`, `*3*`. For example, if you specify `c5*`, you are excluding the entire C5 instance family, which includes all C5a and C5n instance types. If you specify `m5a.*`, you are excluding all the M5a instance types, but not the M5n instance types. Maximum of 400 entries in the list; each entry is limited to 30 characters. Default is no excluded instance types.
     * 
     */
    public List<String> excludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? List.of() : this.excludedInstanceTypes;
    }
    /**
     * @return List of instance generation names. Default is any generation.
     * 
     */
    public List<String> instanceGenerations() {
        return this.instanceGenerations == null ? List.of() : this.instanceGenerations;
    }
    /**
     * @return Indicate whether instance types with local storage volumes are `included`, `excluded`, or `required`. Default is `included`.
     * 
     */
    public Optional<String> localStorage() {
        return Optional.ofNullable(this.localStorage);
    }
    /**
     * @return List of local storage type names. Default any storage type.
     * 
     */
    public List<String> localStorageTypes() {
        return this.localStorageTypes == null ? List.of() : this.localStorageTypes;
    }
    /**
     * @return Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsMemoryGibPerVcpu> memoryGibPerVcpu() {
        return Optional.ofNullable(this.memoryGibPerVcpu);
    }
    /**
     * @return Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * 
     */
    public LaunchTemplateInstanceRequirementsMemoryMib memoryMib() {
        return this.memoryMib;
    }
    /**
     * @return Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsNetworkInterfaceCount> networkInterfaceCount() {
        return Optional.ofNullable(this.networkInterfaceCount);
    }
    /**
     * @return The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999. Default is 20.
     * 
     */
    public Optional<Integer> onDemandMaxPricePercentageOverLowestPrice() {
        return Optional.ofNullable(this.onDemandMaxPricePercentageOverLowestPrice);
    }
    /**
     * @return Indicate whether instance types must support On-Demand Instance Hibernation, either `true` or `false`. Default is `false`.
     * 
     */
    public Optional<Boolean> requireHibernateSupport() {
        return Optional.ofNullable(this.requireHibernateSupport);
    }
    /**
     * @return The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as 999999. Default is 100.
     * 
     */
    public Optional<Integer> spotMaxPricePercentageOverLowestPrice() {
        return Optional.ofNullable(this.spotMaxPricePercentageOverLowestPrice);
    }
    /**
     * @return Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * 
     */
    public Optional<LaunchTemplateInstanceRequirementsTotalLocalStorageGb> totalLocalStorageGb() {
        return Optional.ofNullable(this.totalLocalStorageGb);
    }
    /**
     * @return Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * 
     */
    public LaunchTemplateInstanceRequirementsVcpuCount vcpuCount() {
        return this.vcpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceRequirements defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LaunchTemplateInstanceRequirementsAcceleratorCount acceleratorCount;
        private @Nullable List<String> acceleratorManufacturers;
        private @Nullable List<String> acceleratorNames;
        private @Nullable LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMib acceleratorTotalMemoryMib;
        private @Nullable List<String> acceleratorTypes;
        private @Nullable String bareMetal;
        private @Nullable LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbps baselineEbsBandwidthMbps;
        private @Nullable String burstablePerformance;
        private @Nullable List<String> cpuManufacturers;
        private @Nullable List<String> excludedInstanceTypes;
        private @Nullable List<String> instanceGenerations;
        private @Nullable String localStorage;
        private @Nullable List<String> localStorageTypes;
        private @Nullable LaunchTemplateInstanceRequirementsMemoryGibPerVcpu memoryGibPerVcpu;
        private LaunchTemplateInstanceRequirementsMemoryMib memoryMib;
        private @Nullable LaunchTemplateInstanceRequirementsNetworkInterfaceCount networkInterfaceCount;
        private @Nullable Integer onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Boolean requireHibernateSupport;
        private @Nullable Integer spotMaxPricePercentageOverLowestPrice;
        private @Nullable LaunchTemplateInstanceRequirementsTotalLocalStorageGb totalLocalStorageGb;
        private LaunchTemplateInstanceRequirementsVcpuCount vcpuCount;
        public Builder() {}
        public Builder(LaunchTemplateInstanceRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMib = defaults.acceleratorTotalMemoryMib;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGibPerVcpu = defaults.memoryGibPerVcpu;
    	      this.memoryMib = defaults.memoryMib;
    	      this.networkInterfaceCount = defaults.networkInterfaceCount;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGb = defaults.totalLocalStorageGb;
    	      this.vcpuCount = defaults.vcpuCount;
        }

        @CustomType.Setter
        public Builder acceleratorCount(@Nullable LaunchTemplateInstanceRequirementsAcceleratorCount acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        @CustomType.Setter
        public Builder acceleratorManufacturers(@Nullable List<String> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }
        public Builder acceleratorManufacturers(String... acceleratorManufacturers) {
            return acceleratorManufacturers(List.of(acceleratorManufacturers));
        }
        @CustomType.Setter
        public Builder acceleratorNames(@Nullable List<String> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }
        public Builder acceleratorNames(String... acceleratorNames) {
            return acceleratorNames(List.of(acceleratorNames));
        }
        @CustomType.Setter
        public Builder acceleratorTotalMemoryMib(@Nullable LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMib acceleratorTotalMemoryMib) {
            this.acceleratorTotalMemoryMib = acceleratorTotalMemoryMib;
            return this;
        }
        @CustomType.Setter
        public Builder acceleratorTypes(@Nullable List<String> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }
        public Builder acceleratorTypes(String... acceleratorTypes) {
            return acceleratorTypes(List.of(acceleratorTypes));
        }
        @CustomType.Setter
        public Builder bareMetal(@Nullable String bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }
        @CustomType.Setter
        public Builder baselineEbsBandwidthMbps(@Nullable LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbps baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }
        @CustomType.Setter
        public Builder burstablePerformance(@Nullable String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        @CustomType.Setter
        public Builder cpuManufacturers(@Nullable List<String> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }
        public Builder cpuManufacturers(String... cpuManufacturers) {
            return cpuManufacturers(List.of(cpuManufacturers));
        }
        @CustomType.Setter
        public Builder excludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public Builder excludedInstanceTypes(String... excludedInstanceTypes) {
            return excludedInstanceTypes(List.of(excludedInstanceTypes));
        }
        @CustomType.Setter
        public Builder instanceGenerations(@Nullable List<String> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public Builder instanceGenerations(String... instanceGenerations) {
            return instanceGenerations(List.of(instanceGenerations));
        }
        @CustomType.Setter
        public Builder localStorage(@Nullable String localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        @CustomType.Setter
        public Builder localStorageTypes(@Nullable List<String> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }
        public Builder localStorageTypes(String... localStorageTypes) {
            return localStorageTypes(List.of(localStorageTypes));
        }
        @CustomType.Setter
        public Builder memoryGibPerVcpu(@Nullable LaunchTemplateInstanceRequirementsMemoryGibPerVcpu memoryGibPerVcpu) {
            this.memoryGibPerVcpu = memoryGibPerVcpu;
            return this;
        }
        @CustomType.Setter
        public Builder memoryMib(LaunchTemplateInstanceRequirementsMemoryMib memoryMib) {
            this.memoryMib = Objects.requireNonNull(memoryMib);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceCount(@Nullable LaunchTemplateInstanceRequirementsNetworkInterfaceCount networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        @CustomType.Setter
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }
        @CustomType.Setter
        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }
        @CustomType.Setter
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }
        @CustomType.Setter
        public Builder totalLocalStorageGb(@Nullable LaunchTemplateInstanceRequirementsTotalLocalStorageGb totalLocalStorageGb) {
            this.totalLocalStorageGb = totalLocalStorageGb;
            return this;
        }
        @CustomType.Setter
        public Builder vcpuCount(LaunchTemplateInstanceRequirementsVcpuCount vcpuCount) {
            this.vcpuCount = Objects.requireNonNull(vcpuCount);
            return this;
        }
        public LaunchTemplateInstanceRequirements build() {
            final var o = new LaunchTemplateInstanceRequirements();
            o.acceleratorCount = acceleratorCount;
            o.acceleratorManufacturers = acceleratorManufacturers;
            o.acceleratorNames = acceleratorNames;
            o.acceleratorTotalMemoryMib = acceleratorTotalMemoryMib;
            o.acceleratorTypes = acceleratorTypes;
            o.bareMetal = bareMetal;
            o.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            o.burstablePerformance = burstablePerformance;
            o.cpuManufacturers = cpuManufacturers;
            o.excludedInstanceTypes = excludedInstanceTypes;
            o.instanceGenerations = instanceGenerations;
            o.localStorage = localStorage;
            o.localStorageTypes = localStorageTypes;
            o.memoryGibPerVcpu = memoryGibPerVcpu;
            o.memoryMib = memoryMib;
            o.networkInterfaceCount = networkInterfaceCount;
            o.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            o.requireHibernateSupport = requireHibernateSupport;
            o.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            o.totalLocalStorageGb = totalLocalStorageGb;
            o.vcpuCount = vcpuCount;
            return o;
        }
    }
}