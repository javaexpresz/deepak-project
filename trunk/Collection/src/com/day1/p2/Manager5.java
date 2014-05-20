package com.day1.p2;

import java.util.Arrays;

class E implements Comparable{
	int i,j;
	E(int i,int j){
		this.i=i;
		this.j=j;
	}
	public String toString(){
		return "("+i+","+j+")";
	}
	@Override
	public int compareTo(Object obj) {
		E e1=(E)obj;
		return e1.j-j;
	}
	
}
public class Manager5 {
public static void main(String[] args) {
	E[] x={
			new E(1,2),
			new E(2,0),
			new E(8,9),
			new E(3,4)
	};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
}
}
