// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersPrestoArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersPrestoArgs Empty = new DataSourceParametersPrestoArgs();

    /**
     * The catalog to which to connect.
     * 
     */
    @Import(name="catalog", required=true)
    private Output<String> catalog;

    /**
     * @return The catalog to which to connect.
     * 
     */
    public Output<String> catalog() {
        return this.catalog;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host to which to connect.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port to which to connect.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private DataSourceParametersPrestoArgs() {}

    private DataSourceParametersPrestoArgs(DataSourceParametersPrestoArgs $) {
        this.catalog = $.catalog;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersPrestoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersPrestoArgs $;

        public Builder() {
            $ = new DataSourceParametersPrestoArgs();
        }

        public Builder(DataSourceParametersPrestoArgs defaults) {
            $ = new DataSourceParametersPrestoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalog The catalog to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder catalog(Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        /**
         * @param catalog The catalog to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port The port to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DataSourceParametersPrestoArgs build() {
            $.catalog = Objects.requireNonNull($.catalog, "expected parameter 'catalog' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}