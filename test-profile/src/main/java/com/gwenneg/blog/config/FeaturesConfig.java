package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class FeaturesConfig {

    public static final String AMAZING_FEATURE_ENABLED = "amazing-feature-enabled";

    @ConfigProperty(name = AMAZING_FEATURE_ENABLED, defaultValue = "false")
    boolean amazingFeatureEnabled;

    public boolean isAmazingFeatureEnabled() {
        return amazingFeatureEnabled;
    }
}
