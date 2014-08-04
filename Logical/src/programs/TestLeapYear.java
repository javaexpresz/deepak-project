package programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestLeapYear {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Year : ");
	int year=Integer.parseInt(br.readLine());
	if(year%400==0||(year%4==0 && year%100!=0)){
		System.out.println(year+" is leap year");
	}else{
		System.out.println(year+" is not a leap year");
	}
}
}
