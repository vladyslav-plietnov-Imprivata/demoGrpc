// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/timeofday.proto

package com.google.type;

public final class TimeOfDayProto {
  private TimeOfDayProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_TimeOfDay_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_TimeOfDay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033google/type/timeofday.proto\022\013google.ty" +
      "pe\"K\n\tTimeOfDay\022\r\n\005hours\030\001 \001(\005\022\017\n\007minute" +
      "s\030\002 \001(\005\022\017\n\007seconds\030\003 \001(\005\022\r\n\005nanos\030\004 \001(\005B" +
      "l\n\017com.google.typeB\016TimeOfDayProtoP\001Z>go" +
      "ogle.golang.org/genproto/googleapis/type" +
      "/timeofday;timeofday\370\001\001\242\002\003GTPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_type_TimeOfDay_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_TimeOfDay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_TimeOfDay_descriptor,
        new java.lang.String[] { "Hours", "Minutes", "Seconds", "Nanos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
