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
		((UserDao) userDao).openCurrentSession();
		
		Integer userid = userDao.getUserId(user);
		
		User authUser = null;
		
		if(userDao.login(userid) != null) {
			authUser = userDao.login(userid);
		}
		
		((UserDao) userDao).closeCurrentSession();
		return authUser;
	}

}
