package com.briup.db.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.briup.db.Account;
import com.briup.db.AccountDao;

public class JdbcDaoImpl implements AccountDao {

	private DataSource dataSource;

	public void withdraw(Account account, double amount) {
		try {
			Connection connection = dataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deposit(Account account, double amount) {
		try {
			Connection connection = dataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
