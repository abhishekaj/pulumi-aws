// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package appconfig

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppConfig Hosted Configuration Version resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/json"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/appconfig"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		tmpJSON0, err := json.Marshal(map[string]interface{}{
// 			"foo": "bar",
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		_, err := appconfig.NewHostedConfigurationVersion(ctx, "example", &appconfig.HostedConfigurationVersionArgs{
// 			ApplicationId:          pulumi.Any(aws_appconfig_application.Example.Id),
// 			ConfigurationProfileId: pulumi.Any(aws_appconfig_configuration_profile.Example.Configuration_profile_id),
// 			Description:            pulumi.String("Example Hosted Configuration Version"),
// 			ContentType:            pulumi.String("application/json"),
// 			Content:                pulumi.String(json0),
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
// AppConfig Hosted Configuration Versions can be imported by using the application ID, configuration profile ID, and version number separated by a slash (`/`), e.g.
//
// ```sh
//  $ pulumi import aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion example 71abcde/11xxxxx/2
// ```
type HostedConfigurationVersion struct {
	pulumi.CustomResourceState

	// The application ID.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The configuration profile ID.
	ConfigurationProfileId pulumi.StringOutput `pulumi:"configurationProfileId"`
	// The content of the configuration or the configuration data.
	Content pulumi.StringOutput `pulumi:"content"`
	// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// A description of the configuration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The version number of the hosted configuration.
	VersionNumber pulumi.IntOutput `pulumi:"versionNumber"`
}

// NewHostedConfigurationVersion registers a new resource with the given unique name, arguments, and options.
func NewHostedConfigurationVersion(ctx *pulumi.Context,
	name string, args *HostedConfigurationVersionArgs, opts ...pulumi.ResourceOption) (*HostedConfigurationVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.ConfigurationProfileId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigurationProfileId'")
	}
	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	var resource HostedConfigurationVersion
	err := ctx.RegisterResource("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostedConfigurationVersion gets an existing HostedConfigurationVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostedConfigurationVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostedConfigurationVersionState, opts ...pulumi.ResourceOption) (*HostedConfigurationVersion, error) {
	var resource HostedConfigurationVersion
	err := ctx.ReadResource("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostedConfigurationVersion resources.
type hostedConfigurationVersionState struct {
	// The application ID.
	ApplicationId *string `pulumi:"applicationId"`
	// The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
	Arn *string `pulumi:"arn"`
	// The configuration profile ID.
	ConfigurationProfileId *string `pulumi:"configurationProfileId"`
	// The content of the configuration or the configuration data.
	Content *string `pulumi:"content"`
	// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
	ContentType *string `pulumi:"contentType"`
	// A description of the configuration.
	Description *string `pulumi:"description"`
	// The version number of the hosted configuration.
	VersionNumber *int `pulumi:"versionNumber"`
}

type HostedConfigurationVersionState struct {
	// The application ID.
	ApplicationId pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
	Arn pulumi.StringPtrInput
	// The configuration profile ID.
	ConfigurationProfileId pulumi.StringPtrInput
	// The content of the configuration or the configuration data.
	Content pulumi.StringPtrInput
	// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
	ContentType pulumi.StringPtrInput
	// A description of the configuration.
	Description pulumi.StringPtrInput
	// The version number of the hosted configuration.
	VersionNumber pulumi.IntPtrInput
}

func (HostedConfigurationVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostedConfigurationVersionState)(nil)).Elem()
}

type hostedConfigurationVersionArgs struct {
	// The application ID.
	ApplicationId string `pulumi:"applicationId"`
	// The configuration profile ID.
	ConfigurationProfileId string `pulumi:"configurationProfileId"`
	// The content of the configuration or the configuration data.
	Content string `pulumi:"content"`
	// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
	ContentType string `pulumi:"contentType"`
	// A description of the configuration.
	Description *string `pulumi:"description"`
}

// The set of arguments for constructing a HostedConfigurationVersion resource.
type HostedConfigurationVersionArgs struct {
	// The application ID.
	ApplicationId pulumi.StringInput
	// The configuration profile ID.
	ConfigurationProfileId pulumi.StringInput
	// The content of the configuration or the configuration data.
	Content pulumi.StringInput
	// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
	ContentType pulumi.StringInput
	// A description of the configuration.
	Description pulumi.StringPtrInput
}

func (HostedConfigurationVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostedConfigurationVersionArgs)(nil)).Elem()
}

type HostedConfigurationVersionInput interface {
	pulumi.Input

	ToHostedConfigurationVersionOutput() HostedConfigurationVersionOutput
	ToHostedConfigurationVersionOutputWithContext(ctx context.Context) HostedConfigurationVersionOutput
}

func (*HostedConfigurationVersion) ElementType() reflect.Type {
	return reflect.TypeOf((*HostedConfigurationVersion)(nil))
}

func (i *HostedConfigurationVersion) ToHostedConfigurationVersionOutput() HostedConfigurationVersionOutput {
	return i.ToHostedConfigurationVersionOutputWithContext(context.Background())
}

func (i *HostedConfigurationVersion) ToHostedConfigurationVersionOutputWithContext(ctx context.Context) HostedConfigurationVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedConfigurationVersionOutput)
}

