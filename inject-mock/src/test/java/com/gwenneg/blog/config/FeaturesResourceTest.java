package com.gwenneg.blog.config;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class FeaturesResourceTest {

    @InjectMock
    FeaturesConfig featuresConfig;

    @Test
    void test() {

        // This line throws a NullPointerException if run in native mode.
        Mockito.when(featuresConfig.isAmazingFeatureEnabled()).thenReturn(true);

        given()
            .when().get("/features/awesome")
            .then().body(is("false"));

        given()
            .when().get("/features/amazing")
            .then().body(is("true"));
    }
}
