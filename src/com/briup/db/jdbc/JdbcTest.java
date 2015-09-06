package com.briup.db.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.AccountDao;

public class JdbcTest {

	@Test
	public void jdbcTest() {
		String path = "com/briup/db/jdbc/jdbc.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(path);
		AccountDao dao = (AccountDao) cxt.getBean("accountDao");
		dao.withdraw(null, 23);
	}
}
