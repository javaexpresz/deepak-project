package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable{
	String name;
	int marks;
	Student(){
		
	}
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Object o1) {
		int marks1=this.marks;
		Student stu=(Student)o1;
		int marks2=stu.marks;
		if(marks1<marks2)
			return -1;
		else if(marks1>marks2)
			return +1;
		else
			return 0;
	}
	
}
public class StudentTest {
public static void main(String[] args) {
	Student s1=new Student("ajay", 96);
	Student s2=new Student("vijay", 94);
	Student s3=new Student("sanjay", 66);
	Student s4=new Student("sujay", 99);
	Student s5=new Student("pritam", 88);
	ArrayList<Student> s=new ArrayList<Student>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	s.add(s5);
	System.out.println(s);
	Collections.sort(s);
	
}
}
