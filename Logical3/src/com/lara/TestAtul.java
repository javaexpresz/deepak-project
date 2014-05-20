package com.lara;

import org.junit.Test;

import junit.framework.TestCase;


public class TestAtul extends TestCase
{
	@Test
	public void sum()
	{
		int act = Atul.sum(4, 5);
		assertEquals(9, act);
	}

}
