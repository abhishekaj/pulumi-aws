// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOpenidConnectProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOpenidConnectProviderArgs Empty = new GetOpenidConnectProviderArgs();

    /**
     * ARN of the OpenID Connect provider.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the OpenID Connect provider.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Map of resource tags for the IAM OIDC provider.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags for the IAM OIDC provider.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * URL of the OpenID Connect provider.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return URL of the OpenID Connect provider.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private GetOpenidConnectProviderArgs() {}

    private GetOpenidConnectProviderArgs(GetOpenidConnectProviderArgs $) {
        this.arn = $.arn;
        this.tags = $.tags;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOpenidConnectProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOpenidConnectProviderArgs $;

        public Builder() {
            $ = new GetOpenidConnectProviderArgs();
        }

        public Builder(GetOpenidConnectProviderArgs defaults) {
            $ = new GetOpenidConnectProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the OpenID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the OpenID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param tags Map of resource tags for the IAM OIDC provider.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags for the IAM OIDC provider.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param url URL of the OpenID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the OpenID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetOpenidConnectProviderArgs build() {
            return $;
        }
    }

}