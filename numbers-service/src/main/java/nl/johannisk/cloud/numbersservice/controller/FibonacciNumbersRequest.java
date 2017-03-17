package nl.johannisk.cloud.numbersservice.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FibonacciNumbersRequest {

    private final Integer from;
    private final Integer to;

    @JsonCreator
    public FibonacciNumbersRequest(@JsonProperty("from") Integer from,
                                   @JsonProperty("to") Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }
}
