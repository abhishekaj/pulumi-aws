// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAll;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern {
    private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAll all;
    private @Nullable List<String> includedPaths;

    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern() {}
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAll> all() {
        return Optional.ofNullable(this.all);
    }
    public List<String> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAll all;
        private @Nullable List<String> includedPaths;
        public Builder() {}
        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        @CustomType.Setter
        public Builder all(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAll all) {
            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder includedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern build() {
            final var o = new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPattern();
            o.all = all;
            o.includedPaths = includedPaths;
            return o;
        }
    }
}