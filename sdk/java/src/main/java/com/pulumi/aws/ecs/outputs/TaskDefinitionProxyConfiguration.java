// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionProxyConfiguration {
    /**
     * @return Name of the container that will serve as the App Mesh proxy.
     * 
     */
    private String containerName;
    /**
     * @return Set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
     * 
     */
    private @Nullable Map<String,String> properties;
    /**
     * @return Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    private @Nullable String type;

    private TaskDefinitionProxyConfiguration() {}
    /**
     * @return Name of the container that will serve as the App Mesh proxy.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return Set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionProxyConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerName;
        private @Nullable Map<String,String> properties;
        private @Nullable String type;
        public Builder() {}
        public Builder(TaskDefinitionProxyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        @CustomType.Setter
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public TaskDefinitionProxyConfiguration build() {
            final var o = new TaskDefinitionProxyConfiguration();
            o.containerName = containerName;
            o.properties = properties;
            o.type = type;
            return o;
        }
    }
}