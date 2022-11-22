package com.ty.annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.ty.annotation_config"})
public class Config {
	@Bean(name="food")
	public Food food() {
		return new Food();
	}

}
