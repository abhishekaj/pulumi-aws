// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrafficPolicyDocumentRuleRegion {
    /**
     * @return References to an endpoint.
     * 
     */
    private @Nullable String endpointReference;
    /**
     * @return Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
     * 
     */
    private @Nullable Boolean evaluateTargetHealth;
    /**
     * @return If you want to associate a health check with the endpoint or rule.
     * 
     */
    private @Nullable String healthCheck;
    /**
     * @return Region code for the AWS Region that you created the resource in.
     * 
     */
    private @Nullable String region;
    /**
     * @return References to a rule.
     * 
     */
    private @Nullable String ruleReference;

    private GetTrafficPolicyDocumentRuleRegion() {}
    /**
     * @return References to an endpoint.
     * 
     */
    public Optional<String> endpointReference() {
        return Optional.ofNullable(this.endpointReference);
    }
    /**
     * @return Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
     * 
     */
    public Optional<Boolean> evaluateTargetHealth() {
        return Optional.ofNullable(this.evaluateTargetHealth);
    }
    /**
     * @return If you want to associate a health check with the endpoint or rule.
     * 
     */
    public Optional<String> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }
    /**
     * @return Region code for the AWS Region that you created the resource in.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return References to a rule.
     * 
     */
    public Optional<String> ruleReference() {
        return Optional.ofNullable(this.ruleReference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficPolicyDocumentRuleRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endpointReference;
        private @Nullable Boolean evaluateTargetHealth;
        private @Nullable String healthCheck;
        private @Nullable String region;
        private @Nullable String ruleReference;
        public Builder() {}
        public Builder(GetTrafficPolicyDocumentRuleRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointReference = defaults.endpointReference;
    	      this.evaluateTargetHealth = defaults.evaluateTargetHealth;
    	      this.healthCheck = defaults.healthCheck;
    	      this.region = defaults.region;
    	      this.ruleReference = defaults.ruleReference;
        }

        @CustomType.Setter
        public Builder endpointReference(@Nullable String endpointReference) {
            this.endpointReference = endpointReference;
            return this;
        }
        @CustomType.Setter
        public Builder evaluateTargetHealth(@Nullable Boolean evaluateTargetHealth) {
            this.evaluateTargetHealth = evaluateTargetHealth;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheck(@Nullable String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder ruleReference(@Nullable String ruleReference) {
            this.ruleReference = ruleReference;
            return this;
        }
        public GetTrafficPolicyDocumentRuleRegion build() {
            final var o = new GetTrafficPolicyDocumentRuleRegion();
            o.endpointReference = endpointReference;
            o.evaluateTargetHealth = evaluateTargetHealth;
            o.healthCheck = healthCheck;
            o.region = region;
            o.ruleReference = ruleReference;
            return o;
        }
    }
}