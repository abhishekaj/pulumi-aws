// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassifierCsvClassifier {
    /**
     * @return Enables the processing of files that contain only one column.
     * 
     */
    private @Nullable Boolean allowSingleColumn;
    /**
     * @return Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
     * 
     */
    private @Nullable String containsHeader;
    /**
     * @return The delimiter used in the Csv to separate columns.
     * 
     */
    private @Nullable String delimiter;
    /**
     * @return Specifies whether to trim column values.
     * 
     */
    private @Nullable Boolean disableValueTrimming;
    /**
     * @return A list of strings representing column names.
     * 
     */
    private @Nullable List<String> headers;
    /**
     * @return A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    private @Nullable String quoteSymbol;

    private ClassifierCsvClassifier() {}
    /**
     * @return Enables the processing of files that contain only one column.
     * 
     */
    public Optional<Boolean> allowSingleColumn() {
        return Optional.ofNullable(this.allowSingleColumn);
    }
    /**
     * @return Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
     * 
     */
    public Optional<String> containsHeader() {
        return Optional.ofNullable(this.containsHeader);
    }
    /**
     * @return The delimiter used in the Csv to separate columns.
     * 
     */
    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    /**
     * @return Specifies whether to trim column values.
     * 
     */
    public Optional<Boolean> disableValueTrimming() {
        return Optional.ofNullable(this.disableValueTrimming);
    }
    /**
     * @return A list of strings representing column names.
     * 
     */
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    public Optional<String> quoteSymbol() {
        return Optional.ofNullable(this.quoteSymbol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierCsvClassifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowSingleColumn;
        private @Nullable String containsHeader;
        private @Nullable String delimiter;
        private @Nullable Boolean disableValueTrimming;
        private @Nullable List<String> headers;
        private @Nullable String quoteSymbol;
        public Builder() {}
        public Builder(ClassifierCsvClassifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSingleColumn = defaults.allowSingleColumn;
    	      this.containsHeader = defaults.containsHeader;
    	      this.delimiter = defaults.delimiter;
    	      this.disableValueTrimming = defaults.disableValueTrimming;
    	      this.headers = defaults.headers;
    	      this.quoteSymbol = defaults.quoteSymbol;
        }

        @CustomType.Setter
        public Builder allowSingleColumn(@Nullable Boolean allowSingleColumn) {
            this.allowSingleColumn = allowSingleColumn;
            return this;
        }
        @CustomType.Setter
        public Builder containsHeader(@Nullable String containsHeader) {
            this.containsHeader = containsHeader;
            return this;
        }
        @CustomType.Setter
        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        @CustomType.Setter
        public Builder disableValueTrimming(@Nullable Boolean disableValueTrimming) {
            this.disableValueTrimming = disableValueTrimming;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder quoteSymbol(@Nullable String quoteSymbol) {
            this.quoteSymbol = quoteSymbol;
            return this;
        }
        public ClassifierCsvClassifier build() {
            final var o = new ClassifierCsvClassifier();
            o.allowSingleColumn = allowSingleColumn;
            o.containsHeader = containsHeader;
            o.delimiter = delimiter;
            o.disableValueTrimming = disableValueTrimming;
            o.headers = headers;
            o.quoteSymbol = quoteSymbol;
            return o;
        }
    }
}
