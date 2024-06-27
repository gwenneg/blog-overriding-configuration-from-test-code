package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class FeaturesServiceWithConfigPropertiesTest {

    @Test
    void test() {

        FeaturesServiceWithConfigProperties featuresServiceWithConfigProperties = new FeaturesServiceWithConfigProperties(false, true);

        assertFalse(featuresServiceWithConfigProperties.isAwesomeFeatureEnabled());
        assertTrue(featuresServiceWithConfigProperties.isAmazingFeatureEnabled());
    }
}
