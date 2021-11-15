# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AlertManagerDefinitionArgs', 'AlertManagerDefinition']

@pulumi.input_type
class AlertManagerDefinitionArgs:
    def __init__(__self__, *,
                 definition: pulumi.Input[str],
                 workspace_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AlertManagerDefinition resource.
        :param pulumi.Input[str] definition: the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        :param pulumi.Input[str] workspace_id: The id of the prometheus workspace the alert manager definition should be linked to
        """
        pulumi.set(__self__, "definition", definition)
        pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Input[str]:
        """
        the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: pulumi.Input[str]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[str]:
        """
        The id of the prometheus workspace the alert manager definition should be linked to
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_id", value)


@pulumi.input_type
class _AlertManagerDefinitionState:
    def __init__(__self__, *,
                 definition: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertManagerDefinition resources.
        :param pulumi.Input[str] definition: the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        :param pulumi.Input[str] workspace_id: The id of the prometheus workspace the alert manager definition should be linked to
        """
        if definition is not None:
            pulumi.set(__self__, "definition", definition)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter
    def definition(self) -> Optional[pulumi.Input[str]]:
        """
        the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the prometheus workspace the alert manager definition should be linked to
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_id", value)


class AlertManagerDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Amazon Managed Service for Prometheus (AMP) Alert Manager Definition

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        demo_workspace = aws.amp.Workspace("demoWorkspace")
        demo_alert_manager_definition = aws.amp.AlertManagerDefinition("demoAlertManagerDefinition",
            workspace_id=demo_workspace.id,
            definition=\"\"\"alertmanager_config: |
          route:
            receiver: 'default'
          receivers:
            - name: 'default'
        \"\"\")
        ```

        ## Import

        The prometheus alert manager definition can be imported using the workspace identifier, e.g.,

        ```sh
         $ pulumi import aws:amp/alertManagerDefinition:AlertManagerDefinition demo ws-C6DCB907-F2D7-4D96-957B-66691F865D8B
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] definition: the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        :param pulumi.Input[str] workspace_id: The id of the prometheus workspace the alert manager definition should be linked to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertManagerDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Amazon Managed Service for Prometheus (AMP) Alert Manager Definition

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        demo_workspace = aws.amp.Workspace("demoWorkspace")
        demo_alert_manager_definition = aws.amp.AlertManagerDefinition("demoAlertManagerDefinition",
            workspace_id=demo_workspace.id,
            definition=\"\"\"alertmanager_config: |
          route:
            receiver: 'default'
          receivers:
            - name: 'default'
        \"\"\")
        ```

        ## Import

        The prometheus alert manager definition can be imported using the workspace identifier, e.g.,

        ```sh
         $ pulumi import aws:amp/alertManagerDefinition:AlertManagerDefinition demo ws-C6DCB907-F2D7-4D96-957B-66691F865D8B
        ```

        :param str resource_name: The name of the resource.
        :param AlertManagerDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertManagerDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertManagerDefinitionArgs.__new__(AlertManagerDefinitionArgs)

            if definition is None and not opts.urn:
                raise TypeError("Missing required property 'definition'")
            __props__.__dict__["definition"] = definition
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        super(AlertManagerDefinition, __self__).__init__(
            'aws:amp/alertManagerDefinition:AlertManagerDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            definition: Optional[pulumi.Input[str]] = None,
            workspace_id: Optional[pulumi.Input[str]] = None) -> 'AlertManagerDefinition':
        """
        Get an existing AlertManagerDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] definition: the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        :param pulumi.Input[str] workspace_id: The id of the prometheus workspace the alert manager definition should be linked to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertManagerDefinitionState.__new__(_AlertManagerDefinitionState)

        __props__.__dict__["definition"] = definition
        __props__.__dict__["workspace_id"] = workspace_id
        return AlertManagerDefinition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Output[str]:
        """
        the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
        """
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[str]:
        """
        The id of the prometheus workspace the alert manager definition should be linked to
        """
        return pulumi.get(self, "workspace_id")
