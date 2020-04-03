/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TenNinteyNineContact
 */

public class TenNinteyNineContact {
  StringUtil util = new StringUtil();

  
  @JsonProperty("Box1")
  private Double box1;

  
  @JsonProperty("Box2")
  private Double box2;

  
  @JsonProperty("Box3")
  private Double box3;

  
  @JsonProperty("Box4")
  private Double box4;

  
  @JsonProperty("Box5")
  private Double box5;

  
  @JsonProperty("Box6")
  private Double box6;

  
  @JsonProperty("Box7")
  private Double box7;

  
  @JsonProperty("Box8")
  private Double box8;

  
  @JsonProperty("Box9")
  private Double box9;

  
  @JsonProperty("Box10")
  private Double box10;

  
  @JsonProperty("Box11")
  private Double box11;

  
  @JsonProperty("Box13")
  private Double box13;

  
  @JsonProperty("Box14")
  private Double box14;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("FederalTaxIDType")
  private String federalTaxIDType;

  
  @JsonProperty("City")
  private String city;

  
  @JsonProperty("Zip")
  private String zip;

  
  @JsonProperty("State")
  private String state;

  
  @JsonProperty("Email")
  private String email;

  
  @JsonProperty("StreetAddress")
  private String streetAddress;

  
  @JsonProperty("TaxID")
  private String taxID;

  
  @JsonProperty("ContactId")
  private UUID contactId;
  public TenNinteyNineContact box1(Double box1) {
    this.box1 = box1;
    return this;
  }

   /**
   * Box 1 on 1099 Form
   * @return box1
  **/
  @ApiModelProperty(value = "Box 1 on 1099 Form")
  public Double getBox1() {
    return box1;
  }

  public void setBox1(Double box1) {
    this.box1 = box1;
  }

  public TenNinteyNineContact box2(Double box2) {
    this.box2 = box2;
    return this;
  }

   /**
   * Box 2 on 1099 Form
   * @return box2
  **/
  @ApiModelProperty(value = "Box 2 on 1099 Form")
  public Double getBox2() {
    return box2;
  }

  public void setBox2(Double box2) {
    this.box2 = box2;
  }

  public TenNinteyNineContact box3(Double box3) {
    this.box3 = box3;
    return this;
  }

   /**
   * Box 3 on 1099 Form
   * @return box3
  **/
  @ApiModelProperty(value = "Box 3 on 1099 Form")
  public Double getBox3() {
    return box3;
  }

  public void setBox3(Double box3) {
    this.box3 = box3;
  }

  public TenNinteyNineContact box4(Double box4) {
    this.box4 = box4;
    return this;
  }

   /**
   * Box 4 on 1099 Form
   * @return box4
  **/
  @ApiModelProperty(value = "Box 4 on 1099 Form")
  public Double getBox4() {
    return box4;
  }

  public void setBox4(Double box4) {
    this.box4 = box4;
  }

  public TenNinteyNineContact box5(Double box5) {
    this.box5 = box5;
    return this;
  }

   /**
   * Box 5 on 1099 Form
   * @return box5
  **/
  @ApiModelProperty(value = "Box 5 on 1099 Form")
  public Double getBox5() {
    return box5;
  }

  public void setBox5(Double box5) {
    this.box5 = box5;
  }

  public TenNinteyNineContact box6(Double box6) {
    this.box6 = box6;
    return this;
  }

   /**
   * Box 6 on 1099 Form
   * @return box6
  **/
  @ApiModelProperty(value = "Box 6 on 1099 Form")
  public Double getBox6() {
    return box6;
  }

  public void setBox6(Double box6) {
    this.box6 = box6;
  }

  public TenNinteyNineContact box7(Double box7) {
    this.box7 = box7;
    return this;
  }

   /**
   * Box 7 on 1099 Form
   * @return box7
  **/
  @ApiModelProperty(value = "Box 7 on 1099 Form")
  public Double getBox7() {
    return box7;
  }

  public void setBox7(Double box7) {
    this.box7 = box7;
  }

  public TenNinteyNineContact box8(Double box8) {
    this.box8 = box8;
    return this;
  }

   /**
   * Box 8 on 1099 Form
   * @return box8
  **/
  @ApiModelProperty(value = "Box 8 on 1099 Form")
  public Double getBox8() {
    return box8;
  }

  public void setBox8(Double box8) {
    this.box8 = box8;
  }

  public TenNinteyNineContact box9(Double box9) {
    this.box9 = box9;
    return this;
  }

   /**
   * Box 9 on 1099 Form
   * @return box9
  **/
  @ApiModelProperty(value = "Box 9 on 1099 Form")
  public Double getBox9() {
    return box9;
  }

  public void setBox9(Double box9) {
    this.box9 = box9;
  }

  public TenNinteyNineContact box10(Double box10) {
    this.box10 = box10;
    return this;
  }

   /**
   * Box 10 on 1099 Form
   * @return box10
  **/
  @ApiModelProperty(value = "Box 10 on 1099 Form")
  public Double getBox10() {
    return box10;
  }

  public void setBox10(Double box10) {
    this.box10 = box10;
  }

  public TenNinteyNineContact box11(Double box11) {
    this.box11 = box11;
    return this;
  }

   /**
   * Box 11 on 1099 Form
   * @return box11
  **/
  @ApiModelProperty(value = "Box 11 on 1099 Form")
  public Double getBox11() {
    return box11;
  }

  public void setBox11(Double box11) {
    this.box11 = box11;
  }

  public TenNinteyNineContact box13(Double box13) {
    this.box13 = box13;
    return this;
  }

