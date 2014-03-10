package com.singleton;

class Singleton{
	
	static Singleton single;
	static{
		single=new Singleton();
	}
	private Singleton(){
		
	}
	public static Singleton getMethod(){
		System.out.println("getMethod");
		return single;
	}
}
public class TestSingleton {
public static void main(String[] args) {
	System.out.println("SingleTone");
	Singleton s1=Singleton.getMethod();
	Singleton s2=Singleton.getMethod();
	System.out.println(s1==s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
