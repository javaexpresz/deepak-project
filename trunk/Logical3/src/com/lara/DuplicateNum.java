package com.lara;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNum
{
	public Map duplicate(Map<Integer, Integer>numbers)
	{
		for(int i = 0; i<numbers.size(); i++)
		{
			boolean flag = false;
			for(int j = 0; j<i; j++)
			{
				if(i == j)
				{
					flag = true;
					System.out.println("key:"+i+",value:"+j);
					numbers.put(i, j);
				}
			}
			if(!flag)
			{
				System.out.println("no duplicate");
			}
		}
		return numbers;
	}
	public static void main(String[] args)
	{
		Map<Integer,Integer>numbers = new HashMap<Integer,Integer>();
		int j = 0;
		for(int i = 1; i<30; i++)
		{
			
			numbers.put(i, j++);
		}
		numbers.put(1, 2);
		numbers.put(1, 1);
		numbers.put(1, 1);
		numbers.put(2, 2);
		DuplicateNum dn = new DuplicateNum();
		dn.duplicate(numbers);
	}
}