   /**
   * Box 13 on 1099 Form
   * @return box13
  **/
  @ApiModelProperty(value = "Box 13 on 1099 Form")
  public Double getBox13() {
    return box13;
  }

  public void setBox13(Double box13) {
    this.box13 = box13;
  }

  public TenNinteyNineContact box14(Double box14) {
    this.box14 = box14;
    return this;
  }

   /**
   * Box 14 on 1099 Form
   * @return box14
  **/
  @ApiModelProperty(value = "Box 14 on 1099 Form")
  public Double getBox14() {
    return box14;
  }

  public void setBox14(Double box14) {
    this.box14 = box14;
  }

  public TenNinteyNineContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Contact name on 1099 Form
   * @return name
  **/
  @ApiModelProperty(value = "Contact name on 1099 Form")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TenNinteyNineContact federalTaxIDType(String federalTaxIDType) {
    this.federalTaxIDType = federalTaxIDType;
    return this;
  }

   /**
   * Contact Fed Tax ID type
   * @return federalTaxIDType
  **/
  @ApiModelProperty(value = "Contact Fed Tax ID type")
  public String getFederalTaxIDType() {
    return federalTaxIDType;
  }

  public void setFederalTaxIDType(String federalTaxIDType) {
    this.federalTaxIDType = federalTaxIDType;
  }

  public TenNinteyNineContact city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Contact city on 1099 Form
   * @return city
  **/
  @ApiModelProperty(value = "Contact city on 1099 Form")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TenNinteyNineContact zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Contact zip on 1099 Form
   * @return zip
  **/
  @ApiModelProperty(value = "Contact zip on 1099 Form")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public TenNinteyNineContact state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Contact State on 1099 Form
   * @return state
  **/
  @ApiModelProperty(value = "Contact State on 1099 Form")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TenNinteyNineContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email on 1099 Form
   * @return email
  **/
  @ApiModelProperty(value = "Contact email on 1099 Form")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TenNinteyNineContact streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Contact address on 1099 Form
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Contact address on 1099 Form")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public TenNinteyNineContact taxID(String taxID) {
    this.taxID = taxID;
    return this;
  }

   /**
   * Contact tax id on 1099 Form
   * @return taxID
  **/
  @ApiModelProperty(value = "Contact tax id on 1099 Form")
  public String getTaxID() {
    return taxID;
  }

  public void setTaxID(String taxID) {
    this.taxID = taxID;
  }

  public TenNinteyNineContact contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Contact contact id
   * @return contactId
  **/
  @ApiModelProperty(value = "Contact contact id")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenNinteyNineContact tenNinteyNineContact = (TenNinteyNineContact) o;
    return Objects.equals(this.box1, tenNinteyNineContact.box1) &&
        Objects.equals(this.box2, tenNinteyNineContact.box2) &&
        Objects.equals(this.box3, tenNinteyNineContact.box3) &&
        Objects.equals(this.box4, tenNinteyNineContact.box4) &&
        Objects.equals(this.box5, tenNinteyNineContact.box5) &&
        Objects.equals(this.box6, tenNinteyNineContact.box6) &&
        Objects.equals(this.box7, tenNinteyNineContact.box7) &&
        Objects.equals(this.box8, tenNinteyNineContact.box8) &&
        Objects.equals(this.box9, tenNinteyNineContact.box9) &&
        Objects.equals(this.box10, tenNinteyNineContact.box10) &&
        Objects.equals(this.box11, tenNinteyNineContact.box11) &&
        Objects.equals(this.box13, tenNinteyNineContact.box13) &&
        Objects.equals(this.box14, tenNinteyNineContact.box14) &&
        Objects.equals(this.name, tenNinteyNineContact.name) &&
        Objects.equals(this.federalTaxIDType, tenNinteyNineContact.federalTaxIDType) &&
        Objects.equals(this.city, tenNinteyNineContact.city) &&
        Objects.equals(this.zip, tenNinteyNineContact.zip) &&
        Objects.equals(this.state, tenNinteyNineContact.state) &&
        Objects.equals(this.email, tenNinteyNineContact.email) &&
        Objects.equals(this.streetAddress, tenNinteyNineContact.streetAddress) &&
        Objects.equals(this.taxID, tenNinteyNineContact.taxID) &&
        Objects.equals(this.contactId, tenNinteyNineContact.contactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box13, box14, name, federalTaxIDType, city, zip, state, email, streetAddress, taxID, contactId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenNinteyNineContact {\n");
    sb.append("    box1: ").append(toIndentedString(box1)).append("\n");
    sb.append("    box2: ").append(toIndentedString(box2)).append("\n");
    sb.append("    box3: ").append(toIndentedString(box3)).append("\n");
    sb.append("    box4: ").append(toIndentedString(box4)).append("\n");
    sb.append("    box5: ").append(toIndentedString(box5)).append("\n");
    sb.append("    box6: ").append(toIndentedString(box6)).append("\n");
    sb.append("    box7: ").append(toIndentedString(box7)).append("\n");
    sb.append("    box8: ").append(toIndentedString(box8)).append("\n");
    sb.append("    box9: ").append(toIndentedString(box9)).append("\n");
    sb.append("    box10: ").append(toIndentedString(box10)).append("\n");
    sb.append("    box11: ").append(toIndentedString(box11)).append("\n");
    sb.append("    box13: ").append(toIndentedString(box13)).append("\n");
    sb.append("    box14: ").append(toIndentedString(box14)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    federalTaxIDType: ").append(toIndentedString(federalTaxIDType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    taxID: ").append(toIndentedString(taxID)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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

