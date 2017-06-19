
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
 * <p>Original spec-file type: Results</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "new_number"
})
public class Results {

    @JsonProperty("new_number")
    private Long newNumber;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("new_number")
    public Long getNewNumber() {
        return newNumber;
    }

    @JsonProperty("new_number")
    public void setNewNumber(Long newNumber) {
        this.newNumber = newNumber;
    }

    public Results withNewNumber(Long newNumber) {
        this.newNumber = newNumber;
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
        return ((((("Results"+" [newNumber=")+ newNumber)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
