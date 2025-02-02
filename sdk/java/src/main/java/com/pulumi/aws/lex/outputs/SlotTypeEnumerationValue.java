// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SlotTypeEnumerationValue {
    /**
     * @return Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
     * 
     */
    private @Nullable List<String> synonyms;
    /**
     * @return The value of the slot type. Must be less than or equal to 140 characters in length.
     * 
     */
    private String value;

    private SlotTypeEnumerationValue() {}
    /**
     * @return Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
     * 
     */
    public List<String> synonyms() {
        return this.synonyms == null ? List.of() : this.synonyms;
    }
    /**
     * @return The value of the slot type. Must be less than or equal to 140 characters in length.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotTypeEnumerationValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> synonyms;
        private String value;
        public Builder() {}
        public Builder(SlotTypeEnumerationValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder synonyms(@Nullable List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SlotTypeEnumerationValue build() {
            final var o = new SlotTypeEnumerationValue();
            o.synonyms = synonyms;
            o.value = value;
            return o;
        }
    }
}
