package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.gwenneg.blog.config.FeaturesResource.AWESOME_FEATURE_ENABLED;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FeaturesResourceTest {

    @Test
    @Order(1)
    void test1() {

        // This line has no effect on the test outcome when the test is run in native mode.
        System.setProperty(AWESOME_FEATURE_ENABLED, "true");

        given()
                .when().get("/features/awesome")
                .then().body(is("true"));
    }

    @Test
    @Order(2)
    void test2() {

        System.setProperty(AWESOME_FEATURE_ENABLED, "false");

        /*
         * This test depends on a CDI bean with a singleton scope which was already initialized by the previous test.
         * As a consequence, the outcome of this test cannot be changed from the system property.
         */
        given()
                .when().get("/features/awesome")
                .then().body(is("true"));
    }
}
