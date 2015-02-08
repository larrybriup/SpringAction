package com.briup.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AnnotationHandler {
	@Pointcut(value="execution(public * com.briup.annotation.service.*.*(..))")
	public void myMethod(){}
	@Before("myMethod()")
	public void before(){
		System.out.println("this is method start!");
	}
	@After("myMethod()")
	public void after(){
		System.out.println("after Method return!");
	}
	@Around("myMethod()")
	public Object arround(ProceedingJoinPoint pjp) 
	throws Throwable{
		System.out.println("enter method!");
		Object obj = pjp.proceed();
		System.out.println("method end!");
		return obj;
	}
	@AfterThrowing("myMethod()")
	public void throwException(){
		System.out.println("throwException()");
	}
}
