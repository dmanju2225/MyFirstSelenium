package com.portnov;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class Final
{
	Calculator calc;

	@Before
	public void setUp() throws Exception
	{
		calc = new Calculator();
		calc.switchOn();
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test(expected = ArithmeticException.class) // expected is provided by jnuit
	public void test()
	{
		int i = 1 / 0;// eventhough exception is there test will pass because of
						// test parameters
	}

	@Test
	@FileParameters(value = "file:C:\\Users\\satya\\workspace\\MyFirstSelenium\\calFinal.csv", // path
																								// of
																								// file
			mapper = CsvWithHeaderMapper.class)
	public void testOperand(int a, char operand, int b, int Expected)
	{
		calc.add(a);
		if (operand == '+')
		{
			calc.add(b);

		}
		else if (operand == '-')
		{

			calc.substract(b);

		}
		else if (operand == '*')
		{

			calc.multiply(b);

		}
		else
		{

			calc.devide(b);

		}
		int result = calc.getResult();
		assertEquals(Expected, result);
	}
	@Test
	@FileParameters(value = "file:C:\\Users\\satya\\workspace\\MyFirstSelenium\\calFinal.csv", // path
																								// of
																								// file
			mapper = CsvWithHeaderMapper.class)
	public void testOperand2(int a, char operand, int b, int Expected)
	{
		calc.add(a);
		switch(operand)
		{
		case '+':
			calc.add(b);
			break;
		case '-':
			calc.substract(b);
			break;
		case '*':
			calc.multiply(b);
			break;
		case '/':
			calc.devide(b);
		}
		int result = calc.getResult();
		assertEquals(Expected, result);
	}
}
