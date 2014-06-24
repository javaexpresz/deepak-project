package com.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome_Number {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, rem, rev = 0;
		System.out.println("Enter the no.");
		num = Integer.parseInt(br.readLine());
		int temp = num;
		while (temp > 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		System.out.println("Reverse : " + rev);
		if (num == rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}

	}
}
