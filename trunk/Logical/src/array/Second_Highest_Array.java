package array;

public class Second_Highest_Array {
public static void main(String[] args) {
	int b[] = {2,3,1,0,5,9,7,19,16,67,60};
	int highest = 0; 
	int sec_highest = 0;
	 for(int i : b) //b is array of integers
	 {
	     if(i>highest)
	     {
	        sec_highest = highest; //make current highest to second highest
	        highest = i; //make current value to highest
	     }
	    else if(i>sec_highest) 
	     {
	        sec_highest = i;
	     }
	 }
	 System.out.println(sec_highest);
}
}
