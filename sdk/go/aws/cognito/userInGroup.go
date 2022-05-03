// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Adds the specified user to the specified group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleUserPool, err := cognito.NewUserPool(ctx, "exampleUserPool", &cognito.UserPoolArgs{
// 			PasswordPolicy: &cognito.UserPoolPasswordPolicyArgs{
// 				TemporaryPasswordValidityDays: pulumi.Int(7),
// 				MinimumLength:                 pulumi.Int(6),
// 				RequireUppercase:              pulumi.Bool(false),
// 				RequireSymbols:                pulumi.Bool(false),
// 				RequireNumbers:                pulumi.Bool(false),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleUser, err := cognito.NewUser(ctx, "exampleUser", &cognito.UserArgs{
// 			UserPoolId: pulumi.Any(aws_cognito_user_pool.Test.Id),
// 			Username:   pulumi.String("example"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleUserGroup, err := cognito.NewUserGroup(ctx, "exampleUserGroup", &cognito.UserGroupArgs{
// 			UserPoolId: pulumi.Any(aws_cognito_user_pool.Test.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cognito.NewUserInGroup(ctx, "exampleUserInGroup", &cognito.UserInGroupArgs{
// 			UserPoolId: exampleUserPool.ID(),
// 			GroupName:  exampleUserGroup.Name,
// 			Username:   exampleUser.Username,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type UserInGroup struct {
	pulumi.CustomResourceState

	// The name of the group to which the user is to be added.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// The user pool ID of the user and group.
	UserPoolId pulumi.StringOutput `pulumi:"userPoolId"`
	// The username of the user to be added to the group.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUserInGroup registers a new resource with the given unique name, arguments, and options.
func NewUserInGroup(ctx *pulumi.Context,
	name string, args *UserInGroupArgs, opts ...pulumi.ResourceOption) (*UserInGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupName == nil {
		return nil, errors.New("invalid value for required argument 'GroupName'")
	}
	if args.UserPoolId == nil {
		return nil, errors.New("invalid value for required argument 'UserPoolId'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource UserInGroup
	err := ctx.RegisterResource("aws:cognito/userInGroup:UserInGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserInGroup gets an existing UserInGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserInGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserInGroupState, opts ...pulumi.ResourceOption) (*UserInGroup, error) {
	var resource UserInGroup
	err := ctx.ReadResource("aws:cognito/userInGroup:UserInGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserInGroup resources.
type userInGroupState struct {
	// The name of the group to which the user is to be added.
	GroupName *string `pulumi:"groupName"`
	// The user pool ID of the user and group.
	UserPoolId *string `pulumi:"userPoolId"`
	// The username of the user to be added to the group.
	Username *string `pulumi:"username"`
}

type UserInGroupState struct {
	// The name of the group to which the user is to be added.
	GroupName pulumi.StringPtrInput
	// The user pool ID of the user and group.
	UserPoolId pulumi.StringPtrInput
	// The username of the user to be added to the group.
	Username pulumi.StringPtrInput
}

func (UserInGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*userInGroupState)(nil)).Elem()
}

type userInGroupArgs struct {
	// The name of the group to which the user is to be added.
	GroupName string `pulumi:"groupName"`
	// The user pool ID of the user and group.
	UserPoolId string `pulumi:"userPoolId"`
	// The username of the user to be added to the group.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a UserInGroup resource.
type UserInGroupArgs struct {
	// The name of the group to which the user is to be added.
	GroupName pulumi.StringInput
	// The user pool ID of the user and group.
	UserPoolId pulumi.StringInput
	// The username of the user to be added to the group.
	Username pulumi.StringInput
}

func (UserInGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userInGroupArgs)(nil)).Elem()
}

type UserInGroupInput interface {
	pulumi.Input

	ToUserInGroupOutput() UserInGroupOutput
	ToUserInGroupOutputWithContext(ctx context.Context) UserInGroupOutput
}

func (*UserInGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInGroup)(nil)).Elem()
}

func (i *UserInGroup) ToUserInGroupOutput() UserInGroupOutput {
	return i.ToUserInGroupOutputWithContext(context.Background())
}

