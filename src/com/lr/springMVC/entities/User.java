package com.lr.springMVC.entities;

public class User {
	private int id;
	private String name;
	private String password;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", address=" + address + "]";
	}
	public User(int id, String name, String password, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
	}
	
}
