package com.briup.aop.dao;

import org.springframework.stereotype.Component;

import com.briup.aop.pojo.Account;

@Component("accountDao")
public class AccountDaoImpl implements AccountDao {

	@Override
	public void withdraw(Account account, double amount) {
		System.out.println("this is withdraw!");
	}

	@Override
	public void deposit(Account account, double amount) {
		System.out.println("this is deposit!");
	}
}