func (i *UserInGroup) ToUserInGroupOutputWithContext(ctx context.Context) UserInGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInGroupOutput)
}

// UserInGroupArrayInput is an input type that accepts UserInGroupArray and UserInGroupArrayOutput values.
// You can construct a concrete instance of `UserInGroupArrayInput` via:
//
//          UserInGroupArray{ UserInGroupArgs{...} }
type UserInGroupArrayInput interface {
	pulumi.Input

	ToUserInGroupArrayOutput() UserInGroupArrayOutput
	ToUserInGroupArrayOutputWithContext(context.Context) UserInGroupArrayOutput
}

type UserInGroupArray []UserInGroupInput

func (UserInGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInGroup)(nil)).Elem()
}

func (i UserInGroupArray) ToUserInGroupArrayOutput() UserInGroupArrayOutput {
	return i.ToUserInGroupArrayOutputWithContext(context.Background())
}

func (i UserInGroupArray) ToUserInGroupArrayOutputWithContext(ctx context.Context) UserInGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInGroupArrayOutput)
}

// UserInGroupMapInput is an input type that accepts UserInGroupMap and UserInGroupMapOutput values.
// You can construct a concrete instance of `UserInGroupMapInput` via:
//
//          UserInGroupMap{ "key": UserInGroupArgs{...} }
type UserInGroupMapInput interface {
	pulumi.Input

	ToUserInGroupMapOutput() UserInGroupMapOutput
	ToUserInGroupMapOutputWithContext(context.Context) UserInGroupMapOutput
}

type UserInGroupMap map[string]UserInGroupInput

func (UserInGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInGroup)(nil)).Elem()
}

func (i UserInGroupMap) ToUserInGroupMapOutput() UserInGroupMapOutput {
	return i.ToUserInGroupMapOutputWithContext(context.Background())
}

func (i UserInGroupMap) ToUserInGroupMapOutputWithContext(ctx context.Context) UserInGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInGroupMapOutput)
}

type UserInGroupOutput struct{ *pulumi.OutputState }

func (UserInGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInGroup)(nil)).Elem()
}

func (o UserInGroupOutput) ToUserInGroupOutput() UserInGroupOutput {
	return o
}

func (o UserInGroupOutput) ToUserInGroupOutputWithContext(ctx context.Context) UserInGroupOutput {
	return o
}

type UserInGroupArrayOutput struct{ *pulumi.OutputState }

func (UserInGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInGroup)(nil)).Elem()
}

func (o UserInGroupArrayOutput) ToUserInGroupArrayOutput() UserInGroupArrayOutput {
	return o
}

func (o UserInGroupArrayOutput) ToUserInGroupArrayOutputWithContext(ctx context.Context) UserInGroupArrayOutput {
	return o
}

func (o UserInGroupArrayOutput) Index(i pulumi.IntInput) UserInGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserInGroup {
		return vs[0].([]*UserInGroup)[vs[1].(int)]
	}).(UserInGroupOutput)
}

type UserInGroupMapOutput struct{ *pulumi.OutputState }

func (UserInGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInGroup)(nil)).Elem()
}

func (o UserInGroupMapOutput) ToUserInGroupMapOutput() UserInGroupMapOutput {
	return o
}

func (o UserInGroupMapOutput) ToUserInGroupMapOutputWithContext(ctx context.Context) UserInGroupMapOutput {
	return o
}

func (o UserInGroupMapOutput) MapIndex(k pulumi.StringInput) UserInGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserInGroup {
		return vs[0].(map[string]*UserInGroup)[vs[1].(string)]
	}).(UserInGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInGroupInput)(nil)).Elem(), &UserInGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInGroupArrayInput)(nil)).Elem(), UserInGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInGroupMapInput)(nil)).Elem(), UserInGroupMap{})
	pulumi.RegisterOutputType(UserInGroupOutput{})
	pulumi.RegisterOutputType(UserInGroupArrayOutput{})
	pulumi.RegisterOutputType(UserInGroupMapOutput{})
}