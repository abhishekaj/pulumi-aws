// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ResourceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupArgs Empty = new ResourceGroupArgs();

    /**
     * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
     * 
     */
    @Import(name="tags", required=true)
    private Output<Map<String,String>> tags;

    /**
     * @return Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
     * 
     */
    public Output<Map<String,String>> tags() {
        return this.tags;
    }

    private ResourceGroupArgs() {}

    private ResourceGroupArgs(ResourceGroupArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupArgs $;

        public Builder() {
            $ = new ResourceGroupArgs();
        }

        public Builder(ResourceGroupArgs defaults) {
            $ = new ResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ResourceGroupArgs build() {
            $.tags = Objects.requireNonNull($.tags, "expected parameter 'tags' to be non-null");
            return $;
        }
    }

}
