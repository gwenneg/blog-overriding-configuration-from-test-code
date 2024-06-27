package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class FeaturesServiceWithConfigProperties {

    private final boolean awesomeFeatureEnabled;
    private final boolean amazingFeatureEnabled;

    public FeaturesServiceWithConfigProperties(
        @ConfigProperty(name = "awesome-feature-enabled", defaultValue = "false") boolean awesomeFeatureEnabled,
        @ConfigProperty(name = "amazing-feature-enabled", defaultValue = "false") boolean amazingFeatureEnabled) {
        this.awesomeFeatureEnabled = awesomeFeatureEnabled;
        this.amazingFeatureEnabled = amazingFeatureEnabled;
    }

    public boolean isAwesomeFeatureEnabled() {
        return awesomeFeatureEnabled;
    }

    public boolean isAmazingFeatureEnabled() {
        return amazingFeatureEnabled;
    }
}
