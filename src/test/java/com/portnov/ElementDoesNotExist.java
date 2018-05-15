package com.portnov;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDoesNotExist {
private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(expected = NoSuchElementException.class)
	public void test() {
		driver.get("https://www.yahoo.com");
		driver.findElement(By.id("Manjeera"));
	}

}
