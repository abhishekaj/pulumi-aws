// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Instance extends fabric.Resource {
    public /*out*/ readonly arn: fabric.Computed<string>;
    public readonly availabilityZone: fabric.Computed<string>;
    public readonly blueprintId: fabric.Computed<string>;
    public readonly bundleId: fabric.Computed<string>;
    public /*out*/ readonly cpuCount: fabric.Computed<number>;
    public /*out*/ readonly createdAt: fabric.Computed<string>;
    public /*out*/ readonly ipv6Address: fabric.Computed<string>;
    public /*out*/ readonly isStaticIp: fabric.Computed<boolean>;
    public readonly keyPairName?: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly privateIpAddress: fabric.Computed<string>;
    public /*out*/ readonly publicIpAddress: fabric.Computed<string>;
    public /*out*/ readonly ramSize: fabric.Computed<number>;
    public readonly userData?: fabric.Computed<string>;
    public /*out*/ readonly username: fabric.Computed<string>;

    constructor(urnName: string, args: InstanceArgs, dependsOn?: fabric.Resource[]) {
        if (args.availabilityZone === undefined) {
            throw new Error("Missing required property 'availabilityZone'");
        }
        if (args.blueprintId === undefined) {
            throw new Error("Missing required property 'blueprintId'");
        }
        if (args.bundleId === undefined) {
            throw new Error("Missing required property 'bundleId'");
        }
        super("aws:lightsail/instance:Instance", urnName, {
            "availabilityZone": args.availabilityZone,
            "blueprintId": args.blueprintId,
            "bundleId": args.bundleId,
            "keyPairName": args.keyPairName,
            "name": args.name,
            "userData": args.userData,
            "arn": undefined,
            "cpuCount": undefined,
            "createdAt": undefined,
            "ipv6Address": undefined,
            "isStaticIp": undefined,
            "privateIpAddress": undefined,
            "publicIpAddress": undefined,
            "ramSize": undefined,
            "username": undefined,
        }, dependsOn);
    }
}

export interface InstanceArgs {
    readonly availabilityZone: fabric.MaybeComputed<string>;
    readonly blueprintId: fabric.MaybeComputed<string>;
    readonly bundleId: fabric.MaybeComputed<string>;
    readonly keyPairName?: fabric.MaybeComputed<string>;
    readonly name?: fabric.MaybeComputed<string>;
    readonly userData?: fabric.MaybeComputed<string>;
}
