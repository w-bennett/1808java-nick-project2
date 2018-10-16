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
		String un = "tadrill";
		String pw = "tadrill";
		Integer userid = 1;
		
		User user = new User();
		user.setPassword(pw);
		user.setUsername(un);
		
		System.out.println(userService.login(user).toString());
		
//		Session sess = SessionUtil.getSession();
//		String hql = "FROM User";
//		Query query = sess.createQuery(hql);
//		List<User> users = query.list();
//		System.out.println(users);
	}

}
