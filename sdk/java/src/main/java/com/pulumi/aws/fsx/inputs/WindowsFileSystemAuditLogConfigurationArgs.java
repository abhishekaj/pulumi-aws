// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFileSystemAuditLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemAuditLogConfigurationArgs Empty = new WindowsFileSystemAuditLogConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
     * 
     */
    @Import(name="auditLogDestination")
    private @Nullable Output<String> auditLogDestination;

    /**
     * @return The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
     * 
     */
    public Optional<Output<String>> auditLogDestination() {
        return Optional.ofNullable(this.auditLogDestination);
    }

    /**
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    @Import(name="fileAccessAuditLogLevel")
    private @Nullable Output<String> fileAccessAuditLogLevel;

    /**
     * @return Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    public Optional<Output<String>> fileAccessAuditLogLevel() {
        return Optional.ofNullable(this.fileAccessAuditLogLevel);
    }

    /**
     * Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    @Import(name="fileShareAccessAuditLogLevel")
    private @Nullable Output<String> fileShareAccessAuditLogLevel;

    /**
     * @return Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    public Optional<Output<String>> fileShareAccessAuditLogLevel() {
        return Optional.ofNullable(this.fileShareAccessAuditLogLevel);
    }

    private WindowsFileSystemAuditLogConfigurationArgs() {}

    private WindowsFileSystemAuditLogConfigurationArgs(WindowsFileSystemAuditLogConfigurationArgs $) {
        this.auditLogDestination = $.auditLogDestination;
        this.fileAccessAuditLogLevel = $.fileAccessAuditLogLevel;
        this.fileShareAccessAuditLogLevel = $.fileShareAccessAuditLogLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFileSystemAuditLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFileSystemAuditLogConfigurationArgs $;

        public Builder() {
            $ = new WindowsFileSystemAuditLogConfigurationArgs();
        }

        public Builder(WindowsFileSystemAuditLogConfigurationArgs defaults) {
            $ = new WindowsFileSystemAuditLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogDestination The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
         * 
         * @return builder
         * 
         */
        public Builder auditLogDestination(@Nullable Output<String> auditLogDestination) {
            $.auditLogDestination = auditLogDestination;
            return this;
        }

        /**
         * @param auditLogDestination The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
         * 
         * @return builder
         * 
         */
        public Builder auditLogDestination(String auditLogDestination) {
            return auditLogDestination(Output.of(auditLogDestination));
        }

        /**
         * @param fileAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder fileAccessAuditLogLevel(@Nullable Output<String> fileAccessAuditLogLevel) {
            $.fileAccessAuditLogLevel = fileAccessAuditLogLevel;
            return this;
        }

        /**
         * @param fileAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder fileAccessAuditLogLevel(String fileAccessAuditLogLevel) {
            return fileAccessAuditLogLevel(Output.of(fileAccessAuditLogLevel));
        }

        /**
         * @param fileShareAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder fileShareAccessAuditLogLevel(@Nullable Output<String> fileShareAccessAuditLogLevel) {
            $.fileShareAccessAuditLogLevel = fileShareAccessAuditLogLevel;
            return this;
        }

        /**
         * @param fileShareAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder fileShareAccessAuditLogLevel(String fileShareAccessAuditLogLevel) {
            return fileShareAccessAuditLogLevel(Output.of(fileShareAccessAuditLogLevel));
        }

        public WindowsFileSystemAuditLogConfigurationArgs build() {
            return $;
        }
    }

}