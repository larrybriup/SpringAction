package com.briup.db.jdbc;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.AccountDao;

public class JdbcTest {
	@Test
	public void jdbcTest() {
		try {
			String path = "com/briup/db/jdbc/jdbc.xml";
			ApplicationContext ctn = new ClassPathXmlApplicationContext(path);
			AccountDao dao=
					(AccountDao) ctn.getBean("accountDao");
			dao.withdraw(null, 23);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
