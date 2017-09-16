// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class StaticIp extends fabric.Resource {
    public /*out*/ readonly arn: fabric.Computed<string>;
    public /*out*/ readonly ipAddress: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly supportCode: fabric.Computed<string>;

    constructor(urnName: string, args?: StaticIpArgs, dependsOn?: fabric.Resource[]) {
        super("aws:lightsail/staticIp:StaticIp", urnName, {
            "name": args.name,
            "arn": undefined,
            "ipAddress": undefined,
            "supportCode": undefined,
        }, dependsOn);
    }
}

export interface StaticIpArgs {
    readonly name?: fabric.MaybeComputed<string>;
}
