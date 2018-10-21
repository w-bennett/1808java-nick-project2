package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@Column(name="commentid", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commentid;
	
	@Column(name="articleid", nullable=false)
	private Integer articleid;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="role", nullable=false)
	private String role;
	
	@Column(name="body", nullable=false)
	private String body;
	
	@Column(name="upvotes", nullable=false)
	private Integer upvotes;
	
	@Column(name="downvotes", nullable=false)
	private Integer downvotes;
	
	@Column(name="stars", nullable=false)
	private Integer stars;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer commentid, Integer articleid, String username, String role, String body, Integer upvotes,
			Integer downvotes, Integer stars) {
		super();
		this.commentid = commentid;
		this.articleid = articleid;
		this.username = username;
		this.role = role;
		this.body = body;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.stars = stars;
	}

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Integer getArticleid() {
		return articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(Integer upvotes) {
		this.upvotes = upvotes;
	}

	public Integer getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(Integer downvotes) {
		this.downvotes = downvotes;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	@Override
	public String toString() {
		return "Comment [commentid=" + commentid + ", articleid=" + articleid + ", username=" + username + ", role="
				+ role + ", body=" + body + ", upvotes=" + upvotes + ", downvotes=" + downvotes + ", stars=" + stars
				+ "]";
	}
		
}
