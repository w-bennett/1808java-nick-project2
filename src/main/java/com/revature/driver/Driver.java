package com.revature.driver;

import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.service.UserServiceInt;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserServiceInt userService = new UserService();
		User user = new User();
		user.setUsername("tad");
		System.out.println(userService.login(user).toString());
	}

}
