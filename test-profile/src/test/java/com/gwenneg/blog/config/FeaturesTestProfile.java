package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Map;

import static com.gwenneg.blog.config.FeaturesConfig.AMAZING_FEATURE_ENABLED;
import static com.gwenneg.blog.config.FeaturesResource.AWESOME_FEATURE_ENABLED;

public class FeaturesTestProfile implements QuarkusTestProfile {

    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of(
            AWESOME_FEATURE_ENABLED, "true",
            AMAZING_FEATURE_ENABLED, "true",
            "features.fantastic-feature-enabled", "true"
        );
    }
}
