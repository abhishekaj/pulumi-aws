// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs : global::Pulumi.ResourceArgs
    {
        [Input("all")]
        public Input<Inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs>? All { get; set; }

        [Input("excludedCookies")]
        private InputList<string>? _excludedCookies;
        public InputList<string> ExcludedCookies
        {
            get => _excludedCookies ?? (_excludedCookies = new InputList<string>());
            set => _excludedCookies = value;
        }

        [Input("includedCookies")]
        private InputList<string>? _includedCookies;
        public InputList<string> IncludedCookies
        {
            get => _includedCookies ?? (_includedCookies = new InputList<string>());
            set => _includedCookies = value;
        }

        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs()
        {
        }
        public static new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs Empty => new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs();
    }
}