package nl.johannisk.cloud.numbersservice.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import nl.johannisk.cloud.numbersservice.service.FibonacciNumbersService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fibonaccinumbers")
public class FibonacciNumbersController {

    private final FibonacciNumbersService fibonacciNumbersService;

    private final EurekaInstanceConfig instanceConfig;

    public FibonacciNumbersController(FibonacciNumbersService fibonacciNumbersService, EurekaInstanceConfig instanceConfig) {
        this.fibonacciNumbersService = fibonacciNumbersService;
        this.instanceConfig = instanceConfig;
    }

    @RequestMapping(method = RequestMethod.POST)
    public FibonacciNumbersResponse calculateFibonacciNumbers(@RequestBody @Validated FibonacciNumbersRequest fibonacciNumbersRequest) {
        List<Integer> fibonacciNumbers = fibonacciNumbersService.calculateFibonacciNumbers(fibonacciNumbersRequest.getFrom(), fibonacciNumbersRequest.getTo());
        return new FibonacciNumbersResponse(fibonacciNumbers, instanceConfig.getInstanceId());
    }

}
