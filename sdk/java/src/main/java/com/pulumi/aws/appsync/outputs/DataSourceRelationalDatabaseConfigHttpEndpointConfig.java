// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceRelationalDatabaseConfigHttpEndpointConfig {
    /**
     * @return AWS secret store ARN for database credentials.
     * 
     */
    private String awsSecretStoreArn;
    /**
     * @return Logical database name.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return Amazon RDS cluster identifier.
     * 
     */
    private String dbClusterIdentifier;
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private @Nullable String region;
    /**
     * @return Logical schema name.
     * 
     */
    private @Nullable String schema;

    private DataSourceRelationalDatabaseConfigHttpEndpointConfig() {}
    /**
     * @return AWS secret store ARN for database credentials.
     * 
     */
    public String awsSecretStoreArn() {
        return this.awsSecretStoreArn;
    }
    /**
     * @return Logical database name.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return Amazon RDS cluster identifier.
     * 
     */
    public String dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Logical schema name.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfigHttpEndpointConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String awsSecretStoreArn;
        private @Nullable String databaseName;
        private String dbClusterIdentifier;
        private @Nullable String region;
        private @Nullable String schema;
        public Builder() {}
        public Builder(DataSourceRelationalDatabaseConfigHttpEndpointConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsSecretStoreArn = defaults.awsSecretStoreArn;
    	      this.databaseName = defaults.databaseName;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.region = defaults.region;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder awsSecretStoreArn(String awsSecretStoreArn) {
            this.awsSecretStoreArn = Objects.requireNonNull(awsSecretStoreArn);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        public DataSourceRelationalDatabaseConfigHttpEndpointConfig build() {
            final var o = new DataSourceRelationalDatabaseConfigHttpEndpointConfig();
            o.awsSecretStoreArn = awsSecretStoreArn;
            o.databaseName = databaseName;
            o.dbClusterIdentifier = dbClusterIdentifier;
            o.region = region;
            o.schema = schema;
            return o;
        }
    }
}