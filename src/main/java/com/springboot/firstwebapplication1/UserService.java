package com.springboot.firstwebapplication1;

import java.util.List;

public interface UserService
{
	public List<User> getAllUsers();
	public User getById(long id);
	public void saveOrUpdate(User user);
	public void deleteUser(long id);
}
