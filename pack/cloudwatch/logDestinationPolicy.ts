// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class LogDestinationPolicy extends fabric.Resource {
    public readonly accessPolicy: fabric.Computed<string>;
    public readonly destinationName: fabric.Computed<string>;

    constructor(urnName: string, args: LogDestinationPolicyArgs, dependsOn?: fabric.Resource[]) {
        if (args.accessPolicy === undefined) {
            throw new Error("Missing required property 'accessPolicy'");
        }
        if (args.destinationName === undefined) {
            throw new Error("Missing required property 'destinationName'");
        }
        super("aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy", urnName, {
            "accessPolicy": args.accessPolicy,
            "destinationName": args.destinationName,
        }, dependsOn);
    }
}

export interface LogDestinationPolicyArgs {
    readonly accessPolicy: fabric.MaybeComputed<string>;
    readonly destinationName: fabric.MaybeComputed<string>;
}
