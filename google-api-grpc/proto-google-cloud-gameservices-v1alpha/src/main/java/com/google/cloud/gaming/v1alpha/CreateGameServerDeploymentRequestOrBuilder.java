// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

public interface CreateGameServerDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project_id}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project_id}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the game server deployment resource to be created.
   * </pre>
   *
   * <code>string deployment_id = 2;</code>
   */
  java.lang.String getDeploymentId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server deployment resource to be created.
   * </pre>
   *
   * <code>string deployment_id = 2;</code>
   */
  com.google.protobuf.ByteString getDeploymentIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The game server deployment resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 3;</code>
   */
  boolean hasGameServerDeployment();
  /**
   *
   *
   * <pre>
   * Required. The game server deployment resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 3;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerDeployment getGameServerDeployment();
  /**
   *
   *
   * <pre>
   * Required. The game server deployment resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 3;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder getGameServerDeploymentOrBuilder();
}
