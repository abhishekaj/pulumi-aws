// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager.Inputs
{

    public sealed class GetCoreNetworkPolicyDocumentCoreNetworkConfigurationInputArgs : Pulumi.ResourceArgs
    {
        [Input("asnRanges", required: true)]
        private InputList<string>? _asnRanges;

        /// <summary>
        /// List of strings containing Autonomous System Numbers (ASNs) to assign to Core Network Edges. By default, the core network automatically assigns an ASN for each Core Network Edge but you can optionally define the ASN in the edge-locations for each Region. The ASN uses an array of integer ranges only from `64512` to `65534` and `4200000000` to `4294967294` expressed as a string like `"64512-65534"`. No other ASN ranges can be used.
        /// </summary>
        public InputList<string> AsnRanges
        {
            get => _asnRanges ?? (_asnRanges = new InputList<string>());
            set => _asnRanges = value;
        }

        [Input("edgeLocations", required: true)]
        private InputList<Inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationInputArgs>? _edgeLocations;

        /// <summary>
        /// A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
        /// </summary>
        public InputList<Inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationInputArgs> EdgeLocations
        {
            get => _edgeLocations ?? (_edgeLocations = new InputList<Inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationInputArgs>());
            set => _edgeLocations = value;
        }

        [Input("insideCidrBlocks")]
        private InputList<string>? _insideCidrBlocks;

        /// <summary>
        /// The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
        /// </summary>
        public InputList<string> InsideCidrBlocks
        {
            get => _insideCidrBlocks ?? (_insideCidrBlocks = new InputList<string>());
            set => _insideCidrBlocks = value;
        }

        /// <summary>
        /// Indicates whether the core network forwards traffic over multiple equal-cost routes using VPN. The value can be either `true` or `false`. The default is `true`.
        /// </summary>
        [Input("vpnEcmpSupport")]
        public Input<bool>? VpnEcmpSupport { get; set; }

        public GetCoreNetworkPolicyDocumentCoreNetworkConfigurationInputArgs()
        {
        }
    }
}