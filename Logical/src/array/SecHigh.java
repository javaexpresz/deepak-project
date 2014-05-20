package array;

public class SecHigh {
	public static int secBig(int array[]){
		int biggest=Integer.MAX_VALUE;
		int secBiggest=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(secBiggest<array[i]){
				secBiggest=array[i];
			}
		}
		return secBiggest;
	}
public static void main(String[] args) {

	int array[]={2,4,10,45,88};
	System.out.println(secBig(array));
}
}
