package com.serialization;

import java.io.Serializable;

public class Customer implements Serializable{
private int id;
private String name;
private transient  long phone;
public Customer(){}
public Customer(int id, String name, long phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
}
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
@Override
	public String toString() {
		
		return "id : "+id+"name : "+name+"phone : "+phone;
	}
}
