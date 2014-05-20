package com.day2.p1;

import java.util.PriorityQueue;

public class Test6 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add("abc");
	pq.add("done");
	//pq.add(10);
	pq.add(new Integer(99));
	pq.add("xyz");
	pq.add("test");
	System.out.println(pq);
}
}
