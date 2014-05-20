package com.lara;

public class Test1
{
	static int i;
	static int ii;
	public static void main(String[] args)
	{
	Test1 tes=new Test1();
tes.prine();
		/*//int ii=0;
		System.out.println("hi atul\t" + i);
		i++;
		ii++;
		if(i<3)
		{
			main(null);
			//prine();
		}
		
		System.out.println("bye\t" + ii)*/;
	}
	int count=0;
	
	public int  prine()
	{
		count++;;
		i++;
		if(i<3)
		{
			int o=prine();
			System.out.println(o);
			//prine();
		}
		
		return count;
		//System.out.println("bye\t" + ii);
	}
}
