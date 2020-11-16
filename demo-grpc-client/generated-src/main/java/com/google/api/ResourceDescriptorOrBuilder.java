// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

public interface ResourceDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource type. It must be in the format of
   * {service_name}/{resource_type_kind}. The `resource_type_kind` must be
   * singular and must not include version numbers.
   * Example: `storage.googleapis.com/Bucket`
   * The value of the resource_type_kind must follow the regular expression
   * /[A-Za-z][a-zA-Z0-9]+/. It should start with an upper case character and
   * should use PascalCase (UpperCamelCase). The maximum number of
   * characters allowed for the `resource_type_kind` is 100.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The resource type. It must be in the format of
   * {service_name}/{resource_type_kind}. The `resource_type_kind` must be
   * singular and must not include version numbers.
   * Example: `storage.googleapis.com/Bucket`
   * The value of the resource_type_kind must follow the regular expression
   * /[A-Za-z][a-zA-Z0-9]+/. It should start with an upper case character and
   * should use PascalCase (UpperCamelCase). The maximum number of
   * characters allowed for the `resource_type_kind` is 100.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Optional. The relative resource name pattern associated with this resource
   * type. The DNS prefix of the full resource name shouldn't be specified here.
   * The path pattern must follow the syntax, which aligns with HTTP binding
   * syntax:
   *     Template = Segment { "/" Segment } ;
   *     Segment = LITERAL | Variable ;
   *     Variable = "{" LITERAL "}" ;
   * Examples:
   *     - "projects/{project}/topics/{topic}"
   *     - "projects/{project}/knowledgeBases/{knowledge_base}"
   * The components in braces correspond to the IDs for each resource in the
   * hierarchy. It is expected that, if multiple patterns are provided,
   * the same component name (e.g. "project") refers to IDs of the same
   * type of resource.
   * </pre>
   *
   * <code>repeated string pattern = 2;</code>
   * @return A list containing the pattern.
   */
  java.util.List<java.lang.String>
      getPatternList();
  /**
   * <pre>
   * Optional. The relative resource name pattern associated with this resource
   * type. The DNS prefix of the full resource name shouldn't be specified here.
   * The path pattern must follow the syntax, which aligns with HTTP binding
   * syntax:
   *     Template = Segment { "/" Segment } ;
   *     Segment = LITERAL | Variable ;
   *     Variable = "{" LITERAL "}" ;
   * Examples:
   *     - "projects/{project}/topics/{topic}"
   *     - "projects/{project}/knowledgeBases/{knowledge_base}"
   * The components in braces correspond to the IDs for each resource in the
   * hierarchy. It is expected that, if multiple patterns are provided,
   * the same component name (e.g. "project") refers to IDs of the same
   * type of resource.
   * </pre>
   *
   * <code>repeated string pattern = 2;</code>
   * @return The count of pattern.
   */
  int getPatternCount();
  /**
   * <pre>
   * Optional. The relative resource name pattern associated with this resource
   * type. The DNS prefix of the full resource name shouldn't be specified here.
   * The path pattern must follow the syntax, which aligns with HTTP binding
   * syntax:
   *     Template = Segment { "/" Segment } ;
   *     Segment = LITERAL | Variable ;
   *     Variable = "{" LITERAL "}" ;
   * Examples:
   *     - "projects/{project}/topics/{topic}"
   *     - "projects/{project}/knowledgeBases/{knowledge_base}"
   * The components in braces correspond to the IDs for each resource in the
   * hierarchy. It is expected that, if multiple patterns are provided,
   * the same component name (e.g. "project") refers to IDs of the same
   * type of resource.
   * </pre>
   *
   * <code>repeated string pattern = 2;</code>
   * @param index The index of the element to return.
   * @return The pattern at the given index.
   */
  java.lang.String getPattern(int index);
  /**
   * <pre>
   * Optional. The relative resource name pattern associated with this resource
   * type. The DNS prefix of the full resource name shouldn't be specified here.
   * The path pattern must follow the syntax, which aligns with HTTP binding
   * syntax:
   *     Template = Segment { "/" Segment } ;
   *     Segment = LITERAL | Variable ;
   *     Variable = "{" LITERAL "}" ;
   * Examples:
   *     - "projects/{project}/topics/{topic}"
   *     - "projects/{project}/knowledgeBases/{knowledge_base}"
   * The components in braces correspond to the IDs for each resource in the
   * hierarchy. It is expected that, if multiple patterns are provided,
   * the same component name (e.g. "project") refers to IDs of the same
   * type of resource.
   * </pre>
   *
   * <code>repeated string pattern = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the pattern at the given index.
   */
  com.google.protobuf.ByteString
      getPatternBytes(int index);

  /**
   * <pre>
   * Optional. The field on the resource that designates the resource name
   * field. If omitted, this is assumed to be "name".
   * </pre>
   *
   * <code>string name_field = 3;</code>
   * @return The nameField.
   */
  java.lang.String getNameField();
  /**
   * <pre>
   * Optional. The field on the resource that designates the resource name
   * field. If omitted, this is assumed to be "name".
   * </pre>
   *
   * <code>string name_field = 3;</code>
   * @return The bytes for nameField.
   */
  com.google.protobuf.ByteString
      getNameFieldBytes();

  /**
   * <pre>
   * Optional. The historical or future-looking state of the resource pattern.
   * Example:
   *     // The InspectTemplate message originally only supported resource
   *     // names with organization, and project was added later.
   *     message InspectTemplate {
   *       option (google.api.resource) = {
   *         type: "dlp.googleapis.com/InspectTemplate"
   *         pattern:
   *         "organizations/{organization}/inspectTemplates/{inspect_template}"
   *         pattern: "projects/{project}/inspectTemplates/{inspect_template}"
   *         history: ORIGINALLY_SINGLE_PATTERN
   *       };
   *     }
   * </pre>
   *
   * <code>.google.api.ResourceDescriptor.History history = 4;</code>
   * @return The enum numeric value on the wire for history.
   */
  int getHistoryValue();
  /**
   * <pre>
   * Optional. The historical or future-looking state of the resource pattern.
   * Example:
   *     // The InspectTemplate message originally only supported resource
   *     // names with organization, and project was added later.
   *     message InspectTemplate {
   *       option (google.api.resource) = {
   *         type: "dlp.googleapis.com/InspectTemplate"
   *         pattern:
   *         "organizations/{organization}/inspectTemplates/{inspect_template}"
   *         pattern: "projects/{project}/inspectTemplates/{inspect_template}"
   *         history: ORIGINALLY_SINGLE_PATTERN
   *       };
   *     }
   * </pre>
   *
   * <code>.google.api.ResourceDescriptor.History history = 4;</code>
   * @return The history.
   */
  com.google.api.ResourceDescriptor.History getHistory();

  /**
   * <pre>
   * The plural name used in the resource name, such as 'projects' for
   * the name of 'projects/{project}'. It is the same concept of the `plural`
   * field in k8s CRD spec
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/
   * </pre>
   *
   * <code>string plural = 5;</code>
   * @return The plural.
   */
  java.lang.String getPlural();
  /**
   * <pre>
   * The plural name used in the resource name, such as 'projects' for
   * the name of 'projects/{project}'. It is the same concept of the `plural`
   * field in k8s CRD spec
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/
   * </pre>
   *
   * <code>string plural = 5;</code>
   * @return The bytes for plural.
   */
  com.google.protobuf.ByteString
      getPluralBytes();

  /**
   * <pre>
   * The same concept of the `singular` field in k8s CRD spec
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/
   * Such as "project" for the `resourcemanager.googleapis.com/Project` type.
   * </pre>
   *
   * <code>string singular = 6;</code>
   * @return The singular.
   */
  java.lang.String getSingular();
  /**
   * <pre>
   * The same concept of the `singular` field in k8s CRD spec
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/
   * Such as "project" for the `resourcemanager.googleapis.com/Project` type.
   * </pre>
   *
   * <code>string singular = 6;</code>
   * @return The bytes for singular.
   */
  com.google.protobuf.ByteString
      getSingularBytes();
}
