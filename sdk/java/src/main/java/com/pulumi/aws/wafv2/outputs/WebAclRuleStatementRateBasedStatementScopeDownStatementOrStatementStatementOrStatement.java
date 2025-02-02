// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement {
    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement> statements;

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement() {}
    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement build() {
            final var o = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement();
            o.statements = statements;
            return o;
        }
    }
}
