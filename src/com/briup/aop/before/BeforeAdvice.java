package com.briup.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.briup.aop.aspect.MyLogger;

public class BeforeAdvice 
implements MethodBeforeAdvice{
	private MyLogger logger;
	
	//参数1 将来我们需要调用的目标对象中的方法镜像
	//参数2 将来调用方法的时候所传过来的参数
	//参数3 目标对象
	public void before(Method m, Object[] args, Object target)
			throws Throwable {
		
		logger.log(m.getName()+" is invoked..");
		
		/*
		 * 注意:这里一定不要自己手动的用反射去
		 * 调用这个目标对象中的方法,因为spring
		 * 会帮我们去调用的,如果我们这个再去调用这个
		 * 方法,那么这这个方法会被调用俩次.
		 * 
		 * m.invoke(target,args);
		 * 
		 * */
	}

	public MyLogger getLogger() {
		return logger;
	}

	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}
}
