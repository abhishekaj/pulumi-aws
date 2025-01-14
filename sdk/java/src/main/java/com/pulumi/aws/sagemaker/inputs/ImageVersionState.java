// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageVersionState extends com.pulumi.resources.ResourceArgs {

    public static final ImageVersionState Empty = new ImageVersionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
     * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
     * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The registry path of the container image on which this image version is based.
     * 
     */
    @Import(name="baseImage")
    private @Nullable Output<String> baseImage;

    /**
     * @return The registry path of the container image on which this image version is based.
     * 
     */
    public Optional<Output<String>> baseImage() {
        return Optional.ofNullable(this.baseImage);
    }

    /**
     * The registry path of the container image that contains this image version.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<String> containerImage;

    /**
     * @return The registry path of the container image that contains this image version.
     * 
     */
    public Optional<Output<String>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    @Import(name="imageArn")
    private @Nullable Output<String> imageArn;

    public Optional<Output<String>> imageArn() {
        return Optional.ofNullable(this.imageArn);
    }

    /**
     * The name of the image. Must be unique to your account.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return The name of the image. Must be unique to your account.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ImageVersionState() {}

    private ImageVersionState(ImageVersionState $) {
        this.arn = $.arn;
        this.baseImage = $.baseImage;
        this.containerImage = $.containerImage;
        this.imageArn = $.imageArn;
        this.imageName = $.imageName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageVersionState $;

        public Builder() {
            $ = new ImageVersionState();
        }

        public Builder(ImageVersionState defaults) {
            $ = new ImageVersionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
         * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
         * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param baseImage The registry path of the container image on which this image version is based.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(@Nullable Output<String> baseImage) {
            $.baseImage = baseImage;
            return this;
        }

        /**
         * @param baseImage The registry path of the container image on which this image version is based.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(String baseImage) {
            return baseImage(Output.of(baseImage));
        }

        /**
         * @param containerImage The registry path of the container image that contains this image version.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<String> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage The registry path of the container image that contains this image version.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(String containerImage) {
            return containerImage(Output.of(containerImage));
        }

        public Builder imageArn(@Nullable Output<String> imageArn) {
            $.imageArn = imageArn;
            return this;
        }

        public Builder imageArn(String imageArn) {
            return imageArn(Output.of(imageArn));
        }

        /**
         * @param imageName The name of the image. Must be unique to your account.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the image. Must be unique to your account.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ImageVersionState build() {
            return $;
        }
    }

}
