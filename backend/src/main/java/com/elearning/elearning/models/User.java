package com.elearning.elearning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
private String username;
private String password;
public String getUsername() {
	return username;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
}
