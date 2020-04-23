// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Workspaces.Inputs
{

    public sealed class DirectorySelfServicePermissionsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
        /// </summary>
        [Input("changeComputeType")]
        public Input<bool>? ChangeComputeType { get; set; }

        /// <summary>
        /// Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
        /// </summary>
        [Input("increaseVolumeSize")]
        public Input<bool>? IncreaseVolumeSize { get; set; }

        /// <summary>
        /// Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
        /// </summary>
        [Input("rebuildWorkspace")]
        public Input<bool>? RebuildWorkspace { get; set; }

        /// <summary>
        /// Whether WorkSpaces directory users can restart their workspace. Default `true`.
        /// </summary>
        [Input("restartWorkspace")]
        public Input<bool>? RestartWorkspace { get; set; }

        /// <summary>
        /// Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
        /// </summary>
        [Input("switchRunningMode")]
        public Input<bool>? SwitchRunningMode { get; set; }

        public DirectorySelfServicePermissionsArgs()
        {
        }
    }
}