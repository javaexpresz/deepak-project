package com.day1.p1;

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
	Student s1=new Student(101);
	Student s2=new Student(102);
	Student s3=new Student(103);
	Vector v=new Vector();
	v.addElement(s1);
	v.addElement(s2);
	v.addElement(s3);
	System.out.println(v);
	System.out.println("after modifying");
	s1.sid=111;
	s2.sid=222;
	s3.sid=333;

	System.out.println(v);
	Vector v1=new Vector();
	Student st=new Student(23);
	v.add(st);
	Object obj=v.get(0);
	Student stud=(Student)obj;
}
}
