// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs;
import com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs;
import com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventDestinationState extends com.pulumi.resources.ResourceArgs {

    public static final EventDestinationState Empty = new EventDestinationState();

    /**
     * The SES event destination ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The SES event destination ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * CloudWatch destination for the events
     * 
     */
    @Import(name="cloudwatchDestinations")
    private @Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations;

    /**
     * @return CloudWatch destination for the events
     * 
     */
    public Optional<Output<List<EventDestinationCloudwatchDestinationArgs>>> cloudwatchDestinations() {
        return Optional.ofNullable(this.cloudwatchDestinations);
    }

    /**
     * The name of the configuration set
     * 
     */
    @Import(name="configurationSetName")
    private @Nullable Output<String> configurationSetName;

    /**
     * @return The name of the configuration set
     * 
     */
    public Optional<Output<String>> configurationSetName() {
        return Optional.ofNullable(this.configurationSetName);
    }

    /**
     * If true, the event destination will be enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If true, the event destination will be enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @Import(name="kinesisDestination")
    private @Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination;

    /**
     * @return Send the events to a kinesis firehose destination
     * 
     */
    public Optional<Output<EventDestinationKinesisDestinationArgs>> kinesisDestination() {
        return Optional.ofNullable(this.kinesisDestination);
    }

    /**
     * A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
     * 
     */
    @Import(name="matchingTypes")
    private @Nullable Output<List<String>> matchingTypes;

    /**
     * @return A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
     * 
     */
    public Optional<Output<List<String>>> matchingTypes() {
        return Optional.ofNullable(this.matchingTypes);
    }

    /**
     * The name of the event destination
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the event destination
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Send the events to an SNS Topic destination
     * 
     */
    @Import(name="snsDestination")
    private @Nullable Output<EventDestinationSnsDestinationArgs> snsDestination;

    /**
     * @return Send the events to an SNS Topic destination
     * 
     */
    public Optional<Output<EventDestinationSnsDestinationArgs>> snsDestination() {
        return Optional.ofNullable(this.snsDestination);
    }

    private EventDestinationState() {}

    private EventDestinationState(EventDestinationState $) {
        this.arn = $.arn;
        this.cloudwatchDestinations = $.cloudwatchDestinations;
        this.configurationSetName = $.configurationSetName;
        this.enabled = $.enabled;
        this.kinesisDestination = $.kinesisDestination;
        this.matchingTypes = $.matchingTypes;
        this.name = $.name;
        this.snsDestination = $.snsDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventDestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventDestinationState $;

        public Builder() {
            $ = new EventDestinationState();
        }

        public Builder(EventDestinationState defaults) {
            $ = new EventDestinationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The SES event destination ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The SES event destination ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param cloudwatchDestinations CloudWatch destination for the events
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchDestinations(@Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations) {
            $.cloudwatchDestinations = cloudwatchDestinations;
            return this;
        }

        /**
         * @param cloudwatchDestinations CloudWatch destination for the events
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchDestinations(List<EventDestinationCloudwatchDestinationArgs> cloudwatchDestinations) {
            return cloudwatchDestinations(Output.of(cloudwatchDestinations));
        }

        /**
         * @param cloudwatchDestinations CloudWatch destination for the events
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchDestinations(EventDestinationCloudwatchDestinationArgs... cloudwatchDestinations) {
            return cloudwatchDestinations(List.of(cloudwatchDestinations));
        }

        /**
         * @param configurationSetName The name of the configuration set
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(@Nullable Output<String> configurationSetName) {
            $.configurationSetName = configurationSetName;
            return this;
        }

        /**
         * @param configurationSetName The name of the configuration set
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(String configurationSetName) {
            return configurationSetName(Output.of(configurationSetName));
        }

        /**
         * @param enabled If true, the event destination will be enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If true, the event destination will be enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param kinesisDestination Send the events to a kinesis firehose destination
         * 
         * @return builder
         * 
         */
        public Builder kinesisDestination(@Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination) {
            $.kinesisDestination = kinesisDestination;
            return this;
        }

        /**
         * @param kinesisDestination Send the events to a kinesis firehose destination
         * 
         * @return builder
         * 
         */
        public Builder kinesisDestination(EventDestinationKinesisDestinationArgs kinesisDestination) {
            return kinesisDestination(Output.of(kinesisDestination));
        }

        /**
         * @param matchingTypes A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder matchingTypes(@Nullable Output<List<String>> matchingTypes) {
            $.matchingTypes = matchingTypes;
            return this;
        }

        /**
         * @param matchingTypes A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder matchingTypes(List<String> matchingTypes) {
            return matchingTypes(Output.of(matchingTypes));
        }

        /**
         * @param matchingTypes A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder matchingTypes(String... matchingTypes) {
            return matchingTypes(List.of(matchingTypes));
        }

        /**
         * @param name The name of the event destination
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the event destination
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param snsDestination Send the events to an SNS Topic destination
         * 
         * @return builder
         * 
         */
        public Builder snsDestination(@Nullable Output<EventDestinationSnsDestinationArgs> snsDestination) {
            $.snsDestination = snsDestination;
            return this;
        }

        /**
         * @param snsDestination Send the events to an SNS Topic destination
         * 
         * @return builder
         * 
         */
        public Builder snsDestination(EventDestinationSnsDestinationArgs snsDestination) {
            return snsDestination(Output.of(snsDestination));
        }

        public EventDestinationState build() {
            return $;
        }
    }

}