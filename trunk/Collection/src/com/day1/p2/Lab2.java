package com.day1.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Student{
	int sid;
	Student(int sid){
		this.sid=sid;
	}
	public String toString(){
		return String.valueOf(sid);
	}
}
class User{
	int uid;
	User(int uid){
		this.uid=uid;
	}
	public String toString(){
		return String.valueOf(uid);
	}
	public boolean equals(Object obj){
		if(obj instanceof User){
			User u=(User)obj;
			return this.uid==u.uid;
		}
		return false;
	}
}
public class Lab2 {
public static void main(String[] args) {
	System.out.println("With Student");
	List li=new ArrayList();
	Student st=new Student(55);
    li.add(new  Student(99));
    li.add(new Student(55));
    li.add(new Student(44));
    li.add(new Student(22));
    li.add(st);
    System.out.println(li.contains(st));
    System.out.println(li.contains(new Student(88)));
    System.out.println("with User");
    List ulist=new ArrayList();
    User u=new User(55);
    ulist.add(new User(99));
    ulist.add(new User(88));
    ulist.add(new User(77));
    ulist.add(new User(66));
    ulist.add(u);
    System.out.println(ulist.contains(u));
    System.out.println(ulist.contains(new User(88)));
    
}
}
