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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Calendar type of the pay run */
public enum CalendarType {

  /** WEEKLY */
  WEEKLY("Weekly"),

  /** FORTNIGHTLY */
  FORTNIGHTLY("Fortnightly"),

  /** FOURWEEKLY */
  FOURWEEKLY("FourWeekly"),

  /** MONTHLY */
  MONTHLY("Monthly"),

  /** ANNUAL */
  ANNUAL("Annual"),

  /** QUARTERLY */
  QUARTERLY("Quarterly"),

  /** TWICEMONTHLY */
  TWICEMONTHLY("TwiceMonthly");

  private String value;

  CalendarType(String value) {
    this.value = value;
  }

  /** @return String value */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * toString
   *
   * @return String value
   */
  @Override
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * fromValue
   *
   * @param value String
   */
  @JsonCreator
  public static CalendarType fromValue(String value) {
    for (CalendarType b : CalendarType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
