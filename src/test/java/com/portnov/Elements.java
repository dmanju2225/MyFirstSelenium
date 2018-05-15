package com.portnov;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Elements {
	private WebDriver driver;
	

	

	/*@Before
	public void setUp() throws Exception {
		driver=new HtmlUnitDriver();//runs test without launching browser and by sending http request
		driver.manage().window().maximize();
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.findElement(By.linkText("Chapter2")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.navigate().back();
		driver.quit();
	}*/

	/*@Test
	public void test() {
		driver.get("http://book.theautomatedtester.co.uk/");
		WebElement linkch2=driver.findElement(By.linkText("Chapter2"));
		linkch2.click();
		//driver.findElement(By.linkText("Index")).click();
		//check that the element exists
		int num=driver.findElements(By.id("but1")).size();
		assertEquals(1,num);
		//check that element does not exist
		int num2=driver.findElements(By.linkText("Index")).size();
		assertEquals("vlad does not exist",0,num2);*/	//optional first parameter that is string error message
	//}
	/*@Ignore
	@Test
	public void test2(){
		
		//driver.get("https://yahoo.com/");
		List<WebElement> list =driver.findElements(By.tagName("a"));
		int num=list.size();
		System.out.println(num);
		for(int i=0;i<num;i++){
			System.out.println(list.get(i).getText());
			System.out.println(list.get(i).getAttribute("href"));
		}	
		
	}
	@Test
	public void test3(){
		//System.out.println(driver.getPageSource());
		System.out.println(driver.findElement(By.tagName("body")).getText());
	}*/
	//@Test
	/*public void test4(){
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		WebElement login=driver.findElement(By.xpath("//@Test
	public void test4(){
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/tables");
		WebElement cell=driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[1]/td[4]"));
		System.out.println(cell.getText());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='table2']/tbody/tr"));
		int numberOfRows=rows.size();
		WebElement cell2;
		String cellpath;
		for(int i=1;i<=numberOfRows;i++){
			cellpath="//*[@id='table2']/tbody/tr[" +i+ "]/td[5]";
			cell2=driver.findElement(By.xpath(cellpath));
			System.out.println(cell2.getText());
		}
		@Test
		public void test5(){
			//System.out.println(driver.getPageSource());
			//System.out.println(driver.findElement(By.tagName("body")).getText());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://the-internet.herokuapp.com/tables");
			WebElement cell=driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[1]/td[4]"));
			System.out.println(cell.getText());
			List<WebElement> rows=driver.findElements(By.xpath("//*[@id='table2']/tbody/tr"));
			int numberOfRows=rows.size();
			WebElement cell2;
			String cellpath;
			for(int i=1;i<=numberOfRows;i++){
				cellpath="//*[@id='table2']/tbody/tr[" +i+ "]/td[5]";
				cell2=driver.findElement(By.xpath(cellpath));
				System.out.println(cell2.getText());
			}"));
		System.out.println(cell.getText());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='table2']/tbody/tr"));
		int numberOfRows=rows.size();
		WebElement cell2;
		String cellpath;
		for(int i=1;i<=numberOfRows;i++){
			cellpath="//*[@id='table2']/tbody/tr[" +i+ "]/td[5]";
			cell2=driver.findElement(By.xpath(cellpath));
			System.out.println(cell2.getText());
		}
			*/
		
		//we.click();
		//driver.findElement(By.linkText("Index")).click();
		//check that the element exists
		/*int num=driver.findElements(By.id("but1")).size();
		assertEquals(1,num);
		//check that element does not exist
		int num2=driver.findElements(By.linkText("Index")).size();
		assertEquals("vlad does not exist",0,num2);**/
	//}
	@Test
	public void testfinal(){
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("tomsmith");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		WebElement login=driver.findElement(By.className("radius"));
		login.click();
		WebElement loggedin=driver.findElement(By.id("flash"));
		System.out.println(loggedin.getText());
		
		assertEquals("You logged into a secure area!\n×" ,loggedin.getText());
		
		WebElement logout=driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
		logout.click();
		WebElement loggedout=driver.findElement(By.id("flash"));
		System.out.println(loggedout.getText());
		assertEquals("You logged out of the secure area!\n×",loggedout.getText());
		
		}


}
