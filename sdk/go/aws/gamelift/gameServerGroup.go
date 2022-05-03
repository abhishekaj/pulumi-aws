// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gamelift

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an GameLift Game Server Group resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/gamelift"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gamelift.NewGameServerGroup(ctx, "example", &gamelift.GameServerGroupArgs{
// 			GameServerGroupName: pulumi.String("example"),
// 			InstanceDefinitions: gamelift.GameServerGroupInstanceDefinitionArray{
// 				&gamelift.GameServerGroupInstanceDefinitionArgs{
// 					InstanceType: pulumi.String("c5.large"),
// 				},
// 				&gamelift.GameServerGroupInstanceDefinitionArgs{
// 					InstanceType: pulumi.String("c5a.large"),
// 				},
// 			},
// 			LaunchTemplate: &gamelift.GameServerGroupLaunchTemplateArgs{
// 				Id: pulumi.Any(aws_launch_template.Example.Id),
// 			},
// 			MaxSize: pulumi.Int(1),
// 			MinSize: pulumi.Int(1),
// 			RoleArn: pulumi.Any(aws_iam_role.Example.Arn),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			aws_iam_role_policy_attachment.Example,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Full usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/gamelift"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gamelift.NewGameServerGroup(ctx, "example", &gamelift.GameServerGroupArgs{
// 			AutoScalingPolicy: &gamelift.GameServerGroupAutoScalingPolicyArgs{
// 				EstimatedInstanceWarmup: pulumi.Int(60),
// 				TargetTrackingConfiguration: &gamelift.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs{
// 					TargetValue: pulumi.Float64(75),
// 				},
// 			},
// 			BalancingStrategy:          pulumi.String("SPOT_ONLY"),
// 			GameServerGroupName:        pulumi.String("example"),
// 			GameServerProtectionPolicy: pulumi.String("FULL_PROTECTION"),
// 			InstanceDefinitions: gamelift.GameServerGroupInstanceDefinitionArray{
// 				&gamelift.GameServerGroupInstanceDefinitionArgs{
// 					InstanceType:     pulumi.String("c5.large"),
// 					WeightedCapacity: pulumi.String("1"),
// 				},
// 				&gamelift.GameServerGroupInstanceDefinitionArgs{
// 					InstanceType:     pulumi.String("c5.2xlarge"),
// 					WeightedCapacity: pulumi.String("2"),
// 				},
// 			},
// 			LaunchTemplate: &gamelift.GameServerGroupLaunchTemplateArgs{
// 				Id:      pulumi.Any(aws_launch_template.Example.Id),
// 				Version: pulumi.String("1"),
// 			},
// 			MaxSize: pulumi.Int(1),
// 			MinSize: pulumi.Int(1),
// 			RoleArn: pulumi.Any(aws_iam_role.Example.Arn),
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("example"),
// 			},
// 			VpcSubnets: pulumi.StringArray{
// 				pulumi.String("subnet-12345678"),
// 				pulumi.String("subnet-23456789"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			aws_iam_role_policy_attachment.Example,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Example IAM Role for GameLift Game Server Group
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		current, err := aws.GetPartition(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleRole, err := iam.NewRole(ctx, "exampleRole", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.Any(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Effect\": \"Allow\",\n", "      \"Principal\": {\n", "        \"Service\": [\n", "          \"autoscaling.amazonaws.com\",\n", "          \"gamelift.amazonaws.com\"\n", "        ]\n", "      },\n", "      \"Action\": \"sts:AssumeRole\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iam.NewRolePolicyAttachment(ctx, "exampleRolePolicyAttachment", &iam.RolePolicyAttachmentArgs{
// 			PolicyArn: pulumi.String(fmt.Sprintf("%v%v%v", "arn:", current.Partition, ":iam::aws:policy/GameLiftGameServerGroupPolicy")),
// 			Role:      exampleRole.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// GameLift Game Server Group can be imported using the `name`, e.g.
//
// ```sh
//  $ pulumi import aws:gamelift/gameServerGroup:GameServerGroup example example
// ```
type GameServerGroup struct {
	pulumi.CustomResourceState

	// The ARN of the GameLift Game Server Group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The ARN of the created EC2 Auto Scaling group.
	AutoScalingGroupArn pulumi.StringOutput                       `pulumi:"autoScalingGroupArn"`
	AutoScalingPolicy   GameServerGroupAutoScalingPolicyPtrOutput `pulumi:"autoScalingPolicy"`
	// Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances.
	// Valid values: `SPOT_ONLY`, `SPOT_PREFERRED`, `ON_DEMAND_ONLY`. Defaults to `SPOT_PREFERRED`.
	BalancingStrategy pulumi.StringOutput `pulumi:"balancingStrategy"`
	// Name of the game server group.
	// This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group.
	GameServerGroupName pulumi.StringOutput `pulumi:"gameServerGroupName"`
	// Indicates whether instances in the game server group are protected from early termination.
	// Unprotected instances that have active game servers running might be terminated during a scale-down event,
	// causing players to be dropped from the game.
	// Protected instances cannot be terminated while there are active game servers running except in the event
	// of a forced game server group deletion.
	// Valid values: `NO_PROTECTION`, `FULL_PROTECTION`. Defaults to `NO_PROTECTION`.
	GameServerProtectionPolicy pulumi.StringOutput                          `pulumi:"gameServerProtectionPolicy"`
	InstanceDefinitions        GameServerGroupInstanceDefinitionArrayOutput `pulumi:"instanceDefinitions"`
	LaunchTemplate             GameServerGroupLaunchTemplateOutput          `pulumi:"launchTemplate"`
	// The maximum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The minimum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// ARN for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
	RoleArn pulumi.StringOutput `pulumi:"roleArn"`
	// Key-value map of resource tags
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// A list of VPC subnets to use with instances in the game server group.
	// By default, all GameLift FleetIQ-supported Availability Zones are used.
	VpcSubnets pulumi.StringArrayOutput `pulumi:"vpcSubnets"`
}

// NewGameServerGroup registers a new resource with the given unique name, arguments, and options.
func NewGameServerGroup(ctx *pulumi.Context,
	name string, args *GameServerGroupArgs, opts ...pulumi.ResourceOption) (*GameServerGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GameServerGroupName == nil {
		return nil, errors.New("invalid value for required argument 'GameServerGroupName'")
	}
	if args.InstanceDefinitions == nil {
		return nil, errors.New("invalid value for required argument 'InstanceDefinitions'")
	}
	if args.LaunchTemplate == nil {
		return nil, errors.New("invalid value for required argument 'LaunchTemplate'")
	}
	if args.MaxSize == nil {
		return nil, errors.New("invalid value for required argument 'MaxSize'")
	}
	if args.MinSize == nil {
		return nil, errors.New("invalid value for required argument 'MinSize'")
	}
	if args.RoleArn == nil {
		return nil, errors.New("invalid value for required argument 'RoleArn'")
	}
	var resource GameServerGroup
	err := ctx.RegisterResource("aws:gamelift/gameServerGroup:GameServerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGameServerGroup gets an existing GameServerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGameServerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GameServerGroupState, opts ...pulumi.ResourceOption) (*GameServerGroup, error) {
	var resource GameServerGroup
	err := ctx.ReadResource("aws:gamelift/gameServerGroup:GameServerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GameServerGroup resources.
type gameServerGroupState struct {
	// The ARN of the GameLift Game Server Group.
	Arn *string `pulumi:"arn"`
	// The ARN of the created EC2 Auto Scaling group.
	AutoScalingGroupArn *string                           `pulumi:"autoScalingGroupArn"`
	AutoScalingPolicy   *GameServerGroupAutoScalingPolicy `pulumi:"autoScalingPolicy"`
	// Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances.
	// Valid values: `SPOT_ONLY`, `SPOT_PREFERRED`, `ON_DEMAND_ONLY`. Defaults to `SPOT_PREFERRED`.
	BalancingStrategy *string `pulumi:"balancingStrategy"`
	// Name of the game server group.
	// This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group.
	GameServerGroupName *string `pulumi:"gameServerGroupName"`
	// Indicates whether instances in the game server group are protected from early termination.
	// Unprotected instances that have active game servers running might be terminated during a scale-down event,
	// causing players to be dropped from the game.
	// Protected instances cannot be terminated while there are active game servers running except in the event
	// of a forced game server group deletion.
	// Valid values: `NO_PROTECTION`, `FULL_PROTECTION`. Defaults to `NO_PROTECTION`.
	GameServerProtectionPolicy *string                             `pulumi:"gameServerProtectionPolicy"`
	InstanceDefinitions        []GameServerGroupInstanceDefinition `pulumi:"instanceDefinitions"`
	LaunchTemplate             *GameServerGroupLaunchTemplate      `pulumi:"launchTemplate"`
	// The maximum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
	MaxSize *int `pulumi:"maxSize"`
	// The minimum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum.
	MinSize *int `pulumi:"minSize"`
	// ARN for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
	RoleArn *string `pulumi:"roleArn"`
	// Key-value map of resource tags
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A list of VPC subnets to use with instances in the game server group.
	// By default, all GameLift FleetIQ-supported Availability Zones are used.
	VpcSubnets []string `pulumi:"vpcSubnets"`
}

type GameServerGroupState struct {
	// The ARN of the GameLift Game Server Group.
	Arn pulumi.StringPtrInput
	// The ARN of the created EC2 Auto Scaling group.
	AutoScalingGroupArn pulumi.StringPtrInput
	AutoScalingPolicy   GameServerGroupAutoScalingPolicyPtrInput
	// Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances.
	// Valid values: `SPOT_ONLY`, `SPOT_PREFERRED`, `ON_DEMAND_ONLY`. Defaults to `SPOT_PREFERRED`.
	BalancingStrategy pulumi.StringPtrInput
	// Name of the game server group.
	// This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group.
	GameServerGroupName pulumi.StringPtrInput
	// Indicates whether instances in the game server group are protected from early termination.
	// Unprotected instances that have active game servers running might be terminated during a scale-down event,
	// causing players to be dropped from the game.
	// Protected instances cannot be terminated while there are active game servers running except in the event
	// of a forced game server group deletion.
	// Valid values: `NO_PROTECTION`, `FULL_PROTECTION`. Defaults to `NO_PROTECTION`.
	GameServerProtectionPolicy pulumi.StringPtrInput
	InstanceDefinitions        GameServerGroupInstanceDefinitionArrayInput
	LaunchTemplate             GameServerGroupLaunchTemplatePtrInput
	// The maximum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
	MaxSize pulumi.IntPtrInput
	// The minimum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum.
	MinSize pulumi.IntPtrInput
	// ARN for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
	RoleArn pulumi.StringPtrInput
	// Key-value map of resource tags
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// A list of VPC subnets to use with instances in the game server group.
	// By default, all GameLift FleetIQ-supported Availability Zones are used.
	VpcSubnets pulumi.StringArrayInput
}

func (GameServerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*gameServerGroupState)(nil)).Elem()
}

type gameServerGroupArgs struct {
	AutoScalingPolicy *GameServerGroupAutoScalingPolicy `pulumi:"autoScalingPolicy"`
	// Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances.
	// Valid values: `SPOT_ONLY`, `SPOT_PREFERRED`, `ON_DEMAND_ONLY`. Defaults to `SPOT_PREFERRED`.
	BalancingStrategy *string `pulumi:"balancingStrategy"`
	// Name of the game server group.
	// This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group.
	GameServerGroupName string `pulumi:"gameServerGroupName"`
	// Indicates whether instances in the game server group are protected from early termination.
	// Unprotected instances that have active game servers running might be terminated during a scale-down event,
	// causing players to be dropped from the game.
	// Protected instances cannot be terminated while there are active game servers running except in the event
	// of a forced game server group deletion.
	// Valid values: `NO_PROTECTION`, `FULL_PROTECTION`. Defaults to `NO_PROTECTION`.
	GameServerProtectionPolicy *string                             `pulumi:"gameServerProtectionPolicy"`
	InstanceDefinitions        []GameServerGroupInstanceDefinition `pulumi:"instanceDefinitions"`
	LaunchTemplate             GameServerGroupLaunchTemplate       `pulumi:"launchTemplate"`
	// The maximum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
	MaxSize int `pulumi:"maxSize"`
	// The minimum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum.
	MinSize int `pulumi:"minSize"`
	// ARN for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
	RoleArn string `pulumi:"roleArn"`
	// Key-value map of resource tags
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A list of VPC subnets to use with instances in the game server group.
	// By default, all GameLift FleetIQ-supported Availability Zones are used.
	VpcSubnets []string `pulumi:"vpcSubnets"`
}

// The set of arguments for constructing a GameServerGroup resource.
type GameServerGroupArgs struct {
	AutoScalingPolicy GameServerGroupAutoScalingPolicyPtrInput
	// Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances.
	// Valid values: `SPOT_ONLY`, `SPOT_PREFERRED`, `ON_DEMAND_ONLY`. Defaults to `SPOT_PREFERRED`.
	BalancingStrategy pulumi.StringPtrInput
	// Name of the game server group.
	// This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group.
	GameServerGroupName pulumi.StringInput
	// Indicates whether instances in the game server group are protected from early termination.
	// Unprotected instances that have active game servers running might be terminated during a scale-down event,
	// causing players to be dropped from the game.
	// Protected instances cannot be terminated while there are active game servers running except in the event
	// of a forced game server group deletion.
	// Valid values: `NO_PROTECTION`, `FULL_PROTECTION`. Defaults to `NO_PROTECTION`.
	GameServerProtectionPolicy pulumi.StringPtrInput
	InstanceDefinitions        GameServerGroupInstanceDefinitionArrayInput
	LaunchTemplate             GameServerGroupLaunchTemplateInput
	// The maximum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
	MaxSize pulumi.IntInput
	// The minimum number of instances allowed in the EC2 Auto Scaling group.
	// During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum.
	MinSize pulumi.IntInput
	// ARN for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
	RoleArn pulumi.StringInput
	// Key-value map of resource tags
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// A list of VPC subnets to use with instances in the game server group.
	// By default, all GameLift FleetIQ-supported Availability Zones are used.
	VpcSubnets pulumi.StringArrayInput
}

func (GameServerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gameServerGroupArgs)(nil)).Elem()
}

type GameServerGroupInput interface {
	pulumi.Input

	ToGameServerGroupOutput() GameServerGroupOutput
	ToGameServerGroupOutputWithContext(ctx context.Context) GameServerGroupOutput
}

func (*GameServerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**GameServerGroup)(nil)).Elem()
}

