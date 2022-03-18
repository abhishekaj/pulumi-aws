// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketV2LifecycleRuleExpirationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date after which you want the corresponding action to take effect.
        /// </summary>
        [Input("date")]
        public Input<string>? Date { get; set; }

        /// <summary>
        /// The number of days specified for the default retention period.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        /// <summary>
        /// Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions.
        /// </summary>
        [Input("expiredObjectDeleteMarker")]
        public Input<bool>? ExpiredObjectDeleteMarker { get; set; }

        public BucketV2LifecycleRuleExpirationGetArgs()
        {
        }
    }
}