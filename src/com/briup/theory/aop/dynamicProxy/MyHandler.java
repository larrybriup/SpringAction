package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler 
implements InvocationHandler {
	private Object target; //IStudentServide
	private StudentLogger logger = new StudentLogger();
	public MyHandler() {
	}
	public MyHandler(Object target) {
		this.target = target;
	}
	
	//参数1 将来所产生的代理对象 Proxy4$
	//参数2 将来需要调用到的目标对象里面真正的那个方法的镜像
	//参数3 将来调用方法的时候所传的参数
	public Object invoke(Object proxy, Method m,
			Object[] args)
			throws Throwable {
		//获得将来所调用方法的名字
		String methodName = m.getName();
		logger.log(methodName + " is invoked...");
		//用反射的方式去调用将来需要真正调用的方法.
		Object o = m.invoke(target,args);
		
		return o;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public StudentLogger getLogger() {
		return logger;
	}
	public void setLogger(StudentLogger logger) {
		this.logger = logger;
	}
}
