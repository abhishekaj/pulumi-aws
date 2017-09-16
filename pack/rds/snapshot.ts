// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Snapshot extends fabric.Resource {
    public /*out*/ readonly allocatedStorage: fabric.Computed<number>;
    public /*out*/ readonly availabilityZone: fabric.Computed<string>;
    public readonly dbInstanceIdentifier: fabric.Computed<string>;
    public /*out*/ readonly dbSnapshotArn: fabric.Computed<string>;
    public readonly dbSnapshotIdentifier: fabric.Computed<string>;
    public /*out*/ readonly encrypted: fabric.Computed<boolean>;
    public /*out*/ readonly engine: fabric.Computed<string>;
    public /*out*/ readonly engineVersion: fabric.Computed<string>;
    public /*out*/ readonly iops: fabric.Computed<number>;
    public /*out*/ readonly kmsKeyId: fabric.Computed<string>;
    public /*out*/ readonly licenseModel: fabric.Computed<string>;
    public /*out*/ readonly optionGroupName: fabric.Computed<string>;
    public /*out*/ readonly port: fabric.Computed<number>;
    public /*out*/ readonly snapshotType: fabric.Computed<string>;
    public /*out*/ readonly sourceDbSnapshotIdentifier: fabric.Computed<string>;
    public /*out*/ readonly sourceRegion: fabric.Computed<string>;
    public /*out*/ readonly status: fabric.Computed<string>;
    public /*out*/ readonly storageType: fabric.Computed<string>;
    public /*out*/ readonly vpcId: fabric.Computed<string>;

    constructor(urnName: string, args: SnapshotArgs, dependsOn?: fabric.Resource[]) {
        if (args.dbInstanceIdentifier === undefined) {
            throw new Error("Missing required property 'dbInstanceIdentifier'");
        }
        if (args.dbSnapshotIdentifier === undefined) {
            throw new Error("Missing required property 'dbSnapshotIdentifier'");
        }
        super("aws:rds/snapshot:Snapshot", urnName, {
            "dbInstanceIdentifier": args.dbInstanceIdentifier,
            "dbSnapshotIdentifier": args.dbSnapshotIdentifier,
            "allocatedStorage": undefined,
            "availabilityZone": undefined,
            "dbSnapshotArn": undefined,
            "encrypted": undefined,
            "engine": undefined,
            "engineVersion": undefined,
            "iops": undefined,
            "kmsKeyId": undefined,
            "licenseModel": undefined,
            "optionGroupName": undefined,
            "port": undefined,
            "snapshotType": undefined,
            "sourceDbSnapshotIdentifier": undefined,
            "sourceRegion": undefined,
            "status": undefined,
            "storageType": undefined,
            "vpcId": undefined,
        }, dependsOn);
    }
}

export interface SnapshotArgs {
    readonly dbInstanceIdentifier: fabric.MaybeComputed<string>;
    readonly dbSnapshotIdentifier: fabric.MaybeComputed<string>;
}
