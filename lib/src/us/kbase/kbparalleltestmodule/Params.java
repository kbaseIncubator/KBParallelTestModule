
package us.kbase.kbparalleltestmodule;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Params</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "throw_error",
    "number"
})
public class Params {

    @JsonProperty("throw_error")
    private Long throwError;
    @JsonProperty("number")
    private Long number;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("throw_error")
    public Long getThrowError() {
        return throwError;
    }

    @JsonProperty("throw_error")
    public void setThrowError(Long throwError) {
        this.throwError = throwError;
    }

    public Params withThrowError(Long throwError) {
        this.throwError = throwError;
        return this;
    }

    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    public Params withNumber(Long number) {
        this.number = number;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("Params"+" [throwError=")+ throwError)+", number=")+ number)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
