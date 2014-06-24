package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OccurancesInArray {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=0;
	System.out.println("how many no you want to write");
	num=Integer.parseInt(br.readLine());
	String elements[]=new String[num];
	int i,j,k,a;
	for(i=0;i<num;i++){
		elements[i]=br.readLine();
	}
	for(i=0;i<elements.length;i++){
		a=0;
		k=1;
		for(j=0;j<elements.length;j++){
			if(j>=i){
				if(elements[i].equals(elements[j]) && j!=i){
					k++;
				}
			}else if(elements[i].equals(elements[j])){
					a=1;
			}
		}if(a!=1){
			System.out.println("Occurence of "+elements[i]+" : "+k);
		}
	}
}

}
