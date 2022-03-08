/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.appstore;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** Plan */
public class Plan {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
  /** Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION. */
  public enum StatusEnum {
    /** ACTIVE */
    ACTIVE("ACTIVE"),

    /** CANCELED */
    CANCELED("CANCELED"),

    /** PENDING_ACTIVATION */
    PENDING_ACTIVATION("PENDING_ACTIVATION");

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

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("subscriptionItems")
  private List<SubscriptionItem> subscriptionItems = new ArrayList<SubscriptionItem>();
  /**
   * The unique identifier of the plan
   *
   * @param id UUID
   * @return Plan
   */
  public Plan id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the plan
   *
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the plan")
  /**
   * The unique identifier of the plan
   *
   * @return id UUID
   */
  public UUID getId() {
    return id;
  }

  /**
   * The unique identifier of the plan
   *
   * @param id UUID
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * The name of the plan. It is used in the invoice line item description.
   *
   * @param name String
   * @return Plan
   */
  public Plan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the plan. It is used in the invoice line item description.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value = "The name of the plan. It is used in the invoice line item description. ")
  /**
   * The name of the plan. It is used in the invoice line item description.
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * The name of the plan. It is used in the invoice line item description.
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION.
   *
   * @param status StatusEnum
   * @return Plan
   */
  public Plan status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value =
          "Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION. ")
  /**
   * Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION.
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Status of the plan. Available statuses are ACTIVE, CANCELED, and PENDING_ACTIVATION.
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * List of the subscription items belonging to the plan. It does not include cancelled
   * subscription items.
   *
   * @param subscriptionItems List&lt;SubscriptionItem&gt;
   * @return Plan
   */
  public Plan subscriptionItems(List<SubscriptionItem> subscriptionItems) {
    this.subscriptionItems = subscriptionItems;
    return this;
  }

  /**
   * List of the subscription items belonging to the plan. It does not include cancelled
   * subscription items.
   *
   * @param subscriptionItemsItem SubscriptionItem
   * @return Plan
   */
  public Plan addSubscriptionItemsItem(SubscriptionItem subscriptionItemsItem) {
    this.subscriptionItems.add(subscriptionItemsItem);
    return this;
  }

  /**
   * List of the subscription items belonging to the plan. It does not include cancelled
   * subscription items.
   *
   * @return subscriptionItems
   */
  @ApiModelProperty(
      required = true,
      value =
          "List of the subscription items belonging to the plan. It does not include cancelled"
              + " subscription items. ")
  /**
   * List of the subscription items belonging to the plan. It does not include cancelled
   * subscription items.
   *
   * @return subscriptionItems List<SubscriptionItem>
   */
  public List<SubscriptionItem> getSubscriptionItems() {
    return subscriptionItems;
  }

  /**
   * List of the subscription items belonging to the plan. It does not include cancelled
   * subscription items.
   *
   * @param subscriptionItems List&lt;SubscriptionItem&gt;
   */
  public void setSubscriptionItems(List<SubscriptionItem> subscriptionItems) {
    this.subscriptionItems = subscriptionItems;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id)
        && Objects.equals(this.name, plan.name)
        && Objects.equals(this.status, plan.status)
        && Objects.equals(this.subscriptionItems, plan.subscriptionItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, subscriptionItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionItems: ").append(toIndentedString(subscriptionItems)).append("\n");
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
