// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Workspaces.Inputs
{

    public sealed class DirectoryWorkspaceCreationPropertiesGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
        /// </summary>
        [Input("customSecurityGroupId")]
        public Input<string>? CustomSecurityGroupId { get; set; }

        /// <summary>
        /// The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=&lt;value&gt;,DC=&lt;value&gt;,...,DC=&lt;value&gt;"` pattern.
        /// </summary>
        [Input("defaultOu")]
        public Input<string>? DefaultOu { get; set; }

        /// <summary>
        /// Indicates whether internet access is enabled for your WorkSpaces.
        /// </summary>
        [Input("enableInternetAccess")]
        public Input<bool>? EnableInternetAccess { get; set; }

        /// <summary>
        /// Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
        /// </summary>
        [Input("enableMaintenanceMode")]
        public Input<bool>? EnableMaintenanceMode { get; set; }

        /// <summary>
        /// Indicates whether users are local administrators of their WorkSpaces.
        /// </summary>
        [Input("userEnabledAsLocalAdministrator")]
        public Input<bool>? UserEnabledAsLocalAdministrator { get; set; }

        public DirectoryWorkspaceCreationPropertiesGetArgs()
        {
        }
    }
}