// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class VpnConnection extends fabric.Resource {
    public readonly customerGatewayConfiguration: fabric.Computed<string>;
    public readonly customerGatewayId: fabric.Computed<string>;
    public readonly routes: fabric.Computed<{ destinationCidrBlock: string, source: string, state: string }[]>;
    public readonly staticRoutesOnly: fabric.Computed<boolean>;
    public readonly tags?: fabric.Computed<{[key: string]: any}>;
    public /*out*/ readonly tunnel1Address: fabric.Computed<string>;
    public /*out*/ readonly tunnel1BgpAsn: fabric.Computed<string>;
    public /*out*/ readonly tunnel1BgpHoldtime: fabric.Computed<number>;
    public /*out*/ readonly tunnel1CgwInsideAddress: fabric.Computed<string>;
    public /*out*/ readonly tunnel1PresharedKey: fabric.Computed<string>;
    public /*out*/ readonly tunnel1VgwInsideAddress: fabric.Computed<string>;
    public /*out*/ readonly tunnel2Address: fabric.Computed<string>;
    public /*out*/ readonly tunnel2BgpAsn: fabric.Computed<string>;
    public /*out*/ readonly tunnel2BgpHoldtime: fabric.Computed<number>;
    public /*out*/ readonly tunnel2CgwInsideAddress: fabric.Computed<string>;
    public /*out*/ readonly tunnel2PresharedKey: fabric.Computed<string>;
    public /*out*/ readonly tunnel2VgwInsideAddress: fabric.Computed<string>;
    public readonly type: fabric.Computed<string>;
    public readonly vgwTelemetry: fabric.Computed<{ acceptedRouteCount: number, lastStatusChange: string, outsideIpAddress: string, status: string, statusMessage: string }[]>;
    public readonly vpnGatewayId: fabric.Computed<string>;

    constructor(urnName: string, args: VpnConnectionArgs, dependsOn?: fabric.Resource[]) {
        if (args.customerGatewayId === undefined) {
            throw new Error("Missing required property 'customerGatewayId'");
        }
        if (args.type === undefined) {
            throw new Error("Missing required property 'type'");
        }
        if (args.vpnGatewayId === undefined) {
            throw new Error("Missing required property 'vpnGatewayId'");
        }
        super("aws:ec2/vpnConnection:VpnConnection", urnName, {
            "customerGatewayConfiguration": args.customerGatewayConfiguration,
            "customerGatewayId": args.customerGatewayId,
            "routes": args.routes,
            "staticRoutesOnly": args.staticRoutesOnly,
            "tags": args.tags,
            "type": args.type,
            "vgwTelemetry": args.vgwTelemetry,
            "vpnGatewayId": args.vpnGatewayId,
            "tunnel1Address": undefined,
            "tunnel1BgpAsn": undefined,
            "tunnel1BgpHoldtime": undefined,
            "tunnel1CgwInsideAddress": undefined,
            "tunnel1PresharedKey": undefined,
            "tunnel1VgwInsideAddress": undefined,
            "tunnel2Address": undefined,
            "tunnel2BgpAsn": undefined,
            "tunnel2BgpHoldtime": undefined,
            "tunnel2CgwInsideAddress": undefined,
            "tunnel2PresharedKey": undefined,
            "tunnel2VgwInsideAddress": undefined,
        }, dependsOn);
    }
}

export interface VpnConnectionArgs {
    readonly customerGatewayConfiguration?: fabric.MaybeComputed<string>;
    readonly customerGatewayId: fabric.MaybeComputed<string>;
    readonly routes?: fabric.MaybeComputed<{ destinationCidrBlock?: fabric.MaybeComputed<string>, source?: fabric.MaybeComputed<string>, state?: fabric.MaybeComputed<string> }>[];
    readonly staticRoutesOnly?: fabric.MaybeComputed<boolean>;
    readonly tags?: fabric.MaybeComputed<{[key: string]: any}>;
    readonly type: fabric.MaybeComputed<string>;
    readonly vgwTelemetry?: fabric.MaybeComputed<{ acceptedRouteCount?: fabric.MaybeComputed<number>, lastStatusChange?: fabric.MaybeComputed<string>, outsideIpAddress?: fabric.MaybeComputed<string>, status?: fabric.MaybeComputed<string>, statusMessage?: fabric.MaybeComputed<string> }>[];
    readonly vpnGatewayId: fabric.MaybeComputed<string>;
}
