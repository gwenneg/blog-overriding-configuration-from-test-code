package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class FeaturesConfig {

    @ConfigProperty(name = "amazing-feature-enabled", defaultValue = "false")
    boolean amazingFeatureEnabled;

    public boolean isAmazingFeatureEnabled() {
        return amazingFeatureEnabled;
    }
}
