// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsSummary;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLaunchPathsResult {
    private @Nullable String acceptLanguage;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String productId;
    /**
     * @return Block with information about the launch path. See details below.
     * 
     */
    private List<GetLaunchPathsSummary> summaries;

    private GetLaunchPathsResult() {}
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String productId() {
        return this.productId;
    }
    /**
     * @return Block with information about the launch path. See details below.
     * 
     */
    public List<GetLaunchPathsSummary> summaries() {
        return this.summaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String id;
        private String productId;
        private List<GetLaunchPathsSummary> summaries;
        public Builder() {}
        public Builder(GetLaunchPathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.id = defaults.id;
    	      this.productId = defaults.productId;
    	      this.summaries = defaults.summaries;
        }

        @CustomType.Setter
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        @CustomType.Setter
        public Builder summaries(List<GetLaunchPathsSummary> summaries) {
            this.summaries = Objects.requireNonNull(summaries);
            return this;
        }
        public Builder summaries(GetLaunchPathsSummary... summaries) {
            return summaries(List.of(summaries));
        }
        public GetLaunchPathsResult build() {
            final var o = new GetLaunchPathsResult();
            o.acceptLanguage = acceptLanguage;
            o.id = id;
            o.productId = productId;
            o.summaries = summaries;
            return o;
        }
    }
}
