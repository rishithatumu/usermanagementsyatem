package com.springboot.firstwebapplication1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class UserController
{
	@Autowired
	UserService userservice;
	
	@PostMapping("/post")
	public User save(@RequestBody User user)
	{
		userservice.saveOrUpdate(user);
		return user;
	}
	
	@GetMapping("/get")
	public List<User> user()
	{
		return userservice.getAllUsers();
	}
	
	@GetMapping("/get/{id}")
	public User getById(@PathVariable long id)
	{
		return userservice.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable (value="id") long id)
	{
		userservice.deleteUser(id);;
		return "Deleted Successfully!!!!";
	}
}
