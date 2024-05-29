package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestProfile(FeaturesTestProfile.class)
public class FeaturesResourceTest {

    @Test
    void test() {

        given()
            .when().get("/features/awesome")
            .then().body(is("true"));

        given()
           .when().get("/features/amazing")
           .then().body(is("true"));

        given()
            .when().get("/features/fantastic")
            .then().body(is("true"));
    }
}
