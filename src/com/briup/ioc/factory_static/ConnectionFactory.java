package com.briup.ioc.factory_static;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactory {

	// private static String driver = "oracle.jdbc.driver.OracleDriver";
	// private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:briupdb";
	// private static String username = "briup";
	// private static String password = "briup";

	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test_db";
	private static String username = "test";
	private static String password = "test";

	public static Object getConnection() throws Exception {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
