package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceInstanceUsage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")


public class ResourceInstanceUsage   {
  @JsonProperty("plan_id")
  private String planId = "SPrXw5tBE3";

  @JsonProperty("start")
  private Integer start = 12344;

  @JsonProperty("end")
  private Integer end = 3600;

  @JsonProperty("measured_usage")
  private List measuredUsage = null;

  @JsonProperty("region")
  private Integer region = 1473188353;

  @JsonProperty("consumer_id")
  private Integer consumerId = 1473188353;

  public ResourceInstanceUsage planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ResourceInstanceUsage start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ResourceInstanceUsage end(Integer end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public ResourceInstanceUsage measuredUsage(List measuredUsage) {
    this.measuredUsage = measuredUsage;
    return this;
  }

  /**
   * Get measuredUsage
   * @return measuredUsage
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public List getMeasuredUsage() {
    return measuredUsage;
  }

  public void setMeasuredUsage(List measuredUsage) {
    this.measuredUsage = measuredUsage;
  }

  public ResourceInstanceUsage region(Integer region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getRegion() {
    return region;
  }

  public void setRegion(Integer region) {
    this.region = region;
  }

  public ResourceInstanceUsage consumerId(Integer consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Get consumerId
   * @return consumerId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Integer consumerId) {
    this.consumerId = consumerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceInstanceUsage resourceInstanceUsage = (ResourceInstanceUsage) o;
    return Objects.equals(this.planId, resourceInstanceUsage.planId) &&
        Objects.equals(this.start, resourceInstanceUsage.start) &&
        Objects.equals(this.end, resourceInstanceUsage.end) &&
        Objects.equals(this.measuredUsage, resourceInstanceUsage.measuredUsage) &&
        Objects.equals(this.region, resourceInstanceUsage.region) &&
        Objects.equals(this.consumerId, resourceInstanceUsage.consumerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, start, end, measuredUsage, region, consumerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceInstanceUsage {\n");
    
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    measuredUsage: ").append(toIndentedString(measuredUsage)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
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
