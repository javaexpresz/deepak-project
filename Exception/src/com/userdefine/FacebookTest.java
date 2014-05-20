package com.userdefine;

class InvalidUserId extends Exception {
	String userId;

	public InvalidUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMessage2() {
		return "userId "+userId+" Is Invalid";
	}
	@Override
	public String toString() {
		
		return getMessage2();
	}
}

class Facebook {
	public static void chat(String userId) {
		try {
			if (userId.equals("dkgoswami")) {
				System.out.println(userId+" is connected");
			} else {
				throw new InvalidUserId(userId);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class FacebookTest {
public static void main(String[] args) {
	Facebook.chat("dkgoswami");
}
}