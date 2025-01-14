// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VpcEndpointServiceAllowedPrincipleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceAllowedPrincipleArgs Empty = new VpcEndpointServiceAllowedPrincipleArgs();

    /**
     * The ARN of the principal to allow permissions.
     * 
     */
    @Import(name="principalArn", required=true)
    private Output<String> principalArn;

    /**
     * @return The ARN of the principal to allow permissions.
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
    }

    /**
     * The ID of the VPC endpoint service to allow permission.
     * 
     */
    @Import(name="vpcEndpointServiceId", required=true)
    private Output<String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC endpoint service to allow permission.
     * 
     */
    public Output<String> vpcEndpointServiceId() {
        return this.vpcEndpointServiceId;
    }

    private VpcEndpointServiceAllowedPrincipleArgs() {}

    private VpcEndpointServiceAllowedPrincipleArgs(VpcEndpointServiceAllowedPrincipleArgs $) {
        this.principalArn = $.principalArn;
        this.vpcEndpointServiceId = $.vpcEndpointServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceAllowedPrincipleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceAllowedPrincipleArgs $;

        public Builder() {
            $ = new VpcEndpointServiceAllowedPrincipleArgs();
        }

        public Builder(VpcEndpointServiceAllowedPrincipleArgs defaults) {
            $ = new VpcEndpointServiceAllowedPrincipleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalArn The ARN of the principal to allow permissions.
         * 
         * @return builder
         * 
         */
        public Builder principalArn(Output<String> principalArn) {
            $.principalArn = principalArn;
            return this;
        }

        /**
         * @param principalArn The ARN of the principal to allow permissions.
         * 
         * @return builder
         * 
         */
        public Builder principalArn(String principalArn) {
            return principalArn(Output.of(principalArn));
        }

        /**
         * @param vpcEndpointServiceId The ID of the VPC endpoint service to allow permission.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceId(Output<String> vpcEndpointServiceId) {
            $.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }

        /**
         * @param vpcEndpointServiceId The ID of the VPC endpoint service to allow permission.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceId(String vpcEndpointServiceId) {
            return vpcEndpointServiceId(Output.of(vpcEndpointServiceId));
        }

        public VpcEndpointServiceAllowedPrincipleArgs build() {
            $.principalArn = Objects.requireNonNull($.principalArn, "expected parameter 'principalArn' to be non-null");
            $.vpcEndpointServiceId = Objects.requireNonNull($.vpcEndpointServiceId, "expected parameter 'vpcEndpointServiceId' to be non-null");
            return $;
        }
    }

}
