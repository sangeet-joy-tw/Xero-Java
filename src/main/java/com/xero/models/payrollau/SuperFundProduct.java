/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SuperFundProduct
 */

public class SuperFundProduct {
  StringUtil util = new StringUtil();

  
  @JsonProperty("ABN")
  private String ABN;

  
  @JsonProperty("USI")
  private String USI;

  
  @JsonProperty("SPIN")
  private String SPIN;

  
  @JsonProperty("ProductName")
  private String productName;
  public SuperFundProduct ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

   /**
   * The ABN of the Regulated SuperFund
   * @return ABN
  **/
  @ApiModelProperty(example = "839182848805", value = "The ABN of the Regulated SuperFund")
  public String getABN() {
    return ABN;
  }

  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  public SuperFundProduct USI(String USI) {
    this.USI = USI;
    return this;
  }

   /**
   * The USI of the Regulated SuperFund
   * @return USI
  **/
  @ApiModelProperty(example = "839182848805001", value = "The USI of the Regulated SuperFund")
  public String getUSI() {
    return USI;
  }

  public void setUSI(String USI) {
    this.USI = USI;
  }

  public SuperFundProduct SPIN(String SPIN) {
    this.SPIN = SPIN;
    return this;
  }

   /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN
   * @return SPIN
  **/
  @ApiModelProperty(example = "NML0117AU", value = "The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN")
  public String getSPIN() {
    return SPIN;
  }

  public void setSPIN(String SPIN) {
    this.SPIN = SPIN;
  }

  public SuperFundProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * The name of the Regulated SuperFund
   * @return productName
  **/
  @ApiModelProperty(example = "MLC Navigator Retirement Plan - Superannuation Service (including Series 2) (MLC Superannuation Fund)", value = "The name of the Regulated SuperFund")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperFundProduct superFundProduct = (SuperFundProduct) o;
    return Objects.equals(this.ABN, superFundProduct.ABN) &&
        Objects.equals(this.USI, superFundProduct.USI) &&
        Objects.equals(this.SPIN, superFundProduct.SPIN) &&
        Objects.equals(this.productName, superFundProduct.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ABN, USI, SPIN, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperFundProduct {\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    USI: ").append(toIndentedString(USI)).append("\n");
    sb.append("    SPIN: ").append(toIndentedString(SPIN)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

