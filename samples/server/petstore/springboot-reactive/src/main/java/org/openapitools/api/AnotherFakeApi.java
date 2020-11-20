/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Client;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "another-fake", description = "the another-fake API")
public interface AnotherFakeApi {

    default AnotherFakeApiDelegate getDelegate() {
        return new AnotherFakeApiDelegate() {};
    }

    /**
     * PATCH /another-fake/dummy : To test special tags
     * To test special tags and operation ID starting with number
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "To test special tags", nickname = "call123testSpecialTags", notes = "To test special tags and operation ID starting with number", response = Client.class, tags={ "$another-fake?", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @PatchMapping(
        value = "/another-fake/dummy",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default Mono<ResponseEntity<Client>> call123testSpecialTags(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Mono<Client> body, ServerWebExchange exchange) {
        return getDelegate().call123testSpecialTags(body, exchange);
    }

}
