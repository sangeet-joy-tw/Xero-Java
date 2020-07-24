/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.9
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

/** CreditNotes */
public class CreditNotes {
  StringUtil util = new StringUtil();

  @JsonProperty("CreditNotes")
  private List<CreditNote> creditNotes = new ArrayList<CreditNote>();

  public CreditNotes creditNotes(List<CreditNote> creditNotes) {
    this.creditNotes = creditNotes;
    return this;
  }

  public CreditNotes addCreditNotesItem(CreditNote creditNotesItem) {
    if (this.creditNotes == null) {
      this.creditNotes = new ArrayList<CreditNote>();
    }
    this.creditNotes.add(creditNotesItem);
    return this;
  }

  /**
   * Get creditNotes
   *
   * @return creditNotes
   */
  @ApiModelProperty(value = "")
  public List<CreditNote> getCreditNotes() {
    return creditNotes;
  }

  public void setCreditNotes(List<CreditNote> creditNotes) {
    this.creditNotes = creditNotes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNotes creditNotes = (CreditNotes) o;
    return Objects.equals(this.creditNotes, creditNotes.creditNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNotes {\n");
    sb.append("    creditNotes: ").append(toIndentedString(creditNotes)).append("\n");
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
