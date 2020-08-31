package com.test;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindowPopUP {
	
	
WebDriver driver;
	
	@Test
	public void handlePopUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Multi-PopUp Test']")).click();
		Thread.sleep(1111);
		Set<String> windowid = driver.getWindowHandles();
		int totalPopUpWindowsCount = windowid.size();
		
		Iterator<String> it = windowid.iterator();
//	 String parentWindowID= it.next();
//	 
//	 String childPopUp1ID= it.next();
//	 String childPopUp2ID= it.next();
//	 String childPopUp3ID= it.next();
//	 String childPopUp4ID= it.next();
//	 String childPopUp5ID= it.next();
//	 String childPopUp6ID= it.next();
//	 
//	 System.out.println("Pop up parent id is  " + parentWindowID);
//	 System.out.println("Pop up 6 id is  " + childPopUp6ID);
//	 System.out.println("Pop up 5 id is  " + childPopUp5ID);
//	 System.out.println("Pop up 4 id is  " + childPopUp4ID);
//	 System.out.println("Pop up 3 id is  " + childPopUp3ID);
//	 System.out.println("Pop up 2 id is  " + childPopUp2ID);
//	 System.out.println("Pop up 1 id is  " + childPopUp1ID);
		
		String parentWindowID = it.next();
		driver.navigate().back();
//		  driver.switchTo().window(parentWindowID);
//		 System.out.println("Pop up id is  " +parentWindowID );
//		 System.out.println("Pop up title is  " + driver.getTitle());
//		 System.out.println("Pop up current URL is  " +driver.getCurrentUrl());
	 
		for(int i=1; i<totalPopUpWindowsCount;i++)
	{
	   String windowID = it.next();
	  driver.switchTo().window(windowID);
	 System.out.println("Pop up id is  " +windowID );
	 System.out.println("Pop up title is  " + driver.getTitle());
	 System.out.println("Pop up current URL is  " +driver.getCurrentUrl());
	 driver.close();
//	 if(driver.getCurrentUrl() != "http://popuptest.com/popuptest1.html")
//	      driver.close();
//	 else
//		 driver.navigate().back();
	}	 
	}
}
