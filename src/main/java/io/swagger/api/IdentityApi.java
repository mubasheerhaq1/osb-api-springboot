/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.model.TokenResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")
@Validated
public interface IdentityApi {

    @Operation(summary = "get the catalog of services that the service broker offers", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "IAM Token" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Token Operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TokenResponse.class))) })
    @RequestMapping(value = "/identity/token",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<TokenResponse> catalogGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Grant type for this API call. You must set the grant type to" ,required=true,schema=@Schema( defaultValue="urn:ibm:params:oauth:grant-type:apikey")) @Valid @RequestParam(value = "grant_type", required = true, defaultValue="urn:ibm:params:oauth:grant-type:apikey") String grantType, @NotNull @Parameter(in = ParameterIn.QUERY, description = "The value of the api key." ,required=true,schema=@Schema( defaultValue="eeaf64b6-cee5-4f7e-ac94-57d34690301e")) @Valid @RequestParam(value = "apikey", required = true, defaultValue="eeaf64b6-cee5-4f7e-ac94-57d34690301e") String apikey);

}
