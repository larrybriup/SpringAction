package com.briup.aop.advice.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.briup.aop.advice.aspect.MyLogger;


public class AroundAdvice implements MethodInterceptor {

	private MyLogger logger;

	public Object invoke(MethodInvocation mi) throws Throwable {
		// mi.getMethod()获得将来要调用的方法的镜像
		logger.log(mi.getMethod().getName() + " is start...");
		// 这个方法就是用来调用目标对象中的方法的
		Object returnValue = mi.proceed();
		logger.log(mi.getMethod().getName() + " is end...");

		return returnValue;
	}

	public MyLogger getLogger() {
		return logger;
	}

	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}
}
