package com.briup.aop.advice.dProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean {

	private InvocationHandler handler;
	private Object target;
	private Class[] interfaces;

	// 根据被代理对象使用JDK代理机制，产生代理对象
	// 此对象就是将来最终操作方法的对象 Proxy$..
	public Object getObject() {
		((LogHandler) handler).setTarget(target);
		Object obj = Proxy.newProxyInstance(((LogHandler) handler).getTarget().getClass().getClassLoader(),
						interfaces, handler);
		return obj;
	}

	public InvocationHandler getHandler() {
		return handler;
	}

	public void setHandler(InvocationHandler handler) {
		this.handler = handler;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Class[] getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Class[] interfaces) {
		this.interfaces = interfaces;
	}
}
