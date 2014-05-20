package com.p3;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private long phone;
public Employee(){}
public Employee(int id,String name,long phone){
	this.id=id;
	this.name=name;
	this.phone=phone;
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
public int compareTo(Employee emp) {
	return this.id-emp.id;
}

}
