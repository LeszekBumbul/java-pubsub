// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface SubscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
   * start with a letter, and contain only letters (`[A-Za-z]`), numbers
   * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
   * plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
   * in length, and it must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
   * start with a letter, and contain only letters (`[A-Za-z]`), numbers
   * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
   * plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
   * in length, and it must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * The value of this field will be `_deleted-topic_` if the topic has been
   * deleted.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * The value of this field will be `_deleted-topic_` if the topic has been
   * deleted.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  boolean hasPushConfig();
  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  com.google.pubsub.v1.PushConfig getPushConfig();
  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * This value is the maximum time after a subscriber receives a message
   * before the subscriber should acknowledge the message. After message
   * delivery but before the ack deadline expires and before the message is
   * acknowledged, it is an outstanding message and will not be delivered
   * again during that time (on a best-effort basis).
   * For pull subscriptions, this value is used as the initial value for the ack
   * deadline. To override this value for a given message, call
   * `ModifyAckDeadline` with the corresponding `ack_id` if using
   * non-streaming pull or send the `ack_id` in a
   * `StreamingModifyAckDeadlineRequest` if using streaming pull.
   * The minimum custom deadline you can specify is 10 seconds.
   * The maximum custom deadline you can specify is 600 seconds (10 minutes).
   * If this parameter is 0, a default value of 10 seconds is used.
   * For push delivery, this value is also used to set the request timeout for
   * the call to the push endpoint.
   * If the subscriber never acknowledges the message, the Pub/Sub
   * system will eventually redeliver the message.
   * </pre>
   *
   * <code>int32 ack_deadline_seconds = 5;</code>
   */
  int getAckDeadlineSeconds();

  /**
   *
   *
   * <pre>
   * Indicates whether to retain acknowledged messages. If true, then
   * messages are not expunged from the subscription's backlog, even if they are
   * acknowledged, until they fall out of the `message_retention_duration`
   * window.&lt;br&gt;&lt;br&gt;
   * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>bool retain_acked_messages = 7;</code>
   */
  boolean getRetainAckedMessages();

  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.&lt;br&gt;&lt;br&gt;
   * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  boolean hasMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.&lt;br&gt;&lt;br&gt;
   * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  com.google.protobuf.Duration getMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.&lt;br&gt;&lt;br&gt;
   * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getMessageRetentionDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * &lt;b&gt;BETA:&lt;/b&gt; This feature is part of a beta release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  boolean hasExpirationPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * &lt;b&gt;BETA:&lt;/b&gt; This feature is part of a beta release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  com.google.pubsub.v1.ExpirationPolicy getExpirationPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * &lt;b&gt;BETA:&lt;/b&gt; This feature is part of a beta release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  com.google.pubsub.v1.ExpirationPolicyOrBuilder getExpirationPolicyOrBuilder();
}
