// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryEndpointResult {
    private String domain;
    private String domainOwner;
    private String format;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String repository;
    /**
     * @return URL of the returned endpoint.
     * 
     */
    private String repositoryEndpoint;

    private GetRepositoryEndpointResult() {}
    public String domain() {
        return this.domain;
    }
    public String domainOwner() {
        return this.domainOwner;
    }
    public String format() {
        return this.format;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String repository() {
        return this.repository;
    }
    /**
     * @return URL of the returned endpoint.
     * 
     */
    public String repositoryEndpoint() {
        return this.repositoryEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domain;
        private String domainOwner;
        private String format;
        private String id;
        private String repository;
        private String repositoryEndpoint;
        public Builder() {}
        public Builder(GetRepositoryEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.repository = defaults.repository;
    	      this.repositoryEndpoint = defaults.repositoryEndpoint;
        }

        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder domainOwner(String domainOwner) {
            this.domainOwner = Objects.requireNonNull(domainOwner);
            return this;
        }
        @CustomType.Setter
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        @CustomType.Setter
        public Builder repositoryEndpoint(String repositoryEndpoint) {
            this.repositoryEndpoint = Objects.requireNonNull(repositoryEndpoint);
            return this;
        }
        public GetRepositoryEndpointResult build() {
            final var o = new GetRepositoryEndpointResult();
            o.domain = domain;
            o.domainOwner = domainOwner;
            o.format = format;
            o.id = id;
            o.repository = repository;
            o.repositoryEndpoint = repositoryEndpoint;
            return o;
        }
    }
}