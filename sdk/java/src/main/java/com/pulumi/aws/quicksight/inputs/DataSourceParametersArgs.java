// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersArgs Empty = new DataSourceParametersArgs();

    /**
     * Parameters for connecting to Amazon Elasticsearch.
     * 
     */
    @Import(name="amazonElasticsearch")
    private @Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch;

    /**
     * @return Parameters for connecting to Amazon Elasticsearch.
     * 
     */
    public Optional<Output<DataSourceParametersAmazonElasticsearchArgs>> amazonElasticsearch() {
        return Optional.ofNullable(this.amazonElasticsearch);
    }

    /**
     * Parameters for connecting to Athena.
     * 
     */
    @Import(name="athena")
    private @Nullable Output<DataSourceParametersAthenaArgs> athena;

    /**
     * @return Parameters for connecting to Athena.
     * 
     */
    public Optional<Output<DataSourceParametersAthenaArgs>> athena() {
        return Optional.ofNullable(this.athena);
    }

    /**
     * Parameters for connecting to Aurora MySQL.
     * 
     */
    @Import(name="aurora")
    private @Nullable Output<DataSourceParametersAuroraArgs> aurora;

    /**
     * @return Parameters for connecting to Aurora MySQL.
     * 
     */
    public Optional<Output<DataSourceParametersAuroraArgs>> aurora() {
        return Optional.ofNullable(this.aurora);
    }

    /**
     * Parameters for connecting to Aurora Postgresql.
     * 
     */
    @Import(name="auroraPostgresql")
    private @Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql;

    /**
     * @return Parameters for connecting to Aurora Postgresql.
     * 
     */
    public Optional<Output<DataSourceParametersAuroraPostgresqlArgs>> auroraPostgresql() {
        return Optional.ofNullable(this.auroraPostgresql);
    }

    /**
     * Parameters for connecting to AWS IOT Analytics.
     * 
     */
    @Import(name="awsIotAnalytics")
    private @Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics;

    /**
     * @return Parameters for connecting to AWS IOT Analytics.
     * 
     */
    public Optional<Output<DataSourceParametersAwsIotAnalyticsArgs>> awsIotAnalytics() {
        return Optional.ofNullable(this.awsIotAnalytics);
    }

    /**
     * Parameters for connecting to Jira.
     * 
     */
    @Import(name="jira")
    private @Nullable Output<DataSourceParametersJiraArgs> jira;

    /**
     * @return Parameters for connecting to Jira.
     * 
     */
    public Optional<Output<DataSourceParametersJiraArgs>> jira() {
        return Optional.ofNullable(this.jira);
    }

    /**
     * Parameters for connecting to MariaDB.
     * 
     */
    @Import(name="mariaDb")
    private @Nullable Output<DataSourceParametersMariaDbArgs> mariaDb;

    /**
     * @return Parameters for connecting to MariaDB.
     * 
     */
    public Optional<Output<DataSourceParametersMariaDbArgs>> mariaDb() {
        return Optional.ofNullable(this.mariaDb);
    }

    /**
     * Parameters for connecting to MySQL.
     * 
     */
    @Import(name="mysql")
    private @Nullable Output<DataSourceParametersMysqlArgs> mysql;

    /**
     * @return Parameters for connecting to MySQL.
     * 
     */
    public Optional<Output<DataSourceParametersMysqlArgs>> mysql() {
        return Optional.ofNullable(this.mysql);
    }

    /**
     * Parameters for connecting to Oracle.
     * 
     */
    @Import(name="oracle")
    private @Nullable Output<DataSourceParametersOracleArgs> oracle;

    /**
     * @return Parameters for connecting to Oracle.
     * 
     */
    public Optional<Output<DataSourceParametersOracleArgs>> oracle() {
        return Optional.ofNullable(this.oracle);
    }

    /**
     * Parameters for connecting to Postgresql.
     * 
     */
    @Import(name="postgresql")
    private @Nullable Output<DataSourceParametersPostgresqlArgs> postgresql;

    /**
     * @return Parameters for connecting to Postgresql.
     * 
     */
    public Optional<Output<DataSourceParametersPostgresqlArgs>> postgresql() {
        return Optional.ofNullable(this.postgresql);
    }

    /**
     * Parameters for connecting to Presto.
     * 
     */
    @Import(name="presto")
    private @Nullable Output<DataSourceParametersPrestoArgs> presto;

    /**
     * @return Parameters for connecting to Presto.
     * 
     */
    public Optional<Output<DataSourceParametersPrestoArgs>> presto() {
        return Optional.ofNullable(this.presto);
    }

    /**
     * Parameters for connecting to RDS.
     * 
     */
    @Import(name="rds")
    private @Nullable Output<DataSourceParametersRdsArgs> rds;

    /**
     * @return Parameters for connecting to RDS.
     * 
     */
    public Optional<Output<DataSourceParametersRdsArgs>> rds() {
        return Optional.ofNullable(this.rds);
    }

    /**
     * Parameters for connecting to Redshift.
     * 
     */
    @Import(name="redshift")
    private @Nullable Output<DataSourceParametersRedshiftArgs> redshift;

    /**
     * @return Parameters for connecting to Redshift.
     * 
     */
    public Optional<Output<DataSourceParametersRedshiftArgs>> redshift() {
        return Optional.ofNullable(this.redshift);
    }

    /**
     * Parameters for connecting to S3.
     * 
     */
    @Import(name="s3")
    private @Nullable Output<DataSourceParametersS3Args> s3;

    /**
     * @return Parameters for connecting to S3.
     * 
     */
    public Optional<Output<DataSourceParametersS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    /**
     * Parameters for connecting to ServiceNow.
     * 
     */
    @Import(name="serviceNow")
    private @Nullable Output<DataSourceParametersServiceNowArgs> serviceNow;

    /**
     * @return Parameters for connecting to ServiceNow.
     * 
     */
    public Optional<Output<DataSourceParametersServiceNowArgs>> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }

    /**
     * Parameters for connecting to Snowflake.
     * 
     */
    @Import(name="snowflake")
    private @Nullable Output<DataSourceParametersSnowflakeArgs> snowflake;

    /**
     * @return Parameters for connecting to Snowflake.
     * 
     */
    public Optional<Output<DataSourceParametersSnowflakeArgs>> snowflake() {
        return Optional.ofNullable(this.snowflake);
    }

    /**
     * Parameters for connecting to Spark.
     * 
     */
    @Import(name="spark")
    private @Nullable Output<DataSourceParametersSparkArgs> spark;

    /**
     * @return Parameters for connecting to Spark.
     * 
     */
    public Optional<Output<DataSourceParametersSparkArgs>> spark() {
        return Optional.ofNullable(this.spark);
    }

    /**
     * Parameters for connecting to SQL Server.
     * 
     */
    @Import(name="sqlServer")
    private @Nullable Output<DataSourceParametersSqlServerArgs> sqlServer;

    /**
     * @return Parameters for connecting to SQL Server.
     * 
     */
    public Optional<Output<DataSourceParametersSqlServerArgs>> sqlServer() {
        return Optional.ofNullable(this.sqlServer);
    }

    /**
     * Parameters for connecting to Teradata.
     * 
     */
    @Import(name="teradata")
    private @Nullable Output<DataSourceParametersTeradataArgs> teradata;

    /**
     * @return Parameters for connecting to Teradata.
     * 
     */
    public Optional<Output<DataSourceParametersTeradataArgs>> teradata() {
        return Optional.ofNullable(this.teradata);
    }

    /**
     * Parameters for connecting to Twitter.
     * 
     */
    @Import(name="twitter")
    private @Nullable Output<DataSourceParametersTwitterArgs> twitter;

    /**
     * @return Parameters for connecting to Twitter.
     * 
     */
    public Optional<Output<DataSourceParametersTwitterArgs>> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    private DataSourceParametersArgs() {}

    private DataSourceParametersArgs(DataSourceParametersArgs $) {
        this.amazonElasticsearch = $.amazonElasticsearch;
        this.athena = $.athena;
        this.aurora = $.aurora;
        this.auroraPostgresql = $.auroraPostgresql;
        this.awsIotAnalytics = $.awsIotAnalytics;
        this.jira = $.jira;
        this.mariaDb = $.mariaDb;
        this.mysql = $.mysql;
        this.oracle = $.oracle;
        this.postgresql = $.postgresql;
        this.presto = $.presto;
        this.rds = $.rds;
        this.redshift = $.redshift;
        this.s3 = $.s3;
        this.serviceNow = $.serviceNow;
        this.snowflake = $.snowflake;
        this.spark = $.spark;
        this.sqlServer = $.sqlServer;
        this.teradata = $.teradata;
        this.twitter = $.twitter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersArgs $;

        public Builder() {
            $ = new DataSourceParametersArgs();
        }

        public Builder(DataSourceParametersArgs defaults) {
            $ = new DataSourceParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amazonElasticsearch Parameters for connecting to Amazon Elasticsearch.
         * 
         * @return builder
         * 
         */
        public Builder amazonElasticsearch(@Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch) {
            $.amazonElasticsearch = amazonElasticsearch;
            return this;
        }

        /**
         * @param amazonElasticsearch Parameters for connecting to Amazon Elasticsearch.
         * 
         * @return builder
         * 
         */
        public Builder amazonElasticsearch(DataSourceParametersAmazonElasticsearchArgs amazonElasticsearch) {
            return amazonElasticsearch(Output.of(amazonElasticsearch));
        }

        /**
         * @param athena Parameters for connecting to Athena.
         * 
         * @return builder
         * 
         */
        public Builder athena(@Nullable Output<DataSourceParametersAthenaArgs> athena) {
            $.athena = athena;
            return this;
        }

        /**
         * @param athena Parameters for connecting to Athena.
         * 
         * @return builder
         * 
         */
        public Builder athena(DataSourceParametersAthenaArgs athena) {
            return athena(Output.of(athena));
        }

        /**
         * @param aurora Parameters for connecting to Aurora MySQL.
         * 
         * @return builder
         * 
         */
        public Builder aurora(@Nullable Output<DataSourceParametersAuroraArgs> aurora) {
            $.aurora = aurora;
            return this;
        }

        /**
         * @param aurora Parameters for connecting to Aurora MySQL.
         * 
         * @return builder
         * 
         */
        public Builder aurora(DataSourceParametersAuroraArgs aurora) {
            return aurora(Output.of(aurora));
        }

        /**
         * @param auroraPostgresql Parameters for connecting to Aurora Postgresql.
         * 
         * @return builder
         * 
         */
        public Builder auroraPostgresql(@Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql) {
            $.auroraPostgresql = auroraPostgresql;
            return this;
        }

        /**
         * @param auroraPostgresql Parameters for connecting to Aurora Postgresql.
         * 
         * @return builder
         * 
         */
        public Builder auroraPostgresql(DataSourceParametersAuroraPostgresqlArgs auroraPostgresql) {
            return auroraPostgresql(Output.of(auroraPostgresql));
        }

        /**
         * @param awsIotAnalytics Parameters for connecting to AWS IOT Analytics.
         * 
         * @return builder
         * 
         */
        public Builder awsIotAnalytics(@Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics) {
            $.awsIotAnalytics = awsIotAnalytics;
            return this;
        }

        /**
         * @param awsIotAnalytics Parameters for connecting to AWS IOT Analytics.
         * 
         * @return builder
         * 
         */
        public Builder awsIotAnalytics(DataSourceParametersAwsIotAnalyticsArgs awsIotAnalytics) {
            return awsIotAnalytics(Output.of(awsIotAnalytics));
        }

        /**
         * @param jira Parameters for connecting to Jira.
         * 
         * @return builder
         * 
         */
        public Builder jira(@Nullable Output<DataSourceParametersJiraArgs> jira) {
            $.jira = jira;
            return this;
        }

        /**
         * @param jira Parameters for connecting to Jira.
         * 
         * @return builder
         * 
         */
        public Builder jira(DataSourceParametersJiraArgs jira) {
            return jira(Output.of(jira));
        }

        /**
         * @param mariaDb Parameters for connecting to MariaDB.
         * 
         * @return builder
         * 
         */
        public Builder mariaDb(@Nullable Output<DataSourceParametersMariaDbArgs> mariaDb) {
            $.mariaDb = mariaDb;
            return this;
        }

        /**
         * @param mariaDb Parameters for connecting to MariaDB.
         * 
         * @return builder
         * 
         */
        public Builder mariaDb(DataSourceParametersMariaDbArgs mariaDb) {
            return mariaDb(Output.of(mariaDb));
        }

        /**
         * @param mysql Parameters for connecting to MySQL.
         * 
         * @return builder
         * 
         */
        public Builder mysql(@Nullable Output<DataSourceParametersMysqlArgs> mysql) {
            $.mysql = mysql;
            return this;
        }

        /**
         * @param mysql Parameters for connecting to MySQL.
         * 
         * @return builder
         * 
         */
        public Builder mysql(DataSourceParametersMysqlArgs mysql) {
            return mysql(Output.of(mysql));
        }

        /**
         * @param oracle Parameters for connecting to Oracle.
         * 
         * @return builder
         * 
         */
        public Builder oracle(@Nullable Output<DataSourceParametersOracleArgs> oracle) {
            $.oracle = oracle;
            return this;
        }

        /**
         * @param oracle Parameters for connecting to Oracle.
         * 
         * @return builder
         * 
         */
        public Builder oracle(DataSourceParametersOracleArgs oracle) {
            return oracle(Output.of(oracle));
        }

        /**
         * @param postgresql Parameters for connecting to Postgresql.
         * 
         * @return builder
         * 
         */
        public Builder postgresql(@Nullable Output<DataSourceParametersPostgresqlArgs> postgresql) {
            $.postgresql = postgresql;
            return this;
        }

        /**
         * @param postgresql Parameters for connecting to Postgresql.
         * 
         * @return builder
         * 
         */
        public Builder postgresql(DataSourceParametersPostgresqlArgs postgresql) {
            return postgresql(Output.of(postgresql));
        }

        /**
         * @param presto Parameters for connecting to Presto.
         * 
         * @return builder
         * 
         */
        public Builder presto(@Nullable Output<DataSourceParametersPrestoArgs> presto) {
            $.presto = presto;
            return this;
        }

        /**
         * @param presto Parameters for connecting to Presto.
         * 
         * @return builder
         * 
         */
        public Builder presto(DataSourceParametersPrestoArgs presto) {
            return presto(Output.of(presto));
        }

        /**
         * @param rds Parameters for connecting to RDS.
         * 
         * @return builder
         * 
         */
        public Builder rds(@Nullable Output<DataSourceParametersRdsArgs> rds) {
            $.rds = rds;
            return this;
        }

        /**
         * @param rds Parameters for connecting to RDS.
         * 
         * @return builder
         * 
         */
        public Builder rds(DataSourceParametersRdsArgs rds) {
            return rds(Output.of(rds));
        }

        /**
         * @param redshift Parameters for connecting to Redshift.
         * 
         * @return builder
         * 
         */
        public Builder redshift(@Nullable Output<DataSourceParametersRedshiftArgs> redshift) {
            $.redshift = redshift;
            return this;
        }

        /**
         * @param redshift Parameters for connecting to Redshift.
         * 
         * @return builder
         * 
         */
        public Builder redshift(DataSourceParametersRedshiftArgs redshift) {
            return redshift(Output.of(redshift));
        }

        /**
         * @param s3 Parameters for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3(@Nullable Output<DataSourceParametersS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        /**
         * @param s3 Parameters for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3(DataSourceParametersS3Args s3) {
            return s3(Output.of(s3));
        }

        /**
         * @param serviceNow Parameters for connecting to ServiceNow.
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(@Nullable Output<DataSourceParametersServiceNowArgs> serviceNow) {
            $.serviceNow = serviceNow;
            return this;
        }

        /**
         * @param serviceNow Parameters for connecting to ServiceNow.
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(DataSourceParametersServiceNowArgs serviceNow) {
            return serviceNow(Output.of(serviceNow));
        }

        /**
         * @param snowflake Parameters for connecting to Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder snowflake(@Nullable Output<DataSourceParametersSnowflakeArgs> snowflake) {
            $.snowflake = snowflake;
            return this;
        }

        /**
         * @param snowflake Parameters for connecting to Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder snowflake(DataSourceParametersSnowflakeArgs snowflake) {
            return snowflake(Output.of(snowflake));
        }

        /**
         * @param spark Parameters for connecting to Spark.
         * 
         * @return builder
         * 
         */
        public Builder spark(@Nullable Output<DataSourceParametersSparkArgs> spark) {
            $.spark = spark;
            return this;
        }

        /**
         * @param spark Parameters for connecting to Spark.
         * 
         * @return builder
         * 
         */
        public Builder spark(DataSourceParametersSparkArgs spark) {
            return spark(Output.of(spark));
        }

        /**
         * @param sqlServer Parameters for connecting to SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder sqlServer(@Nullable Output<DataSourceParametersSqlServerArgs> sqlServer) {
            $.sqlServer = sqlServer;
            return this;
        }

        /**
         * @param sqlServer Parameters for connecting to SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder sqlServer(DataSourceParametersSqlServerArgs sqlServer) {
            return sqlServer(Output.of(sqlServer));
        }

        /**
         * @param teradata Parameters for connecting to Teradata.
         * 
         * @return builder
         * 
         */
        public Builder teradata(@Nullable Output<DataSourceParametersTeradataArgs> teradata) {
            $.teradata = teradata;
            return this;
        }

        /**
         * @param teradata Parameters for connecting to Teradata.
         * 
         * @return builder
         * 
         */
        public Builder teradata(DataSourceParametersTeradataArgs teradata) {
            return teradata(Output.of(teradata));
        }

        /**
         * @param twitter Parameters for connecting to Twitter.
         * 
         * @return builder
         * 
         */
        public Builder twitter(@Nullable Output<DataSourceParametersTwitterArgs> twitter) {
            $.twitter = twitter;
            return this;
        }

        /**
         * @param twitter Parameters for connecting to Twitter.
         * 
         * @return builder
         * 
         */
        public Builder twitter(DataSourceParametersTwitterArgs twitter) {
            return twitter(Output.of(twitter));
        }

        public DataSourceParametersArgs build() {
            return $;
        }
    }

}