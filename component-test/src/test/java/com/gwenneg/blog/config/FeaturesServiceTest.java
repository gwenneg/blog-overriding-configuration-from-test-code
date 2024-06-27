package com.gwenneg.blog.config;

import io.quarkus.test.component.QuarkusComponentTest;
import io.quarkus.test.component.TestConfigProperty;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusComponentTest
@TestConfigProperty(key = "features.amazing-feature-enabled", value = "true")
public class FeaturesServiceTest {

    // This line will cause a test failure if run in native mode because @Inject is not supported in tests annotated with @QuarkusIntegrationTest.
    @Inject
    FeaturesService featuresService;

    @Test
    @TestConfigProperty(key = "fantastic-feature-enabled", value = "true")
    void test() {

        assertFalse(featuresService.isAwesomeFeatureEnabled());
        assertTrue(featuresService.isAmazingFeatureEnabled());
        assertTrue(featuresService.isFantasticFeatureEnabled());
    }
}
