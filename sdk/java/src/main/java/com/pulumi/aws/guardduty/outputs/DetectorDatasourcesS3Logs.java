// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class DetectorDatasourcesS3Logs {
    /**
     * @return If true, enables [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
     * Defaults to `true`.
     * 
     */
    private Boolean enable;

    private DetectorDatasourcesS3Logs() {}
    /**
     * @return If true, enables [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
     * Defaults to `true`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesS3Logs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        public Builder() {}
        public Builder(DetectorDatasourcesS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public DetectorDatasourcesS3Logs build() {
            final var o = new DetectorDatasourcesS3Logs();
            o.enable = enable;
            return o;
        }
    }
}