package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.service.UserServiceInt;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegisterCtrl {
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/register", method=RequestMethod.POST, consumes= {"application/json"})
	public String registerPost(@RequestBody User user, ModelMap modelMap, HttpSession sess) throws JsonProcessingException {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		
		UserServiceInt userService = new UserService();
		user.setDownvotes(0);
		user.setStars(0);
		user.setUpvotes(0);
		user.setRole("user");
		System.out.println(user.toString());
		userService.register(user);
		//System.out.println("HELP");
		//System.out.println(userService.register(user).toString());
		// sess.setAttribute("role", userService.login(user).getRole());
		//ObjectMapper om = new ObjectMapper();
		return "";
	}

}
