package com.revature.dao;

import java.util.List;

import com.revature.pojo.Comment;

public interface CommentDaoInt {

	public void createComment(Comment c);
	
	public List<Comment> readCommentsByArticleId(Integer id);
	
	public Comment readCommentByCommentId(Integer id);
	
	public List<Comment> readAllComments();
	
	public void updateComment(Comment c);
	
	public void deleteCommentByCommentId(Integer id);
	
}
