// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyExpression;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPermissionsLfTagPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsLfTagPolicy Empty = new GetPermissionsLfTagPolicy();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    /**
     * List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
     * 
     */
    @Import(name="expressions", required=true)
    private List<GetPermissionsLfTagPolicyExpression> expressions;

    /**
     * @return List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
     * 
     */
    public List<GetPermissionsLfTagPolicyExpression> expressions() {
        return this.expressions;
    }

    /**
     * Resource type for which the tag policy applies. Valid values are `DATABASE` and `TABLE`.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Resource type for which the tag policy applies. Valid values are `DATABASE` and `TABLE`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private GetPermissionsLfTagPolicy() {}

    private GetPermissionsLfTagPolicy(GetPermissionsLfTagPolicy $) {
        this.catalogId = $.catalogId;
        this.expressions = $.expressions;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsLfTagPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsLfTagPolicy $;

        public Builder() {
            $ = new GetPermissionsLfTagPolicy();
        }

        public Builder(GetPermissionsLfTagPolicy defaults) {
            $ = new GetPermissionsLfTagPolicy(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param expressions List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
         * 
         * @return builder
         * 
         */
        public Builder expressions(List<GetPermissionsLfTagPolicyExpression> expressions) {
            $.expressions = expressions;
            return this;
        }

        /**
         * @param expressions List of tag conditions that apply to the resource&#39;s tag policy. Configuration block for tag conditions that apply to the policy. See `expression` below.
         * 
         * @return builder
         * 
         */
        public Builder expressions(GetPermissionsLfTagPolicyExpression... expressions) {
            return expressions(List.of(expressions));
        }

        /**
         * @param resourceType Resource type for which the tag policy applies. Valid values are `DATABASE` and `TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public GetPermissionsLfTagPolicy build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.expressions = Objects.requireNonNull($.expressions, "expected parameter 'expressions' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}