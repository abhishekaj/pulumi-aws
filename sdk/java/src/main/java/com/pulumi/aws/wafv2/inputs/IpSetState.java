// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpSetState extends com.pulumi.resources.ResourceArgs {

    public static final IpSetState Empty = new IpSetState();

    /**
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<String>> addresses;

    /**
     * @return Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    public Optional<Output<List<String>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A friendly description of the IP set.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A friendly description of the IP set.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    @Import(name="ipAddressVersion")
    private @Nullable Output<String> ipAddressVersion;

    /**
     * @return Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    public Optional<Output<String>> ipAddressVersion() {
        return Optional.ofNullable(this.ipAddressVersion);
    }

    @Import(name="lockToken")
    private @Nullable Output<String> lockToken;

    public Optional<Output<String>> lockToken() {
        return Optional.ofNullable(this.lockToken);
    }

    /**
     * A friendly name of the IP set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name of the IP set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private IpSetState() {}

    private IpSetState(IpSetState $) {
        this.addresses = $.addresses;
        this.arn = $.arn;
        this.description = $.description;
        this.ipAddressVersion = $.ipAddressVersion;
        this.lockToken = $.lockToken;
        this.name = $.name;
        this.scope = $.scope;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpSetState $;

        public Builder() {
            $ = new IpSetState();
        }

        public Builder(IpSetState defaults) {
            $ = new IpSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) that identifies the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) that identifies the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A friendly description of the IP set.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A friendly description of the IP set.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipAddressVersion Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressVersion(@Nullable Output<String> ipAddressVersion) {
            $.ipAddressVersion = ipAddressVersion;
            return this;
        }

        /**
         * @param ipAddressVersion Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressVersion(String ipAddressVersion) {
            return ipAddressVersion(Output.of(ipAddressVersion));
        }

        public Builder lockToken(@Nullable Output<String> lockToken) {
            $.lockToken = lockToken;
            return this;
        }

        public Builder lockToken(String lockToken) {
            return lockToken(Output.of(lockToken));
        }

        /**
         * @param name A friendly name of the IP set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name of the IP set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public IpSetState build() {
            return $;
        }
    }

}