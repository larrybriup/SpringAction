package com.briup.tran.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.tran.Account;
import com.briup.tran.service.AccountService;

public class HibernateTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
						"com/briup/tran/hibernate/spring_hibernate.xml");

		Account account = (Account) ctx.getBean("account");
		AccountService service = (AccountService) ctx.getBean("accountService");
		service.saveUpdate(account);
	}
}
