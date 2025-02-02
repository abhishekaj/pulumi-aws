// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class VpcAttachmentOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcAttachmentOptionsArgs Empty = new VpcAttachmentOptionsArgs();

    /**
     * Indicates whether IPv6 is supported.
     * 
     */
    @Import(name="ipv6Support", required=true)
    private Output<Boolean> ipv6Support;

    /**
     * @return Indicates whether IPv6 is supported.
     * 
     */
    public Output<Boolean> ipv6Support() {
        return this.ipv6Support;
    }

    private VpcAttachmentOptionsArgs() {}

    private VpcAttachmentOptionsArgs(VpcAttachmentOptionsArgs $) {
        this.ipv6Support = $.ipv6Support;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcAttachmentOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcAttachmentOptionsArgs $;

        public Builder() {
            $ = new VpcAttachmentOptionsArgs();
        }

        public Builder(VpcAttachmentOptionsArgs defaults) {
            $ = new VpcAttachmentOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv6Support Indicates whether IPv6 is supported.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Support(Output<Boolean> ipv6Support) {
            $.ipv6Support = ipv6Support;
            return this;
        }

        /**
         * @param ipv6Support Indicates whether IPv6 is supported.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Support(Boolean ipv6Support) {
            return ipv6Support(Output.of(ipv6Support));
        }

        public VpcAttachmentOptionsArgs build() {
            $.ipv6Support = Objects.requireNonNull($.ipv6Support, "expected parameter 'ipv6Support' to be non-null");
            return $;
        }
    }

}
