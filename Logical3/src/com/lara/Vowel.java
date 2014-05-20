package com.lara;
import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args)
	{
		char c;
		System.out.println("Enter a Character");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		c = s.charAt(0);
		if(c>= 'A' && c<= 'Z' || c>= 'a' && c<= 'z')
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
			|| c == 'u')
				System.out.println("given character is a vowel\t" + c);
			else
				System.out.println("given character is a consonent\t" + c);
		else
			System.out.println("given character is not alphabet");
	}
}
