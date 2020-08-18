package com.springboot.firstwebapplication1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService
{
	@Autowired
	UserRepository userrepository;
	
	public List<User> getAllUsers()
	{
		return (List<User>)userrepository.findAll();
	}
	
	public User getById(long id)
	{
		return userrepository.findById(id).get();
	}
	
	public void saveOrUpdate(User user)
	{
		userrepository.save(user);
	}
	
	public void deleteUser(long id)
	{
		userrepository.deleteById(id);
	}
}
