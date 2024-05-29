package com.gwenneg.blog.config;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/features")
public class FeaturesResource {

    public static final String AWESOME_FEATURE_ENABLED = "awesome-feature-enabled";

    @ConfigProperty(name = AWESOME_FEATURE_ENABLED, defaultValue = "false")
    boolean awesomeFeatureEnabled;

    @Inject
    FeaturesConfig featuresConfig;

    @Inject
    FeaturesConfigMapping featuresConfigMapping;

    @GET
    @Path("/awesome")
    public boolean isAwesomeFeatureEnabled() {
        return awesomeFeatureEnabled;
    }

    @GET
    @Path("/amazing")
    public boolean isAmazingFeatureEnabled() {
        return featuresConfig.isAmazingFeatureEnabled();
    }

    @GET
    @Path("/fantastic")
    public boolean isFantasticFeatureEnabled() {
        return featuresConfigMapping.fantasticFeatureEnabled();
    }
}
