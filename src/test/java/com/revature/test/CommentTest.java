package com.revature.test;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;

import com.revature.dao.CommentDao;
import com.revature.pojo.Comment;
import com.revature.service.CommentService;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnit44Runner.class)
public class CommentTest {

	@Mock
	private static CommentDao cd;

	@InjectMocks
	CommentService cs;

	private static Comment comment;
	private static List<Comment> commentList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		commentList = new ArrayList<Comment>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cs.setCommentDao(cd);
		comment = new Comment();
		comment.setBody("HELP ME");
		commentList.add(comment);
		// when(cd.createComment(comment)).returns(comment);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateComment() {
		cs.createComment(this.comment);
		verify(cd).createComment(comment);
	}
	
	@Test
	public void testGetAllComments() {
		cs.readAllComments();
		verify(cd).readAllComments();
	}

}
