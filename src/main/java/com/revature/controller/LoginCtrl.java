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
public class LoginCtrl {
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes= {"application/json"})
	public String loginPost(@RequestBody User user, ModelMap modelMap, HttpSession sess) throws JsonProcessingException {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		UserServiceInt userService = new UserService();
		// System.out.println(userService.login(user).toString());
		User user2 = userService.login(user);
//		sess.setAttribute("role", userService.login(user).getRole());
//		sess.setAttribute("username", userService.login(user).getUsername());
//		System.out.println(sess.getAttribute("role"));
//		System.out.println(sess.getAttribute("username"));
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(user2);
	}

}
