// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Policy extends fabric.Resource {
    public readonly adjustmentType: fabric.Computed<string>;
    public readonly alarms?: fabric.Computed<string[]>;
    public /*out*/ readonly arn: fabric.Computed<string>;
    public readonly cooldown: fabric.Computed<number>;
    public readonly metricAggregationType: fabric.Computed<string>;
    public readonly minAdjustmentMagnitude?: fabric.Computed<number>;
    public readonly name: fabric.Computed<string>;
    public readonly policyType?: fabric.Computed<string>;
    public readonly resourceId: fabric.Computed<string>;
    public readonly scalableDimension: fabric.Computed<string>;
    public readonly serviceNamespace: fabric.Computed<string>;
    public readonly stepAdjustment?: fabric.Computed<{ metricIntervalLowerBound?: string, metricIntervalUpperBound?: string, scalingAdjustment: number }[]>;

    constructor(urnName: string, args: PolicyArgs, dependsOn?: fabric.Resource[]) {
        if (args.adjustmentType === undefined) {
            throw new Error("Missing required property 'adjustmentType'");
        }
        if (args.cooldown === undefined) {
            throw new Error("Missing required property 'cooldown'");
        }
        if (args.metricAggregationType === undefined) {
            throw new Error("Missing required property 'metricAggregationType'");
        }
        if (args.resourceId === undefined) {
            throw new Error("Missing required property 'resourceId'");
        }
        if (args.scalableDimension === undefined) {
            throw new Error("Missing required property 'scalableDimension'");
        }
        if (args.serviceNamespace === undefined) {
            throw new Error("Missing required property 'serviceNamespace'");
        }
        super("aws:appautoscaling/policy:Policy", urnName, {
            "adjustmentType": args.adjustmentType,
            "alarms": args.alarms,
            "cooldown": args.cooldown,
            "metricAggregationType": args.metricAggregationType,
            "minAdjustmentMagnitude": args.minAdjustmentMagnitude,
            "name": args.name,
            "policyType": args.policyType,
            "resourceId": args.resourceId,
            "scalableDimension": args.scalableDimension,
            "serviceNamespace": args.serviceNamespace,
            "stepAdjustment": args.stepAdjustment,
            "arn": undefined,
        }, dependsOn);
    }
}

export interface PolicyArgs {
    readonly adjustmentType: fabric.MaybeComputed<string>;
    readonly alarms?: fabric.MaybeComputed<fabric.MaybeComputed<string>>[];
    readonly cooldown: fabric.MaybeComputed<number>;
    readonly metricAggregationType: fabric.MaybeComputed<string>;
    readonly minAdjustmentMagnitude?: fabric.MaybeComputed<number>;
    readonly name?: fabric.MaybeComputed<string>;
    readonly policyType?: fabric.MaybeComputed<string>;
    readonly resourceId: fabric.MaybeComputed<string>;
    readonly scalableDimension: fabric.MaybeComputed<string>;
    readonly serviceNamespace: fabric.MaybeComputed<string>;
    readonly stepAdjustment?: fabric.MaybeComputed<{ metricIntervalLowerBound?: fabric.MaybeComputed<string>, metricIntervalUpperBound?: fabric.MaybeComputed<string>, scalingAdjustment: fabric.MaybeComputed<number> }>[];
}
