// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssessmentTargetState extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentTargetState Empty = new AssessmentTargetState();

    /**
     * The target assessment ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The target assessment ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the assessment target.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the assessment target.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    @Import(name="resourceGroupArn")
    private @Nullable Output<String> resourceGroupArn;

    /**
     * @return Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    public Optional<Output<String>> resourceGroupArn() {
        return Optional.ofNullable(this.resourceGroupArn);
    }

    private AssessmentTargetState() {}

    private AssessmentTargetState(AssessmentTargetState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.resourceGroupArn = $.resourceGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentTargetState $;

        public Builder() {
            $ = new AssessmentTargetState();
        }

        public Builder(AssessmentTargetState defaults) {
            $ = new AssessmentTargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The target assessment ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The target assessment ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name The name of the assessment target.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the assessment target.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupArn Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupArn(@Nullable Output<String> resourceGroupArn) {
            $.resourceGroupArn = resourceGroupArn;
            return this;
        }

        /**
         * @param resourceGroupArn Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupArn(String resourceGroupArn) {
            return resourceGroupArn(Output.of(resourceGroupArn));
        }

        public AssessmentTargetState build() {
            return $;
        }
    }

}