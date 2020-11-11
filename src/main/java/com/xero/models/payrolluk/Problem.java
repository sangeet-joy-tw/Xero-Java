/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.4.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object returned for a bad request */
@ApiModel(description = "The object returned for a bad request")
public class Problem {
  StringUtil util = new StringUtil();

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("status")
  private String status;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("instance")
  private String instance;

  @JsonProperty("invalidFields")
  private List<InvalidField> invalidFields = new ArrayList<InvalidField>();

  public Problem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error format
   *
   * @return type
   */
  @ApiModelProperty(example = "application/problem+json", value = "The type of error format")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Problem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The type of the error
   *
   * @return title
   */
  @ApiModelProperty(example = "BadRequest", value = "The type of the error")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Problem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The error status code
   *
   * @return status
   */
  @ApiModelProperty(example = "400", value = "The error status code")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Problem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A description of the error
   *
   * @return detail
   */
  @ApiModelProperty(example = "Validation error occurred.", value = "A description of the error")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Problem instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   *
   * @return instance
   */
  @ApiModelProperty(value = "")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public Problem invalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public Problem addInvalidFieldsItem(InvalidField invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<InvalidField>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

  /**
   * Get invalidFields
   *
   * @return invalidFields
   */
  @ApiModelProperty(value = "")
  public List<InvalidField> getInvalidFields() {
    return invalidFields;
  }

  public void setInvalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type)
        && Objects.equals(this.title, problem.title)
        && Objects.equals(this.status, problem.status)
        && Objects.equals(this.detail, problem.detail)
        && Objects.equals(this.instance, problem.instance)
        && Objects.equals(this.invalidFields, problem.invalidFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, invalidFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
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
