package com.set;

import java.util.HashSet;
import java.util.Iterator;

class Customer{
	int id;
	String name;
	Customer(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	/*public int hashCode() {
		
		return super.hashCode();
	}*/
	
	public String toString() {
		return "id : "+id+"name : "+name;
	}
	
}
public class Client3 {
public static void main(String[] args) {
	HashSet<Customer> h=new HashSet<Customer>();
	h.add(new Customer(101, "sri"));
	h.add(new Customer(101, "sri"));
	h.add(new Customer(101, "sri"));
	Iterator it=h.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println(h);
	System.out.println(h.size());
}
}