func (i *GameServerGroup) ToGameServerGroupOutput() GameServerGroupOutput {
	return i.ToGameServerGroupOutputWithContext(context.Background())
}

func (i *GameServerGroup) ToGameServerGroupOutputWithContext(ctx context.Context) GameServerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GameServerGroupOutput)
}

// GameServerGroupArrayInput is an input type that accepts GameServerGroupArray and GameServerGroupArrayOutput values.
// You can construct a concrete instance of `GameServerGroupArrayInput` via:
//
//          GameServerGroupArray{ GameServerGroupArgs{...} }
type GameServerGroupArrayInput interface {
	pulumi.Input

	ToGameServerGroupArrayOutput() GameServerGroupArrayOutput
	ToGameServerGroupArrayOutputWithContext(context.Context) GameServerGroupArrayOutput
}

type GameServerGroupArray []GameServerGroupInput

func (GameServerGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GameServerGroup)(nil)).Elem()
}

func (i GameServerGroupArray) ToGameServerGroupArrayOutput() GameServerGroupArrayOutput {
	return i.ToGameServerGroupArrayOutputWithContext(context.Background())
}

func (i GameServerGroupArray) ToGameServerGroupArrayOutputWithContext(ctx context.Context) GameServerGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GameServerGroupArrayOutput)
}

