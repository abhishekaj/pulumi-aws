// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeBuild.Inputs
{

    public sealed class ProjectSecondarySourceVersionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An identifier for a source in the build project.
        /// </summary>
        [Input("sourceIdentifier", required: true)]
        public Input<string> SourceIdentifier { get; set; } = null!;

        /// <summary>
        /// The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
        /// </summary>
        [Input("sourceVersion", required: true)]
        public Input<string> SourceVersion { get; set; } = null!;

        public ProjectSecondarySourceVersionGetArgs()
        {
        }
    }
}