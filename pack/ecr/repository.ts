// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Repository extends fabric.Resource {
    public /*out*/ readonly arn: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly registryId: fabric.Computed<string>;
    public /*out*/ readonly repositoryUrl: fabric.Computed<string>;

    constructor(urnName: string, args?: RepositoryArgs, dependsOn?: fabric.Resource[]) {
        super("aws:ecr/repository:Repository", urnName, {
            "name": args.name,
            "arn": undefined,
            "registryId": undefined,
            "repositoryUrl": undefined,
        }, dependsOn);
    }
}

export interface RepositoryArgs {
    readonly name?: fabric.MaybeComputed<string>;
}
