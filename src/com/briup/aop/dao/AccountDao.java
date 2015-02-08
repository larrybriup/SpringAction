package com.briup.aop.dao;

import com.briup.aop.pojo.Account;

public interface AccountDao {
	void withdraw(Account acc,double amt);
	void deposit(Account acc,double amt);
}
