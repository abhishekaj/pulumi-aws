// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs Empty = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs();

    /**
     * The credentials used to access protected Zendesk resources.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * The identifier for the desired client.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The identifier for the desired client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    @Import(name="oauthRequest")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs> oauthRequest;

    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs>> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs() {}

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs $) {
        this.accessToken = $.accessToken;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.oauthRequest = $.oauthRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs $;

        public Builder() {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs();
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs defaults) {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The credentials used to access protected Zendesk resources.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The credentials used to access protected Zendesk resources.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param clientId The identifier for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The identifier for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret used by the OAuth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret used by the OAuth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param oauthRequest The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
         * 
         * @return builder
         * 
         */
        public Builder oauthRequest(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs> oauthRequest) {
            $.oauthRequest = oauthRequest;
            return this;
        }

        /**
         * @param oauthRequest The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
         * 
         * @return builder
         * 
         */
        public Builder oauthRequest(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs oauthRequest) {
            return oauthRequest(Output.of(oauthRequest));
        }

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}