package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Client1 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("java");
	al.add("jsp");
	al.add("struts");
	al.add("spring");
	al.add("hibernate");
	System.out.println(al);
	Collections.unmodifiableList(al);
	al.add("ajax");
	System.out.println(al);
}
}
