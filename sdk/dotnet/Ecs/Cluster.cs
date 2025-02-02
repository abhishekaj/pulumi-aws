// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs
{
    /// <summary>
    /// Provides an ECS cluster.
    /// 
    /// &gt; **NOTE on Clusters and Cluster Capacity Providers:** this provider provides both a standalone `aws.ecs.ClusterCapacityProviders` resource, as well as allowing the capacity providers and default strategies to be managed in-line by the `aws.ecs.Cluster` resource. You cannot use a Cluster with in-line capacity providers in conjunction with the Capacity Providers resource, nor use more than one Capacity Providers resource with a single Cluster, as doing so will cause a conflict and will lead to mutual overwrites.
    /// 
    /// ## Example Usage
    /// ### Basic Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Aws.Ecs.Cluster("foo", new()
    ///     {
    ///         Settings = new[]
    ///         {
    ///             new Aws.Ecs.Inputs.ClusterSettingArgs
    ///             {
    ///                 Name = "containerInsights",
    ///                 Value = "enabled",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with Log Configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleKey = new Aws.Kms.Key("exampleKey", new()
    ///     {
    ///         Description = "example",
    ///         DeletionWindowInDays = 7,
    ///     });
    /// 
    ///     var exampleLogGroup = new Aws.CloudWatch.LogGroup("exampleLogGroup");
    /// 
    ///     var test = new Aws.Ecs.Cluster("test", new()
    ///     {
    ///         Configuration = new Aws.Ecs.Inputs.ClusterConfigurationArgs
    ///         {
    ///             ExecuteCommandConfiguration = new Aws.Ecs.Inputs.ClusterConfigurationExecuteCommandConfigurationArgs
    ///             {
    ///                 KmsKeyId = exampleKey.Arn,
    ///                 Logging = "OVERRIDE",
    ///                 LogConfiguration = new Aws.Ecs.Inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs
    ///                 {
    ///                     CloudWatchEncryptionEnabled = true,
    ///                     CloudWatchLogGroupName = exampleLogGroup.Name,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with Capacity Providers
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleCluster = new Aws.Ecs.Cluster("exampleCluster");
    /// 
    ///     var exampleCapacityProvider = new Aws.Ecs.CapacityProvider("exampleCapacityProvider", new()
    ///     {
    ///         AutoScalingGroupProvider = new Aws.Ecs.Inputs.CapacityProviderAutoScalingGroupProviderArgs
    ///         {
    ///             AutoScalingGroupArn = aws_autoscaling_group.Example.Arn,
    ///         },
    ///     });
    /// 
    ///     var exampleClusterCapacityProviders = new Aws.Ecs.ClusterCapacityProviders("exampleClusterCapacityProviders", new()
    ///     {
    ///         ClusterName = exampleCluster.Name,
    ///         CapacityProviders = new[]
    ///         {
    ///             exampleCapacityProvider.Name,
    ///         },
    ///         DefaultCapacityProviderStrategies = new[]
    ///         {
    ///             new Aws.Ecs.Inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs
    ///             {
    ///                 Base = 1,
    ///                 Weight = 100,
    ///                 CapacityProvider = exampleCapacityProvider.Name,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS clusters can be imported using the `name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:ecs/cluster:Cluster stateless stateless-app
    /// ```
    /// </summary>
    [AwsResourceType("aws:ecs/cluster:Cluster")]
    public partial class Cluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN that identifies the cluster.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
        /// </summary>
        [Output("capacityProviders")]
        public Output<ImmutableArray<string>> CapacityProviders { get; private set; } = null!;

        /// <summary>
        /// The execute command configuration for the cluster. Detailed below.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.ClusterConfiguration?> Configuration { get; private set; } = null!;

        /// <summary>
        /// Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
        /// </summary>
        [Output("defaultCapacityProviderStrategies")]
        public Output<ImmutableArray<Outputs.ClusterDefaultCapacityProviderStrategy>> DefaultCapacityProviderStrategies { get; private set; } = null!;

        /// <summary>
        /// Name of the setting to manage. Valid values: `containerInsights`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
        /// </summary>
        [Output("settings")]
        public Output<ImmutableArray<Outputs.ClusterSetting>> Settings { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ecs/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:ecs/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("capacityProviders")]
        private InputList<string>? _capacityProviders;

        /// <summary>
        /// List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
        /// </summary>
        [Obsolete(@"Use the aws_ecs_cluster_capacity_providers resource instead")]
        public InputList<string> CapacityProviders
        {
            get => _capacityProviders ?? (_capacityProviders = new InputList<string>());
            set => _capacityProviders = value;
        }

        /// <summary>
        /// The execute command configuration for the cluster. Detailed below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.ClusterConfigurationArgs>? Configuration { get; set; }

        [Input("defaultCapacityProviderStrategies")]
        private InputList<Inputs.ClusterDefaultCapacityProviderStrategyArgs>? _defaultCapacityProviderStrategies;

        /// <summary>
        /// Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
        /// </summary>
        [Obsolete(@"Use the aws_ecs_cluster_capacity_providers resource instead")]
        public InputList<Inputs.ClusterDefaultCapacityProviderStrategyArgs> DefaultCapacityProviderStrategies
        {
            get => _defaultCapacityProviderStrategies ?? (_defaultCapacityProviderStrategies = new InputList<Inputs.ClusterDefaultCapacityProviderStrategyArgs>());
            set => _defaultCapacityProviderStrategies = value;
        }

        /// <summary>
        /// Name of the setting to manage. Valid values: `containerInsights`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("settings")]
        private InputList<Inputs.ClusterSettingArgs>? _settings;

        /// <summary>
        /// Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
        /// </summary>
        public InputList<Inputs.ClusterSettingArgs> Settings
        {
            get => _settings ?? (_settings = new InputList<Inputs.ClusterSettingArgs>());
            set => _settings = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ClusterArgs()
        {
        }
        public static new ClusterArgs Empty => new ClusterArgs();
    }

    public sealed class ClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN that identifies the cluster.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("capacityProviders")]
        private InputList<string>? _capacityProviders;

        /// <summary>
        /// List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
        /// </summary>
        [Obsolete(@"Use the aws_ecs_cluster_capacity_providers resource instead")]
        public InputList<string> CapacityProviders
        {
            get => _capacityProviders ?? (_capacityProviders = new InputList<string>());
            set => _capacityProviders = value;
        }

        /// <summary>
        /// The execute command configuration for the cluster. Detailed below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.ClusterConfigurationGetArgs>? Configuration { get; set; }

        [Input("defaultCapacityProviderStrategies")]
        private InputList<Inputs.ClusterDefaultCapacityProviderStrategyGetArgs>? _defaultCapacityProviderStrategies;

        /// <summary>
        /// Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
        /// </summary>
        [Obsolete(@"Use the aws_ecs_cluster_capacity_providers resource instead")]
        public InputList<Inputs.ClusterDefaultCapacityProviderStrategyGetArgs> DefaultCapacityProviderStrategies
        {
            get => _defaultCapacityProviderStrategies ?? (_defaultCapacityProviderStrategies = new InputList<Inputs.ClusterDefaultCapacityProviderStrategyGetArgs>());
            set => _defaultCapacityProviderStrategies = value;
        }

        /// <summary>
        /// Name of the setting to manage. Valid values: `containerInsights`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("settings")]
        private InputList<Inputs.ClusterSettingGetArgs>? _settings;

        /// <summary>
        /// Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
        /// </summary>
        public InputList<Inputs.ClusterSettingGetArgs> Settings
        {
            get => _settings ?? (_settings = new InputList<Inputs.ClusterSettingGetArgs>());
            set => _settings = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ClusterState()
        {
        }
        public static new ClusterState Empty => new ClusterState();
    }
}
