// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPointPosixUser {
    /**
     * @return Group ID
     * 
     */
    private Integer gid;
    /**
     * @return Secondary group IDs
     * 
     */
    private List<Integer> secondaryGids;
    /**
     * @return User Id
     * * `root_directory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
     * 
     */
    private Integer uid;

    private GetAccessPointPosixUser() {}
    /**
     * @return Group ID
     * 
     */
    public Integer gid() {
        return this.gid;
    }
    /**
     * @return Secondary group IDs
     * 
     */
    public List<Integer> secondaryGids() {
        return this.secondaryGids;
    }
    /**
     * @return User Id
     * * `root_directory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
     * 
     */
    public Integer uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointPosixUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer gid;
        private List<Integer> secondaryGids;
        private Integer uid;
        public Builder() {}
        public Builder(GetAccessPointPosixUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder gid(Integer gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryGids(List<Integer> secondaryGids) {
            this.secondaryGids = Objects.requireNonNull(secondaryGids);
            return this;
        }
        public Builder secondaryGids(Integer... secondaryGids) {
            return secondaryGids(List.of(secondaryGids));
        }
        @CustomType.Setter
        public Builder uid(Integer uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public GetAccessPointPosixUser build() {
            final var o = new GetAccessPointPosixUser();
            o.gid = gid;
            o.secondaryGids = secondaryGids;
            o.uid = uid;
            return o;
        }
    }
}