// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewayFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayArgs Empty = new GetLocalGatewayArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetLocalGatewayFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetLocalGatewayFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Id of the specific Local Gateway to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id of the specific Local Gateway to retrieve.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Current state of the desired Local Gateway.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current state of the desired Local Gateway.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Mapping of tags, each pair of which must exactly match
     * a pair on the desired Local Gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Mapping of tags, each pair of which must exactly match
     * a pair on the desired Local Gateway.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewayArgs() {}

    private GetLocalGatewayArgs(GetLocalGatewayArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayArgs $;

        public Builder() {
            $ = new GetLocalGatewayArgs();
        }

        public Builder(GetLocalGatewayArgs defaults) {
            $ = new GetLocalGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetLocalGatewayFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetLocalGatewayFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLocalGatewayFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Id of the specific Local Gateway to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the specific Local Gateway to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param state Current state of the desired Local Gateway.
         * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current state of the desired Local Gateway.
         * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Mapping of tags, each pair of which must exactly match
         * a pair on the desired Local Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Mapping of tags, each pair of which must exactly match
         * a pair on the desired Local Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetLocalGatewayArgs build() {
            return $;
        }
    }

}