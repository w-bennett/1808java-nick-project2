package com.revature.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.service.UserServiceInt;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		UserServiceInt userService = new UserService();
		User user = new User();
		user.setUsername("tad");
		System.out.println(userService.login(user).toString());
		
//		Session sess = SessionUtil.getSession();
//		Query query2 = sess.createNativeQuery("SELECT * FROM \"user\"");
//		List<User> users = query2.getResultList();
//		System.out.println(users);
	}

}
