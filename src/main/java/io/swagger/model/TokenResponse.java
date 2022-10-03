package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TokenResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")


public class TokenResponse   {
  @JsonProperty("access_token")
  private String accessToken = "eyJhbGciOiJIUz";

  @JsonProperty("refresh_token")
  private String refreshToken = "SPrXw5tBE3";

  @JsonProperty("token_type")
  private String tokenType = "Bearer";

  @JsonProperty("expires_in")
  private Integer expiresIn = 3600;

  @JsonProperty("expiration")
  private Integer expiration = 1473188353;

  public TokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public TokenResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public TokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public TokenResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public TokenResponse expiration(Integer expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getExpiration() {
    return expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponse tokenResponse = (TokenResponse) o;
    return Objects.equals(this.accessToken, tokenResponse.accessToken) &&
        Objects.equals(this.refreshToken, tokenResponse.refreshToken) &&
        Objects.equals(this.tokenType, tokenResponse.tokenType) &&
        Objects.equals(this.expiresIn, tokenResponse.expiresIn) &&
        Objects.equals(this.expiration, tokenResponse.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, tokenType, expiresIn, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
