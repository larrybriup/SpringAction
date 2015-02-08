package com.briup.tran.dao;

import org.springframework.dao.DataAccessException;

import com.briup.tran.Account;

public interface AccountDao {
	void save(Account account) throws DataAccessException;
	boolean update(Account account) throws DataAccessException;
	boolean delete(Account account) throws DataAccessException;
}
