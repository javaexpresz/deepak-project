package programs;

public class LeapYear {
public static void main(String[] args) {
	//
	int year=2014;
	boolean flag=false;
	if(year%4==0){
		if(year%100==0){
			if(year%400==0){
				flag=true;
			}
		}else{
			flag=true;
		}
	}
	/*if(year%400==0){
		flag=true;
	}else if(year%100==0){
		flag=false;
	}else if(year%4==0){
		flag=true;
	}else{
		flag=false;
	}*/
	if(flag){
	System.out.println("leap year");
	}else{
		System.out.println("not leap year");
	}
}
}
