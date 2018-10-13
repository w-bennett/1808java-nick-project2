package com.revature.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

public class LoginTest {

	@Mock
    private Session sess;
	
	UserDao userDao = new UserDao();
	User user;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    
    @Before
    public void setUp() throws Exception {
    	this.user = new User(1, "tadrill", "tadpole", "ge", "no@gmail.com", 0, 0, 0);
        MockitoAnnotations.initMocks(this);
        when(sess.get(User.class, "tadrill")).thenReturn(user);
        userDao.setCurrentSession(sess);
    }

    
    @After
    public void tearDown() throws Exception {
    }

    
    @Test
    public void test() {
        User authUser = userDao.login(user);
        System.out.println(authUser);
        assertTrue("tadrill".equals(authUser.getUsername()));
        assertTrue("tadpole".equals(authUser.getPassword()));
        assertFalse("visitor".equals(authUser.getRole()));
    }
}