package com.util;

import java.util.HashSet;
import java.util.Set;

public class Test {
	static String returnMethod(){
		try{
			//System.exit(0);
			//
		//int i=10/0;
				return "A";
				//return "Z";
			
			
		}catch(Exception e){
			return "B";
		}/*finally{
			System.out.println("finally block");
			return 90;
		}*/
	}
public static void main(String[] args) {
	
System.out.println(Test.returnMethod());
}
}
