// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointMongodbSettings {
    /**
     * @return Authentication mechanism to access the MongoDB source endpoint. Default is `default`.
     * 
     */
    private @Nullable String authMechanism;
    /**
     * @return Authentication database name. Not used when `auth_type` is `no`. Default is `admin`.
     * 
     */
    private @Nullable String authSource;
    /**
     * @return The type of authentication to perform when connecting to a Redis target. Options include `none`, `auth-token`, and `auth-role`. The `auth-token` option requires an `auth_password` value to be provided. The `auth-role` option requires `auth_user_name` and `auth_password` values to be provided.
     * 
     */
    private @Nullable String authType;
    /**
     * @return Number of documents to preview to determine the document organization. Use this setting when `nesting_level` is set to `one`. Default is `1000`.
     * 
     */
    private @Nullable String docsToInvestigate;
    /**
     * @return Document ID. Use this setting when `nesting_level` is set to `none`. Default is `false`.
     * 
     */
    private @Nullable String extractDocId;
    /**
     * @return Specifies either document or table mode. Default is `none`. Valid values are `one` (table mode) and `none` (document mode).
     * 
     */
    private @Nullable String nestingLevel;

    private EndpointMongodbSettings() {}
    /**
     * @return Authentication mechanism to access the MongoDB source endpoint. Default is `default`.
     * 
     */
    public Optional<String> authMechanism() {
        return Optional.ofNullable(this.authMechanism);
    }
    /**
     * @return Authentication database name. Not used when `auth_type` is `no`. Default is `admin`.
     * 
     */
    public Optional<String> authSource() {
        return Optional.ofNullable(this.authSource);
    }
    /**
     * @return The type of authentication to perform when connecting to a Redis target. Options include `none`, `auth-token`, and `auth-role`. The `auth-token` option requires an `auth_password` value to be provided. The `auth-role` option requires `auth_user_name` and `auth_password` values to be provided.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return Number of documents to preview to determine the document organization. Use this setting when `nesting_level` is set to `one`. Default is `1000`.
     * 
     */
    public Optional<String> docsToInvestigate() {
        return Optional.ofNullable(this.docsToInvestigate);
    }
    /**
     * @return Document ID. Use this setting when `nesting_level` is set to `none`. Default is `false`.
     * 
     */
    public Optional<String> extractDocId() {
        return Optional.ofNullable(this.extractDocId);
    }
    /**
     * @return Specifies either document or table mode. Default is `none`. Valid values are `one` (table mode) and `none` (document mode).
     * 
     */
    public Optional<String> nestingLevel() {
        return Optional.ofNullable(this.nestingLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMongodbSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authMechanism;
        private @Nullable String authSource;
        private @Nullable String authType;
        private @Nullable String docsToInvestigate;
        private @Nullable String extractDocId;
        private @Nullable String nestingLevel;
        public Builder() {}
        public Builder(EndpointMongodbSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMechanism = defaults.authMechanism;
    	      this.authSource = defaults.authSource;
    	      this.authType = defaults.authType;
    	      this.docsToInvestigate = defaults.docsToInvestigate;
    	      this.extractDocId = defaults.extractDocId;
    	      this.nestingLevel = defaults.nestingLevel;
        }

        @CustomType.Setter
        public Builder authMechanism(@Nullable String authMechanism) {
            this.authMechanism = authMechanism;
            return this;
        }
        @CustomType.Setter
        public Builder authSource(@Nullable String authSource) {
            this.authSource = authSource;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder docsToInvestigate(@Nullable String docsToInvestigate) {
            this.docsToInvestigate = docsToInvestigate;
            return this;
        }
        @CustomType.Setter
        public Builder extractDocId(@Nullable String extractDocId) {
            this.extractDocId = extractDocId;
            return this;
        }
        @CustomType.Setter
        public Builder nestingLevel(@Nullable String nestingLevel) {
            this.nestingLevel = nestingLevel;
            return this;
        }
        public EndpointMongodbSettings build() {
            final var o = new EndpointMongodbSettings();
            o.authMechanism = authMechanism;
            o.authSource = authSource;
            o.authType = authType;
            o.docsToInvestigate = docsToInvestigate;
            o.extractDocId = extractDocId;
            o.nestingLevel = nestingLevel;
            return o;
        }
    }
}