/*
 * Xero Finance API
 * The Finance API is a collection of endpoints which customers can use in the course of a loan application, which may assist lenders to gain the confidence they need to provide capital.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** PrepaymentResponse */
public class PrepaymentResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("prepaymentId")
  private UUID prepaymentId;

  @JsonProperty("contact")
  private ContactResponse contact;

  @JsonProperty("total")
  private Double total;

  @JsonProperty("lineItems")
  private List<LineItemResponse> lineItems = new ArrayList<LineItemResponse>();
  /**
   * Xero Identifier of prepayment
   *
   * @param prepaymentId UUID
   * @return PrepaymentResponse
   */
  public PrepaymentResponse prepaymentId(UUID prepaymentId) {
    this.prepaymentId = prepaymentId;
    return this;
  }

  /**
   * Xero Identifier of prepayment
   *
   * @return prepaymentId
   */
  @ApiModelProperty(value = "Xero Identifier of prepayment")
  /**
   * Xero Identifier of prepayment
   *
   * @return prepaymentId UUID
   */
  public UUID getPrepaymentId() {
    return prepaymentId;
  }

  /**
   * Xero Identifier of prepayment
   *
   * @param prepaymentId UUID
   */
  public void setPrepaymentId(UUID prepaymentId) {
    this.prepaymentId = prepaymentId;
  }

  /**
   * contact
   *
   * @param contact ContactResponse
   * @return PrepaymentResponse
   */
  public PrepaymentResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  /**
   * contact
   *
   * @return contact ContactResponse
   */
  public ContactResponse getContact() {
    return contact;
  }

  /**
   * contact
   *
   * @param contact ContactResponse
   */
  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax); Not included in summary mode
   *
   * @param total Double
   * @return PrepaymentResponse
   */
  public PrepaymentResponse total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax); Not included in summary mode
   *
   * @return total
   */
  @ApiModelProperty(
      value =
          "Total of Invoice tax inclusive (i.e. SubTotal + TotalTax); Not included in summary mode")
  /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax); Not included in summary mode
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax); Not included in summary mode
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * Not included in summary mode
   *
   * @param lineItems List&lt;LineItemResponse&gt;
   * @return PrepaymentResponse
   */
  public PrepaymentResponse lineItems(List<LineItemResponse> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Not included in summary mode
   *
   * @param lineItemsItem LineItemResponse
   * @return PrepaymentResponse
   */
  public PrepaymentResponse addLineItemsItem(LineItemResponse lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItemResponse>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Not included in summary mode
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "Not included in summary mode")
  /**
   * Not included in summary mode
   *
   * @return lineItems List<LineItemResponse>
   */
  public List<LineItemResponse> getLineItems() {
    return lineItems;
  }

  /**
   * Not included in summary mode
   *
   * @param lineItems List&lt;LineItemResponse&gt;
   */
  public void setLineItems(List<LineItemResponse> lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaymentResponse prepaymentResponse = (PrepaymentResponse) o;
    return Objects.equals(this.prepaymentId, prepaymentResponse.prepaymentId)
        && Objects.equals(this.contact, prepaymentResponse.contact)
        && Objects.equals(this.total, prepaymentResponse.total)
        && Objects.equals(this.lineItems, prepaymentResponse.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepaymentId, contact, total, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaymentResponse {\n");
    sb.append("    prepaymentId: ").append(toIndentedString(prepaymentId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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
