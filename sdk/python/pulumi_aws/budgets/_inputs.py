# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'BudgetActionActionThresholdArgs',
    'BudgetActionDefinitionArgs',
    'BudgetActionDefinitionIamActionDefinitionArgs',
    'BudgetActionDefinitionScpActionDefinitionArgs',
    'BudgetActionDefinitionSsmActionDefinitionArgs',
    'BudgetActionSubscriberArgs',
    'BudgetCostFilterArgs',
    'BudgetCostTypesArgs',
    'BudgetNotificationArgs',
]

@pulumi.input_type
class BudgetActionActionThresholdArgs:
    def __init__(__self__, *,
                 action_threshold_type: pulumi.Input[str],
                 action_threshold_value: pulumi.Input[float]):
        """
        :param pulumi.Input[str] action_threshold_type: The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
        :param pulumi.Input[float] action_threshold_value: The threshold of a notification.
        """
        pulumi.set(__self__, "action_threshold_type", action_threshold_type)
        pulumi.set(__self__, "action_threshold_value", action_threshold_value)

    @property
    @pulumi.getter(name="actionThresholdType")
    def action_threshold_type(self) -> pulumi.Input[str]:
        """
        The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
        """
        return pulumi.get(self, "action_threshold_type")

    @action_threshold_type.setter
    def action_threshold_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_threshold_type", value)

    @property
    @pulumi.getter(name="actionThresholdValue")
    def action_threshold_value(self) -> pulumi.Input[float]:
        """
        The threshold of a notification.
        """
        return pulumi.get(self, "action_threshold_value")

    @action_threshold_value.setter
    def action_threshold_value(self, value: pulumi.Input[float]):
        pulumi.set(self, "action_threshold_value", value)


@pulumi.input_type
class BudgetActionDefinitionArgs:
    def __init__(__self__, *,
                 iam_action_definition: Optional[pulumi.Input['BudgetActionDefinitionIamActionDefinitionArgs']] = None,
                 scp_action_definition: Optional[pulumi.Input['BudgetActionDefinitionScpActionDefinitionArgs']] = None,
                 ssm_action_definition: Optional[pulumi.Input['BudgetActionDefinitionSsmActionDefinitionArgs']] = None):
        """
        :param pulumi.Input['BudgetActionDefinitionIamActionDefinitionArgs'] iam_action_definition: The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
        :param pulumi.Input['BudgetActionDefinitionScpActionDefinitionArgs'] scp_action_definition: The service control policies (SCPs) action definition details. See SCP Action Definition.
        :param pulumi.Input['BudgetActionDefinitionSsmActionDefinitionArgs'] ssm_action_definition: The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
        """
        if iam_action_definition is not None:
            pulumi.set(__self__, "iam_action_definition", iam_action_definition)
        if scp_action_definition is not None:
            pulumi.set(__self__, "scp_action_definition", scp_action_definition)
        if ssm_action_definition is not None:
            pulumi.set(__self__, "ssm_action_definition", ssm_action_definition)

    @property
    @pulumi.getter(name="iamActionDefinition")
    def iam_action_definition(self) -> Optional[pulumi.Input['BudgetActionDefinitionIamActionDefinitionArgs']]:
        """
        The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
        """
        return pulumi.get(self, "iam_action_definition")

    @iam_action_definition.setter
    def iam_action_definition(self, value: Optional[pulumi.Input['BudgetActionDefinitionIamActionDefinitionArgs']]):
        pulumi.set(self, "iam_action_definition", value)

    @property
    @pulumi.getter(name="scpActionDefinition")
    def scp_action_definition(self) -> Optional[pulumi.Input['BudgetActionDefinitionScpActionDefinitionArgs']]:
        """
        The service control policies (SCPs) action definition details. See SCP Action Definition.
        """
        return pulumi.get(self, "scp_action_definition")

    @scp_action_definition.setter
    def scp_action_definition(self, value: Optional[pulumi.Input['BudgetActionDefinitionScpActionDefinitionArgs']]):
        pulumi.set(self, "scp_action_definition", value)

    @property
    @pulumi.getter(name="ssmActionDefinition")
    def ssm_action_definition(self) -> Optional[pulumi.Input['BudgetActionDefinitionSsmActionDefinitionArgs']]:
        """
        The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
        """
        return pulumi.get(self, "ssm_action_definition")

    @ssm_action_definition.setter
    def ssm_action_definition(self, value: Optional[pulumi.Input['BudgetActionDefinitionSsmActionDefinitionArgs']]):
        pulumi.set(self, "ssm_action_definition", value)


