// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoryConnectSetting {
    private List<String> availabilityZones;
    /**
     * @return IP addresses of the AD Connector servers.
     * 
     */
    private List<String> connectIps;
    /**
     * @return DNS IP addresses of the domain to connect to.
     * 
     */
    private List<String> customerDnsIps;
    /**
     * @return Username corresponding to the password provided.
     * 
     */
    private String customerUsername;
    /**
     * @return Identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
     */
    private List<String> subnetIds;
    /**
     * @return ID of the VPC that the connector is in.
     * 
     */
    private String vpcId;

    private GetDirectoryConnectSetting() {}
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return IP addresses of the AD Connector servers.
     * 
     */
    public List<String> connectIps() {
        return this.connectIps;
    }
    /**
     * @return DNS IP addresses of the domain to connect to.
     * 
     */
    public List<String> customerDnsIps() {
        return this.customerDnsIps;
    }
    /**
     * @return Username corresponding to the password provided.
     * 
     */
    public String customerUsername() {
        return this.customerUsername;
    }
    /**
     * @return Identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return ID of the VPC that the connector is in.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryConnectSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> availabilityZones;
        private List<String> connectIps;
        private List<String> customerDnsIps;
        private String customerUsername;
        private List<String> subnetIds;
        private String vpcId;
        public Builder() {}
        public Builder(GetDirectoryConnectSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectIps = defaults.connectIps;
    	      this.customerDnsIps = defaults.customerDnsIps;
    	      this.customerUsername = defaults.customerUsername;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder connectIps(List<String> connectIps) {
            this.connectIps = Objects.requireNonNull(connectIps);
            return this;
        }
        public Builder connectIps(String... connectIps) {
            return connectIps(List.of(connectIps));
        }
        @CustomType.Setter
        public Builder customerDnsIps(List<String> customerDnsIps) {
            this.customerDnsIps = Objects.requireNonNull(customerDnsIps);
            return this;
        }
        public Builder customerDnsIps(String... customerDnsIps) {
            return customerDnsIps(List.of(customerDnsIps));
        }
        @CustomType.Setter
        public Builder customerUsername(String customerUsername) {
            this.customerUsername = Objects.requireNonNull(customerUsername);
            return this;
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetDirectoryConnectSetting build() {
            final var o = new GetDirectoryConnectSetting();
            o.availabilityZones = availabilityZones;
            o.connectIps = connectIps;
            o.customerDnsIps = customerDnsIps;
            o.customerUsername = customerUsername;
            o.subnetIds = subnetIds;
            o.vpcId = vpcId;
            return o;
        }
    }
}