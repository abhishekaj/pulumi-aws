// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OpenZfsVolumeOriginSnapshot {
    private String copyStrategy;
    private String snapshotArn;

    private OpenZfsVolumeOriginSnapshot() {}
    public String copyStrategy() {
        return this.copyStrategy;
    }
    public String snapshotArn() {
        return this.snapshotArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeOriginSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String copyStrategy;
        private String snapshotArn;
        public Builder() {}
        public Builder(OpenZfsVolumeOriginSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyStrategy = defaults.copyStrategy;
    	      this.snapshotArn = defaults.snapshotArn;
        }

        @CustomType.Setter
        public Builder copyStrategy(String copyStrategy) {
            this.copyStrategy = Objects.requireNonNull(copyStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotArn(String snapshotArn) {
            this.snapshotArn = Objects.requireNonNull(snapshotArn);
            return this;
        }
        public OpenZfsVolumeOriginSnapshot build() {
            final var o = new OpenZfsVolumeOriginSnapshot();
            o.copyStrategy = copyStrategy;
            o.snapshotArn = snapshotArn;
            return o;
        }
    }
}