// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    /**
     * Name of the gateway to retrieve.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the gateway to retrieve.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetGatewayArgs() {}

    private GetGatewayArgs(GetGatewayArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayArgs $;

        public Builder() {
            $ = new GetGatewayArgs();
        }

        public Builder(GetGatewayArgs defaults) {
            $ = new GetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the gateway to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the gateway to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetGatewayArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}