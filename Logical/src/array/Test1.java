package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Test1 {
public static void main(String[] args)throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the a String");
String name=br.readLine();
String nameArray[]=name.split(" ");
StringBuilder result=new StringBuilder();
for(String i:nameArray)
{
result.append(new StringBuilder(i).reverse()+" ");
}
System.out.println(result);
}
}
