// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Trigger extends fabric.Resource {
    public /*out*/ readonly configurationId: fabric.Computed<string>;
    public readonly repositoryName: fabric.Computed<string>;
    public readonly trigger: fabric.Computed<{ branches?: string[], customData?: string, destinationArn: string, events: string[], name: string }[]>;

    constructor(urnName: string, args: TriggerArgs, dependsOn?: fabric.Resource[]) {
        if (args.repositoryName === undefined) {
            throw new Error("Missing required property 'repositoryName'");
        }
        if (args.trigger === undefined) {
            throw new Error("Missing required property 'trigger'");
        }
        super("aws:codecommit/trigger:Trigger", urnName, {
            "repositoryName": args.repositoryName,
            "trigger": args.trigger,
            "configurationId": undefined,
        }, dependsOn);
    }
}

export interface TriggerArgs {
    readonly repositoryName: fabric.MaybeComputed<string>;
    readonly trigger: fabric.MaybeComputed<{ branches?: fabric.MaybeComputed<fabric.MaybeComputed<string>>[], customData?: fabric.MaybeComputed<string>, destinationArn: fabric.MaybeComputed<string>, events: fabric.MaybeComputed<fabric.MaybeComputed<string>>[], name: fabric.MaybeComputed<string> }>[];
}
