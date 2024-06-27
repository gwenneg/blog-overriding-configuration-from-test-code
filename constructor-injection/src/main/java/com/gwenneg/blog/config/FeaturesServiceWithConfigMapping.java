package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FeaturesServiceWithConfigMapping {

    private final FeaturesConfigMapping featuresConfigMapping;

    public FeaturesServiceWithConfigMapping(FeaturesConfigMapping featuresConfigMapping) {
        this.featuresConfigMapping = featuresConfigMapping;
    }

    public boolean isAwesomeFeatureEnabled() {
        return featuresConfigMapping.awesomeFeatureEnabled();
    }

    public boolean isAmazingFeatureEnabled() {
        return featuresConfigMapping.amazingFeatureEnabled();
    }
}
