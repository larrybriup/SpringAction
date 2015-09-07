package com.briup.aop.advice.throwException;

import org.springframework.aop.ThrowsAdvice;

import com.briup.aop.advice.aspect.MyLogger;

public class ThrowingAdvice implements ThrowsAdvice {

	private MyLogger logger;

	public MyLogger getLogger() {
		return logger;
	}

	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}

	// 这里这个方法的名字一定要叫afterThrowing
	public void afterThrowing(Throwable e) {
		logger.log(e.getMessage());
	}

}
