package com.mmm;

public class Manager
{
	public static void main(String[] args)
	{
		DoubleLL l = new DoubleLL();
		l.add(7);
		l.add(7.0);
		l.add("7");
		l.add(true);
		l.add('t');
//		l.add(null);
		l.add(new Integer(12));
		l.iterate();
		Manager m1 = new Manager();
	}
}
