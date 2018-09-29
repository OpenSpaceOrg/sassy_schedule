package sassy.rest;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sassy.app.App;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = {App.class})
public class SessionsTest {
    @Value("${local.server.port}") private int serverPort;

    @Before
    public void setUp() {
        RestAssured.port = serverPort;
    }

    @Test
    public void getSingleSession() {
        // @formatter:off
        when()
            .get("/conference/be/session/1")
        .then()
            .body("id", is("1"));
        // @formatter:on
    }

}
