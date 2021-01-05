// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Inputs
{

    public sealed class FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the stateful rule group.
        /// </summary>
        [Input("resourceArn", required: true)]
        public Input<string> ResourceArn { get; set; } = null!;

        public FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs()
        {
        }
    }
}