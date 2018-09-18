package net.kidpluto.RestClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomSpringBootQuote {

    private String type;
    private RandomSpringBootQuoteValue value;

    public RandomSpringBootQuote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RandomSpringBootQuoteValue getValue() {
        return value;
    }

    public void setValue(RandomSpringBootQuoteValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
