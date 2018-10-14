package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class UserDao implements UserDaoInt {

	private Session currentSession;
	private Transaction currentTransaction;

	public UserDao() {
	
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

	
	public User login(Integer userid) {
		return (User) getCurrentSession().get(User.class, userid);
	}

	
	public Integer getUserId(User user) {
		Session sess = getCurrentSession();
		String hql = "FROM User WHERE username = :un AND password = :pw";
		Query query = sess.createQuery(hql);
		query.setParameter("un", user.getUsername());
		query.setParameter("pw", user.getPassword());

		
		
		List<User> users = query.list();
		if(!users.isEmpty()) {
			User user2 = users.get(0);
			return user2.getUserid();
		}
		else
			return 0;
	}
	

}
