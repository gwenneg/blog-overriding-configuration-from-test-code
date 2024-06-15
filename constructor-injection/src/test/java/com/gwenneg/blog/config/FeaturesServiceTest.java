package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class FeaturesServiceTest {

    @Test
    void test() {

        FeaturesService featuresService = new FeaturesService(false, true);

        assertFalse(featuresService.isAwesomeFeatureEnabled());
        assertTrue(featuresService.isAmazingFeatureEnabled());
    }
}
