// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerBackendServerPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendServerPolicyState Empty = new LoadBalancerBackendServerPolicyState();

    /**
     * The instance port to apply the policy to.
     * 
     */
    @Import(name="instancePort")
    private @Nullable Output<Integer> instancePort;

    /**
     * @return The instance port to apply the policy to.
     * 
     */
    public Optional<Output<Integer>> instancePort() {
        return Optional.ofNullable(this.instancePort);
    }

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return The load balancer to attach the policy to.
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Import(name="policyNames")
    private @Nullable Output<List<String>> policyNames;

    /**
     * @return List of Policy Names to apply to the backend server.
     * 
     */
    public Optional<Output<List<String>>> policyNames() {
        return Optional.ofNullable(this.policyNames);
    }

    private LoadBalancerBackendServerPolicyState() {}

    private LoadBalancerBackendServerPolicyState(LoadBalancerBackendServerPolicyState $) {
        this.instancePort = $.instancePort;
        this.loadBalancerName = $.loadBalancerName;
        this.policyNames = $.policyNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerBackendServerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerBackendServerPolicyState $;

        public Builder() {
            $ = new LoadBalancerBackendServerPolicyState();
        }

        public Builder(LoadBalancerBackendServerPolicyState defaults) {
            $ = new LoadBalancerBackendServerPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instancePort The instance port to apply the policy to.
         * 
         * @return builder
         * 
         */
        public Builder instancePort(@Nullable Output<Integer> instancePort) {
            $.instancePort = instancePort;
            return this;
        }

        /**
         * @param instancePort The instance port to apply the policy to.
         * 
         * @return builder
         * 
         */
        public Builder instancePort(Integer instancePort) {
            return instancePort(Output.of(instancePort));
        }

        /**
         * @param loadBalancerName The load balancer to attach the policy to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The load balancer to attach the policy to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param policyNames List of Policy Names to apply to the backend server.
         * 
         * @return builder
         * 
         */
        public Builder policyNames(@Nullable Output<List<String>> policyNames) {
            $.policyNames = policyNames;
            return this;
        }

        /**
         * @param policyNames List of Policy Names to apply to the backend server.
         * 
         * @return builder
         * 
         */
        public Builder policyNames(List<String> policyNames) {
            return policyNames(Output.of(policyNames));
        }

        /**
         * @param policyNames List of Policy Names to apply to the backend server.
         * 
         * @return builder
         * 
         */
        public Builder policyNames(String... policyNames) {
            return policyNames(List.of(policyNames));
        }

        public LoadBalancerBackendServerPolicyState build() {
            return $;
        }
    }

}
