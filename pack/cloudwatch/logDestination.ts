// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class LogDestination extends fabric.Resource {
    public /*out*/ readonly arn: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public readonly roleArn: fabric.Computed<string>;
    public readonly targetArn: fabric.Computed<string>;

    constructor(urnName: string, args: LogDestinationArgs, dependsOn?: fabric.Resource[]) {
        if (args.roleArn === undefined) {
            throw new Error("Missing required property 'roleArn'");
        }
        if (args.targetArn === undefined) {
            throw new Error("Missing required property 'targetArn'");
        }
        super("aws:cloudwatch/logDestination:LogDestination", urnName, {
            "name": args.name,
            "roleArn": args.roleArn,
            "targetArn": args.targetArn,
            "arn": undefined,
        }, dependsOn);
    }
}

export interface LogDestinationArgs {
    readonly name?: fabric.MaybeComputed<string>;
    readonly roleArn: fabric.MaybeComputed<string>;
    readonly targetArn: fabric.MaybeComputed<string>;
}
