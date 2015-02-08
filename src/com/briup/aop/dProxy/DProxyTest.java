package com.briup.aop.dProxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class DProxyTest {
	@Test
	public void proxyTest(){
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
		
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext
			("com/briup/aop/dProxy/beans.xml");
		
		IAccountService service = 
			(IAccountService)ctx.getBean("proxy");
		service.bankAction();
	}
}