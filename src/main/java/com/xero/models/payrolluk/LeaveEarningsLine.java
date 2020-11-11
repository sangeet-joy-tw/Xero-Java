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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** LeaveEarningsLine */
public class LeaveEarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;

  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("isLinkedToTimesheet")
  private Boolean isLinkedToTimesheet;

  public LeaveEarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero identifier for payroll leave earnings rate
   *
   * @return earningsRateID
   */
  @ApiModelProperty(value = "Xero identifier for payroll leave earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public LeaveEarningsLine ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * Rate per unit for leave earnings line
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(value = "Rate per unit for leave earnings line")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public LeaveEarningsLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Leave earnings number of units
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(value = "Leave earnings number of units")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeaveEarningsLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Leave earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed
   *
   * @return fixedAmount
   */
  @ApiModelProperty(
      value = "Leave earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public LeaveEarningsLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the earnings line.
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the earnings line.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LeaveEarningsLine isLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
    return this;
  }

  /**
   * Identifies if the leave earnings is taken from the timesheet. False for leave earnings line
   *
   * @return isLinkedToTimesheet
   */
  @ApiModelProperty(
      value =
          "Identifies if the leave earnings is taken from the timesheet. False for leave earnings"
              + " line")
  public Boolean getIsLinkedToTimesheet() {
    return isLinkedToTimesheet;
  }

  public void setIsLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveEarningsLine leaveEarningsLine = (LeaveEarningsLine) o;
    return Objects.equals(this.earningsRateID, leaveEarningsLine.earningsRateID)
        && Objects.equals(this.ratePerUnit, leaveEarningsLine.ratePerUnit)
        && Objects.equals(this.numberOfUnits, leaveEarningsLine.numberOfUnits)
        && Objects.equals(this.fixedAmount, leaveEarningsLine.fixedAmount)
        && Objects.equals(this.amount, leaveEarningsLine.amount)
        && Objects.equals(this.isLinkedToTimesheet, leaveEarningsLine.isLinkedToTimesheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        earningsRateID, ratePerUnit, numberOfUnits, fixedAmount, amount, isLinkedToTimesheet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveEarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isLinkedToTimesheet: ")
        .append(toIndentedString(isLinkedToTimesheet))
        .append("\n");
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
