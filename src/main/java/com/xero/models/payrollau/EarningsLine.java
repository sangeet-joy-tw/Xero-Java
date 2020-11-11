/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.4.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** EarningsLine */
public class EarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("EarningsRateID")
  private UUID earningsRateID;

  @JsonProperty("CalculationType")
  private EarningsRateCalculationType calculationType;

  @JsonProperty("AnnualSalary")
  private Double annualSalary;

  @JsonProperty("NumberOfUnitsPerWeek")
  private Double numberOfUnitsPerWeek;

  @JsonProperty("RatePerUnit")
  private Double ratePerUnit;

  @JsonProperty("NormalNumberOfUnits")
  private Double normalNumberOfUnits;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("FixedAmount")
  private Double fixedAmount;

  public EarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero unique id for earnings rate
   *
   * @return earningsRateID
   */
  @ApiModelProperty(
      example = "72e962d1-fcac-4083-8a71-742bb3e7ae14",
      required = true,
      value = "Xero unique id for earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public EarningsLine calculationType(EarningsRateCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Get calculationType
   *
   * @return calculationType
   */
  @ApiModelProperty(value = "")
  public EarningsRateCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(EarningsRateCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public EarningsLine annualSalary(Double annualSalary) {
    this.annualSalary = annualSalary;
    return this;
  }

  /**
   * Annual salary for earnings line
   *
   * @return annualSalary
   */
  @ApiModelProperty(example = "40000.0", value = "Annual salary for earnings line")
  public Double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(Double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public EarningsLine numberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
    this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
    return this;
  }

  /**
   * number of units for earning line
   *
   * @return numberOfUnitsPerWeek
   */
  @ApiModelProperty(example = "38.0", value = "number of units for earning line")
  public Double getNumberOfUnitsPerWeek() {
    return numberOfUnitsPerWeek;
  }

  public void setNumberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
    this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
  }

  public EarningsLine ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * Rate per unit of the EarningsLine.
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(example = "38.0", value = "Rate per unit of the EarningsLine.")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public EarningsLine normalNumberOfUnits(Double normalNumberOfUnits) {
    this.normalNumberOfUnits = normalNumberOfUnits;
    return this;
  }

  /**
   * Normal number of units for EarningsLine. Applicable when RateType is \&quot;MULTIPLE\&quot;
   *
   * @return normalNumberOfUnits
   */
  @ApiModelProperty(
      example = "38.0",
      value = "Normal number of units for EarningsLine. Applicable when RateType is \"MULTIPLE\"")
  public Double getNormalNumberOfUnits() {
    return normalNumberOfUnits;
  }

  public void setNormalNumberOfUnits(Double normalNumberOfUnits) {
    this.normalNumberOfUnits = normalNumberOfUnits;
  }

  public EarningsLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Earnings rate amount
   *
   * @return amount
   */
  @ApiModelProperty(example = "38.0", value = "Earnings rate amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public EarningsLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Earnings rate number of units.
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(example = "2.5", value = "Earnings rate number of units.")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public EarningsLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Earnings rate amount. Only applicable if the EarningsRate RateType is Fixed
   *
   * @return fixedAmount
   */
  @ApiModelProperty(
      example = "2.5",
      value = "Earnings rate amount. Only applicable if the EarningsRate RateType is Fixed")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsLine earningsLine = (EarningsLine) o;
    return Objects.equals(this.earningsRateID, earningsLine.earningsRateID)
        && Objects.equals(this.calculationType, earningsLine.calculationType)
        && Objects.equals(this.annualSalary, earningsLine.annualSalary)
        && Objects.equals(this.numberOfUnitsPerWeek, earningsLine.numberOfUnitsPerWeek)
        && Objects.equals(this.ratePerUnit, earningsLine.ratePerUnit)
        && Objects.equals(this.normalNumberOfUnits, earningsLine.normalNumberOfUnits)
        && Objects.equals(this.amount, earningsLine.amount)
        && Objects.equals(this.numberOfUnits, earningsLine.numberOfUnits)
        && Objects.equals(this.fixedAmount, earningsLine.fixedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        earningsRateID,
        calculationType,
        annualSalary,
        numberOfUnitsPerWeek,
        ratePerUnit,
        normalNumberOfUnits,
        amount,
        numberOfUnits,
        fixedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    numberOfUnitsPerWeek: ")
        .append(toIndentedString(numberOfUnitsPerWeek))
        .append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    normalNumberOfUnits: ")
        .append(toIndentedString(normalNumberOfUnits))
        .append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
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
