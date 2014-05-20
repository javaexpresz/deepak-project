package com.rst;
public class RepeatedChars6
{
	
	public static void main(String[] args)
	{
		String s1 = "helomooeeemhh";
		char ch[] = s1.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			int count = 0;
			for(int j=i; j>=0; j--)
			{
				if(ch[i] == ch[j])
				{
					count ++;
				}
			}
			if(count == 1)
			{
				int count2 = 0;
				for(int k = 0; k<ch.length; k++)
				{
					if(ch[i] == ch[k])
					{
						count2++;
					}
				}
				System.out.println(ch[i] + "==" + count2);
			}
		}
	}
}
