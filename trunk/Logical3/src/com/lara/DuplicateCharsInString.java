package com.lara;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharsInString
{
	public void findDuplicate(String str)
	{
		Map<Character,Integer>dupMap = new HashMap<Character,Integer>();
		char []chrs = str.toCharArray();
		for(Character ch:chrs)
		{
			if(dupMap.containsKey(ch))
			{
				dupMap.put(ch, dupMap.get(ch)+1);
			}
			else
			{
				dupMap.put(ch, 1);
			}
		}
		Set<Character>keys = dupMap.keySet();
		for(Character ch:keys)
		{
			System.out.println(ch+"---->" +dupMap.get(ch));
		}
	}
	public static void main(String[] args)
	{
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicate("java2novice");
	}
}