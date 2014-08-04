package com.string;

import java.util.Stack;

public class RecursionString {
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 1) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }



	public static String recIterReverse (String word){

	    Stack <String> stack = new Stack <String> ();
	    stack.push(word);
	    String result = "";

	    while (!stack.isEmpty()){
	        String temp = stack.pop();
	        result = temp.charAt(0) + result;

	        if (temp.length() > 1){
	        stack.push(temp.substring(1));
	        }
	    }

	    return result;
	}
public static void main(String[] args) {
	System.out.println(recIterReverse("deepak"));
	System.out.println(reverseRecursively("kumar"));
}
}
