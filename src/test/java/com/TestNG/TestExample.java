package com.TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestExample {
	
WebDriver driver;


public void CommonToAll()
{
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
	   ChromeOptions option = new ChromeOptions();
	   option.addArguments("window-size=1400,800");
	   option.addArguments("headless");		
		driver = new ChromeDriver(option);
}

@BeforeMethod
public void setUp(){	
	CommonToAll();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//	@Test
//	public void handlePopUp() throws InterruptedException
//	{
//		driver.findElement(By.id("tags")).sendKeys("admin");
//	}

@Test(groups = { "group" },enabled=false,dependsOnGroups = {"group2"})
public void testCase3() {
   System.out.println("in test case 3");
}
	

@Test(priority=5,groups="group2",dependsOnMethods = {"test4"})
public void test5() throws InterruptedException
{
	String title=driver.getTitle();
	System.out.println("test case 5" + ' '+ title);
}

@Test(priority=6,groups="group1",invocationCount=3)
public void test6() throws InterruptedException
{
	System.out.println("test case 6" + ' '+ driver.getTitle());
}
	
	@Test(priority=2,groups="group1")
	public void test2() throws InterruptedException
	{
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			if (radio.get(i).getAttribute("value").equalsIgnoreCase("Ruby"))
			{
				radio.get(i).click();
			}
		}
		  System.out.println("test case 2");

}
	
	@Test(priority=3, groups="group2")
	public void test3() throws InterruptedException
	{

		driver.findElement(By.id("sing")).click();
		  System.out.println("test case 3");
	
	}
	
	@Test(priority=1, groups="group1")
	public void test1() throws InterruptedException
	{

		driver.findElement(By.id("code")).click();
	  System.out.println("test case 1");
	}
	
	@Test(priority=4, groups="group2")
	public void test4() throws InterruptedException
	{

		driver.findElement(By.id("singing")).click();
		  System.out.println("test case 4");
	
	}
	
	@Test(priority=7, groups="group2",expectedExceptions=IndexOutOfBoundsException.class)
	public void getAllLinks()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.axisbank.com/");
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 int linkSize=allLinks.size();
		 
		 for(int i=0; i<=linkSize;i++)
		 {
			 WebElement link = allLinks.get(i);
			 String linktext = link.getText();
			 System.out.println("text of link "+linktext);			 
		 }
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}



