/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** InvalidField */
public class InvalidField {
  StringUtil util = new StringUtil();

  @JsonProperty("name")
  private String name;

  @JsonProperty("reason")
  private String reason;
  /**
   * The name of the field that caused the error
   *
   * @param name String
   * @return InvalidField
   */
  public InvalidField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field that caused the error
   *
   * @return name
   */
  @ApiModelProperty(example = "DateOfBirth", value = "The name of the field that caused the error")
  /**
   * The name of the field that caused the error
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * The name of the field that caused the error
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The reason the error occurred
   *
   * @param reason String
   * @return InvalidField
   */
  public InvalidField reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason the error occurred
   *
   * @return reason
   */
  @ApiModelProperty(
      example = "The Date of Birth is required.",
      value = "The reason the error occurred")
  /**
   * The reason the error occurred
   *
   * @return reason String
   */
  public String getReason() {
    return reason;
  }

  /**
   * The reason the error occurred
   *
   * @param reason String
   */
  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidField invalidField = (InvalidField) o;
    return Objects.equals(this.name, invalidField.name)
        && Objects.equals(this.reason, invalidField.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
