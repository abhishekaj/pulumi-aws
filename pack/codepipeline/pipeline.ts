// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Pipeline extends fabric.Resource {
    public readonly artifactStore: fabric.Computed<{ encryptionKey?: { id: string, type: string }[], location: string, type: string }[]>;
    public readonly name: fabric.Computed<string>;
    public readonly roleArn: fabric.Computed<string>;
    public readonly stage: fabric.Computed<{ action: { category: string, configuration?: {[key: string]: any}, inputArtifacts?: string[], name: string, outputArtifacts?: string[], owner: string, provider: string, roleArn?: string, runOrder: number, version: string }[], name: string }[]>;

    constructor(urnName: string, args: PipelineArgs, dependsOn?: fabric.Resource[]) {
        if (args.artifactStore === undefined) {
            throw new Error("Missing required property 'artifactStore'");
        }
        if (args.roleArn === undefined) {
            throw new Error("Missing required property 'roleArn'");
        }
        if (args.stage === undefined) {
            throw new Error("Missing required property 'stage'");
        }
        super("aws:codepipeline/pipeline:Pipeline", urnName, {
            "artifactStore": args.artifactStore,
            "name": args.name,
            "roleArn": args.roleArn,
            "stage": args.stage,
        }, dependsOn);
    }
}

export interface PipelineArgs {
    readonly artifactStore: fabric.MaybeComputed<{ encryptionKey?: fabric.MaybeComputed<{ id: fabric.MaybeComputed<string>, type: fabric.MaybeComputed<string> }>[], location: fabric.MaybeComputed<string>, type: fabric.MaybeComputed<string> }>[];
    readonly name?: fabric.MaybeComputed<string>;
    readonly roleArn: fabric.MaybeComputed<string>;
    readonly stage: fabric.MaybeComputed<{ action: fabric.MaybeComputed<{ category: fabric.MaybeComputed<string>, configuration?: fabric.MaybeComputed<{[key: string]: any}>, inputArtifacts?: fabric.MaybeComputed<fabric.MaybeComputed<string>>[], name: fabric.MaybeComputed<string>, outputArtifacts?: fabric.MaybeComputed<fabric.MaybeComputed<string>>[], owner: fabric.MaybeComputed<string>, provider: fabric.MaybeComputed<string>, roleArn?: fabric.MaybeComputed<string>, runOrder?: fabric.MaybeComputed<number>, version: fabric.MaybeComputed<string> }>[], name: fabric.MaybeComputed<string> }>[];
}
