// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitoring.proto

package com.google.api;

public interface MonitoringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Monitoring)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  java.util.List<com.google.api.Monitoring.MonitoringDestination> 
      getProducerDestinationsList();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  com.google.api.Monitoring.MonitoringDestination getProducerDestinations(int index);
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  int getProducerDestinationsCount();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  java.util.List<? extends com.google.api.Monitoring.MonitoringDestinationOrBuilder> 
      getProducerDestinationsOrBuilderList();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the producer project.
   * There can be multiple producer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination producer_destinations = 1;</code>
   */
  com.google.api.Monitoring.MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(
      int index);

  /**
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  java.util.List<com.google.api.Monitoring.MonitoringDestination> 
      getConsumerDestinationsList();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  com.google.api.Monitoring.MonitoringDestination getConsumerDestinations(int index);
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  int getConsumerDestinationsCount();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  java.util.List<? extends com.google.api.Monitoring.MonitoringDestinationOrBuilder> 
      getConsumerDestinationsOrBuilderList();
  /**
   * <pre>
   * Monitoring configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations. A monitored resouce type may
   * appear in multiple monitoring destinations if different aggregations are
   * needed for different sets of metrics associated with that monitored
   * resource type. A monitored resource and metric pair may only be used once
   * in the Monitoring configuration.
   * </pre>
   *
   * <code>repeated .google.api.Monitoring.MonitoringDestination consumer_destinations = 2;</code>
   */
  com.google.api.Monitoring.MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(
      int index);
}
