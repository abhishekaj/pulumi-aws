// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterCostCategoryArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterDimensionArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTagsFilterArgs Empty = new GetTagsFilterArgs();

    /**
     * Return results that match both `Dimension` objects.
     * 
     */
    @Import(name="ands")
    private @Nullable Output<List<GetTagsFilterAndArgs>> ands;

    /**
     * @return Return results that match both `Dimension` objects.
     * 
     */
    public Optional<Output<List<GetTagsFilterAndArgs>>> ands() {
        return Optional.ofNullable(this.ands);
    }

    /**
     * Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    @Import(name="costCategory")
    private @Nullable Output<GetTagsFilterCostCategoryArgs> costCategory;

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<Output<GetTagsFilterCostCategoryArgs>> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }

    /**
     * Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    @Import(name="dimension")
    private @Nullable Output<GetTagsFilterDimensionArgs> dimension;

    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<Output<GetTagsFilterDimensionArgs>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * Return results that match both `Dimension` object.
     * 
     */
    @Import(name="not")
    private @Nullable Output<GetTagsFilterNotArgs> not;

    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    public Optional<Output<GetTagsFilterNotArgs>> not() {
        return Optional.ofNullable(this.not);
    }

    /**
     * Return results that match both `Dimension` object.
     * 
     */
    @Import(name="ors")
    private @Nullable Output<List<GetTagsFilterOrArgs>> ors;

    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    public Optional<Output<List<GetTagsFilterOrArgs>>> ors() {
        return Optional.ofNullable(this.ors);
    }

    /**
     * Tags that match your request.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<GetTagsFilterTagsArgs> tags;

    /**
     * @return Tags that match your request.
     * 
     */
    public Optional<Output<GetTagsFilterTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTagsFilterArgs() {}

    private GetTagsFilterArgs(GetTagsFilterArgs $) {
        this.ands = $.ands;
        this.costCategory = $.costCategory;
        this.dimension = $.dimension;
        this.not = $.not;
        this.ors = $.ors;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagsFilterArgs $;

        public Builder() {
            $ = new GetTagsFilterArgs();
        }

        public Builder(GetTagsFilterArgs defaults) {
            $ = new GetTagsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ands Return results that match both `Dimension` objects.
         * 
         * @return builder
         * 
         */
        public Builder ands(@Nullable Output<List<GetTagsFilterAndArgs>> ands) {
            $.ands = ands;
            return this;
        }

        /**
         * @param ands Return results that match both `Dimension` objects.
         * 
         * @return builder
         * 
         */
        public Builder ands(List<GetTagsFilterAndArgs> ands) {
            return ands(Output.of(ands));
        }

        /**
         * @param ands Return results that match both `Dimension` objects.
         * 
         * @return builder
         * 
         */
        public Builder ands(GetTagsFilterAndArgs... ands) {
            return ands(List.of(ands));
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(@Nullable Output<GetTagsFilterCostCategoryArgs> costCategory) {
            $.costCategory = costCategory;
            return this;
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(GetTagsFilterCostCategoryArgs costCategory) {
            return costCategory(Output.of(costCategory));
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(@Nullable Output<GetTagsFilterDimensionArgs> dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(GetTagsFilterDimensionArgs dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param not Return results that match both `Dimension` object.
         * 
         * @return builder
         * 
         */
        public Builder not(@Nullable Output<GetTagsFilterNotArgs> not) {
            $.not = not;
            return this;
        }

        /**
         * @param not Return results that match both `Dimension` object.
         * 
         * @return builder
         * 
         */
        public Builder not(GetTagsFilterNotArgs not) {
            return not(Output.of(not));
        }

        /**
         * @param ors Return results that match both `Dimension` object.
         * 
         * @return builder
         * 
         */
        public Builder ors(@Nullable Output<List<GetTagsFilterOrArgs>> ors) {
            $.ors = ors;
            return this;
        }

        /**
         * @param ors Return results that match both `Dimension` object.
         * 
         * @return builder
         * 
         */
        public Builder ors(List<GetTagsFilterOrArgs> ors) {
            return ors(Output.of(ors));
        }

        /**
         * @param ors Return results that match both `Dimension` object.
         * 
         * @return builder
         * 
         */
        public Builder ors(GetTagsFilterOrArgs... ors) {
            return ors(List.of(ors));
        }

        /**
         * @param tags Tags that match your request.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<GetTagsFilterTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags that match your request.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetTagsFilterTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public GetTagsFilterArgs build() {
            return $;
        }
    }

}