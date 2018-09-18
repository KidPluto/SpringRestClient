package net.kidpluto.RestClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MbtaResponse {

    private String data;

    public MbtaResponse() {
    }

    public String getType() {
        return data;
    }

    public void setType(String type) {
        this.data = type;
    }

    @Override
    public String toString() {
        return "The response is {" +
                "type='" + data + '\'' +
                '}';
    }
}
