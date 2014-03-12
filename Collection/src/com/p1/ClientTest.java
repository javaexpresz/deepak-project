package com.p1;

import java.util.HashSet;
class Person{
	int age;
	Person(int age){
		this.age=age;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(age);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals");
		Person p=(Person)obj;
		return this.age==p.age;
	}
}
public class ClientTest {
public static void main(String[] args) {
	Person p=new Person(23);
	HashSet set=new HashSet();
	set.add(p);
	set.add(p);
	set.add(p);
	System.out.println(set);
	p.age=34;
	set.add(p);
	System.out.println(set);
}
}
