package com.briup.annotation.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.briup.annotation.pojo.User;

public interface UserDao {

	public void save(User user) throws DataAccessException;

	public void delete(int id) throws DataAccessException;

	public void update(User user) throws DataAccessException;

	public List<User> query() throws DataAccessException;

	public User get(int id) throws DataAccessException;
}
