/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class SetIamPolicySubnetworkHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final RegionSetPolicyRequest regionSetPolicyRequestResource;
  private final String resource;
  private final String userIp;

  private SetIamPolicySubnetworkHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.regionSetPolicyRequestResource = null;
    this.resource = null;
    this.userIp = null;
  }

  private SetIamPolicySubnetworkHttpRequest(
      String access_token,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      RegionSetPolicyRequest regionSetPolicyRequestResource,
      String resource,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.regionSetPolicyRequestResource = regionSetPolicyRequestResource;
    this.resource = resource;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return access_token;
    }
    if (fieldName.equals("callback")) {
      return callback;
    }
    if (fieldName.equals("fields")) {
      return fields;
    }
    if (fieldName.equals("key")) {
      return key;
    }
    if (fieldName.equals("prettyPrint")) {
      return prettyPrint;
    }
    if (fieldName.equals("quotaUser")) {
      return quotaUser;
    }
    if (fieldName.equals("regionSetPolicyRequestResource")) {
      return regionSetPolicyRequestResource;
    }
    if (fieldName.equals("resource")) {
      return resource;
    }
    if (fieldName.equals("userIp")) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public RegionSetPolicyRequest getApiMessageRequestBody() {
    return regionSetPolicyRequestResource;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getCallback() {
    return callback;
  }

  public String getFields() {
    return fields;
  }

  public String getKey() {
    return key;
  }

  public String getPrettyPrint() {
    return prettyPrint;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public RegionSetPolicyRequest getRegionSetPolicyRequestResource() {
    return regionSetPolicyRequestResource;
  }

  public String getResource() {
    return resource;
  }

  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SetIamPolicySubnetworkHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SetIamPolicySubnetworkHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SetIamPolicySubnetworkHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SetIamPolicySubnetworkHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private RegionSetPolicyRequest regionSetPolicyRequestResource;
    private String resource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(SetIamPolicySubnetworkHttpRequest other) {
      if (other == SetIamPolicySubnetworkHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRegionSetPolicyRequestResource() != null) {
        this.regionSetPolicyRequestResource = other.regionSetPolicyRequestResource;
      }
      if (other.getResource() != null) {
        this.resource = other.resource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(SetIamPolicySubnetworkHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.regionSetPolicyRequestResource = source.regionSetPolicyRequestResource;
      this.resource = source.resource;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public String getKey() {
      return key;
    }

    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    public String getPrettyPrint() {
      return prettyPrint;
    }

    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    public String getQuotaUser() {
      return quotaUser;
    }

    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    public RegionSetPolicyRequest getRegionSetPolicyRequestResource() {
      return regionSetPolicyRequestResource;
    }

    public Builder setRegionSetPolicyRequestResource(
        RegionSetPolicyRequest regionSetPolicyRequestResource) {
      this.regionSetPolicyRequestResource = regionSetPolicyRequestResource;
      return this;
    }

    public String getResource() {
      return resource;
    }

    public Builder setResource(String resource) {
      this.resource = resource;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public SetIamPolicySubnetworkHttpRequest build() {
      String missing = "";

      if (resource == null) {
        missing += " resource";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new SetIamPolicySubnetworkHttpRequest(
          access_token,
          callback,
          fields,
          key,
          prettyPrint,
          quotaUser,
          regionSetPolicyRequestResource,
          resource,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRegionSetPolicyRequestResource(this.regionSetPolicyRequestResource);
      newBuilder.setResource(this.resource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SetIamPolicySubnetworkHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "regionSetPolicyRequestResource="
        + regionSetPolicyRequestResource
        + ", "
        + "resource="
        + resource
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SetIamPolicySubnetworkHttpRequest) {
      SetIamPolicySubnetworkHttpRequest that = (SetIamPolicySubnetworkHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(
              this.regionSetPolicyRequestResource, that.getRegionSetPolicyRequestResource())
          && Objects.equals(this.resource, that.getResource())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fields,
        key,
        prettyPrint,
        quotaUser,
        regionSetPolicyRequestResource,
        resource,
        userIp);
  }
}
