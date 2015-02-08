package com.briup.db;


public interface AccountDao {
	void withdraw(Account acc,double amt);
	void deposit(Account acc,double amt);
}
