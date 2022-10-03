package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")


public class ServiceInstanceMetadata   {
  @JsonProperty("labels")
  private Object labels = null;

  @JsonProperty("attributes")
  private Object attributes = null;

  public ServiceInstanceMetadata labels(Object labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @Schema(description = "")
  
    public Object getLabels() {
    return labels;
  }

  public void setLabels(Object labels) {
    this.labels = labels;
  }

  public ServiceInstanceMetadata attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   **/
  @Schema(description = "")
  
    public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceMetadata serviceInstanceMetadata = (ServiceInstanceMetadata) o;
    return Objects.equals(this.labels, serviceInstanceMetadata.labels) &&
        Objects.equals(this.attributes, serviceInstanceMetadata.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceMetadata {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
