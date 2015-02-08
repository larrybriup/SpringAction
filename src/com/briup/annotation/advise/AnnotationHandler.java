package com.briup.annotation.advise;

import org.aspectj.lang.ProceedingJoinPoint;


public class AnnotationHandler {
	public void before(){
		System.out.println("this is method start!");
	}
	public void after(){
		System.out.println("after Method return!");
	}
	public Object arround(ProceedingJoinPoint pjp) 
	throws Throwable{
		System.out.println("enter method!");
		Object obj = pjp.proceed();
		System.out.println("method end!");
		return obj;
	}
}
