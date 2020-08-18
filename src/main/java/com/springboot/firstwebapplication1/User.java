package com.springboot.firstwebapplication1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userstables")
public class User 
{
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "firstname")
	private String firstname;
	
	
	@Column(name = "lastname")
	private String lastname;

	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "address")
	private String address;
	

	@Column(name = "password")
	private String password;
	

	@Column(name = "phonenumber")
	private long phonenumber;

	
	public long getId() 
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public long getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber)
	{
		this.phonenumber = phonenumber;
	}
}
