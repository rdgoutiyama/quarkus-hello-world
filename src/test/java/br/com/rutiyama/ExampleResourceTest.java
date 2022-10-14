package br.com.rutiyama;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy5"));
    }

    @Test
    public void testGreetingNameEndpoint() {
        UUID uuid = UUID.randomUUID();
        given()
            .when()
            .pathParam("name", uuid.toString())
            .get("/hello/greeting/{name}")
            .then()
            
                .statusCode(200)
                .body(is("Hello " + uuid.toString()));
    }
}
