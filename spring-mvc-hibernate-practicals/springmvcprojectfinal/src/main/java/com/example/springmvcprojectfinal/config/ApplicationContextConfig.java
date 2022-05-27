package com.example.springmvcprojectfinal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {
	
	@Bean(name = "viewResolver")
	public ViewResolver getViewResolver() {
		FreeMarkerViewResolver 
	}

	
}
