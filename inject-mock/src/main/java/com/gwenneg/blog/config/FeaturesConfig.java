package com.gwenneg.blog.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class FeaturesConfig {

    @ConfigProperty(name = "fantastic-feature-enabled", defaultValue = "false")
    boolean fantasticFeatureEnabled;

    public boolean isFantasticFeatureEnabled() {
        return fantasticFeatureEnabled;
    }
}
