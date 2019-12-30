/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/build.proto

package io.grafeas.v1;

public final class Build {
  private Build() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_BuildNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_BuildNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_BuildOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_BuildOccurrence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\026grafeas/v1/build.proto\022\ngrafeas.v1\032\033gr"
          + "afeas/v1/provenance.proto\"$\n\tBuildNote\022\027"
          + "\n\017builder_version\030\001 \001(\t\"\\\n\017BuildOccurren"
          + "ce\022/\n\nprovenance\030\001 \001(\0132\033.grafeas.v1.Buil"
          + "dProvenance\022\030\n\020provenance_bytes\030\002 \001(\tBQ\n"
          + "\rio.grafeas.v1P\001Z8google.golang.org/genp"
          + "roto/googleapis/grafeas/v1;grafeas\242\002\003GRA"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              io.grafeas.v1.Provenance.getDescriptor(),
            });
    internal_static_grafeas_v1_BuildNote_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_BuildNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_BuildNote_descriptor,
            new java.lang.String[] {
              "BuilderVersion",
            });
    internal_static_grafeas_v1_BuildOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_BuildOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_BuildOccurrence_descriptor,
            new java.lang.String[] {
              "Provenance", "ProvenanceBytes",
            });
    io.grafeas.v1.Provenance.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