@pulumi.input_type
class BudgetActionDefinitionIamActionDefinitionArgs:
    def __init__(__self__, *,
                 policy_arn: pulumi.Input[str],
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] policy_arn: The Amazon Resource Name (ARN) of the policy to be attached.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: A list of groups to be attached. There must be at least one group.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: A list of roles to be attached. There must be at least one role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: A list of users to be attached. There must be at least one user.
        """
        pulumi.set(__self__, "policy_arn", policy_arn)
        if groups is not None:
            pulumi.set(__self__, "groups", groups)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="policyArn")
    def policy_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the policy to be attached.
        """
        return pulumi.get(self, "policy_arn")

    @policy_arn.setter
    def policy_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_arn", value)

    @property
    @pulumi.getter
    def groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of groups to be attached. There must be at least one group.
        """
        return pulumi.get(self, "groups")

    @groups.setter
    def groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "groups", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of roles to be attached. There must be at least one role.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of users to be attached. There must be at least one user.
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


@pulumi.input_type
class BudgetActionDefinitionScpActionDefinitionArgs:
    def __init__(__self__, *,
                 policy_id: pulumi.Input[str],
                 target_ids: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] policy_id: The policy ID attached.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] target_ids: A list of target IDs.
        """
        pulumi.set(__self__, "policy_id", policy_id)
        pulumi.set(__self__, "target_ids", target_ids)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        The policy ID attached.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="targetIds")
    def target_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of target IDs.
        """
        return pulumi.get(self, "target_ids")

    @target_ids.setter
    def target_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "target_ids", value)


@pulumi.input_type
class BudgetActionDefinitionSsmActionDefinitionArgs:
    def __init__(__self__, *,
                 action_sub_type: pulumi.Input[str],
                 instance_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 region: pulumi.Input[str]):
        """
        :param pulumi.Input[str] action_sub_type: The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The EC2 and RDS instance IDs.
        :param pulumi.Input[str] region: The Region to run the SSM document.
        """
        pulumi.set(__self__, "action_sub_type", action_sub_type)
        pulumi.set(__self__, "instance_ids", instance_ids)
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="actionSubType")
    def action_sub_type(self) -> pulumi.Input[str]:
        """
        The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
        """
        return pulumi.get(self, "action_sub_type")

    @action_sub_type.setter
    def action_sub_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_sub_type", value)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The EC2 and RDS instance IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The Region to run the SSM document.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class BudgetActionSubscriberArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 subscription_type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] address: The address that AWS sends budget notifications to, either an SNS topic or an email.
        :param pulumi.Input[str] subscription_type: The type of notification that AWS sends to a subscriber. Valid values are `SNS` or `EMAIL`.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "subscription_type", subscription_type)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The address that AWS sends budget notifications to, either an SNS topic or an email.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="subscriptionType")
    def subscription_type(self) -> pulumi.Input[str]:
        """
        The type of notification that AWS sends to a subscriber. Valid values are `SNS` or `EMAIL`.
        """
        return pulumi.get(self, "subscription_type")

    @subscription_type.setter
    def subscription_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "subscription_type", value)


@pulumi.input_type
class BudgetCostFilterArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] name: The name of a budget. Unique within accounts.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of a budget. Unique within accounts.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class BudgetCostTypesArgs:
    def __init__(__self__, *,
                 include_credit: Optional[pulumi.Input[bool]] = None,
                 include_discount: Optional[pulumi.Input[bool]] = None,
                 include_other_subscription: Optional[pulumi.Input[bool]] = None,
                 include_recurring: Optional[pulumi.Input[bool]] = None,
                 include_refund: Optional[pulumi.Input[bool]] = None,
                 include_subscription: Optional[pulumi.Input[bool]] = None,
                 include_support: Optional[pulumi.Input[bool]] = None,
                 include_tax: Optional[pulumi.Input[bool]] = None,
                 include_upfront: Optional[pulumi.Input[bool]] = None,
                 use_amortized: Optional[pulumi.Input[bool]] = None,
                 use_blended: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] include_credit: A boolean value whether to include credits in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_discount: Whether a budget includes discounts. Defaults to `true`
        :param pulumi.Input[bool] include_other_subscription: A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_recurring: A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_refund: A boolean value whether to include refunds in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_subscription: A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_support: A boolean value whether to include support costs in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_tax: A boolean value whether to include tax in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] include_upfront: A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
        :param pulumi.Input[bool] use_amortized: Whether a budget uses the amortized rate. Defaults to `false`
        :param pulumi.Input[bool] use_blended: A boolean value whether to use blended costs in the cost budget. Defaults to `false`
        """
        if include_credit is not None:
            pulumi.set(__self__, "include_credit", include_credit)
        if include_discount is not None:
            pulumi.set(__self__, "include_discount", include_discount)
        if include_other_subscription is not None:
            pulumi.set(__self__, "include_other_subscription", include_other_subscription)
        if include_recurring is not None:
            pulumi.set(__self__, "include_recurring", include_recurring)
        if include_refund is not None:
            pulumi.set(__self__, "include_refund", include_refund)
        if include_subscription is not None:
            pulumi.set(__self__, "include_subscription", include_subscription)
        if include_support is not None:
            pulumi.set(__self__, "include_support", include_support)
        if include_tax is not None:
            pulumi.set(__self__, "include_tax", include_tax)
        if include_upfront is not None:
            pulumi.set(__self__, "include_upfront", include_upfront)
        if use_amortized is not None:
            pulumi.set(__self__, "use_amortized", use_amortized)
        if use_blended is not None:
            pulumi.set(__self__, "use_blended", use_blended)

    @property
    @pulumi.getter(name="includeCredit")
    def include_credit(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include credits in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_credit")

    @include_credit.setter
    def include_credit(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_credit", value)

    @property
    @pulumi.getter(name="includeDiscount")
    def include_discount(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether a budget includes discounts. Defaults to `true`
        """
        return pulumi.get(self, "include_discount")

    @include_discount.setter
    def include_discount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_discount", value)

    @property
    @pulumi.getter(name="includeOtherSubscription")
    def include_other_subscription(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_other_subscription")

    @include_other_subscription.setter
    def include_other_subscription(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_other_subscription", value)

    @property
    @pulumi.getter(name="includeRecurring")
    def include_recurring(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_recurring")

    @include_recurring.setter
    def include_recurring(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_recurring", value)

    @property
    @pulumi.getter(name="includeRefund")
    def include_refund(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include refunds in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_refund")

    @include_refund.setter
    def include_refund(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_refund", value)

    @property
    @pulumi.getter(name="includeSubscription")
    def include_subscription(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_subscription")

    @include_subscription.setter
    def include_subscription(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_subscription", value)

    @property
    @pulumi.getter(name="includeSupport")
    def include_support(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include support costs in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_support")

    @include_support.setter
    def include_support(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_support", value)

    @property
    @pulumi.getter(name="includeTax")
    def include_tax(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include tax in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_tax")

    @include_tax.setter
    def include_tax(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_tax", value)

    @property
    @pulumi.getter(name="includeUpfront")
    def include_upfront(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
        """
        return pulumi.get(self, "include_upfront")

    @include_upfront.setter
    def include_upfront(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_upfront", value)

    @property
    @pulumi.getter(name="useAmortized")
    def use_amortized(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether a budget uses the amortized rate. Defaults to `false`
        """
        return pulumi.get(self, "use_amortized")

    @use_amortized.setter
    def use_amortized(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_amortized", value)

    @property
    @pulumi.getter(name="useBlended")
    def use_blended(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value whether to use blended costs in the cost budget. Defaults to `false`
        """
        return pulumi.get(self, "use_blended")

    @use_blended.setter
    def use_blended(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_blended", value)


@pulumi.input_type
class BudgetNotificationArgs:
    def __init__(__self__, *,
                 comparison_operator: pulumi.Input[str],
                 notification_type: pulumi.Input[str],
                 threshold: pulumi.Input[float],
                 threshold_type: pulumi.Input[str],
                 subscriber_email_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subscriber_sns_topic_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] comparison_operator: (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
        :param pulumi.Input[str] notification_type: (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
        :param pulumi.Input[float] threshold: (Required) Threshold when the notification should be sent.
        :param pulumi.Input[str] threshold_type: (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subscriber_email_addresses: (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subscriber_sns_topic_arns: (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
        """
        pulumi.set(__self__, "comparison_operator", comparison_operator)
        pulumi.set(__self__, "notification_type", notification_type)
        pulumi.set(__self__, "threshold", threshold)
        pulumi.set(__self__, "threshold_type", threshold_type)
        if subscriber_email_addresses is not None:
            pulumi.set(__self__, "subscriber_email_addresses", subscriber_email_addresses)
        if subscriber_sns_topic_arns is not None:
            pulumi.set(__self__, "subscriber_sns_topic_arns", subscriber_sns_topic_arns)

    @property
    @pulumi.getter(name="comparisonOperator")
    def comparison_operator(self) -> pulumi.Input[str]:
        """
        (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
        """
        return pulumi.get(self, "comparison_operator")

    @comparison_operator.setter
    def comparison_operator(self, value: pulumi.Input[str]):
        pulumi.set(self, "comparison_operator", value)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Input[str]:
        """
        (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "notification_type", value)

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Input[float]:
        """
        (Required) Threshold when the notification should be sent.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: pulumi.Input[float]):
        pulumi.set(self, "threshold", value)

    @property
    @pulumi.getter(name="thresholdType")
    def threshold_type(self) -> pulumi.Input[str]:
        """
        (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
        """
        return pulumi.get(self, "threshold_type")

    @threshold_type.setter
    def threshold_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "threshold_type", value)

    @property
    @pulumi.getter(name="subscriberEmailAddresses")
    def subscriber_email_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
        """
        return pulumi.get(self, "subscriber_email_addresses")

    @subscriber_email_addresses.setter
    def subscriber_email_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subscriber_email_addresses", value)

    @property
    @pulumi.getter(name="subscriberSnsTopicArns")
    def subscriber_sns_topic_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
        """
        return pulumi.get(self, "subscriber_sns_topic_arns")

    @subscriber_sns_topic_arns.setter
    def subscriber_sns_topic_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subscriber_sns_topic_arns", value)


