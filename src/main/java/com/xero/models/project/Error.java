/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.project;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Error
 */

public class Error {
  @JsonProperty("message")
  private String message;

  @JsonProperty("modelState")
  private Object modelState = null;

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Exception message
   * @return message
  **/
  @ApiModelProperty(value = "Exception message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error modelState(Object modelState) {
    this.modelState = modelState;
    return this;
  }

   /**
   * Array of Elements of validation Errors
   * @return modelState
  **/
  @ApiModelProperty(value = "Array of Elements of validation Errors")
  public Object getModelState() {
    return modelState;
  }

  public void setModelState(Object modelState) {
    this.modelState = modelState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.message, error.message) &&
        Objects.equals(this.modelState, error.modelState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, modelState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modelState: ").append(toIndentedString(modelState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

