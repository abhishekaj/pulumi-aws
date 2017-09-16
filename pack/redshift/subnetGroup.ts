// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class SubnetGroup extends fabric.Resource {
    public readonly description?: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public readonly subnetIds: fabric.Computed<string[]>;
    public readonly tags?: fabric.Computed<{[key: string]: any}>;

    constructor(urnName: string, args: SubnetGroupArgs, dependsOn?: fabric.Resource[]) {
        if (args.subnetIds === undefined) {
            throw new Error("Missing required property 'subnetIds'");
        }
        super("aws:redshift/subnetGroup:SubnetGroup", urnName, {
            "description": args.description,
            "name": args.name,
            "subnetIds": args.subnetIds,
            "tags": args.tags,
        }, dependsOn);
    }
}

export interface SubnetGroupArgs {
    readonly description?: fabric.MaybeComputed<string>;
    readonly name?: fabric.MaybeComputed<string>;
    readonly subnetIds: fabric.MaybeComputed<fabric.MaybeComputed<string>>[];
    readonly tags?: fabric.MaybeComputed<{[key: string]: any}>;
}
