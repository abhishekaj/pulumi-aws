// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceState Empty = new VpcEndpointServiceState();

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    @Import(name="acceptanceRequired")
    private @Nullable Output<Boolean> acceptanceRequired;

    /**
     * @return Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> acceptanceRequired() {
        return Optional.ofNullable(this.acceptanceRequired);
    }

    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    @Import(name="allowedPrincipals")
    private @Nullable Output<List<String>> allowedPrincipals;

    /**
     * @return The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    public Optional<Output<List<String>>> allowedPrincipals() {
        return Optional.ofNullable(this.allowedPrincipals);
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A set of Availability Zones in which the service is available.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    /**
     * @return A set of Availability Zones in which the service is available.
     * 
     */
    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * A set of DNS names for the service.
     * 
     */
    @Import(name="baseEndpointDnsNames")
    private @Nullable Output<List<String>> baseEndpointDnsNames;

    /**
     * @return A set of DNS names for the service.
     * 
     */
    public Optional<Output<List<String>>> baseEndpointDnsNames() {
        return Optional.ofNullable(this.baseEndpointDnsNames);
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    @Import(name="gatewayLoadBalancerArns")
    private @Nullable Output<List<String>> gatewayLoadBalancerArns;

    /**
     * @return Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    public Optional<Output<List<String>>> gatewayLoadBalancerArns() {
        return Optional.ofNullable(this.gatewayLoadBalancerArns);
    }

    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    @Import(name="managesVpcEndpoints")
    private @Nullable Output<Boolean> managesVpcEndpoints;

    /**
     * @return Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> managesVpcEndpoints() {
        return Optional.ofNullable(this.managesVpcEndpoints);
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    @Import(name="networkLoadBalancerArns")
    private @Nullable Output<List<String>> networkLoadBalancerArns;

    /**
     * @return Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    public Optional<Output<List<String>>> networkLoadBalancerArns() {
        return Optional.ofNullable(this.networkLoadBalancerArns);
    }

    /**
     * The private DNS name for the service.
     * 
     */
    @Import(name="privateDnsName")
    private @Nullable Output<String> privateDnsName;

    /**
     * @return The private DNS name for the service.
     * 
     */
    public Optional<Output<String>> privateDnsName() {
        return Optional.ofNullable(this.privateDnsName);
    }

    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    @Import(name="privateDnsNameConfigurations")
    private @Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationArgs>> privateDnsNameConfigurations;

    /**
     * @return List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    public Optional<Output<List<VpcEndpointServicePrivateDnsNameConfigurationArgs>>> privateDnsNameConfigurations() {
        return Optional.ofNullable(this.privateDnsNameConfigurations);
    }

    /**
     * The service name.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @Import(name="serviceType")
    private @Nullable Output<String> serviceType;

    /**
     * @return The service type, `Gateway` or `Interface`.
     * 
     */
    public Optional<Output<String>> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }

    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The supported IP address types. The possible values are `ipv4` and `ipv6`.
     * 
     */
    @Import(name="supportedIpAddressTypes")
    private @Nullable Output<List<String>> supportedIpAddressTypes;

    /**
     * @return The supported IP address types. The possible values are `ipv4` and `ipv6`.
     * 
     */
    public Optional<Output<List<String>>> supportedIpAddressTypes() {
        return Optional.ofNullable(this.supportedIpAddressTypes);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private VpcEndpointServiceState() {}

    private VpcEndpointServiceState(VpcEndpointServiceState $) {
        this.acceptanceRequired = $.acceptanceRequired;
        this.allowedPrincipals = $.allowedPrincipals;
        this.arn = $.arn;
        this.availabilityZones = $.availabilityZones;
        this.baseEndpointDnsNames = $.baseEndpointDnsNames;
        this.gatewayLoadBalancerArns = $.gatewayLoadBalancerArns;
        this.managesVpcEndpoints = $.managesVpcEndpoints;
        this.networkLoadBalancerArns = $.networkLoadBalancerArns;
        this.privateDnsName = $.privateDnsName;
        this.privateDnsNameConfigurations = $.privateDnsNameConfigurations;
        this.serviceName = $.serviceName;
        this.serviceType = $.serviceType;
        this.state = $.state;
        this.supportedIpAddressTypes = $.supportedIpAddressTypes;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceState $;

        public Builder() {
            $ = new VpcEndpointServiceState();
        }

        public Builder(VpcEndpointServiceState defaults) {
            $ = new VpcEndpointServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptanceRequired Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder acceptanceRequired(@Nullable Output<Boolean> acceptanceRequired) {
            $.acceptanceRequired = acceptanceRequired;
            return this;
        }

        /**
         * @param acceptanceRequired Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder acceptanceRequired(Boolean acceptanceRequired) {
            return acceptanceRequired(Output.of(acceptanceRequired));
        }

        /**
         * @param allowedPrincipals The ARNs of one or more principals allowed to discover the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipals(@Nullable Output<List<String>> allowedPrincipals) {
            $.allowedPrincipals = allowedPrincipals;
            return this;
        }

        /**
         * @param allowedPrincipals The ARNs of one or more principals allowed to discover the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipals(List<String> allowedPrincipals) {
            return allowedPrincipals(Output.of(allowedPrincipals));
        }

        /**
         * @param allowedPrincipals The ARNs of one or more principals allowed to discover the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipals(String... allowedPrincipals) {
            return allowedPrincipals(List.of(allowedPrincipals));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the VPC endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the VPC endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param availabilityZones A set of Availability Zones in which the service is available.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones A set of Availability Zones in which the service is available.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones A set of Availability Zones in which the service is available.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param baseEndpointDnsNames A set of DNS names for the service.
         * 
         * @return builder
         * 
         */
        public Builder baseEndpointDnsNames(@Nullable Output<List<String>> baseEndpointDnsNames) {
            $.baseEndpointDnsNames = baseEndpointDnsNames;
            return this;
        }

        /**
         * @param baseEndpointDnsNames A set of DNS names for the service.
         * 
         * @return builder
         * 
         */
        public Builder baseEndpointDnsNames(List<String> baseEndpointDnsNames) {
            return baseEndpointDnsNames(Output.of(baseEndpointDnsNames));
        }

        /**
         * @param baseEndpointDnsNames A set of DNS names for the service.
         * 
         * @return builder
         * 
         */
        public Builder baseEndpointDnsNames(String... baseEndpointDnsNames) {
            return baseEndpointDnsNames(List.of(baseEndpointDnsNames));
        }

        /**
         * @param gatewayLoadBalancerArns Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder gatewayLoadBalancerArns(@Nullable Output<List<String>> gatewayLoadBalancerArns) {
            $.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
            return this;
        }

        /**
         * @param gatewayLoadBalancerArns Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder gatewayLoadBalancerArns(List<String> gatewayLoadBalancerArns) {
            return gatewayLoadBalancerArns(Output.of(gatewayLoadBalancerArns));
        }

        /**
         * @param gatewayLoadBalancerArns Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder gatewayLoadBalancerArns(String... gatewayLoadBalancerArns) {
            return gatewayLoadBalancerArns(List.of(gatewayLoadBalancerArns));
        }

        /**
         * @param managesVpcEndpoints Whether or not the service manages its VPC endpoints - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder managesVpcEndpoints(@Nullable Output<Boolean> managesVpcEndpoints) {
            $.managesVpcEndpoints = managesVpcEndpoints;
            return this;
        }

        /**
         * @param managesVpcEndpoints Whether or not the service manages its VPC endpoints - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder managesVpcEndpoints(Boolean managesVpcEndpoints) {
            return managesVpcEndpoints(Output.of(managesVpcEndpoints));
        }

        /**
         * @param networkLoadBalancerArns Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerArns(@Nullable Output<List<String>> networkLoadBalancerArns) {
            $.networkLoadBalancerArns = networkLoadBalancerArns;
            return this;
        }

        /**
         * @param networkLoadBalancerArns Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerArns(List<String> networkLoadBalancerArns) {
            return networkLoadBalancerArns(Output.of(networkLoadBalancerArns));
        }

        /**
         * @param networkLoadBalancerArns Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerArns(String... networkLoadBalancerArns) {
            return networkLoadBalancerArns(List.of(networkLoadBalancerArns));
        }

        /**
         * @param privateDnsName The private DNS name for the service.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            $.privateDnsName = privateDnsName;
            return this;
        }

        /**
         * @param privateDnsName The private DNS name for the service.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(String privateDnsName) {
            return privateDnsName(Output.of(privateDnsName));
        }

        /**
         * @param privateDnsNameConfigurations List of objects containing information about the endpoint service private DNS name configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsNameConfigurations(@Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationArgs>> privateDnsNameConfigurations) {
            $.privateDnsNameConfigurations = privateDnsNameConfigurations;
            return this;
        }

        /**
         * @param privateDnsNameConfigurations List of objects containing information about the endpoint service private DNS name configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsNameConfigurations(List<VpcEndpointServicePrivateDnsNameConfigurationArgs> privateDnsNameConfigurations) {
            return privateDnsNameConfigurations(Output.of(privateDnsNameConfigurations));
        }

        /**
         * @param privateDnsNameConfigurations List of objects containing information about the endpoint service private DNS name configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsNameConfigurations(VpcEndpointServicePrivateDnsNameConfigurationArgs... privateDnsNameConfigurations) {
            return privateDnsNameConfigurations(List.of(privateDnsNameConfigurations));
        }

        /**
         * @param serviceName The service name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param serviceType The service type, `Gateway` or `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(@Nullable Output<String> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        /**
         * @param serviceType The service type, `Gateway` or `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(String serviceType) {
            return serviceType(Output.of(serviceType));
        }

        /**
         * @param state Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param supportedIpAddressTypes The supported IP address types. The possible values are `ipv4` and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder supportedIpAddressTypes(@Nullable Output<List<String>> supportedIpAddressTypes) {
            $.supportedIpAddressTypes = supportedIpAddressTypes;
            return this;
        }

        /**
         * @param supportedIpAddressTypes The supported IP address types. The possible values are `ipv4` and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder supportedIpAddressTypes(List<String> supportedIpAddressTypes) {
            return supportedIpAddressTypes(Output.of(supportedIpAddressTypes));
        }

        /**
         * @param supportedIpAddressTypes The supported IP address types. The possible values are `ipv4` and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder supportedIpAddressTypes(String... supportedIpAddressTypes) {
            return supportedIpAddressTypes(List.of(supportedIpAddressTypes));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public VpcEndpointServiceState build() {
            return $;
        }
    }

}