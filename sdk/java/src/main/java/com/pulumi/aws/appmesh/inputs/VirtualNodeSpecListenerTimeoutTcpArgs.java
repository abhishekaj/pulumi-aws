// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpIdleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutTcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutTcpArgs Empty = new VirtualNodeSpecListenerTimeoutTcpArgs();

    /**
     * Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle;

    /**
     * @return Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs>> idle() {
        return Optional.ofNullable(this.idle);
    }

    private VirtualNodeSpecListenerTimeoutTcpArgs() {}

    private VirtualNodeSpecListenerTimeoutTcpArgs(VirtualNodeSpecListenerTimeoutTcpArgs $) {
        this.idle = $.idle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTimeoutTcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTimeoutTcpArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTimeoutTcpArgs();
        }

        public Builder(VirtualNodeSpecListenerTimeoutTcpArgs defaults) {
            $ = new VirtualNodeSpecListenerTimeoutTcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(@Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle) {
            $.idle = idle;
            return this;
        }

        /**
         * @param idle Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(VirtualNodeSpecListenerTimeoutTcpIdleArgs idle) {
            return idle(Output.of(idle));
        }

        public VirtualNodeSpecListenerTimeoutTcpArgs build() {
            return $;
        }
    }

}