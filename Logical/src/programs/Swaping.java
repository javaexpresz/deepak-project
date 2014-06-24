package programs;

public class Swaping {
public static void main(String[] args) {
	int a=6,b=8;
	
	System.out.println("Before swaping values a= "+a+" b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After  swaping values a= "+a+" b= "+b);
}
}
