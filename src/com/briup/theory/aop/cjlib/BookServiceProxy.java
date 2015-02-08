package com.briup.theory.aop.cjlib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class BookServiceProxy 
	implements MethodInterceptor {  
	    private Object target;  
	  
	    /** 
	     * 创建代理对象 
	     *  
	     * @param target 
	     * @return 
	     */  
	    public Object getInstance(Object target) {  
	        this.target = target;  
	        Enhancer enhancer = new Enhancer();  
	        enhancer.setSuperclass(this.target.getClass());  
	        // 回调方法  
	        enhancer.setCallback(this);  
	        // 创建代理对象  
	        return enhancer.create();  
	    }  
	  
	    @Override  
	    // 回调方法  
	    public Object intercept(Object obj, Method method, Object[] args,  
	            MethodProxy proxy) throws Throwable {  
	        System.out.println("开始操作！");  
	        proxy.invokeSuper(obj, args);  
	        System.out.println("操作结束！");  
	        return null; 
	    }  
}
