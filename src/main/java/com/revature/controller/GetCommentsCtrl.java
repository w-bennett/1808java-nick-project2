package com.revature.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.revature.pojo.Comment;
import com.revature.service.CommentService;
import com.revature.service.CommentServiceInt;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class GetCommentsCtrl {
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getAllComments", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Comment> commentPost(ModelMap modelMap, HttpSession sess) throws JsonProcessingException {

		CommentServiceInt commentService = new CommentService();
		
		commentService.readAllComments();
		
		System.out.println(commentService.readAllComments());

		//ObjectMapper om = new ObjectMapper();
		return commentService.readAllComments();
	}
}
