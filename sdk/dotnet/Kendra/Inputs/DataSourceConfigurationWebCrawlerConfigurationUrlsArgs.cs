// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class DataSourceConfigurationWebCrawlerConfigurationUrlsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that specifies the configuration of the seed or starting point URLs of the websites you want to crawl. You can choose to crawl only the website host names, or the website host names with subdomains, or the website host names with subdomains and other domains that the webpages link to. You can list up to `100` seed URLs. Detailed below.
        /// </summary>
        [Input("seedUrlConfiguration")]
        public Input<Inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfigurationArgs>? SeedUrlConfiguration { get; set; }

        /// <summary>
        /// A block that specifies the configuration of the sitemap URLs of the websites you want to crawl. Only URLs belonging to the same website host names are crawled. You can list up to `3` sitemap URLs. Detailed below.
        /// </summary>
        [Input("siteMapsConfiguration")]
        public Input<Inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationArgs>? SiteMapsConfiguration { get; set; }

        public DataSourceConfigurationWebCrawlerConfigurationUrlsArgs()
        {
        }
        public static new DataSourceConfigurationWebCrawlerConfigurationUrlsArgs Empty => new DataSourceConfigurationWebCrawlerConfigurationUrlsArgs();
    }
}