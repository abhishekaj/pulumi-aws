// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupStatefulRuleOptions {
    /**
     * @return Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    private String ruleOrder;

    private RuleGroupRuleGroupStatefulRuleOptions() {}
    /**
     * @return Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    public String ruleOrder() {
        return this.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupStatefulRuleOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ruleOrder;
        public Builder() {}
        public Builder(RuleGroupRuleGroupStatefulRuleOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        @CustomType.Setter
        public Builder ruleOrder(String ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }
        public RuleGroupRuleGroupStatefulRuleOptions build() {
            final var o = new RuleGroupRuleGroupStatefulRuleOptions();
            o.ruleOrder = ruleOrder;
            return o;
        }
    }
}