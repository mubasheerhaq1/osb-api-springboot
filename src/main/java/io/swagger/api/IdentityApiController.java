package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.TokenResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")
@RestController
public class IdentityApiController implements IdentityApi {

    private static final Logger log = LoggerFactory.getLogger(IdentityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IdentityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TokenResponse> catalogGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Grant type for this API call. You must set the grant type to" ,required=true,schema=@Schema( defaultValue="urn:ibm:params:oauth:grant-type:apikey")) @Valid @RequestParam(value = "grant_type", required = true, defaultValue="urn:ibm:params:oauth:grant-type:apikey") String grantType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The value of the api key." ,required=true,schema=@Schema( defaultValue="eeaf64b6-cee5-4f7e-ac94-57d34690301e")) @Valid @RequestParam(value = "apikey", required = true, defaultValue="eeaf64b6-cee5-4f7e-ac94-57d34690301e") String apikey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TokenResponse>(objectMapper.readValue("{\n  \"access_token\" : \"eyJhbGciOiJIUz\",\n  \"refresh_token\" : \"SPrXw5tBE3\",\n  \"expiration\" : 6,\n  \"token_type\" : \"Bearer\",\n  \"expires_in\" : 0\n}", TokenResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TokenResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TokenResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
