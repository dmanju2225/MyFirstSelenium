package com.portnov;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
@RunWith(JUnitParamsRunner.class)
public class SubstractDDT
{
	Calculator calc;
	@Before
	public void setUp() throws Exception
	{
		calc=new Calculator();
		calc.switchOn();
	}
	@Test
	@FileParameters(value="file:C:\\Users\\satya\\workspace\\MyFirstSelenium\\substract.csv",//path of file
	                mapper=CsvWithHeaderMapper.class)//u need to mention mapper to tell csv to ignore header
	public void test(int a,int b,int Expected)
	{
		calc.add(a);
		calc.substract(b);
		int result=calc.getResult();
		assertEquals(Expected,result);
		//assertThat(Expected,equalTo(result));
	}
}
