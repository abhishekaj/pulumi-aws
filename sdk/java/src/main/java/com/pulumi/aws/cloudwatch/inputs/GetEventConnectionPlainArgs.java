// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventConnectionPlainArgs Empty = new GetEventConnectionPlainArgs();

    /**
     * Name of the connection.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the connection.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetEventConnectionPlainArgs() {}

    private GetEventConnectionPlainArgs(GetEventConnectionPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventConnectionPlainArgs $;

        public Builder() {
            $ = new GetEventConnectionPlainArgs();
        }

        public Builder(GetEventConnectionPlainArgs defaults) {
            $ = new GetEventConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetEventConnectionPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}