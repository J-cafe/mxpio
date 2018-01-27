package com.mxpio.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "mxpio", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
