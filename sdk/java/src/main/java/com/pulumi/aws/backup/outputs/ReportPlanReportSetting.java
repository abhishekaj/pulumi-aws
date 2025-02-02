// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportPlanReportSetting {
    /**
     * @return Specifies the Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
     */
    private @Nullable List<String> frameworkArns;
    /**
     * @return Specifies the number of frameworks a report covers.
     * 
     */
    private @Nullable Integer numberOfFrameworks;
    /**
     * @return Identifies the report template for the report. Reports are built using a report template. The report templates are: `RESOURCE_COMPLIANCE_REPORT` | `CONTROL_COMPLIANCE_REPORT` | `BACKUP_JOB_REPORT` | `COPY_JOB_REPORT` | `RESTORE_JOB_REPORT`.
     * 
     */
    private String reportTemplate;

    private ReportPlanReportSetting() {}
    /**
     * @return Specifies the Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
     */
    public List<String> frameworkArns() {
        return this.frameworkArns == null ? List.of() : this.frameworkArns;
    }
    /**
     * @return Specifies the number of frameworks a report covers.
     * 
     */
    public Optional<Integer> numberOfFrameworks() {
        return Optional.ofNullable(this.numberOfFrameworks);
    }
    /**
     * @return Identifies the report template for the report. Reports are built using a report template. The report templates are: `RESOURCE_COMPLIANCE_REPORT` | `CONTROL_COMPLIANCE_REPORT` | `BACKUP_JOB_REPORT` | `COPY_JOB_REPORT` | `RESTORE_JOB_REPORT`.
     * 
     */
    public String reportTemplate() {
        return this.reportTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportPlanReportSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> frameworkArns;
        private @Nullable Integer numberOfFrameworks;
        private String reportTemplate;
        public Builder() {}
        public Builder(ReportPlanReportSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameworkArns = defaults.frameworkArns;
    	      this.numberOfFrameworks = defaults.numberOfFrameworks;
    	      this.reportTemplate = defaults.reportTemplate;
        }

        @CustomType.Setter
        public Builder frameworkArns(@Nullable List<String> frameworkArns) {
            this.frameworkArns = frameworkArns;
            return this;
        }
        public Builder frameworkArns(String... frameworkArns) {
            return frameworkArns(List.of(frameworkArns));
        }
        @CustomType.Setter
        public Builder numberOfFrameworks(@Nullable Integer numberOfFrameworks) {
            this.numberOfFrameworks = numberOfFrameworks;
            return this;
        }
        @CustomType.Setter
        public Builder reportTemplate(String reportTemplate) {
            this.reportTemplate = Objects.requireNonNull(reportTemplate);
            return this;
        }
        public ReportPlanReportSetting build() {
            final var o = new ReportPlanReportSetting();
            o.frameworkArns = frameworkArns;
            o.numberOfFrameworks = numberOfFrameworks;
            o.reportTemplate = reportTemplate;
            return o;
        }
    }
}
