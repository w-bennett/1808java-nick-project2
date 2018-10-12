package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoInt;
import com.revature.pojo.User;


public class UserService implements UserServiceInt {
	
	private static UserDaoInt userDao;
	
	public UserService(){
		userDao = new UserDao();
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		((UserDao) userDao).openCurrentSession();
		
		User authUser = null;
		
		if(userDao.login(user) != null) {
			authUser = user;
		}
		
		((UserDao) userDao).closeCurrentSession();
		return authUser;
	}

}
