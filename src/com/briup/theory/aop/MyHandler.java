package com.briup.theory.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private Object target;
	private StudentLogger logger = new StudentLogger();
	public MyHandler() {
	}
	public MyHandler(Object target) {
		this.target = target;
	}
	
	//����1 ���������Ĵ������
	//����2 ������Ҫ���õ���Ŀ���������������Ǹ������ľ���
	//����3 �������÷�����ʱ����Ĳ���
	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		//��ý�������÷���������
		String methodName = m.getName();
		logger.log(methodName + " is invoked...");
		//�÷���ķ�ʽȥ���ý�����Ҫ������õķ���.
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
