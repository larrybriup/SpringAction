package com.briup.tran.service;

import com.briup.tran.Account;
import com.briup.tran.dao.AccountDao;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void saveorupdate(Account account) {
		accountDao.save(account);
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Account account) {
		// TODO Auto-generated method stub
		
	}

}
