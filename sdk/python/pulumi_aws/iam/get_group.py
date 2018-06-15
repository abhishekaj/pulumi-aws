# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class GetGroupResult(object):
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, arn=None, group_id=None, path=None):
        if arn and not isinstance(arn, basestring):
            raise TypeError('Expected argument arn to be a basestring')
        __self__.arn = arn
        """
        The Amazon Resource Name (ARN) specifying the group.
        """
        if group_id and not isinstance(group_id, basestring):
            raise TypeError('Expected argument group_id to be a basestring')
        __self__.group_id = group_id
        """
        The stable and unique string identifying the group.
        """
        if path and not isinstance(path, basestring):
            raise TypeError('Expected argument path to be a basestring')
        __self__.path = path
        """
        The path to the group.
        """

def get_group(group_name=None):
    """
    This data source can be used to fetch information about a specific
    IAM group. By using this data source, you can reference IAM group
    properties without having to hard code ARNs as input.
    """
    __args__ = dict()

    __args__['groupName'] = group_name
    __ret__ = pulumi.runtime.invoke('aws:iam/getGroup:getGroup', __args__)

    return GetGroupResult(
        arn=__ret__.get('arn'),
        group_id=__ret__.get('groupId'),
        path=__ret__.get('path'))