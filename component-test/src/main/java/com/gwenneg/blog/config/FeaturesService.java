package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class FeaturesService {

    @Inject
    FeaturesConfigMapping featuresConfigMapping;

    @ConfigProperty(name = "fantastic-feature-enabled", defaultValue = "false")
    boolean fantasticFeatureEnabled;

    public boolean isAwesomeFeatureEnabled() {
        return featuresConfigMapping.awesomeFeatureEnabled();
    }

    public boolean isAmazingFeatureEnabled() {
        return featuresConfigMapping.amazingFeatureEnabled();
    }

    public boolean isFantasticFeatureEnabled() {
        return fantasticFeatureEnabled;
    }
}
