package com.revature.service;

import java.util.List;

import com.revature.dao.CommentDao;
import com.revature.dao.CommentDaoInt;
import com.revature.dao.UserDao;
import com.revature.pojo.Comment;

public class CommentService implements CommentServiceInt {

	private static CommentDaoInt commentDao;
	
	public CommentService() {
		commentDao = new CommentDao();
	}
	
	public static CommentDaoInt getCommentDao() {
		return commentDao;
	}

	public static void setCommentDao(CommentDaoInt commentDao) {
		CommentService.commentDao = commentDao;
	}

	public void createComment(Comment c) {
		((CommentDao) commentDao).openCurrentSession();

		commentDao.createComment(c);

		((CommentDao) commentDao).closeCurrentSession();
	}

	public List<Comment> readCommentsByArticleId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment readCommentByCommentId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comment> readAllComments() {
		((CommentDao) commentDao).openCurrentSession();

		List<Comment> list = commentDao.readAllComments();

		((CommentDao) commentDao).closeCurrentSession();
		
		return list;
	}

	public void updateComment(Comment c) {
		// TODO Auto-generated method stub

	}

	public void deleteComment(Comment c) {
		((CommentDao) commentDao).openCurrentSession();

		commentDao.deleteComment(c);

		((CommentDao) commentDao).closeCurrentSession();
	}

}
