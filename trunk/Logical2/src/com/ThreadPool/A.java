package com.ThreadPool;

import java.util.ArrayList;

public class A
{
	synchronized void goToWait()
	{
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	synchronized void releaseFromWait()
	{
		notify();
	}
}
class Thread1 extends Thread
{
	A a1 = null;
	public Thread1(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		while(true)
		{
			a1.goToWait();
			for(int i = 0; i<10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "is doing something");
				try
				{
					sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "finished");
			}
			a1.releaseFromWait();
		}
	}
}
class PoolManager
{
	private ArrayList pool = new ArrayList();
	
	public void init()
	{
		A a1 = null;
		Thread1 t1 = null;
		for(int i = 0; i<10; i++)
		{
			a1 = new A();
			t1 = new Thread1(a1);
			t1.start();
			pool.add(t1);
		}
		System.out.println("pool initialized");
	}
	public Thread1 getThread()
	{
		Thread1 t1 = null;
		if(pool.size()>0)
		{
			t1 = (Thread1)pool.remove(0);
		}
		else
		{
			A a1 = new A();
			t1 = new Thread1(a1);
			t1.start();
		}
		return t1;
	}
	public void setThread(Thread t)
	{
		if(pool.size()<10)
		{
			pool.add(t);
		}
		else
		{
			t.stop();
		}
	}
	public void release()
	{
		Thread1 t1 = null;
		for(int i = 0; i<pool.size();)
		{
			t1 = (Thread1)pool.remove(0);
			t1.stop();
		}
		pool = null;
		System.out.println("pool is released");
	}
}
class User1 extends Thread
{
	private PoolManager pm = null;
	public User1(PoolManager pm)
	{
		this.pm = pm;
	}
	public void run()
	{
		while(true)
		{
			Thread1 t1 = pm.getThread();
			t1.a1.releaseFromWait();
			t1.a1.goToWait();
			pm.setThread(t1);
		}
	}
}
class User2 extends Thread
{
	private PoolManager pm = null;
	public User2(PoolManager pm)
	{
		this.pm = pm;
	}
	public void run()
	{
		
	}
}