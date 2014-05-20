package com.lara;

public class BinaryToDecimal
{
	public int getDecimalFromBinary(int binary)
	{
		int decimal = 0;
		int power = 0;
		while(true)
		{
			if(binary == 0)
			{
				break;
			}
			else
			{
				int temp = binary%10;
				decimal +=temp*Math.pow(2,power);
				binary = binary/10;
				power++;
			}
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		BinaryToDecimal bd = new BinaryToDecimal();
		System.out.println("110---->"+bd.getDecimalFromBinary(110));
		System.out.println("1100---->"+bd.getDecimalFromBinary(1100));
		System.out.println("1110---->"+bd.getDecimalFromBinary(1110));
	}
}