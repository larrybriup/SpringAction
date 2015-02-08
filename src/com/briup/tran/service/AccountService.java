package com.briup.tran.service;

import com.briup.tran.Account;

public interface AccountService {
	void saveorupdate(Account account);
	void update(Account account);
	void remove(Account account);
}
