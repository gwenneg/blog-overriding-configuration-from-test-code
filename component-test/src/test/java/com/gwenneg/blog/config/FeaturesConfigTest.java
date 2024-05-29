package com.gwenneg.blog.config;

import io.quarkus.test.component.QuarkusComponentTest;
import io.quarkus.test.component.TestConfigProperty;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusComponentTest
@TestConfigProperty(key = "amazing-feature-enabled", value = "true")
public class FeaturesConfigTest {

    // This line will cause a test failure if run in native mode because @Inject is not supported in tests annotated with @QuarkusIntegrationTest.
    @Inject
    FeaturesConfig featuresConfig;

    @Test
    void test() {

        assertFalse(featuresConfig.isAwesomeFeatureEnabled());
        assertTrue(featuresConfig.isAmazingFeatureEnabled());
    }
}
