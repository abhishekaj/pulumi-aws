// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftdata;

import com.pulumi.aws.redshiftdata.inputs.StatementParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatementArgs Empty = new StatementArgs();

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The name of the database.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * The database user name.
     * 
     */
    @Import(name="dbUser")
    private @Nullable Output<String> dbUser;

    /**
     * @return The database user name.
     * 
     */
    public Optional<Output<String>> dbUser() {
        return Optional.ofNullable(this.dbUser);
    }

    @Import(name="parameters")
    private @Nullable Output<List<StatementParameterArgs>> parameters;

    public Optional<Output<List<StatementParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    @Import(name="secretArn")
    private @Nullable Output<String> secretArn;

    /**
     * @return The name or ARN of the secret that enables access to the database.
     * 
     */
    public Optional<Output<String>> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    /**
     * The SQL statement text to run.
     * 
     */
    @Import(name="sql", required=true)
    private Output<String> sql;

    /**
     * @return The SQL statement text to run.
     * 
     */
    public Output<String> sql() {
        return this.sql;
    }

    /**
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    @Import(name="statementName")
    private @Nullable Output<String> statementName;

    /**
     * @return The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    public Optional<Output<String>> statementName() {
        return Optional.ofNullable(this.statementName);
    }

    /**
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * 
     */
    @Import(name="withEvent")
    private @Nullable Output<Boolean> withEvent;

    /**
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * 
     */
    public Optional<Output<Boolean>> withEvent() {
        return Optional.ofNullable(this.withEvent);
    }

    private StatementArgs() {}

    private StatementArgs(StatementArgs $) {
        this.clusterIdentifier = $.clusterIdentifier;
        this.database = $.database;
        this.dbUser = $.dbUser;
        this.parameters = $.parameters;
        this.secretArn = $.secretArn;
        this.sql = $.sql;
        this.statementName = $.statementName;
        this.withEvent = $.withEvent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatementArgs $;

        public Builder() {
            $ = new StatementArgs();
        }

        public Builder(StatementArgs defaults) {
            $ = new StatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param database The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param dbUser The database user name.
         * 
         * @return builder
         * 
         */
        public Builder dbUser(@Nullable Output<String> dbUser) {
            $.dbUser = dbUser;
            return this;
        }

        /**
         * @param dbUser The database user name.
         * 
         * @return builder
         * 
         */
        public Builder dbUser(String dbUser) {
            return dbUser(Output.of(dbUser));
        }

        public Builder parameters(@Nullable Output<List<StatementParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<StatementParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(StatementParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param secretArn The name or ARN of the secret that enables access to the database.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(@Nullable Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn The name or ARN of the secret that enables access to the database.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        /**
         * @param sql The SQL statement text to run.
         * 
         * @return builder
         * 
         */
        public Builder sql(Output<String> sql) {
            $.sql = sql;
            return this;
        }

        /**
         * @param sql The SQL statement text to run.
         * 
         * @return builder
         * 
         */
        public Builder sql(String sql) {
            return sql(Output.of(sql));
        }

        /**
         * @param statementName The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
         * 
         * @return builder
         * 
         */
        public Builder statementName(@Nullable Output<String> statementName) {
            $.statementName = statementName;
            return this;
        }

        /**
         * @param statementName The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
         * 
         * @return builder
         * 
         */
        public Builder statementName(String statementName) {
            return statementName(Output.of(statementName));
        }

        /**
         * @param withEvent A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
         * 
         * @return builder
         * 
         */
        public Builder withEvent(@Nullable Output<Boolean> withEvent) {
            $.withEvent = withEvent;
            return this;
        }

        /**
         * @param withEvent A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
         * 
         * @return builder
         * 
         */
        public Builder withEvent(Boolean withEvent) {
            return withEvent(Output.of(withEvent));
        }

        public StatementArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.sql = Objects.requireNonNull($.sql, "expected parameter 'sql' to be non-null");
            return $;
        }
    }

}