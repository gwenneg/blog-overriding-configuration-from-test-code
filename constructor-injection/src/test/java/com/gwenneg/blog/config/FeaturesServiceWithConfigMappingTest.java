package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class FeaturesServiceWithConfigMappingTest {

    @Test
    void test() {

        FeaturesConfigMapping featuresConfigMapping = new FeaturesConfigMapping() {
            @Override
            public boolean awesomeFeatureEnabled() {
                return false;
            }

            @Override
            public boolean amazingFeatureEnabled() {
                return true;
            }
        };

        FeaturesServiceWithConfigMapping featuresServiceWithConfigMapping = new FeaturesServiceWithConfigMapping(featuresConfigMapping);

        assertFalse(featuresServiceWithConfigMapping.isAwesomeFeatureEnabled());
        assertTrue(featuresServiceWithConfigMapping.isAmazingFeatureEnabled());
    }
}
