// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoreNetworkPolicyDocumentSegmentAction extends com.pulumi.resources.InvokeArgs {

    public static final GetCoreNetworkPolicyDocumentSegmentAction Empty = new GetCoreNetworkPolicyDocumentSegmentAction();

    /**
     * Action to take for the chosen segment. Valid values `create-route` or `share`.
     * 
     */
    @Import(name="action", required=true)
    private String action;

    /**
     * @return Action to take for the chosen segment. Valid values `create-route` or `share`.
     * 
     */
    public String action() {
        return this.action;
    }

    /**
     * A user-defined string describing the segment action.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return A user-defined string describing the segment action.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
     * 
     */
    @Import(name="destinationCidrBlocks")
    private @Nullable List<String> destinationCidrBlocks;

    /**
     * @return List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
     * 
     */
    public Optional<List<String>> destinationCidrBlocks() {
        return Optional.ofNullable(this.destinationCidrBlocks);
    }

    /**
     * A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
     * 
     */
    @Import(name="destinations")
    private @Nullable List<String> destinations;

    /**
     * @return A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
     * 
     */
    public Optional<List<String>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * String. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
     * 
     */
    @Import(name="mode")
    private @Nullable String mode;

    /**
     * @return String. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Name of the segment.
     * 
     */
    @Import(name="segment", required=true)
    private String segment;

    /**
     * @return Name of the segment.
     * 
     */
    public String segment() {
        return this.segment;
    }

    /**
     * A set subtraction of segments to not share with.
     * 
     */
    @Import(name="shareWithExcepts")
    private @Nullable List<String> shareWithExcepts;

    /**
     * @return A set subtraction of segments to not share with.
     * 
     */
    public Optional<List<String>> shareWithExcepts() {
        return Optional.ofNullable(this.shareWithExcepts);
    }

    /**
     * A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
     * 
     */
    @Import(name="shareWiths")
    private @Nullable List<String> shareWiths;

    /**
     * @return A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
     * 
     */
    public Optional<List<String>> shareWiths() {
        return Optional.ofNullable(this.shareWiths);
    }

    private GetCoreNetworkPolicyDocumentSegmentAction() {}

    private GetCoreNetworkPolicyDocumentSegmentAction(GetCoreNetworkPolicyDocumentSegmentAction $) {
        this.action = $.action;
        this.description = $.description;
        this.destinationCidrBlocks = $.destinationCidrBlocks;
        this.destinations = $.destinations;
        this.mode = $.mode;
        this.segment = $.segment;
        this.shareWithExcepts = $.shareWithExcepts;
        this.shareWiths = $.shareWiths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCoreNetworkPolicyDocumentSegmentAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCoreNetworkPolicyDocumentSegmentAction $;

        public Builder() {
            $ = new GetCoreNetworkPolicyDocumentSegmentAction();
        }

        public Builder(GetCoreNetworkPolicyDocumentSegmentAction defaults) {
            $ = new GetCoreNetworkPolicyDocumentSegmentAction(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to take for the chosen segment. Valid values `create-route` or `share`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            $.action = action;
            return this;
        }

        /**
         * @param description A user-defined string describing the segment action.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param destinationCidrBlocks List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlocks(@Nullable List<String> destinationCidrBlocks) {
            $.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * @param destinationCidrBlocks List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlocks(String... destinationCidrBlocks) {
            return destinationCidrBlocks(List.of(destinationCidrBlocks));
        }

        /**
         * @param destinations A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable List<String> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations A list of strings. Valid values include `[&#34;blackhole&#34;]` or a list of attachment ids.
         * 
         * @return builder
         * 
         */
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param mode String. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param segment Name of the segment.
         * 
         * @return builder
         * 
         */
        public Builder segment(String segment) {
            $.segment = segment;
            return this;
        }

        /**
         * @param shareWithExcepts A set subtraction of segments to not share with.
         * 
         * @return builder
         * 
         */
        public Builder shareWithExcepts(@Nullable List<String> shareWithExcepts) {
            $.shareWithExcepts = shareWithExcepts;
            return this;
        }

        /**
         * @param shareWithExcepts A set subtraction of segments to not share with.
         * 
         * @return builder
         * 
         */
        public Builder shareWithExcepts(String... shareWithExcepts) {
            return shareWithExcepts(List.of(shareWithExcepts));
        }

        /**
         * @param shareWiths A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder shareWiths(@Nullable List<String> shareWiths) {
            $.shareWiths = shareWiths;
            return this;
        }

        /**
         * @param shareWiths A list of strings to share with. Must be a substring is all segments. Valid values include: `[&#34;*&#34;]` or `[&#34;&lt;segment-names&gt;&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder shareWiths(String... shareWiths) {
            return shareWiths(List.of(shareWiths));
        }

        public GetCoreNetworkPolicyDocumentSegmentAction build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.segment = Objects.requireNonNull($.segment, "expected parameter 'segment' to be non-null");
            return $;
        }
    }

}