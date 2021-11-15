// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Pause Cluster Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleRole = new aws.iam.Role("exampleRole", {assumeRolePolicy: `{
 *   "Version": "2012-10-17",
 *   "Statement": [
 *     {
 *       "Action": "sts:AssumeRole",
 *       "Principal": {
 *         "Service": [
 *           "scheduler.redshift.amazonaws.com"
 *         ]
 *       },
 *       "Effect": "Allow",
 *       "Sid": ""
 *     }
 *   ]
 * }
 * `});
 * const examplePolicy = new aws.iam.Policy("examplePolicy", {policy: `{
 *   "Version": "2012-10-17",
 *   "Statement": [
 *       {
 *           "Sid": "VisualEditor0",
 *           "Effect": "Allow",
 *           "Action": [
 *               "redshift:PauseCluster",
 *               "redshift:ResumeCluster",
 *               "redshift:ResizeCluster"
 *           ],
 *           "Resource": "*"
 *       }
 *   ]
 * }
 * `});
 * const exampleRolePolicyAttachment = new aws.iam.RolePolicyAttachment("exampleRolePolicyAttachment", {
 *     policyArn: examplePolicy.arn,
 *     role: exampleRole.name,
 * });
 * const exampleScheduledAction = new aws.redshift.ScheduledAction("exampleScheduledAction", {
 *     schedule: "cron(00 23 * * ? *)",
 *     iamRole: exampleRole.arn,
 *     targetAction: {
 *         pauseCluster: {
 *             clusterIdentifier: "tf-redshift001",
 *         },
 *     },
 * });
 * ```
 * ### Resize Cluster Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.redshift.ScheduledAction("example", {
 *     schedule: "cron(00 23 * * ? *)",
 *     iamRole: aws_iam_role.example.arn,
 *     targetAction: {
 *         resizeCluster: {
 *             clusterIdentifier: "tf-redshift001",
 *             clusterType: "multi-node",
 *             nodeType: "dc1.large",
 *             numberOfNodes: 2,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Redshift Scheduled Action can be imported using the `name`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:redshift/scheduledAction:ScheduledAction example tf-redshift-scheduled-action
 * ```
 */
export class ScheduledAction extends pulumi.CustomResource {
    /**
     * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduledActionState, opts?: pulumi.CustomResourceOptions): ScheduledAction {
        return new ScheduledAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:redshift/scheduledAction:ScheduledAction';

    /**
     * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScheduledAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScheduledAction.__pulumiType;
    }

    /**
     * The description of the scheduled action.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the scheduled action. Default is `true` .
     */
    public readonly enable!: pulumi.Output<boolean | undefined>;
    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    public readonly endTime!: pulumi.Output<string | undefined>;
    /**
     * The IAM role to assume to run the scheduled action.
     */
    public readonly iamRole!: pulumi.Output<string>;
    /**
     * The scheduled action name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     */
    public readonly schedule!: pulumi.Output<string>;
    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    public readonly startTime!: pulumi.Output<string | undefined>;
    /**
     * Target action. Documented below.
     */
    public readonly targetAction!: pulumi.Output<outputs.redshift.ScheduledActionTargetAction>;

    /**
     * Create a ScheduledAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduledActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduledActionArgs | ScheduledActionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduledActionState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enable"] = state ? state.enable : undefined;
            inputs["endTime"] = state ? state.endTime : undefined;
            inputs["iamRole"] = state ? state.iamRole : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["schedule"] = state ? state.schedule : undefined;
            inputs["startTime"] = state ? state.startTime : undefined;
            inputs["targetAction"] = state ? state.targetAction : undefined;
        } else {
            const args = argsOrState as ScheduledActionArgs | undefined;
            if ((!args || args.iamRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamRole'");
            }
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            if ((!args || args.targetAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetAction'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["enable"] = args ? args.enable : undefined;
            inputs["endTime"] = args ? args.endTime : undefined;
            inputs["iamRole"] = args ? args.iamRole : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["schedule"] = args ? args.schedule : undefined;
            inputs["startTime"] = args ? args.startTime : undefined;
            inputs["targetAction"] = args ? args.targetAction : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ScheduledAction.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScheduledAction resources.
 */
export interface ScheduledActionState {
    /**
     * The description of the scheduled action.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the scheduled action. Default is `true` .
     */
    enable?: pulumi.Input<boolean>;
    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    endTime?: pulumi.Input<string>;
    /**
     * The IAM role to assume to run the scheduled action.
     */
    iamRole?: pulumi.Input<string>;
    /**
     * The scheduled action name.
     */
    name?: pulumi.Input<string>;
    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     */
    schedule?: pulumi.Input<string>;
    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    startTime?: pulumi.Input<string>;
    /**
     * Target action. Documented below.
     */
    targetAction?: pulumi.Input<inputs.redshift.ScheduledActionTargetAction>;
}

/**
 * The set of arguments for constructing a ScheduledAction resource.
 */
export interface ScheduledActionArgs {
    /**
     * The description of the scheduled action.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the scheduled action. Default is `true` .
     */
    enable?: pulumi.Input<boolean>;
    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    endTime?: pulumi.Input<string>;
    /**
     * The IAM role to assume to run the scheduled action.
     */
    iamRole: pulumi.Input<string>;
    /**
     * The scheduled action name.
     */
    name?: pulumi.Input<string>;
    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     */
    schedule: pulumi.Input<string>;
    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    startTime?: pulumi.Input<string>;
    /**
     * Target action. Documented below.
     */
    targetAction: pulumi.Input<inputs.redshift.ScheduledActionTargetAction>;
}