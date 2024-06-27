package com.gwenneg.blog.config;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/features")
public class FeaturesResource {

    @Inject
    FeaturesConfigMapping featuresConfigMapping;

    @Inject
    FeaturesConfig featuresConfig;

    @ConfigProperty(name = "fantastic-feature-enabled", defaultValue = "false")
    boolean fantasticFeatureEnabled;

    @GET
    @Path("/awesome")
    public boolean isAwesomeFeatureEnabled() {
        return featuresConfigMapping.awesomeFeatureEnabled();
    }

    @GET
    @Path("/amazing")
    public boolean isAmazingFeatureEnabled() {
        return featuresConfig.isAmazingFeatureEnabled();
    }

    @GET
    @Path("/fantastic")
    public boolean isFantasticFeatureEnabled() {
        return fantasticFeatureEnabled;
    }
}
