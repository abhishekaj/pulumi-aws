// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class RestApi extends fabric.Resource {
    public readonly binaryMediaTypes?: fabric.Computed<string[]>;
    public readonly body?: fabric.Computed<string>;
    public /*out*/ readonly createdDate: fabric.Computed<string>;
    public readonly description?: fabric.Computed<string>;
    public readonly name: fabric.Computed<string>;
    public /*out*/ readonly rootResourceId: fabric.Computed<string>;

    constructor(urnName: string, args?: RestApiArgs, dependsOn?: fabric.Resource[]) {
        super("aws:apigateway/restApi:RestApi", urnName, {
            "binaryMediaTypes": args.binaryMediaTypes,
            "body": args.body,
            "description": args.description,
            "name": args.name,
            "createdDate": undefined,
            "rootResourceId": undefined,
        }, dependsOn);
    }
}

export interface RestApiArgs {
    readonly binaryMediaTypes?: fabric.MaybeComputed<fabric.MaybeComputed<string>>[];
    readonly body?: fabric.MaybeComputed<string>;
    readonly description?: fabric.MaybeComputed<string>;
    readonly name?: fabric.MaybeComputed<string>;
}
