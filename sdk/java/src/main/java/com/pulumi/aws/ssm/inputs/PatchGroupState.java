// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchGroupState extends com.pulumi.resources.ResourceArgs {

    public static final PatchGroupState Empty = new PatchGroupState();

    /**
     * The ID of the patch baseline to register the patch group with.
     * 
     */
    @Import(name="baselineId")
    private @Nullable Output<String> baselineId;

    /**
     * @return The ID of the patch baseline to register the patch group with.
     * 
     */
    public Optional<Output<String>> baselineId() {
        return Optional.ofNullable(this.baselineId);
    }

    /**
     * The name of the patch group that should be registered with the patch baseline.
     * 
     */
    @Import(name="patchGroup")
    private @Nullable Output<String> patchGroup;

    /**
     * @return The name of the patch group that should be registered with the patch baseline.
     * 
     */
    public Optional<Output<String>> patchGroup() {
        return Optional.ofNullable(this.patchGroup);
    }

    private PatchGroupState() {}

    private PatchGroupState(PatchGroupState $) {
        this.baselineId = $.baselineId;
        this.patchGroup = $.patchGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchGroupState $;

        public Builder() {
            $ = new PatchGroupState();
        }

        public Builder(PatchGroupState defaults) {
            $ = new PatchGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param baselineId The ID of the patch baseline to register the patch group with.
         * 
         * @return builder
         * 
         */
        public Builder baselineId(@Nullable Output<String> baselineId) {
            $.baselineId = baselineId;
            return this;
        }

        /**
         * @param baselineId The ID of the patch baseline to register the patch group with.
         * 
         * @return builder
         * 
         */
        public Builder baselineId(String baselineId) {
            return baselineId(Output.of(baselineId));
        }

        /**
         * @param patchGroup The name of the patch group that should be registered with the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchGroup(@Nullable Output<String> patchGroup) {
            $.patchGroup = patchGroup;
            return this;
        }

        /**
         * @param patchGroup The name of the patch group that should be registered with the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchGroup(String patchGroup) {
            return patchGroup(Output.of(patchGroup));
        }

        public PatchGroupState build() {
            return $;
        }
    }

}