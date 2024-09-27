package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;
import io.restassured.RestAssured;
import java.util.Map;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(FeaturesResourceTestProfileTest.class)
public class FeaturesResourceTestProfileTest implements QuarkusTestProfile {

    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of(
                "features.awesome-feature-enabled", "true",
                "amazing-feature-enabled", "true"
        );
    }

    @Test
    void test() {

        RestAssured.given()
                .when().get("/features/awesome")
                .then().body(CoreMatchers.is("true"));

        RestAssured.given()
                .when().get("/features/amazing")
                .then().body(CoreMatchers.is("true"));
    }
}
