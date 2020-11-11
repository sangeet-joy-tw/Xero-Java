/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.3
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** Item */
public class Item {
  StringUtil util = new StringUtil();

  @JsonProperty("Code")
  private String code;

  @JsonProperty("InventoryAssetAccountCode")
  private String inventoryAssetAccountCode;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("IsSold")
  private Boolean isSold;

  @JsonProperty("IsPurchased")
  private Boolean isPurchased;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("PurchaseDescription")
  private String purchaseDescription;

  @JsonProperty("PurchaseDetails")
  private Purchase purchaseDetails;

  @JsonProperty("SalesDetails")
  private Purchase salesDetails;

  @JsonProperty("IsTrackedAsInventory")
  private Boolean isTrackedAsInventory;

  @JsonProperty("TotalCostPool")
  private Double totalCostPool;

  @JsonProperty("QuantityOnHand")
  private Double quantityOnHand;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ItemID")
  private UUID itemID;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public Item code(String code) {
    this.code = code;
    return this;
  }

  /**
   * User defined item code (max length &#x3D; 30)
   *
   * @return code
   */
  @ApiModelProperty(required = true, value = "User defined item code (max length = 30)")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Item inventoryAssetAccountCode(String inventoryAssetAccountCode) {
    this.inventoryAssetAccountCode = inventoryAssetAccountCode;
    return this;
  }

  /**
   * The inventory asset account for the item. The account must be of type INVENTORY. The
   * COGSAccountCode in PurchaseDetails is also required to create a tracked item
   *
   * @return inventoryAssetAccountCode
   */
  @ApiModelProperty(
      value =
          "The inventory asset account for the item. The account must be of type INVENTORY. The "
              + " COGSAccountCode in PurchaseDetails is also required to create a tracked item")
  public String getInventoryAssetAccountCode() {
    return inventoryAssetAccountCode;
  }

