// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DocumentAttachmentsSource {
    /**
     * @return The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
     * 
     */
    private String key;
    /**
     * @return The name of the document attachment file
     * 
     */
    private @Nullable String name;
    /**
     * @return The value describing the location of an attachment to a document
     * 
     */
    private List<String> values;

    private DocumentAttachmentsSource() {}
    /**
     * @return The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The name of the document attachment file
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The value describing the location of an attachment to a document
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private @Nullable String name;
        private List<String> values;
        public Builder() {}
        public Builder(DocumentAttachmentsSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public DocumentAttachmentsSource build() {
            final var o = new DocumentAttachmentsSource();
            o.key = key;
            o.name = name;
            o.values = values;
            return o;
        }
    }
}