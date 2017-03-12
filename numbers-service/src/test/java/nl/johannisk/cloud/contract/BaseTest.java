package nl.johannisk.cloud.contract;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import nl.johannisk.cloud.numbersservice.NumbersServiceApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NumbersServiceApplication.class, webEnvironment =     SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseTest {

    @Autowired
    private WebApplicationContext appContext;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(appContext);
    }
}
