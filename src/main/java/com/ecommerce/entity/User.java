package com.ecommerce.entity;

public class User {

	private Integer id;
	private String name;
	private String userName;
	private String email;
	private String phone;
	private String password;
	private String rol;
	public User() {
		super();
	}
	public User(Integer id, String name, String userName, String email, String phone, String password, String rol) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.rol = rol;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
	
}
