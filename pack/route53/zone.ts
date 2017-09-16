// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Zone extends fabric.Resource {
    public readonly comment?: fabric.Computed<string>;
    public readonly delegationSetId?: fabric.Computed<string>;
    public readonly forceDestroy?: fabric.Computed<boolean>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly nameServers: fabric.Computed<string[]>;
    public readonly tags?: fabric.Computed<{[key: string]: any}>;
    public readonly vpcId?: fabric.Computed<string>;
    public readonly vpcRegion: fabric.Computed<string>;
    public /*out*/ readonly zoneId: fabric.Computed<string>;

    constructor(urnName: string, args?: ZoneArgs, dependsOn?: fabric.Resource[]) {
        super("aws:route53/zone:Zone", urnName, {
            "comment": args.comment,
            "delegationSetId": args.delegationSetId,
            "forceDestroy": args.forceDestroy,
            "name": args.name,
            "tags": args.tags,
            "vpcId": args.vpcId,
            "vpcRegion": args.vpcRegion,
            "nameServers": undefined,
            "zoneId": undefined,
        }, dependsOn);
    }
}

export interface ZoneArgs {
    readonly comment?: fabric.MaybeComputed<string>;
    readonly delegationSetId?: fabric.MaybeComputed<string>;
    readonly forceDestroy?: fabric.MaybeComputed<boolean>;
    readonly name?: fabric.MaybeComputed<string>;
    readonly tags?: fabric.MaybeComputed<{[key: string]: any}>;
    readonly vpcId?: fabric.MaybeComputed<string>;
    readonly vpcRegion?: fabric.MaybeComputed<string>;
}
