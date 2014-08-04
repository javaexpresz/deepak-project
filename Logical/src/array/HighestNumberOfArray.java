package array;

public class HighestNumberOfArray {
public static void main(String... args) {
	int array[]={89,76,56,99,5,78};
	int temp=array[0];
	for(int i=1;i<array.length;i++){
		if(temp<array[i]){
			temp=array[i];
		}
	}
	System.out.println(temp);
}
}
