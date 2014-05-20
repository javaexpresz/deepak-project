package com.exception;

class UserIdNotFoundException extends Exception {
String userId;
UserIdNotFoundException(){}
UserIdNotFoundException(String userId){
	this.userId=userId;
}
	public String getMessage() {
		
		return "UserID "+userId+" is not avilable";
	}
		public String toString() {
			
			return getMessage();
		}
}
class Facebook{
	
	public static void chat(String userId)throws Exception{
		if(userId.equals("srinivas")){
			System.out.println("Welcome : "+userId);
		}else{
			throw new UserIdNotFoundException(userId);
		}
	}
}
public class FacebookTest {
public static void main(String[] args) throws Exception{
	Facebook.chat("srinivass|SS");
}
}
