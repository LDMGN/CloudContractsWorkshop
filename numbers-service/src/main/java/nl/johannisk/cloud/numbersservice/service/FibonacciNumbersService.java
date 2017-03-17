package nl.johannisk.cloud.numbersservice.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FibonacciNumbersService {

    public List<Integer> calculateFibonacciNumbers(int from, int to) {
        List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0));
        int nextFibonacci = 1;
        while (nextFibonacci <= to) {
            fibonacci.add(nextFibonacci);
            nextFibonacci = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
        }
        return fibonacci.stream().filter(number -> number >= from).collect(Collectors.toList());
    }
}