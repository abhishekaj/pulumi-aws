// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyStatelessCustomAction {
    /**
     * @return A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition;
    /**
     * @return A friendly name of the custom action.
     * 
     */
    private String actionName;

    private FirewallPolicyFirewallPolicyStatelessCustomAction() {}
    /**
     * @return A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition() {
        return this.actionDefinition;
    }
    /**
     * @return A friendly name of the custom action.
     * 
     */
    public String actionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition;
        private String actionName;
        public Builder() {}
        public Builder(FirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        @CustomType.Setter
        public Builder actionDefinition(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }
        @CustomType.Setter
        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessCustomAction build() {
            final var o = new FirewallPolicyFirewallPolicyStatelessCustomAction();
            o.actionDefinition = actionDefinition;
            o.actionName = actionName;
            return o;
        }
    }
}