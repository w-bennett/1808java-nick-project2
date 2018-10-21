package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.revature.pojo.Comment;
import com.revature.util.SessionUtil;

public class CommentDao implements CommentDaoInt {
	

	private Session currentSession;
	private Transaction currentTransaction;

	public CommentDao() {
	
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;

	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = (Transaction) currentSession.beginTransaction();
		return currentSession;

	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
	
	public Session getCurrentSession() {
		Session sess = SessionUtil.getSession();
		return sess;
	}
	
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void createComment(Comment c) {
		getCurrentSession().save(c);
	}

	public List<Comment> readCommentsByArticleId(Integer id) {
		return null;
	}

	public Comment readCommentByCommentId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comment> readAllComments() {
		return getCurrentSession().createCriteria(Comment.class).list();
	}

	public void updateComment(Comment c) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCommentByCommentId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
