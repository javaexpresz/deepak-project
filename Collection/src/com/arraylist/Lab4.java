package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Lab4 {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("sri");
	col.add("nivas");
	col.add("dande");
	System.out.println(col);
	System.out.println();
	Collection col2=new ArrayList();
	col2.add("java");
	col2.add(col);
	System.out.println(col2);
	System.out.println("size col2 : "+col2.size());
	System.out.println();
	Collection col3=new ArrayList();
	col3.add("spring");
	col3.addAll(col);
	System.out.println(col3);
	System.out.println("size of col3 : "+col3.size());
}
}
