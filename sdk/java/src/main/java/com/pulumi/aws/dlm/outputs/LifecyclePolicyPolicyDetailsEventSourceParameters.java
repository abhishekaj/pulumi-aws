// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LifecyclePolicyPolicyDetailsEventSourceParameters {
    /**
     * @return The snapshot description that can trigger the policy. The description pattern is specified using a regular expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared with your account.
     * 
     */
    private String descriptionRegex;
    /**
     * @return The type of event. Currently, only `shareSnapshot` events are supported.
     * 
     */
    private String eventType;
    /**
     * @return The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs if one of the specified AWS accounts shares a snapshot with your account.
     * 
     */
    private List<String> snapshotOwners;

    private LifecyclePolicyPolicyDetailsEventSourceParameters() {}
    /**
     * @return The snapshot description that can trigger the policy. The description pattern is specified using a regular expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared with your account.
     * 
     */
    public String descriptionRegex() {
        return this.descriptionRegex;
    }
    /**
     * @return The type of event. Currently, only `shareSnapshot` events are supported.
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs if one of the specified AWS accounts shares a snapshot with your account.
     * 
     */
    public List<String> snapshotOwners() {
        return this.snapshotOwners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsEventSourceParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String descriptionRegex;
        private String eventType;
        private List<String> snapshotOwners;
        public Builder() {}
        public Builder(LifecyclePolicyPolicyDetailsEventSourceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.descriptionRegex = defaults.descriptionRegex;
    	      this.eventType = defaults.eventType;
    	      this.snapshotOwners = defaults.snapshotOwners;
        }

        @CustomType.Setter
        public Builder descriptionRegex(String descriptionRegex) {
            this.descriptionRegex = Objects.requireNonNull(descriptionRegex);
            return this;
        }
        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotOwners(List<String> snapshotOwners) {
            this.snapshotOwners = Objects.requireNonNull(snapshotOwners);
            return this;
        }
        public Builder snapshotOwners(String... snapshotOwners) {
            return snapshotOwners(List.of(snapshotOwners));
        }
        public LifecyclePolicyPolicyDetailsEventSourceParameters build() {
            final var o = new LifecyclePolicyPolicyDetailsEventSourceParameters();
            o.descriptionRegex = descriptionRegex;
            o.eventType = eventType;
            o.snapshotOwners = snapshotOwners;
            return o;
        }
    }
}