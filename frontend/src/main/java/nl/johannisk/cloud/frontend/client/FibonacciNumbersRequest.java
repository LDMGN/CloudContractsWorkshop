package nl.johannisk.cloud.frontend.client;

public class FibonacciNumbersRequest {

    //TODO 5.2
    private final Integer untill;

    public FibonacciNumbersRequest(Integer untill) {
        this.untill = untill;
    }

    public Integer getUntil() {
        return untill;
    }
}
