package org.jsp.springbootdemo.dto;

public class User {
private int id;
private String name;
private long phone;
private String email;

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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(int id, String name, long phone, String email) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.email = email;
}
public User() {
	
}

}
