// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DirectoryWorkspaceAccessProperties {
    /**
     * @return Indicates whether users can use Android devices to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeAndroid;
    /**
     * @return Indicates whether users can use Chromebooks to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeChromeos;
    /**
     * @return Indicates whether users can use iOS devices to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeIos;
    /**
     * @return Indicates whether users can use Linux clients to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeLinux;
    /**
     * @return Indicates whether users can use macOS clients to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeOsx;
    /**
     * @return Indicates whether users can access their WorkSpaces through a web browser.
     * 
     */
    private @Nullable String deviceTypeWeb;
    /**
     * @return Indicates whether users can use Windows clients to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeWindows;
    /**
     * @return Indicates whether users can use zero client devices to access their WorkSpaces.
     * 
     */
    private @Nullable String deviceTypeZeroclient;

    private DirectoryWorkspaceAccessProperties() {}
    /**
     * @return Indicates whether users can use Android devices to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeAndroid() {
        return Optional.ofNullable(this.deviceTypeAndroid);
    }
    /**
     * @return Indicates whether users can use Chromebooks to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeChromeos() {
        return Optional.ofNullable(this.deviceTypeChromeos);
    }
    /**
     * @return Indicates whether users can use iOS devices to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeIos() {
        return Optional.ofNullable(this.deviceTypeIos);
    }
    /**
     * @return Indicates whether users can use Linux clients to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeLinux() {
        return Optional.ofNullable(this.deviceTypeLinux);
    }
    /**
     * @return Indicates whether users can use macOS clients to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeOsx() {
        return Optional.ofNullable(this.deviceTypeOsx);
    }
    /**
     * @return Indicates whether users can access their WorkSpaces through a web browser.
     * 
     */
    public Optional<String> deviceTypeWeb() {
        return Optional.ofNullable(this.deviceTypeWeb);
    }
    /**
     * @return Indicates whether users can use Windows clients to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeWindows() {
        return Optional.ofNullable(this.deviceTypeWindows);
    }
    /**
     * @return Indicates whether users can use zero client devices to access their WorkSpaces.
     * 
     */
    public Optional<String> deviceTypeZeroclient() {
        return Optional.ofNullable(this.deviceTypeZeroclient);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryWorkspaceAccessProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deviceTypeAndroid;
        private @Nullable String deviceTypeChromeos;
        private @Nullable String deviceTypeIos;
        private @Nullable String deviceTypeLinux;
        private @Nullable String deviceTypeOsx;
        private @Nullable String deviceTypeWeb;
        private @Nullable String deviceTypeWindows;
        private @Nullable String deviceTypeZeroclient;
        public Builder() {}
        public Builder(DirectoryWorkspaceAccessProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceTypeAndroid = defaults.deviceTypeAndroid;
    	      this.deviceTypeChromeos = defaults.deviceTypeChromeos;
    	      this.deviceTypeIos = defaults.deviceTypeIos;
    	      this.deviceTypeLinux = defaults.deviceTypeLinux;
    	      this.deviceTypeOsx = defaults.deviceTypeOsx;
    	      this.deviceTypeWeb = defaults.deviceTypeWeb;
    	      this.deviceTypeWindows = defaults.deviceTypeWindows;
    	      this.deviceTypeZeroclient = defaults.deviceTypeZeroclient;
        }

        @CustomType.Setter
        public Builder deviceTypeAndroid(@Nullable String deviceTypeAndroid) {
            this.deviceTypeAndroid = deviceTypeAndroid;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeChromeos(@Nullable String deviceTypeChromeos) {
            this.deviceTypeChromeos = deviceTypeChromeos;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeIos(@Nullable String deviceTypeIos) {
            this.deviceTypeIos = deviceTypeIos;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeLinux(@Nullable String deviceTypeLinux) {
            this.deviceTypeLinux = deviceTypeLinux;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeOsx(@Nullable String deviceTypeOsx) {
            this.deviceTypeOsx = deviceTypeOsx;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeWeb(@Nullable String deviceTypeWeb) {
            this.deviceTypeWeb = deviceTypeWeb;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeWindows(@Nullable String deviceTypeWindows) {
            this.deviceTypeWindows = deviceTypeWindows;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTypeZeroclient(@Nullable String deviceTypeZeroclient) {
            this.deviceTypeZeroclient = deviceTypeZeroclient;
            return this;
        }
        public DirectoryWorkspaceAccessProperties build() {
            final var o = new DirectoryWorkspaceAccessProperties();
            o.deviceTypeAndroid = deviceTypeAndroid;
            o.deviceTypeChromeos = deviceTypeChromeos;
            o.deviceTypeIos = deviceTypeIos;
            o.deviceTypeLinux = deviceTypeLinux;
            o.deviceTypeOsx = deviceTypeOsx;
            o.deviceTypeWeb = deviceTypeWeb;
            o.deviceTypeWindows = deviceTypeWindows;
            o.deviceTypeZeroclient = deviceTypeZeroclient;
            return o;
        }
    }
}