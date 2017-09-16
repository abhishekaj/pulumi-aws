// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class EventTarget extends fabric.Resource {
    public readonly arn: fabric.Computed<string>;
    public readonly ecsTarget?: fabric.Computed<{ taskCount?: number, taskDefinitionArn: string }[]>;
    public readonly input?: fabric.Computed<string>;
    public readonly inputPath?: fabric.Computed<string>;
    public readonly roleArn?: fabric.Computed<string>;
    public readonly rule: fabric.Computed<string>;
    public readonly runCommandTargets?: fabric.Computed<{ key: string, values: string[] }[]>;
    public readonly targetId: fabric.Computed<string>;

    constructor(urnName: string, args: EventTargetArgs, dependsOn?: fabric.Resource[]) {
        if (args.arn === undefined) {
            throw new Error("Missing required property 'arn'");
        }
        if (args.rule === undefined) {
            throw new Error("Missing required property 'rule'");
        }
        super("aws:cloudwatch/eventTarget:EventTarget", urnName, {
            "arn": args.arn,
            "ecsTarget": args.ecsTarget,
            "input": args.input,
            "inputPath": args.inputPath,
            "roleArn": args.roleArn,
            "rule": args.rule,
            "runCommandTargets": args.runCommandTargets,
            "targetId": args.targetId,
        }, dependsOn);
    }
}

export interface EventTargetArgs {
    readonly arn: fabric.MaybeComputed<string>;
    readonly ecsTarget?: fabric.MaybeComputed<{ taskCount?: fabric.MaybeComputed<number>, taskDefinitionArn: fabric.MaybeComputed<string> }>[];
    readonly input?: fabric.MaybeComputed<string>;
    readonly inputPath?: fabric.MaybeComputed<string>;
    readonly roleArn?: fabric.MaybeComputed<string>;
    readonly rule: fabric.MaybeComputed<string>;
    readonly runCommandTargets?: fabric.MaybeComputed<{ key: fabric.MaybeComputed<string>, values: fabric.MaybeComputed<fabric.MaybeComputed<string>>[] }>[];
    readonly targetId?: fabric.MaybeComputed<string>;
}
