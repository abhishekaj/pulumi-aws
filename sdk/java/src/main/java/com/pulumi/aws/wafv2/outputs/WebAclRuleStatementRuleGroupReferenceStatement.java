// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementExcludedRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRuleGroupReferenceStatement {
    /**
     * @return The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
     */
    private String arn;
    /**
     * @return The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    private @Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules;

    private WebAclRuleStatementRuleGroupReferenceStatement() {}
    /**
     * @return The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    public List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules() {
        return this.excludedRules == null ? List.of() : this.excludedRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private @Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules;
        public Builder() {}
        public Builder(WebAclRuleStatementRuleGroupReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.excludedRules = defaults.excludedRules;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder excludedRules(@Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }
        public Builder excludedRules(WebAclRuleStatementRuleGroupReferenceStatementExcludedRule... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }
        public WebAclRuleStatementRuleGroupReferenceStatement build() {
            final var o = new WebAclRuleStatementRuleGroupReferenceStatement();
            o.arn = arn;
            o.excludedRules = excludedRules;
            return o;
        }
    }
}
