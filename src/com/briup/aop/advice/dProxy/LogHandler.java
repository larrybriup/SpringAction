package com.briup.aop.advice.dProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 拦截器
public class LogHandler implements InvocationHandler {

	// 构建被代理对象
	private Object target;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		if (method.getName().equals("bankAction") && !"".equals(method.getName())) {
			System.out.println("logger:" + proxy.getClass() + " method:" + method.getName() + " start!");
			obj = method.invoke(this.target, args);
		}
		return obj;
	}

	/*
	 * // 绑定代理，返回的Object就是代理对象 public Object bind(Object target){ this.target =
	 * target; Proxy.newProxyInstance (target.getClass().getClassLoader(),
	 * target.getClass().getInterfaces(),this); Object obj =
	 * Proxy.newProxyInstance (target.getClass().getClassLoader(), new
	 * Class[]{AccountDao.class},this); return obj; }
	 */

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
}
