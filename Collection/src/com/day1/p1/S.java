package com.day1.p1;

import java.util.Arrays;

public class S {
public static void main(String[] args) {
	int[] x={10,20,30,13,21,45};
	System.out.println(x);
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	String[] s={"xyz","test","hello","abc","done"};
	System.out.println(Arrays.toString(s));
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	String[] ss={"tutu","111","test","999","abc","done","768"};
	System.out.println(Arrays.toString(ss));
	Arrays.sort(ss);
	System.out.println(Arrays.toString(ss));
}

}
