// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement {
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement> statements;

    private WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement() {}
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement();
            o.statements = statements;
            return o;
        }
    }
}