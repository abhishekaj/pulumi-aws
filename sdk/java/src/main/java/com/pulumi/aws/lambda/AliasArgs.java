// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Description of the alias.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the alias.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Lambda Function name or ARN.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return Lambda Function name or ARN.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     * 
     */
    @Import(name="functionVersion", required=true)
    private Output<String> functionVersion;

    /**
     * @return Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     * 
     */
    public Output<String> functionVersion() {
        return this.functionVersion;
    }

    /**
     * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Lambda alias&#39; route configuration settings. Fields documented below
     * 
     */
    @Import(name="routingConfig")
    private @Nullable Output<AliasRoutingConfigArgs> routingConfig;

    /**
     * @return The Lambda alias&#39; route configuration settings. Fields documented below
     * 
     */
    public Optional<Output<AliasRoutingConfigArgs>> routingConfig() {
        return Optional.ofNullable(this.routingConfig);
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.description = $.description;
        this.functionName = $.functionName;
        this.functionVersion = $.functionVersion;
        this.name = $.name;
        this.routingConfig = $.routingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param functionName Lambda Function name or ARN.
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName Lambda Function name or ARN.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param functionVersion Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
         * 
         * @return builder
         * 
         */
        public Builder functionVersion(Output<String> functionVersion) {
            $.functionVersion = functionVersion;
            return this;
        }

        /**
         * @param functionVersion Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
         * 
         * @return builder
         * 
         */
        public Builder functionVersion(String functionVersion) {
            return functionVersion(Output.of(functionVersion));
        }

        /**
         * @param name Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingConfig The Lambda alias&#39; route configuration settings. Fields documented below
         * 
         * @return builder
         * 
         */
        public Builder routingConfig(@Nullable Output<AliasRoutingConfigArgs> routingConfig) {
            $.routingConfig = routingConfig;
            return this;
        }

        /**
         * @param routingConfig The Lambda alias&#39; route configuration settings. Fields documented below
         * 
         * @return builder
         * 
         */
        public Builder routingConfig(AliasRoutingConfigArgs routingConfig) {
            return routingConfig(Output.of(routingConfig));
        }

        public AliasArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.functionVersion = Objects.requireNonNull($.functionVersion, "expected parameter 'functionVersion' to be non-null");
            return $;
        }
    }

}