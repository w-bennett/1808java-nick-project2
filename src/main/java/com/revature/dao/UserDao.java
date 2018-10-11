package com.revature.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.pojo.User;

@Repository("UserDaoInt")
public class UserDao implements UserDaoInt {

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().get(User.class, user.getUsername());
	}

}
