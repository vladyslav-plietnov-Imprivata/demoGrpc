// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

public interface AuthenticationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.AuthenticationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The email address of the authenticated user making the request.
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   * @return The principalEmail.
   */
  java.lang.String getPrincipalEmail();
  /**
   * <pre>
   * The email address of the authenticated user making the request.
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   * @return The bytes for principalEmail.
   */
  com.google.protobuf.ByteString
      getPrincipalEmailBytes();
}
