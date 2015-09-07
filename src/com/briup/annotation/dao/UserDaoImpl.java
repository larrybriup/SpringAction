package com.briup.annotation.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.briup.annotation.pojo.User;

@Component(value = "userDao")
public class UserDaoImpl extends HibernateDaoSupport // HibernateTemplate
				implements UserDao {

	@Override
	public void save(User user) throws DataAccessException {
		// super.save(user);
		getHibernateTemplate().save(user);
	}

	@Override
	public void delete(int id) throws DataAccessException {
//		 super.delete(id);
	}

	@Override
	public void update(User user) throws DataAccessException {
		// super.update(user);
	}

	@Override
	public List<User> query() throws DataAccessException {
		String hql = "from com.briup.annotation.User";
		// return find(hql);
		return null;
	}

	@Override
	public User get(int id) throws DataAccessException {
		// return get(User.class,id);
		return null;
	}
}
