package com.revature.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineers")
public class User {
	
	@Id
	@Column(name="userid", nullable=false)
	private Integer userid;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="role", nullable=false)
	private String role;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="upvotes", nullable=false)
	private Integer upvotes;
	
	@Column(name="downvotes", nullable=false)
	private Integer downvotes;
	
	@Column(name="stars", nullable=false)
	private Integer stars;
	
	public User() {
		super();
	}

	public User(Integer userid, String username, String password, String role, String email, Integer upvotes,
			Integer downvotes, Integer stars) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.stars = stars;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", email=" + email + ", upvotes=" + upvotes + ", downvotes=" + downvotes + ", stars=" + stars + "]";
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		
}
