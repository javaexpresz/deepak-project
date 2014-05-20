package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n,f=1;
	System.out.println("Enter the no.");
	n=Integer.parseInt(br.readLine());
	for(int i=1;i<=n;i++){
		f=f*i;	
	}
	System.out.println("fatorials : "+f);
}
}
