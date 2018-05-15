package com.portnov;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestAddition
{
Calculator calc;
	@Before
	public void setUp() throws Exception
	{
		calc=new Calculator();
		calc.switchOn();
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testAdd()
	{
		calc.add(3);
		calc.add(5);
		int result=calc.getResult();
		assertEquals("positive numbers",8,result);//assert equals is better as we can see actual and expectd 
	}

	@Test
	public void testAdd2()
	{
		calc.add(-1);
		calc.add(-11);
		int result=calc.getResult();
		assertTrue("negative numbers",-12==result);
	}
	

}
