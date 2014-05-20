package com.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidAccNoException extends Exception{
	int accno;
	InvalidAccNoException(){
		
	}
	InvalidAccNoException(int accno){
		this.accno=accno;
	}
	public String getMessage(){
		String msg=null;
		if(accno==0){
			msg="Accno is not Available";
		}else{
			msg="Accno : "+accno+" is Not Available";
		}
		return msg;
	}
	public String toString(){
		return "InvalidAccNoException : "+getMessage();
	}
}
class InsufficientFundException extends RuntimeException{
	int bal;
	InsufficientFundException(){}
	InsufficientFundException(int bal){
		this.bal=bal;
	}
	@Override
	public String getMessage() {
		String msg=null;
		if(bal==0){
			msg="sorry you dont have enough funds.";
		}else{
			msg="sorry you dont have amount : "+bal;
		}
		return msg;
	}
	@Override
	public String toString() {
		
		return "InsufficientFundException : "+getMessage();
	}
}
class Account{
	int bal=500;
	int getBal(int accno){
		try{
			if(accno>100){
				throw new InvalidAccNoException();
			}else{
				return bal;
			}
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		return bal;
	}
}
void withdraw(int accno,int amt){
	try{
		if(accno>100){
			throw new InsufficientFundException(accno);
		}else{
			if(amt+1000>bal){
				throw new InsufficientFundException(amt);
			}else{
				bal=bal-amt;
			}
		}
	}catch(Exception e){
		System.out.println(e);
		System.out.println(e.getMessage());
	}
}
public class Lab6 {
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
	int accno;
	System.out.println("Enter the accnout no.");
	accno=Integer.parseInt(br.readLine());

	Account ac=new Account();
	ac.getBal(accno);
	}catch(Exception e){
		System.out.println(e);
		System.out.println(e.getMessage());
	}
}
}
