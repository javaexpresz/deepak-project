package com.logical1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidUserId extends Exception {
	String emailId;

	public InvalidUserId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getMessage2() {
		return "emailId "+ emailId+ " must be ends with @gmail.com/@hotmail.com";
	}
	@Override
	public String toString() {
		
		return getMessage2();
	}
}

class Facebook {
	
	public static void chat(String emailId) {
		try {
			if (emailId.endsWith("@gmail.com") || emailId.endsWith("@hotmail.com")) {
				System.out.println(emailId+" is Valid");
			} else {
				throw new InvalidUserId(emailId);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Client1 {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Email Id");
	String emailId=br.readLine();
	Facebook.chat(emailId);
}
}