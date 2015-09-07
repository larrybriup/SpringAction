package com.briup.aop.advice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class MyLogger {

	public void log(String msg) {
		System.out.println("log:" + msg);
	}
}
