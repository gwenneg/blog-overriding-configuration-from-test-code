package com.gwenneg.blog.config;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Map;

public class FeaturesTestProfile implements QuarkusTestProfile {

    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of(
            "features.awesome-feature-enabled", "true",
            "amazing-feature-enabled", "true",
            "fantastic-feature-enabled", "true"
        );
    }
}