  public void setInventoryAssetAccountCode(String inventoryAssetAccountCode) {
    this.inventoryAssetAccountCode = inventoryAssetAccountCode;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the item (max length &#x3D; 50)
   *
   * @return name
   */
  @ApiModelProperty(value = "The name of the item (max length = 50)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item isSold(Boolean isSold) {
    this.isSold = isSold;
    return this;
  }

  /**
   * Boolean value, defaults to true. When IsSold is true the item will be available on sales
   * transactions in the Xero UI. If IsSold is updated to false then Description and SalesDetails
   * values will be nulled.
   *
   * @return isSold
   */
  @ApiModelProperty(
      value =
          "Boolean value, defaults to true. When IsSold is true the item will be available on"
              + " sales transactions in the Xero UI. If IsSold is updated to false then"
              + " Description and SalesDetails values will be nulled.")
  public Boolean getIsSold() {
    return isSold;
  }

  public void setIsSold(Boolean isSold) {
    this.isSold = isSold;
  }

  public Item isPurchased(Boolean isPurchased) {
    this.isPurchased = isPurchased;
    return this;
  }

  /**
   * Boolean value, defaults to true. When IsPurchased is true the item is available for purchase
   * transactions in the Xero UI. If IsPurchased is updated to false then PurchaseDescription and
   * PurchaseDetails values will be nulled.
   *
   * @return isPurchased
   */
  @ApiModelProperty(
      value =
          "Boolean value, defaults to true. When IsPurchased is true the item is available for"
              + " purchase transactions in the Xero UI. If IsPurchased is updated to false then"
              + " PurchaseDescription and PurchaseDetails values will be nulled.")
  public Boolean getIsPurchased() {
    return isPurchased;
  }

  public void setIsPurchased(Boolean isPurchased) {
    this.isPurchased = isPurchased;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The sales description of the item (max length &#x3D; 4000)
   *
   * @return description
   */
  @ApiModelProperty(value = "The sales description of the item (max length = 4000)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item purchaseDescription(String purchaseDescription) {
    this.purchaseDescription = purchaseDescription;
    return this;
  }

  /**
   * The purchase description of the item (max length &#x3D; 4000)
   *
   * @return purchaseDescription
   */
  @ApiModelProperty(value = "The purchase description of the item (max length = 4000)")
  public String getPurchaseDescription() {
    return purchaseDescription;
  }

  public void setPurchaseDescription(String purchaseDescription) {
    this.purchaseDescription = purchaseDescription;
  }

  public Item purchaseDetails(Purchase purchaseDetails) {
    this.purchaseDetails = purchaseDetails;
    return this;
  }

  /**
   * Get purchaseDetails
   *
   * @return purchaseDetails
   */
  @ApiModelProperty(value = "")
  public Purchase getPurchaseDetails() {
    return purchaseDetails;
  }

  public void setPurchaseDetails(Purchase purchaseDetails) {
    this.purchaseDetails = purchaseDetails;
  }

  public Item salesDetails(Purchase salesDetails) {
    this.salesDetails = salesDetails;
    return this;
  }

  /**
   * Get salesDetails
   *
   * @return salesDetails
   */
  @ApiModelProperty(value = "")
  public Purchase getSalesDetails() {
    return salesDetails;
  }

  public void setSalesDetails(Purchase salesDetails) {
    this.salesDetails = salesDetails;
  }

  public Item isTrackedAsInventory(Boolean isTrackedAsInventory) {
    this.isTrackedAsInventory = isTrackedAsInventory;
    return this;
  }

  /**
   * True for items that are tracked as inventory. An item will be tracked as inventory if the
   * InventoryAssetAccountCode and COGSAccountCode are set.
   *
   * @return isTrackedAsInventory
   */
  @ApiModelProperty(
      value =
          "True for items that are tracked as inventory. An item will be tracked as inventory if"
              + " the InventoryAssetAccountCode and COGSAccountCode are set.")
  public Boolean getIsTrackedAsInventory() {
    return isTrackedAsInventory;
  }

  public void setIsTrackedAsInventory(Boolean isTrackedAsInventory) {
    this.isTrackedAsInventory = isTrackedAsInventory;
  }

  public Item totalCostPool(Double totalCostPool) {
    this.totalCostPool = totalCostPool;
    return this;
  }

  /**
   * The value of the item on hand. Calculated using average cost accounting.
   *
   * @return totalCostPool
   */
  @ApiModelProperty(
      value = "The value of the item on hand. Calculated using average cost accounting.")
  public Double getTotalCostPool() {
    return totalCostPool;
  }

  public void setTotalCostPool(Double totalCostPool) {
    this.totalCostPool = totalCostPool;
  }

  public Item quantityOnHand(Double quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
    return this;
  }

  /**
   * The quantity of the item on hand
   *
   * @return quantityOnHand
   */
  @ApiModelProperty(value = "The quantity of the item on hand")
  public Double getQuantityOnHand() {
    return quantityOnHand;
  }

  public void setQuantityOnHand(Double quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }

  /**
   * Last modified date in UTC format
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date in UTC format")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

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

  public Item itemID(UUID itemID) {
    this.itemID = itemID;
    return this;
  }

  /**
   * The Xero identifier for an Item
   *
   * @return itemID
   */
  @ApiModelProperty(value = "The Xero identifier for an Item")
  public UUID getItemID() {
    return itemID;
  }

  public void setItemID(UUID itemID) {
    this.itemID = itemID;
  }

  public Item statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * Status of object
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "Status of object")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public Item validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Item addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.code, item.code)
        && Objects.equals(this.inventoryAssetAccountCode, item.inventoryAssetAccountCode)
        && Objects.equals(this.name, item.name)
        && Objects.equals(this.isSold, item.isSold)
        && Objects.equals(this.isPurchased, item.isPurchased)
        && Objects.equals(this.description, item.description)
        && Objects.equals(this.purchaseDescription, item.purchaseDescription)
        && Objects.equals(this.purchaseDetails, item.purchaseDetails)
        && Objects.equals(this.salesDetails, item.salesDetails)
        && Objects.equals(this.isTrackedAsInventory, item.isTrackedAsInventory)
        && Objects.equals(this.totalCostPool, item.totalCostPool)
        && Objects.equals(this.quantityOnHand, item.quantityOnHand)
        && Objects.equals(this.updatedDateUTC, item.updatedDateUTC)
        && Objects.equals(this.itemID, item.itemID)
        && Objects.equals(this.statusAttributeString, item.statusAttributeString)
        && Objects.equals(this.validationErrors, item.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        code,
        inventoryAssetAccountCode,
        name,
        isSold,
        isPurchased,
        description,
        purchaseDescription,
        purchaseDetails,
        salesDetails,
        isTrackedAsInventory,
        totalCostPool,
        quantityOnHand,
        updatedDateUTC,
        itemID,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    inventoryAssetAccountCode: ")
        .append(toIndentedString(inventoryAssetAccountCode))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isSold: ").append(toIndentedString(isSold)).append("\n");
    sb.append("    isPurchased: ").append(toIndentedString(isPurchased)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purchaseDescription: ")
        .append(toIndentedString(purchaseDescription))
        .append("\n");
    sb.append("    purchaseDetails: ").append(toIndentedString(purchaseDetails)).append("\n");
    sb.append("    salesDetails: ").append(toIndentedString(salesDetails)).append("\n");
    sb.append("    isTrackedAsInventory: ")
        .append(toIndentedString(isTrackedAsInventory))
        .append("\n");
    sb.append("    totalCostPool: ").append(toIndentedString(totalCostPool)).append("\n");
    sb.append("    quantityOnHand: ").append(toIndentedString(quantityOnHand)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
