package com.briup.db;

public interface AccountDao {

	void withdraw(Account account, double amount);

	void deposit(Account account, double amount);
}