// GameServerGroupMapInput is an input type that accepts GameServerGroupMap and GameServerGroupMapOutput values.
// You can construct a concrete instance of `GameServerGroupMapInput` via:
//
//          GameServerGroupMap{ "key": GameServerGroupArgs{...} }
type GameServerGroupMapInput interface {
	pulumi.Input

	ToGameServerGroupMapOutput() GameServerGroupMapOutput
	ToGameServerGroupMapOutputWithContext(context.Context) GameServerGroupMapOutput
}

type GameServerGroupMap map[string]GameServerGroupInput

func (GameServerGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GameServerGroup)(nil)).Elem()
}

func (i GameServerGroupMap) ToGameServerGroupMapOutput() GameServerGroupMapOutput {
	return i.ToGameServerGroupMapOutputWithContext(context.Background())
}

func (i GameServerGroupMap) ToGameServerGroupMapOutputWithContext(ctx context.Context) GameServerGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GameServerGroupMapOutput)
}

type GameServerGroupOutput struct{ *pulumi.OutputState }

func (GameServerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GameServerGroup)(nil)).Elem()
}

func (o GameServerGroupOutput) ToGameServerGroupOutput() GameServerGroupOutput {
	return o
}

func (o GameServerGroupOutput) ToGameServerGroupOutputWithContext(ctx context.Context) GameServerGroupOutput {
	return o
}

