package com.gwenneg.blog.config;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/features")
public class FeaturesResource {

    @Inject
    FeaturesConfig featuresConfig;

    @GET
    @Path("/awesome")
    public boolean isAwesomeFeatureEnabled() {
        return featuresConfig.awesomeFeatureEnabled();
    }

    @GET
    @Path("/amazing")
    public boolean isAmazingFeatureEnabled() {
        return featuresConfig.amazingFeatureEnabled();
    }
}
