// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class VpnConnectionTunnel2LogOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Options for sending VPN tunnel logs to CloudWatch. See CloudWatch Log Options below for more details.
        /// </summary>
        [Input("cloudwatchLogOptions")]
        public Input<Inputs.VpnConnectionTunnel2LogOptionsCloudwatchLogOptionsArgs>? CloudwatchLogOptions { get; set; }

        public VpnConnectionTunnel2LogOptionsArgs()
        {
        }
        public static new VpnConnectionTunnel2LogOptionsArgs Empty => new VpnConnectionTunnel2LogOptionsArgs();
    }
}