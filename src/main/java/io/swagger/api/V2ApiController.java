package io.swagger.api;

import io.swagger.model.AsyncOperation;
import io.swagger.model.Error;
import io.swagger.model.ServiceInstanceAsyncOperation;
import io.swagger.model.ServiceInstanceProvisionRequestBody;
import io.swagger.model.ServiceInstanceProvisionResponse;
import io.swagger.model.ServiceInstanceResource;
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
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> serviceInstanceDeprovision(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "id of instance being deleted", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = true) String planId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous deprovision supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceResource> serviceInstanceGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to fetch", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceResource>(objectMapper.readValue("{\n  \"metadata\" : {\n    \"attributes\" : { },\n    \"labels\" : { }\n  },\n  \"maintenance_info\" : {\n    \"description\" : \"description\",\n    \"version\" : \"version\"\n  },\n  \"service_id\" : \"service_id\",\n  \"dashboard_url\" : \"dashboard_url\",\n  \"parameters\" : { },\n  \"plan_id\" : \"plan_id\"\n}", ServiceInstanceResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceProvisionResponse> serviceInstanceProvision(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to provision", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.DEFAULT, description = "parameters for the requested service instance provision", required=true, schema=@Schema()) @Valid @RequestBody ServiceInstanceProvisionRequestBody body,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceProvisionResponse>(objectMapper.readValue("{\n  \"metadata\" : {\n    \"attributes\" : { },\n    \"labels\" : { }\n  },\n  \"dashboard_url\" : \"dashboard_url\"\n}", ServiceInstanceProvisionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
