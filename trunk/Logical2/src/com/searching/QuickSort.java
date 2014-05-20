package com.searching;

public class QuickSort
{
	  public static void main(String args[])
	  {
		  int i;
		  int a[] = {12,9,4,99,120,1,3,10,13};
		  System.out.println("Values Before the sort:\n");
		  for(i = 0; i < a.length; i++)
		  {
			  System.out.print( a[i]+"  ");  
		  }
		  	  System.out.println();
		  	  quick_srt(a,0,a.length-1);
		  	  System.out.print("Values after the sort:\n");
		  for(i = 0; i <a.length; i++)
		  {
			  System.out.print(a[i]+"  ");
		  }
		  	  System.out.println();
	  }

	  public static void quick_srt(int a[],int low, int n)
	  {
		  int lo = low;
		  int hi = n;
		  if (lo >= n)
		  {
			  return;
		  }
		  int mid = a[(lo + hi) / 2];
		  while (lo < hi)
		  {
		  while (lo<hi && a[lo] < mid)
		  {
			  lo++;
		  }
		  while (lo<hi && a[hi] > mid) 
		  {
			  hi--;
		  }
		  if (lo < hi)
		  {
			  int T = a[lo];
			  a[lo] = a[hi];
			  a[hi] = T;
		  }
	  }
	  if (hi < lo)
	  {
		  int T = hi;
		  hi = lo;
		  lo = T;
	  }
	  	quick_srt(a, low, lo);
	  	quick_srt(a, lo == low ? lo+1 : lo, n);
	  }
}
