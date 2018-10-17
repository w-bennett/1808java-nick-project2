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
public class RoleCtrl {
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/role", method=RequestMethod.POST, consumes={"application/json"})
	public String rolePost(@RequestBody User user, ModelMap modelMap, HttpSession sess) throws JsonProcessingException {
		String role1 = (String) sess.getAttribute("role");
		String user1 = (String) sess.getAttribute("username");
		System.out.println(role1);
		System.out.println(user1);

		User user2 = new User();
		user2.setUsername(user1);
		
		UserServiceInt userService = new UserService();
		User user3 = userService.login(user2);
		System.out.println(user3);
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(user3);
	}

}
