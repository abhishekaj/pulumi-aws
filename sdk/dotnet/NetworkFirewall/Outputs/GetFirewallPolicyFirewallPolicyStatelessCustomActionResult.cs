// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Outputs
{

    [OutputType]
    public sealed class GetFirewallPolicyFirewallPolicyStatelessCustomActionResult
    {
        public readonly ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionResult> ActionDefinitions;
        public readonly string ActionName;

        [OutputConstructor]
        private GetFirewallPolicyFirewallPolicyStatelessCustomActionResult(
            ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionResult> actionDefinitions,

            string actionName)
        {
            ActionDefinitions = actionDefinitions;
            ActionName = actionName;
        }
    }
}