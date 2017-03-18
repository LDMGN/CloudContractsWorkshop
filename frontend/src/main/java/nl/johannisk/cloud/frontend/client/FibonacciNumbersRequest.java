package nl.johannisk.cloud.frontend.client;

public class FibonacciNumbersRequest {
    private final Integer from;
    private final Integer to;

    public FibonacciNumbersRequest(Integer from, Integer to) {
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
