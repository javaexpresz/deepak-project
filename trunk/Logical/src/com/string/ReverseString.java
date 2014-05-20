package com.string;

public class ReverseString {
	static int i,c=0,rev;
	public static void reverse(String str){
		char ch[]=new char[str.length()];
		for(i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
			
		}
		int str_len=str.length()-1;
		for(i=str_len;i>=0;i--){
			System.out.print(ch[i]);
		}
		if(str.equals(ch[i])){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
	
public static void main(String[] args) {
	reverse("deepak");
}
}
