package com.briup.aop.advice.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterHandler implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("after returning " + "\nlogger: target=" + target
				+ "\nmethod Name=" + method.getName() + " \nargs are:" + args
				+ "\nreturnValue=" + returnValue);
	}
}
