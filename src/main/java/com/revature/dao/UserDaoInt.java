package com.revature.dao;

import com.revature.pojo.User;

public interface UserDaoInt {
	public User login(Integer userid);
	public Integer getUserId(User user);
}
