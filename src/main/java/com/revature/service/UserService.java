package com.revature.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDaoInt;
import com.revature.pojo.User;

@Service
public class UserService implements UserServiceInt {
	
	@Autowired
	UserDaoInt userDao;
	
	Logger log = Logger.getLogger(UserService.class);

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
		User authUser = null;
		log.info("Logging in User: " + user.getUsername());
		//log.info("Validating Password: " + user.getPassword());
		
		if(userDao.login(user) != null) {
			authUser = user;
		}
		
		return authUser;
	}

}
