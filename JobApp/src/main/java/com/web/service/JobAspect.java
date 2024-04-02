package com.web.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JobAspect {

	@Before(value = "execution(* com.web.controller.JobRestController.*(..))")
	public void beforeAdvise(JoinPoint jp) {
		System.out.println("Before called " + jp.getSignature());
	}

	@After(value = "execution(* com.web.controller.JobRestController.*(..))")
	public void afterAdvise(JoinPoint jp) {
		System.out.println("After called " + jp.getSignature());
	}

	@AfterReturning(value = "execution(* com.web.controller.JobRestController.*(..))")
	public void afterReturnAdvise(JoinPoint jp) {
		System.out.println("After return  called " + jp.getSignature());
	}
}
