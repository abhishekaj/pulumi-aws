// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceEphemeralBlockDevice {
    /**
     * @return Physical name of the device.
     * 
     */
    private String deviceName;
    /**
     * @return Whether the specified device included in the device mapping was suppressed or not (Boolean).
     * 
     */
    private @Nullable Boolean noDevice;
    /**
     * @return Virtual device name.
     * 
     */
    private @Nullable String virtualName;

    private GetInstanceEphemeralBlockDevice() {}
    /**
     * @return Physical name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Whether the specified device included in the device mapping was suppressed or not (Boolean).
     * 
     */
    public Optional<Boolean> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * @return Virtual device name.
     * 
     */
    public Optional<String> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;
        public Builder() {}
        public Builder(GetInstanceEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        @CustomType.Setter
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public GetInstanceEphemeralBlockDevice build() {
            final var o = new GetInstanceEphemeralBlockDevice();
            o.deviceName = deviceName;
            o.noDevice = noDevice;
            o.virtualName = virtualName;
            return o;
        }
    }
}