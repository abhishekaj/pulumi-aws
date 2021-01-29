// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGatewayV2.Outputs
{

    [OutputType]
    public sealed class IntegrationResponseParameter
    {
        /// <summary>
        /// A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
        /// See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Mappings;
        /// <summary>
        /// The HTTP status code in the range 200-599.
        /// </summary>
        public readonly string StatusCode;

        [OutputConstructor]
        private IntegrationResponseParameter(
            ImmutableDictionary<string, string> mappings,

            string statusCode)
        {
            Mappings = mappings;
            StatusCode = statusCode;
        }
    }
}