package com.util;

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

public class Lab1 {
public static void main(String[] args) {
	Student s1=new Student(99);
	Student s2=new Student(88);
	Student s3=new Student(77);
	Student s4=new Student(966);
	Vector v=new Vector();
	v.addElement(s1);
	v.addElement(s2);
	v.addElement(s3);
	v.addElement(s4);
	System.out.println(v);
	System.out.println("after modifying");
	s1.sid=101;
	s2.sid=102;
	s3.sid=103;
	s4.sid=104;
	System.out.println(v);
}
}
