package com.lara;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxWordCountInLine
{
	private int currentMaxCount = 0;
	private List<String>lines = new ArrayList();
	public void readMaxLineCount(String fileName)
	{
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		String line = null;
		try
		{
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			while((line = br.readLine()) !=null)
			{
				int count = (line.split("\\s")).length;
				if(count>currentMaxCount)
				{
					lines.clear();
					lines.add(line);
				}
				else if(count == currentMaxCount)
				{
					lines.add(line);
				}
			}
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
	public int getCurrentMaxCount()
	{
		return currentMaxCount;
	}
	public void setCurrentMaxCount(int currentMaxCount)
	{
		this.currentMaxCount = currentMaxCount;
	}
	public List<String> getLines()
	{
		return lines;
	}
	public static void main(String[] args)
	{
		MaxWordCountInLine mdc = new MaxWordCountInLine();
		mdc.readMaxLineCount("E:\\sample.txt");
		System.out.println("Max no. of words in a line is" +mdc.getCurrentMaxCount());
		System.out.println("Line with Max word Count:");
		List<String>lines = mdc.getLines();
				for(String l:lines)
				{
					System.out.println(l);
				}
	}
}