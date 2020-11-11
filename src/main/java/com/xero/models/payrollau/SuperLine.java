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

/** SuperLine */
public class SuperLine {
  StringUtil util = new StringUtil();

  @JsonProperty("SuperMembershipID")
  private UUID superMembershipID;

  @JsonProperty("ContributionType")
  private SuperannuationContributionType contributionType;

  @JsonProperty("CalculationType")
  private SuperannuationCalculationType calculationType;

  @JsonProperty("MinimumMonthlyEarnings")
  private Double minimumMonthlyEarnings;

  @JsonProperty("ExpenseAccountCode")
  private String expenseAccountCode;

  @JsonProperty("LiabilityAccountCode")
  private String liabilityAccountCode;

  @JsonProperty("Percentage")
  private Double percentage;

  @JsonProperty("Amount")
  private Double amount;

  public SuperLine superMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
    return this;
  }

  /**
   * Xero super membership ID
   *
   * @return superMembershipID
   */
  @ApiModelProperty(
      example = "4333d5cd-53a5-4c31-98e5-a8b4e5676b0b",
      value = "Xero super membership ID")
  public UUID getSuperMembershipID() {
    return superMembershipID;
  }

  public void setSuperMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
  }

  public SuperLine contributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
    return this;
  }

  /**
   * Get contributionType
   *
   * @return contributionType
   */
  @ApiModelProperty(value = "")
  public SuperannuationContributionType getContributionType() {
    return contributionType;
  }

  public void setContributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
  }

  public SuperLine calculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Get calculationType
   *
   * @return calculationType
   */
  @ApiModelProperty(value = "")
  public SuperannuationCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public SuperLine minimumMonthlyEarnings(Double minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
    return this;
  }

  /**
   * amount of mimimum earnings
   *
   * @return minimumMonthlyEarnings
   */
  @ApiModelProperty(example = "450.0", value = "amount of mimimum earnings")
  public Double getMinimumMonthlyEarnings() {
    return minimumMonthlyEarnings;
  }

  public void setMinimumMonthlyEarnings(Double minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
  }

  public SuperLine expenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
    return this;
  }

  /**
   * expense account code
   *
   * @return expenseAccountCode
   */
  @ApiModelProperty(example = "478", value = "expense account code")
  public String getExpenseAccountCode() {
    return expenseAccountCode;
  }

  public void setExpenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
  }

  public SuperLine liabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
    return this;
  }

  /**
   * liabilty account code
   *
   * @return liabilityAccountCode
   */
  @ApiModelProperty(example = "826", value = "liabilty account code")
  public String getLiabilityAccountCode() {
    return liabilityAccountCode;
  }

  public void setLiabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
  }

  public SuperLine percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * percentage for super line
   *
   * @return percentage
   */
  @ApiModelProperty(example = "9.0", value = "percentage for super line")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public SuperLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Super membership amount
   *
   * @return amount
   */
  @ApiModelProperty(example = "10.0", value = "Super membership amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperLine superLine = (SuperLine) o;
    return Objects.equals(this.superMembershipID, superLine.superMembershipID)
        && Objects.equals(this.contributionType, superLine.contributionType)
        && Objects.equals(this.calculationType, superLine.calculationType)
        && Objects.equals(this.minimumMonthlyEarnings, superLine.minimumMonthlyEarnings)
        && Objects.equals(this.expenseAccountCode, superLine.expenseAccountCode)
        && Objects.equals(this.liabilityAccountCode, superLine.liabilityAccountCode)
        && Objects.equals(this.percentage, superLine.percentage)
        && Objects.equals(this.amount, superLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        superMembershipID,
        contributionType,
        calculationType,
        minimumMonthlyEarnings,
        expenseAccountCode,
        liabilityAccountCode,
        percentage,
        amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperLine {\n");
    sb.append("    superMembershipID: ").append(toIndentedString(superMembershipID)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    minimumMonthlyEarnings: ")
        .append(toIndentedString(minimumMonthlyEarnings))
        .append("\n");
    sb.append("    expenseAccountCode: ").append(toIndentedString(expenseAccountCode)).append("\n");
    sb.append("    liabilityAccountCode: ")
        .append(toIndentedString(liabilityAccountCode))
        .append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
