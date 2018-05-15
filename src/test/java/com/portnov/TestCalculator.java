package com.portnov;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)//runner that runs all classes provided by junit
@Suite.SuiteClasses({
	TestAddition.class,
	TestSubstarct.class,
	TestMultiply.class
})
public class TestCalculator
{

}
