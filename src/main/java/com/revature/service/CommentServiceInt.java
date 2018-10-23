package com.revature.service;

import java.util.List;

import com.revature.pojo.Comment;

public interface CommentServiceInt {
	// CRUD methods
	
	// create
	public void createComment(Comment c);
	
	// read all by article id
	public List<Comment> readCommentsByArticleId(Integer id);
	
	// read by comment id
	public Comment readCommentByCommentId(Integer id);
	
	// read all comments
	public List<Comment> readAllComments();
	
	// update a comment by id
	public void updateComment(Comment c);
	
	// delete a comment by id
	public void deleteComment(Comment c);

}
