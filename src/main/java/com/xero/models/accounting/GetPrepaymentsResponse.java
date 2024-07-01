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

/** GetPrepaymentsResponse */
public class GetPrepaymentsResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("Id")
  private String id;

  @JsonProperty("Status")
  private String status;

  @JsonProperty("ProviderName")
  private String providerName;

  @JsonProperty("DateTimeUTC")
  private String dateTimeUTC;

  @JsonProperty("PageInfo")
  private PageInfo pageInfo;

  @JsonProperty("Prepayments")
  private List<Prepayment> prepayments = new ArrayList<Prepayment>();
  /**
   * id
   *
   * @param id String
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  /**
   * id
   *
   * @return id String
   */
  public String getId() {
    return id;
  }

  /**
   * id
   *
   * @param id String
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * status
   *
   * @param status String
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  /**
   * status
   *
   * @return status String
   */
  public String getStatus() {
    return status;
  }

  /**
   * status
   *
   * @param status String
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * providerName
   *
   * @param providerName String
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   *
   * @return providerName
   */
  @ApiModelProperty(value = "")
  /**
   * providerName
   *
   * @return providerName String
   */
  public String getProviderName() {
    return providerName;
  }

  /**
   * providerName
   *
   * @param providerName String
   */
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  /**
   * dateTimeUTC
   *
   * @param dateTimeUTC String
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse dateTimeUTC(String dateTimeUTC) {
    this.dateTimeUTC = dateTimeUTC;
    return this;
  }

  /**
   * Get dateTimeUTC
   *
   * @return dateTimeUTC
   */
  @ApiModelProperty(value = "")
  /**
   * dateTimeUTC
   *
   * @return dateTimeUTC String
   */
  public String getDateTimeUTC() {
    return dateTimeUTC;
  }

  /**
   * dateTimeUTC
   *
   * @param dateTimeUTC String
   */
  public void setDateTimeUTC(String dateTimeUTC) {
    this.dateTimeUTC = dateTimeUTC;
  }

  /**
   * pageInfo
   *
   * @param pageInfo PageInfo
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  /**
   * pageInfo
   *
   * @return pageInfo PageInfo
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  /**
   * pageInfo
   *
   * @param pageInfo PageInfo
   */
  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   * prepayments
   *
   * @param prepayments List&lt;Prepayment&gt;
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse prepayments(List<Prepayment> prepayments) {
    this.prepayments = prepayments;
    return this;
  }

  /**
   * prepayments
   *
   * @param prepaymentsItem Prepayment
   * @return GetPrepaymentsResponse
   */
  public GetPrepaymentsResponse addPrepaymentsItem(Prepayment prepaymentsItem) {
    if (this.prepayments == null) {
      this.prepayments = new ArrayList<Prepayment>();
    }
    this.prepayments.add(prepaymentsItem);
    return this;
  }

  /**
   * Get prepayments
   *
   * @return prepayments
   */
  @ApiModelProperty(value = "")
  /**
   * prepayments
   *
   * @return prepayments List<Prepayment>
   */
  public List<Prepayment> getPrepayments() {
    return prepayments;
  }

  /**
   * prepayments
   *
   * @param prepayments List&lt;Prepayment&gt;
   */
  public void setPrepayments(List<Prepayment> prepayments) {
    this.prepayments = prepayments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrepaymentsResponse getPrepaymentsResponse = (GetPrepaymentsResponse) o;
    return Objects.equals(this.id, getPrepaymentsResponse.id)
        && Objects.equals(this.status, getPrepaymentsResponse.status)
        && Objects.equals(this.providerName, getPrepaymentsResponse.providerName)
        && Objects.equals(this.dateTimeUTC, getPrepaymentsResponse.dateTimeUTC)
        && Objects.equals(this.pageInfo, getPrepaymentsResponse.pageInfo)
        && Objects.equals(this.prepayments, getPrepaymentsResponse.prepayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, providerName, dateTimeUTC, pageInfo, prepayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrepaymentsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    dateTimeUTC: ").append(toIndentedString(dateTimeUTC)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    prepayments: ").append(toIndentedString(prepayments)).append("\n");
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
