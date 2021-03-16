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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** BatchPayment */
public class BatchPayment {
  StringUtil util = new StringUtil();

  @JsonProperty("Account")
  private Account account;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("Particulars")
  private String particulars;

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Details")
  private String details;

  @JsonProperty("Narrative")
  private String narrative;

  @JsonProperty("BatchPaymentID")
  private UUID batchPaymentID;

  @JsonProperty("DateString")
  private String dateString;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Payments")
  private List<Payment> payments = new ArrayList<Payment>();
  /** PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only) */
  public enum TypeEnum {
    /** PAYBATCH */
    PAYBATCH("PAYBATCH"),

    /** RECBATCH */
    RECBATCH("RECBATCH");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;
  /**
   * AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED. It is
   * not possible to delete batch payments via the API.
   */
  public enum StatusEnum {
    /** AUTHORISED */
    AUTHORISED("AUTHORISED"),

    /** DELETED */
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("TotalAmount")
  private String totalAmount;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("IsReconciled")
  private String isReconciled;
  /**
   * account
   *
   * @param account Account
   * @return BatchPayment
   */
  public BatchPayment account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   *
   * @return account
   */
  @ApiModelProperty(value = "")
  /**
   * account
   *
   * @return account Account
   */
  public Account getAccount() {
    return account;
  }

