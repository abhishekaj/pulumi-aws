// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The document type specified in the Veeva document extract flow.
        /// </summary>
        [Input("documentType")]
        public Input<string>? DocumentType { get; set; }

        /// <summary>
        /// Boolean value to include All Versions of files in Veeva document extract flow.
        /// </summary>
        [Input("includeAllVersions")]
        public Input<bool>? IncludeAllVersions { get; set; }

        /// <summary>
        /// Boolean value to include file renditions in Veeva document extract flow.
        /// </summary>
        [Input("includeRenditions")]
        public Input<bool>? IncludeRenditions { get; set; }

        /// <summary>
        /// Boolean value to include source files in Veeva document extract flow.
        /// </summary>
        [Input("includeSourceFiles")]
        public Input<bool>? IncludeSourceFiles { get; set; }

        /// <summary>
        /// The object specified in the Veeva flow source.
        /// </summary>
        [Input("object", required: true)]
        public Input<string> Object { get; set; } = null!;

        public FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs()
        {
        }
    }
}