package com.briup.annotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.briup.annotation.dao.UserDao;
import com.briup.annotation.pojo.User;

@Component(value="userService")
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl 
implements UserService{
	@Resource
	private UserDao userDao;
	
	@Override
	public void save(User user) throws Exception {
		userDao.save(user);
//		System.out.println("save()");
//		throw new Exception("错了吧,小样");
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