func (i *HostedConfigurationVersion) ToHostedConfigurationVersionPtrOutput() HostedConfigurationVersionPtrOutput {
	return i.ToHostedConfigurationVersionPtrOutputWithContext(context.Background())
}

func (i *HostedConfigurationVersion) ToHostedConfigurationVersionPtrOutputWithContext(ctx context.Context) HostedConfigurationVersionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedConfigurationVersionPtrOutput)
}

type HostedConfigurationVersionPtrInput interface {
	pulumi.Input

	ToHostedConfigurationVersionPtrOutput() HostedConfigurationVersionPtrOutput
	ToHostedConfigurationVersionPtrOutputWithContext(ctx context.Context) HostedConfigurationVersionPtrOutput
}

type hostedConfigurationVersionPtrType HostedConfigurationVersionArgs

func (*hostedConfigurationVersionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**HostedConfigurationVersion)(nil))
}

func (i *hostedConfigurationVersionPtrType) ToHostedConfigurationVersionPtrOutput() HostedConfigurationVersionPtrOutput {
	return i.ToHostedConfigurationVersionPtrOutputWithContext(context.Background())
}

func (i *hostedConfigurationVersionPtrType) ToHostedConfigurationVersionPtrOutputWithContext(ctx context.Context) HostedConfigurationVersionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedConfigurationVersionPtrOutput)
}

// HostedConfigurationVersionArrayInput is an input type that accepts HostedConfigurationVersionArray and HostedConfigurationVersionArrayOutput values.
// You can construct a concrete instance of `HostedConfigurationVersionArrayInput` via:
//
//          HostedConfigurationVersionArray{ HostedConfigurationVersionArgs{...} }
type HostedConfigurationVersionArrayInput interface {
	pulumi.Input

	ToHostedConfigurationVersionArrayOutput() HostedConfigurationVersionArrayOutput
	ToHostedConfigurationVersionArrayOutputWithContext(context.Context) HostedConfigurationVersionArrayOutput
}

type HostedConfigurationVersionArray []HostedConfigurationVersionInput

func (HostedConfigurationVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*HostedConfigurationVersion)(nil))
}

func (i HostedConfigurationVersionArray) ToHostedConfigurationVersionArrayOutput() HostedConfigurationVersionArrayOutput {
	return i.ToHostedConfigurationVersionArrayOutputWithContext(context.Background())
}

func (i HostedConfigurationVersionArray) ToHostedConfigurationVersionArrayOutputWithContext(ctx context.Context) HostedConfigurationVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedConfigurationVersionArrayOutput)
}

// HostedConfigurationVersionMapInput is an input type that accepts HostedConfigurationVersionMap and HostedConfigurationVersionMapOutput values.
// You can construct a concrete instance of `HostedConfigurationVersionMapInput` via:
//
//          HostedConfigurationVersionMap{ "key": HostedConfigurationVersionArgs{...} }
type HostedConfigurationVersionMapInput interface {
	pulumi.Input

	ToHostedConfigurationVersionMapOutput() HostedConfigurationVersionMapOutput
	ToHostedConfigurationVersionMapOutputWithContext(context.Context) HostedConfigurationVersionMapOutput
}

