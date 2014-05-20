package com.day1.p3;

import java.util.UUID;

public class Manager2 {
	public String generateUniqueKey(){
		String id=UUID.randomUUID().toString();
		return id;
	}
public static void main(String[] args) {
	Manager2 man=new Manager2();
	System.out.println("Unique Id : "+man.generateUniqueKey());
}
}
