package com.portnov;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelect {

	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	@Test
	public void test1() {
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.findElement(By.linkText("Chapter1")).click();
		WebElement e=driver.findElement(By.id("selecttype"));
		Select sel=new Select(e);
		sel.selectByVisibleText("Selenium Grid");
		sel.selectByIndex(0);//first element in the dropdown
		List<WebElement> allOptions=driver.findElements(By.id("selecttype"));
		//1
		for(WebElement option:allOptions)
			System.out.println(option.getText());
		//2
			List<WebElement> options=sel.getOptions();
		
	}
	
	@Test
	public void test2(){
		
	}
	
	

}
