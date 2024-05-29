package com.gwenneg.blog.config;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "features")
public interface FeaturesConfig {

    @WithDefault("false")
    boolean awesomeFeatureEnabled();

    @WithDefault("false")
    boolean amazingFeatureEnabled();
}
