package io.swagger.api;

import io.swagger.model.ResourceInstanceUsage;
import io.swagger.model.UsageResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-23T15:34:55.696Z[GMT]")
@RestController
public class V4ApiController implements V4Api {

    private static final Logger log = LoggerFactory.getLogger(V4ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V4ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UsageResponse> catalogGet(@Parameter(in = ParameterIn.PATH, description = "The resource for which the usage is submitted.", required=true, schema=@Schema()) @PathVariable("resource_id") String resourceId,@Parameter(in = ParameterIn.DEFAULT, description = "parameters for the requested service instance provision", required=true, schema=@Schema()) @Valid @RequestBody List<ResourceInstanceUsage> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsageResponse>(objectMapper.readValue("{\n  \"resources\" : [ {\n    \"code\" : \"usage_submitted\",\n    \"location\" : \"/v4/metering/resources/sdk-for-nodejs/usage/normalized/t%2F0001501468312892-0-0-1-0%2Fk%2F265d9d22597d4ee589138929093f1246\",\n    \"message\" : \"Usage submitted successfully\",\n    \"status\" : 0\n  }, {\n    \"code\" : \"usage_submitted\",\n    \"location\" : \"/v4/metering/resources/sdk-for-nodejs/usage/normalized/t%2F0001501468312892-0-0-1-0%2Fk%2F265d9d22597d4ee589138929093f1246\",\n    \"message\" : \"Usage submitted successfully\",\n    \"status\" : 0\n  } ]\n}", UsageResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsageResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
