package com.p1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	Integer one=1;
	Integer two=2;
	Integer three=3;
	Integer four=4;
	Integer five=5;
	Integer six=6;
	Integer seven=7;
	Integer eight=8;
	Integer nine=9;
	Integer zero=0;
	
	Integer arr[]={zero,one,two,three,four,five,six,seven,eight,nine};
	List<Integer> list=new ArrayList<Integer>();
	Arrays.sort(arr);
	list.add(arr[0]);
	for(Integer currentVal:arr){
		if(currentVal.equals(list.get(list.size()-1))){
			list.add(currentVal);
		}
	}
	for(Integer currentVal:arr){
		System.out.println(currentVal+"");
	}
	
}
}
