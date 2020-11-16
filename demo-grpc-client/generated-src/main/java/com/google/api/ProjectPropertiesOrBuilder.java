// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

public interface ProjectPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ProjectProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  java.util.List<com.google.api.Property> 
      getPropertiesList();
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  com.google.api.Property getProperties(int index);
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  java.util.List<? extends com.google.api.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  com.google.api.PropertyOrBuilder getPropertiesOrBuilder(
      int index);
}
