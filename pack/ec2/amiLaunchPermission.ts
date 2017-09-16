// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class AmiLaunchPermission extends fabric.Resource {
    public readonly accountId: fabric.Computed<string>;
    public readonly imageId: fabric.Computed<string>;

    constructor(urnName: string, args: AmiLaunchPermissionArgs, dependsOn?: fabric.Resource[]) {
        if (args.accountId === undefined) {
            throw new Error("Missing required property 'accountId'");
        }
        if (args.imageId === undefined) {
            throw new Error("Missing required property 'imageId'");
        }
        super("aws:ec2/amiLaunchPermission:AmiLaunchPermission", urnName, {
            "accountId": args.accountId,
            "imageId": args.imageId,
        }, dependsOn);
    }
}

export interface AmiLaunchPermissionArgs {
    readonly accountId: fabric.MaybeComputed<string>;
    readonly imageId: fabric.MaybeComputed<string>;
}
