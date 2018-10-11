package com.revature.service;

import org.jboss.logging.Logger;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoInt;
import com.revature.pojo.User;


public class UserService implements UserServiceInt {
	
	private static UserDaoInt userDao;
	Logger log = Logger.getLogger(UserService.class);
	
	public UserService(){
		userDao = new UserDao();
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		((UserDao) userDao).openCurrentSessionwithTransaction();
		
		User authUser = null;
		log.info("Logging in User: " + user.getUsername());
		//log.info("Validating Password: " + user.getPassword());
		
		if(userDao.login(user) != null) {
			authUser = user;
		}
		
		((UserDao) userDao).closeCurrentSessionwithTransaction();
		return authUser;
	}

}
