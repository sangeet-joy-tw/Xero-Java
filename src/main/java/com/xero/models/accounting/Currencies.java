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

/** Currencies */
public class Currencies {
  StringUtil util = new StringUtil();

  @JsonProperty("Currencies")
  private List<Currency> currencies = new ArrayList<Currency>();
  /**
   * currencies
   *
   * @param currencies List&lt;Currency&gt;
   * @return Currencies
   */
  public Currencies currencies(List<Currency> currencies) {
    this.currencies = currencies;
    return this;
  }

  /**
   * currencies
   *
   * @param currenciesItem Currency
   * @return Currencies
   */
  public Currencies addCurrenciesItem(Currency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<Currency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * Get currencies
   *
   * @return currencies
   */
  @ApiModelProperty(value = "")
  /**
   * currencies
   *
   * @return currencies List<Currency>
   */
  public List<Currency> getCurrencies() {
    return currencies;
  }

  /**
   * currencies
   *
   * @param currencies List&lt;Currency&gt;
   */
  public void setCurrencies(List<Currency> currencies) {
    this.currencies = currencies;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currencies currencies = (Currencies) o;
    return Objects.equals(this.currencies, currencies.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currencies {\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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
