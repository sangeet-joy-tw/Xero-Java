/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.2.9
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TaskCreateOrUpdate */
public class TaskCreateOrUpdate {
  StringUtil util = new StringUtil();

  @JsonProperty("name")
  private String name;

  @JsonProperty("rate")
  private Amount rate;

  @JsonProperty("chargeType")
  private ChargeType chargeType;

  @JsonProperty("estimateMinutes")
  private Integer estimateMinutes;

  public TaskCreateOrUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task. Max length 100 characters. maximum: 100
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the task. Max length 100 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskCreateOrUpdate rate(Amount rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   *
   * @return rate
   */
  @ApiModelProperty(required = true, value = "")
  public Amount getRate() {
    return rate;
  }

  public void setRate(Amount rate) {
    this.rate = rate;
  }

  public TaskCreateOrUpdate chargeType(ChargeType chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * Get chargeType
   *
   * @return chargeType
   */
  @ApiModelProperty(required = true, value = "")
  public ChargeType getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeType chargeType) {
    this.chargeType = chargeType;
  }

  public TaskCreateOrUpdate estimateMinutes(Integer estimateMinutes) {
    this.estimateMinutes = estimateMinutes;
    return this;
  }

  /**
   * Estimated time to perform the task. EstimateMinutes has to be greater than 0 if provided.
   *
   * @return estimateMinutes
   */
  @ApiModelProperty(
      value =
          "Estimated time to perform the task. EstimateMinutes has to be greater than 0 if"
              + " provided.")
  public Integer getEstimateMinutes() {
    return estimateMinutes;
  }

  public void setEstimateMinutes(Integer estimateMinutes) {
    this.estimateMinutes = estimateMinutes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreateOrUpdate taskCreateOrUpdate = (TaskCreateOrUpdate) o;
    return Objects.equals(this.name, taskCreateOrUpdate.name)
        && Objects.equals(this.rate, taskCreateOrUpdate.rate)
        && Objects.equals(this.chargeType, taskCreateOrUpdate.chargeType)
        && Objects.equals(this.estimateMinutes, taskCreateOrUpdate.estimateMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rate, chargeType, estimateMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreateOrUpdate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    estimateMinutes: ").append(toIndentedString(estimateMinutes)).append("\n");
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
