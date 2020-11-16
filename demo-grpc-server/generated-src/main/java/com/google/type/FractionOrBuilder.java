// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/fraction.proto

package com.google.type;

public interface FractionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.Fraction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The portion of the denominator in the faction, e.g. 2 in 2/3.
   * </pre>
   *
   * <code>int64 numerator = 1;</code>
   * @return The numerator.
   */
  long getNumerator();

  /**
   * <pre>
   * The value by which the numerator is divided, e.g. 3 in 2/3. Must be
   * positive.
   * </pre>
   *
   * <code>int64 denominator = 2;</code>
   * @return The denominator.
   */
  long getDenominator();
}
