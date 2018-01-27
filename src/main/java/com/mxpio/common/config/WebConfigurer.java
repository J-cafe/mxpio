package com.mxpio.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
class WebConfigurer extends WebMvcConfigurerAdapter {
	@Autowired
	MxpIOConfig mxpioConfig;
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/files/**").addResourceLocations("file:///"+mxpioConfig.getUploadPath());
		super.addResourceHandlers(registry);
	}

}