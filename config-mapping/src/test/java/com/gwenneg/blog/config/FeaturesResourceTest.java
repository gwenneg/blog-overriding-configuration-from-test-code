package com.gwenneg.blog.config;

import io.quarkus.test.InjectMock;
import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.config.SmallRyeConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.Config;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FeaturesResourceTest {

    @Inject
    Config config;

    @Produces // Optional
    @ApplicationScoped
    @Mock
    FeaturesConfig featuresConfig() {
        return config.unwrap(SmallRyeConfig.class).getConfigMapping(FeaturesConfig.class);
    }

    @InjectMock
    FeaturesConfig featuresConfig;

    @Test
    void test() {

        // This line throws a NullPointerException if run in native mode.
        Mockito.when(featuresConfig.amazingFeatureEnabled()).thenReturn(true);

        given()
                .when().get("/features/awesome")
                .then().body(is("false"));

        given()
                .when().get("/features/amazing")
                .then().body(is("true"));
    }
}