type GameServerGroupArrayOutput struct{ *pulumi.OutputState }

func (GameServerGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GameServerGroup)(nil)).Elem()
}

func (o GameServerGroupArrayOutput) ToGameServerGroupArrayOutput() GameServerGroupArrayOutput {
	return o
}

func (o GameServerGroupArrayOutput) ToGameServerGroupArrayOutputWithContext(ctx context.Context) GameServerGroupArrayOutput {
	return o
}

func (o GameServerGroupArrayOutput) Index(i pulumi.IntInput) GameServerGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GameServerGroup {
		return vs[0].([]*GameServerGroup)[vs[1].(int)]
	}).(GameServerGroupOutput)
}

type GameServerGroupMapOutput struct{ *pulumi.OutputState }

func (GameServerGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GameServerGroup)(nil)).Elem()
}

func (o GameServerGroupMapOutput) ToGameServerGroupMapOutput() GameServerGroupMapOutput {
	return o
}

func (o GameServerGroupMapOutput) ToGameServerGroupMapOutputWithContext(ctx context.Context) GameServerGroupMapOutput {
	return o
}

func (o GameServerGroupMapOutput) MapIndex(k pulumi.StringInput) GameServerGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GameServerGroup {
		return vs[0].(map[string]*GameServerGroup)[vs[1].(string)]
	}).(GameServerGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GameServerGroupInput)(nil)).Elem(), &GameServerGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*GameServerGroupArrayInput)(nil)).Elem(), GameServerGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GameServerGroupMapInput)(nil)).Elem(), GameServerGroupMap{})
	pulumi.RegisterOutputType(GameServerGroupOutput{})
	pulumi.RegisterOutputType(GameServerGroupArrayOutput{})
	pulumi.RegisterOutputType(GameServerGroupMapOutput{})
}