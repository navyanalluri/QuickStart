package com.springboot.quickstart.model;

public class User {

	private long  userId;
	private String  firstname;
	private String lastname;
	private String email;
	
	
	public User() {
		super();
			}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	
	
	public User(long userId) {
		super();
		this.userId = userId;
	}
	public User(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	@Override
	
	public String toString() {
		return "User [userId=" + userId + "]";
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
