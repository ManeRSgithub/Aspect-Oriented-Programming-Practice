package com.manerstech.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.manerstech.aspects.myLogging;
import com.manerstech.services.TransactionServices;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfigFile {
	@Bean
	public myLogging loggingAspect() {
		return new myLogging();
	}
	@Bean
	public TransactionServices trans() {
		return new TransactionServices();
	}
}
