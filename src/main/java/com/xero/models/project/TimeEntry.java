/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** TimeEntry */
public class TimeEntry {
  StringUtil util = new StringUtil();

  @JsonProperty("timeEntryId")
  private UUID timeEntryId;

  @JsonProperty("userId")
  private UUID userId;

  @JsonProperty("projectId")
  private UUID projectId;

  @JsonProperty("taskId")
  private UUID taskId;

  @JsonProperty("dateUtc")
  private OffsetDateTime dateUtc;

  @JsonProperty("dateEnteredUtc")
  private OffsetDateTime dateEnteredUtc;

  @JsonProperty("duration")
  private Integer duration;

  @JsonProperty("description")
  private String description;
  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;.
   * A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for
   * example being invoiced). Updates are not allowed when in this state. It will have a status of
   * INVOICED once it is invoiced.
   */
  public enum StatusEnum {
    /** ACTIVE */
    ACTIVE("ACTIVE"),

    /** LOCKED */
    LOCKED("LOCKED");

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
  /**
   * Identifier of the time entry.
   *
   * @param timeEntryId UUID
   * @return TimeEntry
   */
  public TimeEntry timeEntryId(UUID timeEntryId) {
    this.timeEntryId = timeEntryId;
    return this;
  }

  /**
   * Identifier of the time entry.
   *
   * @return timeEntryId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Identifier of the time entry.")
  /**
   * Identifier of the time entry.
   *
   * @return timeEntryId UUID
   */
  public UUID getTimeEntryId() {
    return timeEntryId;
  }

  /**
   * Identifier of the time entry.
   *
   * @param timeEntryId UUID
   */
  public void setTimeEntryId(UUID timeEntryId) {
    this.timeEntryId = timeEntryId;
  }

  /**
   * The xero user identifier of the person who logged time.
   *
   * @param userId UUID
   * @return TimeEntry
   */
  public TimeEntry userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The xero user identifier of the person who logged time.
   *
   * @return userId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "The xero user identifier of the person who logged time.")
  /**
   * The xero user identifier of the person who logged time.
   *
   * @return userId UUID
   */
  public UUID getUserId() {
    return userId;
  }

  /**
   * The xero user identifier of the person who logged time.
   *
   * @param userId UUID
   */
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  /**
   * Identifier of the project, that the task (which the time entry is logged against) belongs to.
   *
   * @param projectId UUID
   * @return TimeEntry
   */
  public TimeEntry projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Identifier of the project, that the task (which the time entry is logged against) belongs to.
   *
   * @return projectId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value =
          "Identifier of the project, that the task (which the time entry is logged against)"
              + " belongs to.")
  /**
   * Identifier of the project, that the task (which the time entry is logged against) belongs to.
   *
   * @return projectId UUID
   */
  public UUID getProjectId() {
    return projectId;
  }

  /**
   * Identifier of the project, that the task (which the time entry is logged against) belongs to.
   *
   * @param projectId UUID
   */
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  /**
   * Identifier of the task that time entry is logged against.
   *
   * @param taskId UUID
   * @return TimeEntry
   */
  public TimeEntry taskId(UUID taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Identifier of the task that time entry is logged against.
   *
   * @return taskId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Identifier of the task that time entry is logged against.")
  /**
   * Identifier of the task that time entry is logged against.
   *
   * @return taskId UUID
   */
  public UUID getTaskId() {
    return taskId;
  }

  /**
   * Identifier of the task that time entry is logged against.
   *
   * @param taskId UUID
   */
  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }

  /**
   * The date time that time entry is logged on. UTC Date Time in ISO-8601 format.
   *
   * @param dateUtc OffsetDateTime
   * @return TimeEntry
   */
  public TimeEntry dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  /**
   * The date time that time entry is logged on. UTC Date Time in ISO-8601 format.
   *
   * @return dateUtc
   */
  @ApiModelProperty(
      value = "The date time that time entry is logged on. UTC Date Time in ISO-8601 format.")
  /**
   * The date time that time entry is logged on. UTC Date Time in ISO-8601 format.
   *
   * @return dateUtc OffsetDateTime
   */
  public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  /**
   * The date time that time entry is logged on. UTC Date Time in ISO-8601 format.
   *
   * @param dateUtc OffsetDateTime
   */
  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is
   * set to server time.
   *
   * @param dateEnteredUtc OffsetDateTime
   * @return TimeEntry
   */
  public TimeEntry dateEnteredUtc(OffsetDateTime dateEnteredUtc) {
    this.dateEnteredUtc = dateEnteredUtc;
    return this;
  }

  /**
   * The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is
   * set to server time.
   *
   * @return dateEnteredUtc
   */
  @ApiModelProperty(
      value =
          "The date time that time entry is created. UTC Date Time in ISO-8601 format. By default"
              + " it is set to server time.")
  /**
   * The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is
   * set to server time.
   *
   * @return dateEnteredUtc OffsetDateTime
   */
  public OffsetDateTime getDateEnteredUtc() {
    return dateEnteredUtc;
  }

  /**
   * The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is
   * set to server time.
   *
   * @param dateEnteredUtc OffsetDateTime
   */
  public void setDateEnteredUtc(OffsetDateTime dateEnteredUtc) {
    this.dateEnteredUtc = dateEnteredUtc;
  }

  /**
   * The duration of logged minutes.
   *
   * @param duration Integer
   * @return TimeEntry
   */
  public TimeEntry duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of logged minutes.
   *
   * @return duration
   */
  @ApiModelProperty(value = "The duration of logged minutes.")
  /**
   * The duration of logged minutes.
   *
   * @return duration Integer
   */
  public Integer getDuration() {
    return duration;
  }

  /**
   * The duration of logged minutes.
   *
   * @param duration Integer
   */
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  /**
   * A description of the time entry.
   *
   * @param description String
   * @return TimeEntry
   */
  public TimeEntry description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the time entry.
   *
   * @return description
   */
  @ApiModelProperty(value = "A description of the time entry.")
  /**
   * A description of the time entry.
   *
   * @return description String
   */
  public String getDescription() {
    return description;
  }

  /**
   * A description of the time entry.
   *
   * @param description String
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;.
   * A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for
   * example being invoiced). Updates are not allowed when in this state. It will have a status of
   * INVOICED once it is invoiced.
   *
   * @param status StatusEnum
   * @return TimeEntry
   */
  public TimeEntry status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;.
   * A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for
   * example being invoiced). Updates are not allowed when in this state. It will have a status of
   * INVOICED once it is invoiced.
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Status of the time entry. By default a time entry is created with status of `ACTIVE`. A"
              + " `LOCKED` state indicates that the time entry is currently changing state (for"
              + " example being invoiced). Updates are not allowed when in this state. It will"
              + " have a status of INVOICED once it is invoiced.")
  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;.
   * A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for
   * example being invoiced). Updates are not allowed when in this state. It will have a status of
   * INVOICED once it is invoiced.
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;.
   * A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for
   * example being invoiced). Updates are not allowed when in this state. It will have a status of
   * INVOICED once it is invoiced.
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeEntry timeEntry = (TimeEntry) o;
    return Objects.equals(this.timeEntryId, timeEntry.timeEntryId)
        && Objects.equals(this.userId, timeEntry.userId)
        && Objects.equals(this.projectId, timeEntry.projectId)
        && Objects.equals(this.taskId, timeEntry.taskId)
        && Objects.equals(this.dateUtc, timeEntry.dateUtc)
        && Objects.equals(this.dateEnteredUtc, timeEntry.dateEnteredUtc)
        && Objects.equals(this.duration, timeEntry.duration)
        && Objects.equals(this.description, timeEntry.description)
        && Objects.equals(this.status, timeEntry.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        timeEntryId,
        userId,
        projectId,
        taskId,
        dateUtc,
        dateEnteredUtc,
        duration,
        description,
        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeEntry {\n");
    sb.append("    timeEntryId: ").append(toIndentedString(timeEntryId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    dateEnteredUtc: ").append(toIndentedString(dateEnteredUtc)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
