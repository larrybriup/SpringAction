package com.briup.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfterHandler implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("after returning " + " logger: target=" + target
				+ " method Name=" + method.getName() + " args are:" + args
				+ " returnValue=" + returnValue);
	}
}
