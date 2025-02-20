/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Produce data to AWS Kinesis Firehose streams.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KinesisFirehose2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface KinesisFirehose2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKinesisFirehose2EndpointBuilder advanced() {
            return (AdvancedKinesisFirehose2EndpointBuilder) this;
        }
        /**
         * This option will set the CBOR_ENABLED property during the execution.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param cborEnabled the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder cborEnabled(boolean cborEnabled) {
            doSetProperty("cborEnabled", cborEnabled);
            return this;
        }
        /**
         * This option will set the CBOR_ENABLED property during the execution.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param cborEnabled the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder cborEnabled(String cborEnabled) {
            doSetProperty("cborEnabled", cborEnabled);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder overrideEndpoint(
                String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * The operation to do in case the user don't want to send only a
         * record.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder operation(
                org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to do in case the user don't want to send only a
         * record.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The region in which Kinesis Firehose client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis Firehose
         * client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis Firehose
         * client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder proxyProtocol(
                String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Amazon AWS Session Token used when the user needs to assume a IAM
         * role.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sessionToken the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder sessionToken(String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to use Session
         * Credentials. This is useful in situation in which the user needs to
         * assume a IAM role for doing operations in Kinesis Firehose.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useSessionCredentials(
                boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to use Session
         * Credentials. This is useful in situation in which the user needs to
         * assume a IAM role for doing operations in Kinesis Firehose.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder useSessionCredentials(
                String useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface AdvancedKinesisFirehose2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default KinesisFirehose2EndpointBuilder basic() {
            return (KinesisFirehose2EndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKinesisFirehose2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKinesisFirehose2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.firehose.FirehoseClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonKinesisFirehoseClient the value to set
         * @return the dsl builder
         */
        default AdvancedKinesisFirehose2EndpointBuilder amazonKinesisFirehoseClient(
                software.amazon.awssdk.services.firehose.FirehoseClient amazonKinesisFirehoseClient) {
            doSetProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.firehose.FirehoseClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonKinesisFirehoseClient the value to set
         * @return the dsl builder
         */
        default AdvancedKinesisFirehose2EndpointBuilder amazonKinesisFirehoseClient(
                String amazonKinesisFirehoseClient) {
            doSetProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
    }

    public interface KinesisFirehose2Builders {
        /**
         * AWS Kinesis Firehose (camel-aws2-kinesis)
         * Produce data to AWS Kinesis Firehose streams.
         * 
         * Category: cloud,messaging
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-kinesis
         * 
         * @return the dsl builder for the headers' name.
         */
        default KinesisFirehose2HeaderNameBuilder aws2KinesisFirehose() {
            return KinesisFirehose2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Kinesis Firehose (camel-aws2-kinesis)
         * Produce data to AWS Kinesis Firehose streams.
         * 
         * Category: cloud,messaging
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-kinesis
         * 
         * Syntax: <code>aws2-kinesis-firehose:streamName</code>
         * 
         * Path parameter: streamName (required)
         * Name of the stream
         * 
         * @param path streamName
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder aws2KinesisFirehose(String path) {
            return KinesisFirehose2EndpointBuilderFactory.endpointBuilder("aws2-kinesis-firehose", path);
        }
        /**
         * AWS Kinesis Firehose (camel-aws2-kinesis)
         * Produce data to AWS Kinesis Firehose streams.
         * 
         * Category: cloud,messaging
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-kinesis
         * 
         * Syntax: <code>aws2-kinesis-firehose:streamName</code>
         * 
         * Path parameter: streamName (required)
         * Name of the stream
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path streamName
         * @return the dsl builder
         */
        default KinesisFirehose2EndpointBuilder aws2KinesisFirehose(
                String componentName,
                String path) {
            return KinesisFirehose2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS Kinesis Firehose component.
     */
    public static class KinesisFirehose2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final KinesisFirehose2HeaderNameBuilder INSTANCE = new KinesisFirehose2HeaderNameBuilder();

        /**
         * The record ID, as defined in
         * http://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecord.html#API_PutRecord_ResponseSyntaxResponse Syntax.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsKinesisFirehoseRecordId}.
         */
        public String awsKinesisFirehoseRecordId() {
            return "CamelAwsKinesisFirehoseRecordId";
        }

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsKinesisFirehoseOperation}.
         */
        public String awsKinesisFirehoseOperation() {
            return "CamelAwsKinesisFirehoseOperation";
        }

        /**
         * The name of the delivery stream.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsKinesisFirehoseDeliveryStreamName}.
         */
        public String awsKinesisFirehoseDeliveryStreamName() {
            return "CamelAwsKinesisFirehoseDeliveryStreamName";
        }
    }
    static KinesisFirehose2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KinesisFirehose2EndpointBuilderImpl extends AbstractEndpointBuilder implements KinesisFirehose2EndpointBuilder, AdvancedKinesisFirehose2EndpointBuilder {
            public KinesisFirehose2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KinesisFirehose2EndpointBuilderImpl(path);
    }
}