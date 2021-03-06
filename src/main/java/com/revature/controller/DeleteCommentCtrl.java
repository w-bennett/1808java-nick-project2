package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.revature.pojo.Comment;
import com.revature.service.CommentService;
import com.revature.service.CommentServiceInt;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class DeleteCommentCtrl {
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/deletecomment", method=RequestMethod.POST, consumes= {"application/json"})
	public String deleteComment(@RequestBody Comment comment, ModelMap modelMap, HttpSession sess) throws JsonProcessingException {
		System.out.println(comment);
		CommentServiceInt commentService = new CommentService();
		
		commentService.deleteComment(comment);

		//ObjectMapper om = new ObjectMapper();
		return "";
	}

}
