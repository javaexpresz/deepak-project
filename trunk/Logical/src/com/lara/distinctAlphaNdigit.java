package com.lara;

public class distinctAlphaNdigit
{
	public static void main(String[] args)
	{
		String s1 = "#@atul12^*)34pankaj3456Pradeep567$(";
		char c;
		String alp = "";
		String dgt = "";
		String spcl = "";
		for(int i = 0; i<s1.length(); i++)
		{
			c = s1.charAt(i);
			
			if(c>='A' && c<='Z' || c>='a'&& c<='z')
			{
				alp = alp + c;
			}
			else if(c>='0' && c<='9')
			{
				dgt = dgt + c;
			}
			else
			{
				spcl = spcl + c;
			}
		}
		System.out.println("alp=" + alp);
		System.out.println("dgt=" + dgt);
		System.out.println("special character=" + spcl);
	}
}
