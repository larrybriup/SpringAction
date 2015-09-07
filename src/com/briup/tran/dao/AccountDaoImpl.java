package com.briup.tran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.briup.tran.hibernate.Account;

public class AccountDaoImpl extends HibernateTemplate implements AccountDao {

	private SessionFactory sessionFactory;

	@Override
	public void save(Account account) throws DataAccessException {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
		session.save(account);
	}

	@Override
	public boolean update(Account account) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Account account) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