  /**
   * account
   *
   * @param account Account
   */
  public void setAccount(Account account) {
    this.account = account;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param reference String
   * @return BatchPayment
   */
  public BatchPayment reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return reference
   */
  @ApiModelProperty(
      value =
          "(NZ Only) Optional references for the batch payment transaction. It will also show with"
              + " the batch payment transaction in the bank reconciliation Find & Match screen."
              + " Depending on your individual bank, the detail may also show on the bank"
              + " statement you import into Xero.")
  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param reference String
   */
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param particulars String
   * @return BatchPayment
   */
  public BatchPayment particulars(String particulars) {
    this.particulars = particulars;
    return this;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return particulars
   */
  @ApiModelProperty(
      value =
          "(NZ Only) Optional references for the batch payment transaction. It will also show with"
              + " the batch payment transaction in the bank reconciliation Find & Match screen."
              + " Depending on your individual bank, the detail may also show on the bank"
              + " statement you import into Xero.")
  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return particulars String
   */
  public String getParticulars() {
    return particulars;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param particulars String
   */
  public void setParticulars(String particulars) {
    this.particulars = particulars;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param code String
   * @return BatchPayment
   */
  public BatchPayment code(String code) {
    this.code = code;
    return this;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return code
   */
  @ApiModelProperty(
      value =
          "(NZ Only) Optional references for the batch payment transaction. It will also show with"
              + " the batch payment transaction in the bank reconciliation Find & Match screen."
              + " Depending on your individual bank, the detail may also show on the bank"
              + " statement you import into Xero.")
  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @return code String
   */
  public String getCode() {
    return code;
  }

  /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the
   * batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your
   * individual bank, the detail may also show on the bank statement you import into Xero.
   *
   * @param code String
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment
   * transaction. They will also show with the batch payment transaction in the bank reconciliation
   * Find &amp; Match screen. Depending on your individual bank, the detail may also show on the
   * bank statement imported into Xero. Maximum field length &#x3D; 18
   *
   * @param details String
   * @return BatchPayment
   */
  public BatchPayment details(String details) {
    this.details = details;
    return this;
  }

  /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment
   * transaction. They will also show with the batch payment transaction in the bank reconciliation
   * Find &amp; Match screen. Depending on your individual bank, the detail may also show on the
   * bank statement imported into Xero. Maximum field length &#x3D; 18
   *
   * @return details
   */
  @ApiModelProperty(
      value =
          "(Non-NZ Only) These details are sent to the org’s bank as a reference for the batch"
              + " payment transaction. They will also show with the batch payment transaction in"
              + " the bank reconciliation Find & Match screen. Depending on your individual bank,"
              + " the detail may also show on the bank statement imported into Xero. Maximum field"
              + " length = 18")
  /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment
   * transaction. They will also show with the batch payment transaction in the bank reconciliation
   * Find &amp; Match screen. Depending on your individual bank, the detail may also show on the
   * bank statement imported into Xero. Maximum field length &#x3D; 18
   *
   * @return details String
   */
  public String getDetails() {
    return details;
  }

  /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment
   * transaction. They will also show with the batch payment transaction in the bank reconciliation
   * Find &amp; Match screen. Depending on your individual bank, the detail may also show on the
   * bank statement imported into Xero. Maximum field length &#x3D; 18
   *
   * @param details String
   */
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * (UK Only) Only shows on the statement line in Xero. Max length &#x3D;18
   *
   * @param narrative String
   * @return BatchPayment
   */
  public BatchPayment narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

  /**
   * (UK Only) Only shows on the statement line in Xero. Max length &#x3D;18
   *
   * @return narrative
   */
  @ApiModelProperty(value = "(UK Only) Only shows on the statement line in Xero. Max length =18")
  /**
   * (UK Only) Only shows on the statement line in Xero. Max length &#x3D;18
   *
   * @return narrative String
   */
  public String getNarrative() {
    return narrative;
  }

  /**
   * (UK Only) Only shows on the statement line in Xero. Max length &#x3D;18
   *
   * @param narrative String
   */
  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  /**
   * The Xero generated unique identifier for the bank transaction (read-only)
   *
   * @return batchPaymentID
   */
  @ApiModelProperty(
      value = "The Xero generated unique identifier for the bank transaction (read-only)")
  /**
   * The Xero generated unique identifier for the bank transaction (read-only)
   *
   * @return batchPaymentID UUID
   */
  public UUID getBatchPaymentID() {
    return batchPaymentID;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @param dateString String
   * @return BatchPayment
   */
  public BatchPayment dateString(String dateString) {
    this.dateString = dateString;
    return this;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @return dateString
   */
  @ApiModelProperty(value = "Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06")
  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @return dateString String
   */
  public String getDateString() {
    return dateString;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @param dateString String
   */
  public void setDateString(String dateString) {
    this.dateString = dateString;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @param date String
   * @return BatchPayment
   */
  public BatchPayment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @return date
   */
  @ApiModelProperty(value = "Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06")
  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @return date String
   */
  public String getDate() {
    return date;
  }
  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @return LocalDate
   */
  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @param date String
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   *
   * @param date LocalDateTime
   */
  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the
   * invoice e.g. 200.00
   *
   * @param amount Double
   * @return BatchPayment
   */
  public BatchPayment amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the
   * invoice e.g. 200.00
   *
   * @return amount
   */
  @ApiModelProperty(
      value =
          "The amount of the payment. Must be less than or equal to the outstanding amount owing"
              + " on the invoice e.g. 200.00")
  /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the
   * invoice e.g. 200.00
   *
   * @return amount Double
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the
   * invoice e.g. 200.00
   *
   * @param amount Double
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * An array of payments
   *
   * @param payments List&lt;Payment&gt;
   * @return BatchPayment
   */
  public BatchPayment payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  /**
   * An array of payments
   *
   * @param paymentsItem Payment
   * @return BatchPayment
   */
  public BatchPayment addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * An array of payments
   *
   * @return payments
   */
  @ApiModelProperty(value = "An array of payments")
  /**
   * An array of payments
   *
   * @return payments List<Payment>
   */
  public List<Payment> getPayments() {
    return payments;
  }

  /**
   * An array of payments
   *
   * @param payments List&lt;Payment&gt;
   */
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  /**
   * PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only)
   *
   * @return type
   */
  @ApiModelProperty(
      value = "PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only)")
  /**
   * PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only)
   *
   * @return type TypeEnum
   */
  public TypeEnum getType() {
    return type;
  }

  /**
   * AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED. It is
   * not possible to delete batch payments via the API.
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED."
              + " It is not possible to delete batch payments via the API.")
  /**
   * AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED. It is
   * not possible to delete batch payments via the API.
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The total of the payments that make up the batch (read-only)
   *
   * @return totalAmount
   */
  @ApiModelProperty(value = "The total of the payments that make up the batch (read-only)")
  /**
   * The total of the payments that make up the batch (read-only)
   *
   * @return totalAmount String
   */
  public String getTotalAmount() {
    return totalAmount;
  }

  /**
   * UTC timestamp of last update to the payment
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of last update to the payment")
  /**
   * UTC timestamp of last update to the payment
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * UTC timestamp of last update to the payment
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Booelan that tells you if the batch payment has been reconciled (read-only)
   *
   * @return isReconciled
   */
  @ApiModelProperty(
      value = "Booelan that tells you if the batch payment has been reconciled (read-only)")
  /**
   * Booelan that tells you if the batch payment has been reconciled (read-only)
   *
   * @return isReconciled String
   */
  public String getIsReconciled() {
    return isReconciled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPayment batchPayment = (BatchPayment) o;
    return Objects.equals(this.account, batchPayment.account)
        && Objects.equals(this.reference, batchPayment.reference)
        && Objects.equals(this.particulars, batchPayment.particulars)
        && Objects.equals(this.code, batchPayment.code)
        && Objects.equals(this.details, batchPayment.details)
        && Objects.equals(this.narrative, batchPayment.narrative)
        && Objects.equals(this.batchPaymentID, batchPayment.batchPaymentID)
        && Objects.equals(this.dateString, batchPayment.dateString)
        && Objects.equals(this.date, batchPayment.date)
        && Objects.equals(this.amount, batchPayment.amount)
        && Objects.equals(this.payments, batchPayment.payments)
        && Objects.equals(this.type, batchPayment.type)
        && Objects.equals(this.status, batchPayment.status)
        && Objects.equals(this.totalAmount, batchPayment.totalAmount)
        && Objects.equals(this.updatedDateUTC, batchPayment.updatedDateUTC)
        && Objects.equals(this.isReconciled, batchPayment.isReconciled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        account,
        reference,
        particulars,
        code,
        details,
        narrative,
        batchPaymentID,
        dateString,
        date,
        amount,
        payments,
        type,
        status,
        totalAmount,
        updatedDateUTC,
        isReconciled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPayment {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    particulars: ").append(toIndentedString(particulars)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
    sb.append("    batchPaymentID: ").append(toIndentedString(batchPaymentID)).append("\n");
    sb.append("    dateString: ").append(toIndentedString(dateString)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
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
