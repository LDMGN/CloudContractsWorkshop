package nl.johannisk.cloud.frontend.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FibonacciNumbersResponse {

    private final List<Integer> fibonacciNumbers;
    private final String instanceId;

    @JsonCreator
    public FibonacciNumbersResponse(@JsonProperty("fibonacciNumbers") List<Integer> fibonacciNumbers, @JsonProperty("instanceId") String instanceId) {
        this.fibonacciNumbers = fibonacciNumbers;
        this.instanceId = instanceId;
    }

    public List<Integer> getFibonacciNumbers() {
        return fibonacciNumbers;
    }

    public String getInstanceId() {
        return instanceId;
    }
}
