/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BankTransactions */
public class BankTransactions {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("BankTransactions")
  private List<BankTransaction> bankTransactions = new ArrayList<BankTransaction>();
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return BankTransactions
   */
  public BankTransactions pagination(Pagination pagination) {
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
   * bankTransactions
   *
   * @param bankTransactions List&lt;BankTransaction&gt;
   * @return BankTransactions
   */
  public BankTransactions bankTransactions(List<BankTransaction> bankTransactions) {
    this.bankTransactions = bankTransactions;
    return this;
  }

  /**
   * bankTransactions
   *
   * @param bankTransactionsItem BankTransaction
   * @return BankTransactions
   */
  public BankTransactions addBankTransactionsItem(BankTransaction bankTransactionsItem) {
    if (this.bankTransactions == null) {
      this.bankTransactions = new ArrayList<BankTransaction>();
    }
    this.bankTransactions.add(bankTransactionsItem);
    return this;
  }

  /**
   * Get bankTransactions
   *
   * @return bankTransactions
   */
  @ApiModelProperty(value = "")
  /**
   * bankTransactions
   *
   * @return bankTransactions List<BankTransaction>
   */
  public List<BankTransaction> getBankTransactions() {
    return bankTransactions;
  }

  /**
   * bankTransactions
   *
   * @param bankTransactions List&lt;BankTransaction&gt;
   */
  public void setBankTransactions(List<BankTransaction> bankTransactions) {
    this.bankTransactions = bankTransactions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransactions bankTransactions = (BankTransactions) o;
    return Objects.equals(this.pagination, bankTransactions.pagination)
        && Objects.equals(this.bankTransactions, bankTransactions.bankTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, bankTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransactions {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    bankTransactions: ").append(toIndentedString(bankTransactions)).append("\n");
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
