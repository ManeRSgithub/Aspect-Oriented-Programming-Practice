package com.manerstech.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.manerstech.aspects.myLogging;
import com.manerstech.services.Transactions;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfigFile {
	@Bean
	public Transactions transactions() {
		return new Transactions();
	}
	
	@Bean
	public myLogging loggingAspect() {
		return new myLogging();
	}
}
