// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSigningJobSignedObjectS3 {
    private String bucket;
    private String key;

    private GetSigningJobSignedObjectS3() {}
    public String bucket() {
        return this.bucket;
    }
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSignedObjectS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String key;
        public Builder() {}
        public Builder(GetSigningJobSignedObjectS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public GetSigningJobSignedObjectS3 build() {
            final var o = new GetSigningJobSignedObjectS3();
            o.bucket = bucket;
            o.key = key;
            return o;
        }
    }
}