package com.briup.tran.service;

import com.briup.tran.dao.AccountDao;
import com.briup.tran.hibernate.Account;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void saveUpdate(Account account) {
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
