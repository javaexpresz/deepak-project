package com.abstractclass;

abstract class Test{
	Test(){
		System.out.println("Abstract Test()");
	}
}
class Testimpl extends Test{
	int a=10;
	void show(){
		System.out.println(a);
	}
}
public class ClientTest {
public static void main(String[] args) { 
	Testimpl t1=new Testimpl();
	System.out.println(t1);
	t1.show();
}
}
