package array;

interface Int{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
	public abstract void m5();
}
abstract class Emp implements Int{
	public void m1(){
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
abstract class Test12 extends Emp{

	
	
	
}
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