type HostedConfigurationVersionMap map[string]HostedConfigurationVersionInput

func (HostedConfigurationVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*HostedConfigurationVersion)(nil))
}

func (i HostedConfigurationVersionMap) ToHostedConfigurationVersionMapOutput() HostedConfigurationVersionMapOutput {
	return i.ToHostedConfigurationVersionMapOutputWithContext(context.Background())
}

func (i HostedConfigurationVersionMap) ToHostedConfigurationVersionMapOutputWithContext(ctx context.Context) HostedConfigurationVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedConfigurationVersionMapOutput)
}

type HostedConfigurationVersionOutput struct {
	*pulumi.OutputState
}

func (HostedConfigurationVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HostedConfigurationVersion)(nil))
}

func (o HostedConfigurationVersionOutput) ToHostedConfigurationVersionOutput() HostedConfigurationVersionOutput {
	return o
}

func (o HostedConfigurationVersionOutput) ToHostedConfigurationVersionOutputWithContext(ctx context.Context) HostedConfigurationVersionOutput {
	return o
}

func (o HostedConfigurationVersionOutput) ToHostedConfigurationVersionPtrOutput() HostedConfigurationVersionPtrOutput {
	return o.ToHostedConfigurationVersionPtrOutputWithContext(context.Background())
}

func (o HostedConfigurationVersionOutput) ToHostedConfigurationVersionPtrOutputWithContext(ctx context.Context) HostedConfigurationVersionPtrOutput {
	return o.ApplyT(func(v HostedConfigurationVersion) *HostedConfigurationVersion {
		return &v
	}).(HostedConfigurationVersionPtrOutput)
}

type HostedConfigurationVersionPtrOutput struct {
	*pulumi.OutputState
}

func (HostedConfigurationVersionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostedConfigurationVersion)(nil))
}

func (o HostedConfigurationVersionPtrOutput) ToHostedConfigurationVersionPtrOutput() HostedConfigurationVersionPtrOutput {
	return o
}

func (o HostedConfigurationVersionPtrOutput) ToHostedConfigurationVersionPtrOutputWithContext(ctx context.Context) HostedConfigurationVersionPtrOutput {
	return o
}

type HostedConfigurationVersionArrayOutput struct{ *pulumi.OutputState }

func (HostedConfigurationVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HostedConfigurationVersion)(nil))
}

func (o HostedConfigurationVersionArrayOutput) ToHostedConfigurationVersionArrayOutput() HostedConfigurationVersionArrayOutput {
	return o
}

func (o HostedConfigurationVersionArrayOutput) ToHostedConfigurationVersionArrayOutputWithContext(ctx context.Context) HostedConfigurationVersionArrayOutput {
	return o
}

func (o HostedConfigurationVersionArrayOutput) Index(i pulumi.IntInput) HostedConfigurationVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) HostedConfigurationVersion {
		return vs[0].([]HostedConfigurationVersion)[vs[1].(int)]
	}).(HostedConfigurationVersionOutput)
}

type HostedConfigurationVersionMapOutput struct{ *pulumi.OutputState }

func (HostedConfigurationVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]HostedConfigurationVersion)(nil))
}

func (o HostedConfigurationVersionMapOutput) ToHostedConfigurationVersionMapOutput() HostedConfigurationVersionMapOutput {
	return o
}

func (o HostedConfigurationVersionMapOutput) ToHostedConfigurationVersionMapOutputWithContext(ctx context.Context) HostedConfigurationVersionMapOutput {
	return o
}

func (o HostedConfigurationVersionMapOutput) MapIndex(k pulumi.StringInput) HostedConfigurationVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) HostedConfigurationVersion {
		return vs[0].(map[string]HostedConfigurationVersion)[vs[1].(string)]
	}).(HostedConfigurationVersionOutput)
}

func init() {
	pulumi.RegisterOutputType(HostedConfigurationVersionOutput{})
	pulumi.RegisterOutputType(HostedConfigurationVersionPtrOutput{})
	pulumi.RegisterOutputType(HostedConfigurationVersionArrayOutput{})
	pulumi.RegisterOutputType(HostedConfigurationVersionMapOutput{})
}