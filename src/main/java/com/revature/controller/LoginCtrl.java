package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.service.UserServiceInt;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginCtrl {
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes= {"application/json"})
	public String loginPost(@RequestBody User user, ModelMap modelMap, HttpSession sess) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		UserServiceInt userService = new UserService();
		System.out.println(userService.login(user).toString());
		return "home";
	}

}
