// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserHierarchyGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserHierarchyGroupArgs Empty = new UserHierarchyGroupArgs();

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The name of the user hierarchy group. Must not be more than 100 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user hierarchy group. Must not be more than 100 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
     * 
     */
    @Import(name="parentGroupId")
    private @Nullable Output<String> parentGroupId;

    /**
     * @return The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
     * 
     */
    public Optional<Output<String>> parentGroupId() {
        return Optional.ofNullable(this.parentGroupId);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private UserHierarchyGroupArgs() {}

    private UserHierarchyGroupArgs(UserHierarchyGroupArgs $) {
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.parentGroupId = $.parentGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserHierarchyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserHierarchyGroupArgs $;

        public Builder() {
            $ = new UserHierarchyGroupArgs();
        }

        public Builder(UserHierarchyGroupArgs defaults) {
            $ = new UserHierarchyGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name The name of the user hierarchy group. Must not be more than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user hierarchy group. Must not be more than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentGroupId The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
         * 
         * @return builder
         * 
         */
        public Builder parentGroupId(@Nullable Output<String> parentGroupId) {
            $.parentGroupId = parentGroupId;
            return this;
        }

        /**
         * @param parentGroupId The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
         * 
         * @return builder
         * 
         */
        public Builder parentGroupId(String parentGroupId) {
            return parentGroupId(Output.of(parentGroupId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public UserHierarchyGroupArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}