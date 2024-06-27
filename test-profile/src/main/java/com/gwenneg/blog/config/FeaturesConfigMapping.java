package com.gwenneg.blog.config;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "features")
public interface FeaturesConfigMapping {

    @WithDefault("false")
    boolean awesomeFeatureEnabled();
}
