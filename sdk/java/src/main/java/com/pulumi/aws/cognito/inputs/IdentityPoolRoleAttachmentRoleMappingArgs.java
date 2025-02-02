// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityPoolRoleAttachmentRoleMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityPoolRoleAttachmentRoleMappingArgs Empty = new IdentityPoolRoleAttachmentRoleMappingArgs();

    /**
     * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    @Import(name="ambiguousRoleResolution")
    private @Nullable Output<String> ambiguousRoleResolution;

    /**
     * @return Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    public Optional<Output<String>> ambiguousRoleResolution() {
        return Optional.ofNullable(this.ambiguousRoleResolution);
    }

    /**
     * A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    @Import(name="identityProvider", required=true)
    private Output<String> identityProvider;

    /**
     * @return A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    public Output<String> identityProvider() {
        return this.identityProvider;
    }

    /**
     * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    @Import(name="mappingRules")
    private @Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules;

    /**
     * @return The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    public Optional<Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>>> mappingRules() {
        return Optional.ofNullable(this.mappingRules);
    }

    /**
     * The role mapping type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The role mapping type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private IdentityPoolRoleAttachmentRoleMappingArgs() {}

    private IdentityPoolRoleAttachmentRoleMappingArgs(IdentityPoolRoleAttachmentRoleMappingArgs $) {
        this.ambiguousRoleResolution = $.ambiguousRoleResolution;
        this.identityProvider = $.identityProvider;
        this.mappingRules = $.mappingRules;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPoolRoleAttachmentRoleMappingArgs $;

        public Builder() {
            $ = new IdentityPoolRoleAttachmentRoleMappingArgs();
        }

        public Builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
            $ = new IdentityPoolRoleAttachmentRoleMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ambiguousRoleResolution Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
         * 
         * @return builder
         * 
         */
        public Builder ambiguousRoleResolution(@Nullable Output<String> ambiguousRoleResolution) {
            $.ambiguousRoleResolution = ambiguousRoleResolution;
            return this;
        }

        /**
         * @param ambiguousRoleResolution Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
         * 
         * @return builder
         * 
         */
        public Builder ambiguousRoleResolution(String ambiguousRoleResolution) {
            return ambiguousRoleResolution(Output.of(ambiguousRoleResolution));
        }

        /**
         * @param identityProvider A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(Output<String> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(String identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        /**
         * @param mappingRules The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
         * 
         * @return builder
         * 
         */
        public Builder mappingRules(@Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules) {
            $.mappingRules = mappingRules;
            return this;
        }

        /**
         * @param mappingRules The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
         * 
         * @return builder
         * 
         */
        public Builder mappingRules(List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs> mappingRules) {
            return mappingRules(Output.of(mappingRules));
        }

        /**
         * @param mappingRules The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
         * 
         * @return builder
         * 
         */
        public Builder mappingRules(IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs... mappingRules) {
            return mappingRules(List.of(mappingRules));
        }

        /**
         * @param type The role mapping type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The role mapping type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IdentityPoolRoleAttachmentRoleMappingArgs build() {
            $.identityProvider = Objects.requireNonNull($.identityProvider, "expected parameter 'identityProvider' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
