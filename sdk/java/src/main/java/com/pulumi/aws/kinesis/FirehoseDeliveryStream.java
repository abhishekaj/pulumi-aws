// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3Configuration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamKinesisSourceConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamS3Configuration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamServerSideEncryption;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Firehose Delivery Stream resource. Amazon Kinesis Firehose is a fully managed, elastic service to easily deliver real-time data streams to destinations such as Amazon S3 and Amazon Redshift.
 * 
 * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
 * 
 * ## Example Usage
 * ### Extended S3 Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.lambda.Function;
 * import com.pulumi.aws.lambda.FunctionArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.asset.FileArchive;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var firehoseRole = new Role(&#34;firehoseRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;firehose.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var lambdaIam = new Role(&#34;lambdaIam&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var lambdaProcessor = new Function(&#34;lambdaProcessor&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;lambda.zip&#34;))
 *             .role(lambdaIam.arn())
 *             .handler(&#34;exports.handler&#34;)
 *             .runtime(&#34;nodejs12.x&#34;)
 *             .build());
 * 
 *         var extendedS3Stream = new FirehoseDeliveryStream(&#34;extendedS3Stream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;extended_s3&#34;)
 *             .extendedS3Configuration(FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder()
 *                 .roleArn(firehoseRole.arn())
 *                 .bucketArn(bucket.arn())
 *                 .processingConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.builder()
 *                     .enabled(&#34;true&#34;)
 *                     .processors(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.builder()
 *                         .type(&#34;Lambda&#34;)
 *                         .parameters(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.builder()
 *                             .parameterName(&#34;LambdaArn&#34;)
 *                             .parameterValue(lambdaProcessor.arn().applyValue(arn -&gt; String.format(&#34;%s:$LATEST&#34;, arn)))
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Extended S3 Destination with dynamic partitioning
 * These examples use built-in Firehose functionality, rather than requiring a lambda.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var extendedS3Stream = new FirehoseDeliveryStream(&#34;extendedS3Stream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;extended_s3&#34;)
 *             .extendedS3Configuration(FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose_role().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .prefix(&#34;data/customer_id=!{partitionKeyFromQuery:customer_id}/year=!{timestamp:yyyy}/month=!{timestamp:MM}/day=!{timestamp:dd}/hour=!{timestamp:HH}/&#34;)
 *                 .errorOutputPrefix(&#34;errors/year=!{timestamp:yyyy}/month=!{timestamp:MM}/day=!{timestamp:dd}/hour=!{timestamp:HH}/!{firehose:error-output-type}/&#34;)
 *                 .bufferSize(64)
 *                 .processingConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.builder()
 *                     .enabled(&#34;true&#34;)
 *                     .processors(                    
 *                         FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.builder()
 *                             .type(&#34;RecordDeAggregation&#34;)
 *                             .parameters(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.builder()
 *                                 .parameterName(&#34;SubRecordType&#34;)
 *                                 .parameterValue(&#34;JSON&#34;)
 *                                 .build())
 *                             .build(),
 *                         FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.builder()
 *                             .type(&#34;AppendDelimiterToRecord&#34;)
 *                             .build(),
 *                         FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.builder()
 *                             .type(&#34;MetadataExtraction&#34;)
 *                             .parameters(                            
 *                                 FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.builder()
 *                                     .parameterName(&#34;JsonParsingEngine&#34;)
 *                                     .parameterValue(&#34;JQ-1.6&#34;)
 *                                     .build(),
 *                                 FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.builder()
 *                                     .parameterName(&#34;MetadataExtractionQuery&#34;)
 *                                     .parameterValue(&#34;{customer_id:.customer_id}&#34;)
 *                                     .build())
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### S3 Destination (deprecated)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var firehoseRole = new Role(&#34;firehoseRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;firehose.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var testStream = new FirehoseDeliveryStream(&#34;testStream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;s3&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(firehoseRole.arn())
 *                 .bucketArn(bucket.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Redshift Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.Cluster;
 * import com.pulumi.aws.redshift.ClusterArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;tf-redshift-cluster&#34;)
 *             .databaseName(&#34;test&#34;)
 *             .masterUsername(&#34;testuser&#34;)
 *             .masterPassword(&#34;T3stPass&#34;)
 *             .nodeType(&#34;dc1.large&#34;)
 *             .clusterType(&#34;single-node&#34;)
 *             .build());
 * 
 *         var testStream = new FirehoseDeliveryStream(&#34;testStream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;redshift&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose_role().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .bufferSize(10)
 *                 .bufferInterval(400)
 *                 .compressionFormat(&#34;GZIP&#34;)
 *                 .build())
 *             .redshiftConfiguration(FirehoseDeliveryStreamRedshiftConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose_role().arn())
 *                 .clusterJdbcurl(Output.tuple(testCluster.endpoint(), testCluster.databaseName()).applyValue(values -&gt; {
 *                     var endpoint = values.t1;
 *                     var databaseName = values.t2;
 *                     return String.format(&#34;jdbc:redshift://%s/%s&#34;, endpoint,databaseName);
 *                 }))
 *                 .username(&#34;testuser&#34;)
 *                 .password(&#34;T3stPass&#34;)
 *                 .dataTableName(&#34;test-table&#34;)
 *                 .copyOptions(&#34;delimiter &#39;|&#39;&#34;)
 *                 .dataTableColumns(&#34;test-col&#34;)
 *                 .s3BackupMode(&#34;Enabled&#34;)
 *                 .s3BackupConfiguration(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs.builder()
 *                     .roleArn(aws_iam_role.firehose_role().arn())
 *                     .bucketArn(aws_s3_bucket.bucket().arn())
 *                     .bufferSize(15)
 *                     .bufferInterval(300)
 *                     .compressionFormat(&#34;GZIP&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Elasticsearch Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testCluster = new Domain(&#34;testCluster&#34;);
 * 
 *         var testStream = new FirehoseDeliveryStream(&#34;testStream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;elasticsearch&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose_role().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .bufferSize(10)
 *                 .bufferInterval(400)
 *                 .compressionFormat(&#34;GZIP&#34;)
 *                 .build())
 *             .elasticsearchConfiguration(FirehoseDeliveryStreamElasticsearchConfigurationArgs.builder()
 *                 .domainArn(testCluster.arn())
 *                 .roleArn(aws_iam_role.firehose_role().arn())
 *                 .indexName(&#34;test&#34;)
 *                 .typeName(&#34;test&#34;)
 *                 .processingConfiguration(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs.builder()
 *                     .enabled(&#34;true&#34;)
 *                     .processors(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs.builder()
 *                         .type(&#34;Lambda&#34;)
 *                         .parameters(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs.builder()
 *                             .parameterName(&#34;LambdaArn&#34;)
 *                             .parameterValue(String.format(&#34;%s:$LATEST&#34;, aws_lambda_function.lambda_processor().arn()))
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Elasticsearch Destination With VPC
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.elasticsearch.DomainArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testCluster = new Domain(&#34;testCluster&#34;, DomainArgs.builder()        
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceCount(2)
 *                 .zoneAwarenessEnabled(true)
 *                 .instanceType(&#34;t2.small.elasticsearch&#34;)
 *                 .build())
 *             .ebsOptions(DomainEbsOptionsArgs.builder()
 *                 .ebsEnabled(true)
 *                 .volumeSize(10)
 *                 .build())
 *             .vpcOptions(DomainVpcOptionsArgs.builder()
 *                 .securityGroupIds(aws_security_group.first().id())
 *                 .subnetIds(                
 *                     aws_subnet.first().id(),
 *                     aws_subnet.second().id())
 *                 .build())
 *             .build());
 * 
 *         var firehose_elasticsearch = new RolePolicy(&#34;firehose-elasticsearch&#34;, RolePolicyArgs.builder()        
 *             .role(aws_iam_role.firehose().id())
 *             .policy(Output.tuple(testCluster.arn(), testCluster.arn()).applyValue(values -&gt; {
 *                 var testClusterArn = values.t1;
 *                 var testClusterArn1 = values.t2;
 *                 return &#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Action&#34;: [
 *         &#34;es:*&#34;
 *       ],
 *       &#34;Resource&#34;: [
 *         &#34;%s&#34;,
 *         &#34;%s/*&#34;
 *       ]
 *         },
 *         {
 *           &#34;Effect&#34;: &#34;Allow&#34;,
 *           &#34;Action&#34;: [
 *             &#34;ec2:DescribeVpcs&#34;,
 *             &#34;ec2:DescribeVpcAttribute&#34;,
 *             &#34;ec2:DescribeSubnets&#34;,
 *             &#34;ec2:DescribeSecurityGroups&#34;,
 *             &#34;ec2:DescribeNetworkInterfaces&#34;,
 *             &#34;ec2:CreateNetworkInterface&#34;,
 *             &#34;ec2:CreateNetworkInterfacePermission&#34;,
 *             &#34;ec2:DeleteNetworkInterface&#34;
 *           ],
 *           &#34;Resource&#34;: [
 *             &#34;*&#34;
 *           ]
 *         }
 *   ]
 * }
 * &#34;, testClusterArn,testClusterArn1);
 *             }))
 *             .build());
 * 
 *         var test = new FirehoseDeliveryStream(&#34;test&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;elasticsearch&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .build())
 *             .elasticsearchConfiguration(FirehoseDeliveryStreamElasticsearchConfigurationArgs.builder()
 *                 .domainArn(testCluster.arn())
 *                 .roleArn(aws_iam_role.firehose().arn())
 *                 .indexName(&#34;test&#34;)
 *                 .typeName(&#34;test&#34;)
 *                 .vpcConfig(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs.builder()
 *                     .subnetIds(                    
 *                         aws_subnet.first().id(),
 *                         aws_subnet.second().id())
 *                     .securityGroupIds(aws_security_group.first().id())
 *                     .roleArn(aws_iam_role.firehose().arn())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(firehose_elasticsearch)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Splunk Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testStream = new FirehoseDeliveryStream(&#34;testStream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;splunk&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .bufferSize(10)
 *                 .bufferInterval(400)
 *                 .compressionFormat(&#34;GZIP&#34;)
 *                 .build())
 *             .splunkConfiguration(FirehoseDeliveryStreamSplunkConfigurationArgs.builder()
 *                 .hecEndpoint(&#34;https://http-inputs-mydomain.splunkcloud.com:443&#34;)
 *                 .hecToken(&#34;51D4DA16-C61B-4F5F-8EC7-ED4301342A4A&#34;)
 *                 .hecAcknowledgmentTimeout(600)
 *                 .hecEndpointType(&#34;Event&#34;)
 *                 .s3BackupMode(&#34;FailedEventsOnly&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### HTTP Endpoint (e.g., New Relic) Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testStream = new FirehoseDeliveryStream(&#34;testStream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .destination(&#34;http_endpoint&#34;)
 *             .s3Configuration(FirehoseDeliveryStreamS3ConfigurationArgs.builder()
 *                 .roleArn(aws_iam_role.firehose().arn())
 *                 .bucketArn(aws_s3_bucket.bucket().arn())
 *                 .bufferSize(10)
 *                 .bufferInterval(400)
 *                 .compressionFormat(&#34;GZIP&#34;)
 *                 .build())
 *             .httpEndpointConfiguration(FirehoseDeliveryStreamHttpEndpointConfigurationArgs.builder()
 *                 .url(&#34;https://aws-api.newrelic.com/firehose/v1&#34;)
 *                 .name(&#34;New Relic&#34;)
 *                 .accessKey(&#34;my-key&#34;)
 *                 .bufferingSize(15)
 *                 .bufferingInterval(600)
 *                 .roleArn(aws_iam_role.firehose().arn())
 *                 .s3BackupMode(&#34;FailedDataOnly&#34;)
 *                 .requestConfiguration(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs.builder()
 *                     .contentEncoding(&#34;GZIP&#34;)
 *                     .commonAttributes(                    
 *                         FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs.builder()
 *                             .name(&#34;testname&#34;)
 *                             .value(&#34;testvalue&#34;)
 *                             .build(),
 *                         FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs.builder()
 *                             .name(&#34;testname2&#34;)
 *                             .value(&#34;testvalue2&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Kinesis Firehose Delivery streams can be imported using the stream ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream foo arn:aws:firehose:us-east-1:XXX:deliverystream/example
 * ```
 * 
 *  NoteImport does not work for stream destination `s3`. Consider using `extended_s3` since `s3` destination is deprecated.
 * 
 */
@ResourceType(type="aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream")
public class FirehoseDeliveryStream extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    @Export(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }
    @Export(name="destinationId", type=String.class, parameters={})
    private Output<String> destinationId;

    public Output<String> destinationId() {
        return this.destinationId;
    }
    /**
     * Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    @Export(name="elasticsearchConfiguration", type=FirehoseDeliveryStreamElasticsearchConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration;

    /**
     * @return Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamElasticsearchConfiguration>> elasticsearchConfiguration() {
        return Codegen.optional(this.elasticsearchConfiguration);
    }
    /**
     * Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    @Export(name="extendedS3Configuration", type=FirehoseDeliveryStreamExtendedS3Configuration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration;

    /**
     * @return Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamExtendedS3Configuration>> extendedS3Configuration() {
        return Codegen.optional(this.extendedS3Configuration);
    }
    /**
     * Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    @Export(name="httpEndpointConfiguration", type=FirehoseDeliveryStreamHttpEndpointConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamHttpEndpointConfiguration> httpEndpointConfiguration;

    /**
     * @return Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamHttpEndpointConfiguration>> httpEndpointConfiguration() {
        return Codegen.optional(this.httpEndpointConfiguration);
    }
    /**
     * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    @Export(name="kinesisSourceConfiguration", type=FirehoseDeliveryStreamKinesisSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration;

    /**
     * @return Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamKinesisSourceConfiguration>> kinesisSourceConfiguration() {
        return Codegen.optional(this.kinesisSourceConfiguration);
    }
    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    @Export(name="redshiftConfiguration", type=FirehoseDeliveryStreamRedshiftConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration;

    /**
     * @return Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamRedshiftConfiguration>> redshiftConfiguration() {
        return Codegen.optional(this.redshiftConfiguration);
    }
    /**
     * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    @Export(name="s3Configuration", type=FirehoseDeliveryStreamS3Configuration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamS3Configuration> s3Configuration;

    /**
     * @return Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamS3Configuration>> s3Configuration() {
        return Codegen.optional(this.s3Configuration);
    }
    /**
     * Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    @Export(name="serverSideEncryption", type=FirehoseDeliveryStreamServerSideEncryption.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamServerSideEncryption> serverSideEncryption;

    /**
     * @return Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamServerSideEncryption>> serverSideEncryption() {
        return Codegen.optional(this.serverSideEncryption);
    }
    /**
     * Configuration options if splunk is the destination. More details are given below.
     * 
     */
    @Export(name="splunkConfiguration", type=FirehoseDeliveryStreamSplunkConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration;

    /**
     * @return Configuration options if splunk is the destination. More details are given below.
     * 
     */
    public Output<Optional<FirehoseDeliveryStreamSplunkConfiguration>> splunkConfiguration() {
        return Codegen.optional(this.splunkConfiguration);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirehoseDeliveryStream(String name) {
        this(name, FirehoseDeliveryStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirehoseDeliveryStream(String name, FirehoseDeliveryStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirehoseDeliveryStream(String name, FirehoseDeliveryStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream", name, args == null ? FirehoseDeliveryStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirehoseDeliveryStream(String name, Output<String> id, @Nullable FirehoseDeliveryStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirehoseDeliveryStream get(String name, Output<String> id, @Nullable FirehoseDeliveryStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirehoseDeliveryStream(name, id, state, options);
    }
}