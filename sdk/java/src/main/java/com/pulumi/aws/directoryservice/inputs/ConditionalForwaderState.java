// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConditionalForwaderState extends com.pulumi.resources.ResourceArgs {

    public static final ConditionalForwaderState Empty = new ConditionalForwaderState();

    /**
     * ID of directory.
     * 
     */
    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    /**
     * @return ID of directory.
     * 
     */
    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    /**
     * A list of forwarder IP addresses.
     * 
     */
    @Import(name="dnsIps")
    private @Nullable Output<List<String>> dnsIps;

    /**
     * @return A list of forwarder IP addresses.
     * 
     */
    public Optional<Output<List<String>>> dnsIps() {
        return Optional.ofNullable(this.dnsIps);
    }

    /**
     * The fully qualified domain name of the remote domain for which forwarders will be used.
     * 
     */
    @Import(name="remoteDomainName")
    private @Nullable Output<String> remoteDomainName;

    /**
     * @return The fully qualified domain name of the remote domain for which forwarders will be used.
     * 
     */
    public Optional<Output<String>> remoteDomainName() {
        return Optional.ofNullable(this.remoteDomainName);
    }

    private ConditionalForwaderState() {}

    private ConditionalForwaderState(ConditionalForwaderState $) {
        this.directoryId = $.directoryId;
        this.dnsIps = $.dnsIps;
        this.remoteDomainName = $.remoteDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionalForwaderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionalForwaderState $;

        public Builder() {
            $ = new ConditionalForwaderState();
        }

        public Builder(ConditionalForwaderState defaults) {
            $ = new ConditionalForwaderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId ID of directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId ID of directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param dnsIps A list of forwarder IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(@Nullable Output<List<String>> dnsIps) {
            $.dnsIps = dnsIps;
            return this;
        }

        /**
         * @param dnsIps A list of forwarder IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(List<String> dnsIps) {
            return dnsIps(Output.of(dnsIps));
        }

        /**
         * @param dnsIps A list of forwarder IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(String... dnsIps) {
            return dnsIps(List.of(dnsIps));
        }

        /**
         * @param remoteDomainName The fully qualified domain name of the remote domain for which forwarders will be used.
         * 
         * @return builder
         * 
         */
        public Builder remoteDomainName(@Nullable Output<String> remoteDomainName) {
            $.remoteDomainName = remoteDomainName;
            return this;
        }

        /**
         * @param remoteDomainName The fully qualified domain name of the remote domain for which forwarders will be used.
         * 
         * @return builder
         * 
         */
        public Builder remoteDomainName(String remoteDomainName) {
            return remoteDomainName(Output.of(remoteDomainName));
        }

        public ConditionalForwaderState build() {
            return $;
        }
    }

}