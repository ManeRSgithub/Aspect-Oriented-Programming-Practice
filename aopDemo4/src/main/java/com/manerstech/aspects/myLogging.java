package com.manerstech.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect()
public class myLogging {
	
	@Before("execution(* com.manerstech.services.Transactions.*(..))")
	public void myLogging() {
		System.out.println("---Logic for Logging---");
	}
}
