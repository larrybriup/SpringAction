package com.briup.aop.dao;

import com.briup.aop.pojo.Account;

public interface AccountDao {

	void withdraw(Account account, double amount);

	void deposit(Account account, double amount);
}
