package com.lara;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Java4s 
{
	 
public static void main(String args[])
{
 
    List a = new ArrayList<String>();
    System.out.println("enter");
    a.add("One");
    a.add("Two");
    a.add("Three");
    a.add("Four");
    a.add("Five");
 
    String stringArrayObject[] = new String[a.size()];
    a.toArray(stringArrayObject);
    
    for(String temp : stringArrayObject)
    System.out.println(temp);
 
}
}