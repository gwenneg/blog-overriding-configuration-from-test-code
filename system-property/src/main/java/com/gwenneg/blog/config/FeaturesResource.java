package com.gwenneg.blog.config;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/features")
public class FeaturesResource {

    public static final String AWESOME_FEATURE_ENABLED = "awesome-feature-enabled";

    @ConfigProperty(name = AWESOME_FEATURE_ENABLED, defaultValue = "false")
    boolean awesomeFeatureEnabled;

    @GET
    @Path("/awesome")
    public boolean isAwesomeFeatureEnabled() {
        return awesomeFeatureEnabled;
    }
}
