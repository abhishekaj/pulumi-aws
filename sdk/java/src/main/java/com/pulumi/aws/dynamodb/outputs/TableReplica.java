// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableReplica {
    /**
     * @return ARN of the CMK that should be used for the AWS KMS encryption. This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    private @Nullable String kmsKeyArn;
    /**
     * @return Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    private @Nullable Boolean pointInTimeRecovery;
    /**
     * @return Whether to propagate the global table&#39;s tags to a replica. Default is `false`. Changes to tags only move in one direction: from global (source) to replica. In other words, tag drift on a replica will not trigger an update. Tag or replica changes on the global table, whether from drift or configuration changes, are propagated to replicas. Changing from `true` to `false` on a subsequent `apply` means replica tags are left as they were, unmanaged, not deleted.
     * 
     */
    private @Nullable Boolean propagateTags;
    /**
     * @return Region name of the replica.
     * 
     */
    private String regionName;

    private TableReplica() {}
    /**
     * @return ARN of the CMK that should be used for the AWS KMS encryption. This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    public Optional<Boolean> pointInTimeRecovery() {
        return Optional.ofNullable(this.pointInTimeRecovery);
    }
    /**
     * @return Whether to propagate the global table&#39;s tags to a replica. Default is `false`. Changes to tags only move in one direction: from global (source) to replica. In other words, tag drift on a replica will not trigger an update. Tag or replica changes on the global table, whether from drift or configuration changes, are propagated to replicas. Changing from `true` to `false` on a subsequent `apply` means replica tags are left as they were, unmanaged, not deleted.
     * 
     */
    public Optional<Boolean> propagateTags() {
        return Optional.ofNullable(this.propagateTags);
    }
    /**
     * @return Region name of the replica.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReplica defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private @Nullable Boolean pointInTimeRecovery;
        private @Nullable Boolean propagateTags;
        private String regionName;
        public Builder() {}
        public Builder(TableReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.pointInTimeRecovery = defaults.pointInTimeRecovery;
    	      this.propagateTags = defaults.propagateTags;
    	      this.regionName = defaults.regionName;
        }

        @CustomType.Setter
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        @CustomType.Setter
        public Builder pointInTimeRecovery(@Nullable Boolean pointInTimeRecovery) {
            this.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }
        @CustomType.Setter
        public Builder propagateTags(@Nullable Boolean propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public TableReplica build() {
            final var o = new TableReplica();
            o.kmsKeyArn = kmsKeyArn;
            o.pointInTimeRecovery = pointInTimeRecovery;
            o.propagateTags = propagateTags;
            o.regionName = regionName;
            return o;
        }
    }
}