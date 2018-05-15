package com.portnov;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddition.class, TestMultiply.class, TestSubstarct.class })
public class AllTests
{

}
