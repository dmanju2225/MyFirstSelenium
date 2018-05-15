package com.portnov;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSubstarct
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
	public void test()
	{
		calc.add(10);
		calc.substract(10);
		int result=calc.getResult();
		assertEquals(0,calc.getResult());
	}
}
