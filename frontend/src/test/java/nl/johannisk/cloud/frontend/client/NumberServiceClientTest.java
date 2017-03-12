package nl.johannisk.cloud.frontend.client;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner
public class NumberServiceClientTest {

    @Autowired
    private RestTemplate restTemplate;
    private NumberServiceClient client;

    @Before
    public void setUp() {
        client = new NumberServiceClient(restTemplate);
    }

    @Test
    public void getPrimeNumbersFrom1till10() {
        PrimeNumbersResponse response = client.calculatePrimeNumbers(new PrimeNumbersRequest(1,10));

        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);

        assertTrue(response.getPrimeNumbers().equals(primes));
    }

    // TODO 3.3
}