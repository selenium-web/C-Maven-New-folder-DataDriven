package com.TestNG;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.AfterSuite;

	public class TestngAnnotation {
		
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
			 System.out.println("in beforeMethod");
			CommonToAll();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	   // test case 1
	   @Test(groups = { "group" },enabled=false,dependsOnGroups = {"group1"})
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }
	//   TestNG lets you pass parameters directly to your test methods in two different ways −
   //	   With testng.xml
  //	   With Data Providers

	   // test case 2
	   @Test(groups = { "group1" })    
	   @Parameters("myName")
	   public void testCase2(String myName) {
	      System.out.println("in test case 2" + myName);
	   }
	   
	   // test case 2
	   @Test(groups = { "group1" })
	   public void testCase5() {
		   String title=driver.getTitle();
		   Assert.assertEquals(title, "Abhijeet");
	      System.out.println("in test case 5");
	   }

	   @Test(groups = { "group" },enabled=true,dependsOnGroups = {"group1"})  //  if any one method failed in the dependent group 
	   // then dependent test case will not run. 
	   public void testCase4() {
	      System.out.println("in test case 4");
	   }
	   

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }

	}


