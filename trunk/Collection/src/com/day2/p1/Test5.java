package com.day2.p1;

import java.util.LinkedList;
class Queue{
	private LinkedList list=new LinkedList();
	public void add(Object obj){
		list.add(obj);
	}
	public Object processElement(){
		return list.removeFirst();
	}
	public String toString(){
		return list.toString();
	}
}
public class Test5 {
public static void main(String[] args) {
	Queue q1=new Queue();
	q1.add("abc");
	q1.add(99);
	q1.add(true);
	System.out.println(q1);
	Object o1=q1.processElement();
	System.out.println(o1);
	Object o2=q1.processElement();
	System.out.println(o2);
	
}
}
