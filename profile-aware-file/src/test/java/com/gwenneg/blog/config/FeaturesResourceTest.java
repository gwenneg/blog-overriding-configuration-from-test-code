package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestProfile(FeaturesResourceTest.class)
public class FeaturesResourceTest implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "blog";
    }

    @Test
    void test() {

        given()
            .when().get("/features/awesome")
            .then().body(is("false"));

        given()
           .when().get("/features/amazing")
           .then().body(is("true"));
    }
}
