package com.briup.jtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class AOPTest {

	private ApplicationContext container;

	@Test
	public void aop_beforeAdvice() {
		container = new ClassPathXmlApplicationContext("com/briup/aop/advice/before/before.xml");
		IAccountService proxy = (IAccountService) container.getBean("proxy");
		proxy.bankAction();
	}

	@Test
	public void aop_afterAdvice() {
		container = new ClassPathXmlApplicationContext("com/briup/aop/advice/after/after.xml");
		IAccountService proxy = (IAccountService) container.getBean("proxy");
		proxy.bankAction();
	}

	@Test
	public void aop_aroundAdvice() {
		container = new ClassPathXmlApplicationContext("com/briup/aop/advice/around/around.xml");
		IAccountService proxy = (IAccountService) container.getBean("proxy");
		proxy.bankAction();
	}
	
	@Test
	public void aop_throwsAdvice() {
		container = new ClassPathXmlApplicationContext("com/briup/aop/advice/throwException/throwing.xml");
		IAccountService proxy = (IAccountService) container.getBean("proxy");
		proxy.bankActionException();
	}
	
	@Test
	public void aop_dynamicProxy(){
		/*InvocationHandler handler = 
			new LogHandler();
		Class[] interfaces = 
			new Class[]{IAccountService.class};
		Object target = 
			new AccountServiceImpl();
		Account acc = new Account();
		AccountDao dao = new AccountDaoImpl();
		AccountServiceImpl simpl = (AccountServiceImpl)target;
		simpl.setAccount(acc);
		simpl.setAccountDao(dao);
		ProxyFactoryBean factory = 
			new ProxyFactoryBean();
		factory.setHandler(handler);
		factory.setInterfaces(interfaces);
		factory.setTarget(target);
		Object obj = factory.getObject();
		System.out.println(obj.getClass());
		((IAccountService)obj).bankAction();*/
		
		container = new ClassPathXmlApplicationContext("com/briup/aop/advice/dProxy/beans.xml");
		IAccountService proxy = (IAccountService) container.getBean("proxy");
		proxy.bankAction();
	}

}
