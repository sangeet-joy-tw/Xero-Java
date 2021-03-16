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

/** PaySlipObject */
public class PaySlipObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("paySlip")
  private PaySlip paySlip;
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return PaySlipObject
   */
  public PaySlipObject pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  /**
   * pagination
   *
   * @return pagination Pagination
   */
  public Pagination getPagination() {
    return pagination;
  }

  /**
   * pagination
   *
   * @param pagination Pagination
   */
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   * problem
   *
   * @param problem Problem
   * @return PaySlipObject
   */
  public PaySlipObject problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  /**
   * problem
   *
   * @return problem Problem
   */
  public Problem getProblem() {
    return problem;
  }

  /**
   * problem
   *
   * @param problem Problem
   */
  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  /**
   * paySlip
   *
   * @param paySlip PaySlip
   * @return PaySlipObject
   */
  public PaySlipObject paySlip(PaySlip paySlip) {
    this.paySlip = paySlip;
    return this;
  }

  /**
   * Get paySlip
   *
   * @return paySlip
   */
  @ApiModelProperty(value = "")
  /**
   * paySlip
   *
   * @return paySlip PaySlip
   */
  public PaySlip getPaySlip() {
    return paySlip;
  }

  /**
   * paySlip
   *
   * @param paySlip PaySlip
   */
  public void setPaySlip(PaySlip paySlip) {
    this.paySlip = paySlip;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaySlipObject paySlipObject = (PaySlipObject) o;
    return Objects.equals(this.pagination, paySlipObject.pagination)
        && Objects.equals(this.problem, paySlipObject.problem)
        && Objects.equals(this.paySlip, paySlipObject.paySlip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, paySlip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaySlipObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    paySlip: ").append(toIndentedString(paySlip)).append("\n");
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
