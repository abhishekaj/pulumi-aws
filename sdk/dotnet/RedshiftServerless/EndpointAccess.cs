// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedshiftServerless
{
    /// <summary>
    /// Creates a new Amazon Redshift Serverless Endpoint Access.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.RedshiftServerless.EndpointAccess("example", new()
    ///     {
    ///         EndpointName = "example",
    ///         WorkgroupName = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Redshift Serverless Endpoint Access can be imported using the `endpoint_name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:redshiftserverless/endpointAccess:EndpointAccess example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:redshiftserverless/endpointAccess:EndpointAccess")]
    public partial class EndpointAccess : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The DNS address of the VPC endpoint.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the endpoint.
        /// </summary>
        [Output("endpointName")]
        public Output<string> EndpointName { get; private set; } = null!;

        /// <summary>
        /// The port that Amazon Redshift Serverless listens on.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// An array of VPC subnet IDs to associate with the endpoint.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
        /// </summary>
        [Output("vpcEndpoints")]
        public Output<ImmutableArray<Outputs.EndpointAccessVpcEndpoint>> VpcEndpoints { get; private set; } = null!;

        /// <summary>
        /// An array of security group IDs to associate with the workgroup.
        /// </summary>
        [Output("vpcSecurityGroupIds")]
        public Output<ImmutableArray<string>> VpcSecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The name of the workgroup.
        /// </summary>
        [Output("workgroupName")]
        public Output<string> WorkgroupName { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointAccess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointAccess(string name, EndpointAccessArgs args, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/endpointAccess:EndpointAccess", name, args ?? new EndpointAccessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointAccess(string name, Input<string> id, EndpointAccessState? state = null, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/endpointAccess:EndpointAccess", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EndpointAccess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointAccess Get(string name, Input<string> id, EndpointAccessState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointAccess(name, id, state, options);
        }
    }

    public sealed class EndpointAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the endpoint.
        /// </summary>
        [Input("endpointName", required: true)]
        public Input<string> EndpointName { get; set; } = null!;

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// An array of VPC subnet IDs to associate with the endpoint.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("vpcSecurityGroupIds")]
        private InputList<string>? _vpcSecurityGroupIds;

        /// <summary>
        /// An array of security group IDs to associate with the workgroup.
        /// </summary>
        public InputList<string> VpcSecurityGroupIds
        {
            get => _vpcSecurityGroupIds ?? (_vpcSecurityGroupIds = new InputList<string>());
            set => _vpcSecurityGroupIds = value;
        }

        /// <summary>
        /// The name of the workgroup.
        /// </summary>
        [Input("workgroupName", required: true)]
        public Input<string> WorkgroupName { get; set; } = null!;

        public EndpointAccessArgs()
        {
        }
        public static new EndpointAccessArgs Empty => new EndpointAccessArgs();
    }

    public sealed class EndpointAccessState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DNS address of the VPC endpoint.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the endpoint.
        /// </summary>
        [Input("endpointName")]
        public Input<string>? EndpointName { get; set; }

        /// <summary>
        /// The port that Amazon Redshift Serverless listens on.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// An array of VPC subnet IDs to associate with the endpoint.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("vpcEndpoints")]
        private InputList<Inputs.EndpointAccessVpcEndpointGetArgs>? _vpcEndpoints;

        /// <summary>
        /// The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
        /// </summary>
        public InputList<Inputs.EndpointAccessVpcEndpointGetArgs> VpcEndpoints
        {
            get => _vpcEndpoints ?? (_vpcEndpoints = new InputList<Inputs.EndpointAccessVpcEndpointGetArgs>());
            set => _vpcEndpoints = value;
        }

        [Input("vpcSecurityGroupIds")]
        private InputList<string>? _vpcSecurityGroupIds;

        /// <summary>
        /// An array of security group IDs to associate with the workgroup.
        /// </summary>
        public InputList<string> VpcSecurityGroupIds
        {
            get => _vpcSecurityGroupIds ?? (_vpcSecurityGroupIds = new InputList<string>());
            set => _vpcSecurityGroupIds = value;
        }

        /// <summary>
        /// The name of the workgroup.
        /// </summary>
        [Input("workgroupName")]
        public Input<string>? WorkgroupName { get; set; }

        public EndpointAccessState()
        {
        }
        public static new EndpointAccessState Empty => new EndpointAccessState();
    }
}