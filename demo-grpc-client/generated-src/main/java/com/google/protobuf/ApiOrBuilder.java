// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package com.google.protobuf;

public interface ApiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fully qualified name of this interface, including package name
   * followed by the interface's simple name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The fully qualified name of this interface, including package name
   * followed by the interface's simple name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The methods of this interface, in unspecified order.
   * </pre>
   *
   * <code>repeated .google.protobuf.Method methods = 2;</code>
   */
  java.util.List<com.google.protobuf.Method> 
      getMethodsList();
  /**
   * <pre>
   * The methods of this interface, in unspecified order.
   * </pre>
   *
   * <code>repeated .google.protobuf.Method methods = 2;</code>
   */
  com.google.protobuf.Method getMethods(int index);
  /**
   * <pre>
   * The methods of this interface, in unspecified order.
   * </pre>
   *
   * <code>repeated .google.protobuf.Method methods = 2;</code>
   */
  int getMethodsCount();
  /**
   * <pre>
   * The methods of this interface, in unspecified order.
   * </pre>
   *
   * <code>repeated .google.protobuf.Method methods = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.MethodOrBuilder> 
      getMethodsOrBuilderList();
  /**
   * <pre>
   * The methods of this interface, in unspecified order.
   * </pre>
   *
   * <code>repeated .google.protobuf.Method methods = 2;</code>
   */
  com.google.protobuf.MethodOrBuilder getMethodsOrBuilder(
      int index);

  /**
   * <pre>
   * Any metadata attached to the interface.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * Any metadata attached to the interface.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * Any metadata attached to the interface.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Any metadata attached to the interface.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * Any metadata attached to the interface.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * A version string for this interface. If specified, must have the form
   * `major-version.minor-version`, as in `1.10`. If the minor version is
   * omitted, it defaults to zero. If the entire version field is empty, the
   * major version is derived from the package name, as outlined below. If the
   * field is not empty, the version in the package name will be verified to be
   * consistent with what is provided here.
   * The versioning schema uses [semantic
   * versioning](http://semver.org) where the major version number
   * indicates a breaking change and the minor version an additive,
   * non-breaking change. Both version numbers are signals to users
   * what to expect from different versions, and should be carefully
   * chosen based on the product plan.
   * The major version is also reflected in the package name of the
   * interface, which must end in `v&lt;major-version&gt;`, as in
   * `google.feature.v1`. For major versions 0 and 1, the suffix can
   * be omitted. Zero major versions must only be used for
   * experimental, non-GA interfaces.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * A version string for this interface. If specified, must have the form
   * `major-version.minor-version`, as in `1.10`. If the minor version is
   * omitted, it defaults to zero. If the entire version field is empty, the
   * major version is derived from the package name, as outlined below. If the
   * field is not empty, the version in the package name will be verified to be
   * consistent with what is provided here.
   * The versioning schema uses [semantic
   * versioning](http://semver.org) where the major version number
   * indicates a breaking change and the minor version an additive,
   * non-breaking change. Both version numbers are signals to users
   * what to expect from different versions, and should be carefully
   * chosen based on the product plan.
   * The major version is also reflected in the package name of the
   * interface, which must end in `v&lt;major-version&gt;`, as in
   * `google.feature.v1`. For major versions 0 and 1, the suffix can
   * be omitted. Zero major versions must only be used for
   * experimental, non-GA interfaces.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Source context for the protocol buffer service represented by this
   * message.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   * @return Whether the sourceContext field is set.
   */
  boolean hasSourceContext();
  /**
   * <pre>
   * Source context for the protocol buffer service represented by this
   * message.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   * @return The sourceContext.
   */
  com.google.protobuf.SourceContext getSourceContext();
  /**
   * <pre>
   * Source context for the protocol buffer service represented by this
   * message.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   */
  com.google.protobuf.SourceContextOrBuilder getSourceContextOrBuilder();

  /**
   * <pre>
   * Included interfaces. See [Mixin][].
   * </pre>
   *
   * <code>repeated .google.protobuf.Mixin mixins = 6;</code>
   */
  java.util.List<com.google.protobuf.Mixin> 
      getMixinsList();
  /**
   * <pre>
   * Included interfaces. See [Mixin][].
   * </pre>
   *
   * <code>repeated .google.protobuf.Mixin mixins = 6;</code>
   */
  com.google.protobuf.Mixin getMixins(int index);
  /**
   * <pre>
   * Included interfaces. See [Mixin][].
   * </pre>
   *
   * <code>repeated .google.protobuf.Mixin mixins = 6;</code>
   */
  int getMixinsCount();
  /**
   * <pre>
   * Included interfaces. See [Mixin][].
   * </pre>
   *
   * <code>repeated .google.protobuf.Mixin mixins = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.MixinOrBuilder> 
      getMixinsOrBuilderList();
  /**
   * <pre>
   * Included interfaces. See [Mixin][].
   * </pre>
   *
   * <code>repeated .google.protobuf.Mixin mixins = 6;</code>
   */
  com.google.protobuf.MixinOrBuilder getMixinsOrBuilder(
      int index);

  /**
   * <pre>
   * The source syntax of the service.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 7;</code>
   * @return The enum numeric value on the wire for syntax.
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax of the service.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 7;</code>
   * @return The syntax.
   */
  com.google.protobuf.Syntax getSyntax();
}
