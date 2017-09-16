// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class AmiFromInstance extends fabric.Resource {
    public /*out*/ readonly architecture: fabric.Computed<string>;
    public readonly description?: fabric.Computed<string>;
    public readonly ebsBlockDevice: fabric.Computed<{ deleteOnTermination: boolean, deviceName: string, encrypted: boolean, iops: number, snapshotId: string, volumeSize: number, volumeType: string }[]>;
    public readonly ephemeralBlockDevice: fabric.Computed<{ deviceName: string, virtualName: string }[]>;
    public /*out*/ readonly amiId: fabric.Computed<string>;
    public /*out*/ readonly imageLocation: fabric.Computed<string>;
    public /*out*/ readonly kernelId: fabric.Computed<string>;
    public /*out*/ readonly manageEbsSnapshots: fabric.Computed<boolean>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly ramdiskId: fabric.Computed<string>;
    public /*out*/ readonly rootDeviceName: fabric.Computed<string>;
    public readonly snapshotWithoutReboot?: fabric.Computed<boolean>;
    public readonly sourceInstanceId: fabric.Computed<string>;
    public /*out*/ readonly sriovNetSupport: fabric.Computed<string>;
    public readonly tags?: fabric.Computed<{[key: string]: any}>;
    public /*out*/ readonly virtualizationType: fabric.Computed<string>;

    constructor(urnName: string, args: AmiFromInstanceArgs, dependsOn?: fabric.Resource[]) {
        if (args.sourceInstanceId === undefined) {
            throw new Error("Missing required property 'sourceInstanceId'");
        }
        super("aws:ec2/amiFromInstance:AmiFromInstance", urnName, {
            "description": args.description,
            "ebsBlockDevice": args.ebsBlockDevice,
            "ephemeralBlockDevice": args.ephemeralBlockDevice,
            "name": args.name,
            "snapshotWithoutReboot": args.snapshotWithoutReboot,
            "sourceInstanceId": args.sourceInstanceId,
            "tags": args.tags,
            "architecture": undefined,
            "amiId": undefined,
            "imageLocation": undefined,
            "kernelId": undefined,
            "manageEbsSnapshots": undefined,
            "ramdiskId": undefined,
            "rootDeviceName": undefined,
            "sriovNetSupport": undefined,
            "virtualizationType": undefined,
        }, dependsOn);
    }
}

export interface AmiFromInstanceArgs {
    readonly description?: fabric.MaybeComputed<string>;
    readonly ebsBlockDevice?: fabric.MaybeComputed<{ deleteOnTermination?: fabric.MaybeComputed<boolean>, deviceName?: fabric.MaybeComputed<string>, encrypted?: fabric.MaybeComputed<boolean>, iops?: fabric.MaybeComputed<number>, snapshotId?: fabric.MaybeComputed<string>, volumeSize?: fabric.MaybeComputed<number>, volumeType?: fabric.MaybeComputed<string> }>[];
    readonly ephemeralBlockDevice?: fabric.MaybeComputed<{ deviceName?: fabric.MaybeComputed<string>, virtualName?: fabric.MaybeComputed<string> }>[];
    readonly name?: fabric.MaybeComputed<string>;
    readonly snapshotWithoutReboot?: fabric.MaybeComputed<boolean>;
    readonly sourceInstanceId: fabric.MaybeComputed<string>;
    readonly tags?: fabric.MaybeComputed<{[key: string]: any}>;
}
