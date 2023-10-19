package com.manerstech.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class myLogging {
	
	@After("execution(* com.manerstech.services.TransactionServices.*(..))")
	public void Logging() {
		System.out.println("---implementation logic for Logging-----");
	}
}
