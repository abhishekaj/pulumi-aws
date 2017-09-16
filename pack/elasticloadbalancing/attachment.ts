// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Attachment extends fabric.Resource {
    public readonly elb: fabric.Computed<string>;
    public readonly instance: fabric.Computed<string>;

    constructor(urnName: string, args: AttachmentArgs, dependsOn?: fabric.Resource[]) {
        if (args.elb === undefined) {
            throw new Error("Missing required property 'elb'");
        }
        if (args.instance === undefined) {
            throw new Error("Missing required property 'instance'");
        }
        super("aws:elasticloadbalancing/attachment:Attachment", urnName, {
            "elb": args.elb,
            "instance": args.instance,
        }, dependsOn);
    }
}

export interface AttachmentArgs {
    readonly elb: fabric.MaybeComputed<string>;
    readonly instance: fabric.MaybeComputed<string>;
}
