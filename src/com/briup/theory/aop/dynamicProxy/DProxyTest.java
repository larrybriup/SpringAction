package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class DProxyTest {

	@Test
	public void test() {
		IStudentService service = new StudentServiceImpl();
		// service是我们的目标对象。
		// 我们要给目标对象产生代理对象。
		// 目标对象service只能单独执行delete方法。
		// 但是我们需要的是:先执行log日志方法再执行delete方法。
		// 目标对象service做不到这个要求,所以我们要给目标对象
		// service生成一个代理对象去完成这俩个操作.

		// 怎么给目标对象生成代理对象:
		// JDK动态代理的方式

		// 获得目标对象的Class对象
		Class c = service.getClass();
		// 获得目标对象的类加载器对象
		ClassLoader classLoader = c.getClassLoader();

		// 获得目标对象所实现的所有接口
		Class[] interfaces = c.getInterfaces();

		// 获得一个InvocationHandler接口的实现类对象,并把目标对象传进去
		InvocationHandler invocationHandler = new MyHandler(service);

		// 参数1 目标对象的类加载器对象
		// 参数2 目标对象所实现的所有接口. Class类型数组
		// 参数3 InvocationHandler接口的实现类对象
		IStudentService proxy = (IStudentService) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

		System.out.println(service.getClass());
		System.out.println(proxy.getClass());
		System.out.println("---------------");
		proxy.delete(1);
		System.out.println("---------------");
		proxy.save(null);
		System.out.println("---------------");
		proxy.find(1);
		System.out.println("---------------");
		System.out.println(proxy.toString());
	}
}
