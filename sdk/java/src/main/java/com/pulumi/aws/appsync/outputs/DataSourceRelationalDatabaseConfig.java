// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.aws.appsync.outputs.DataSourceRelationalDatabaseConfigHttpEndpointConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceRelationalDatabaseConfig {
    /**
     * @return Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
     */
    private @Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig;
    /**
     * @return Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
     */
    private @Nullable String sourceType;

    private DataSourceRelationalDatabaseConfig() {}
    /**
     * @return Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
     */
    public Optional<DataSourceRelationalDatabaseConfigHttpEndpointConfig> httpEndpointConfig() {
        return Optional.ofNullable(this.httpEndpointConfig);
    }
    /**
     * @return Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
     */
    public Optional<String> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig;
        private @Nullable String sourceType;
        public Builder() {}
        public Builder(DataSourceRelationalDatabaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpointConfig = defaults.httpEndpointConfig;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder httpEndpointConfig(@Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig) {
            this.httpEndpointConfig = httpEndpointConfig;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public DataSourceRelationalDatabaseConfig build() {
            final var o = new DataSourceRelationalDatabaseConfig();
            o.httpEndpointConfig = httpEndpointConfig;
            o.sourceType = sourceType;
            return o;
        }
    }
}