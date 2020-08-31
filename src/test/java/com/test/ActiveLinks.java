 package com.test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActiveLinks {
	
	
	WebDriver driver;
	WebDriverWait webDriverWait;
	
	@Test
	public void BrokenLinks() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://makemysushi.com/404"); 
		// driver.get("https://www.activelink.ie/"); //https://www.amazon.com/
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(46,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		
       List<WebElement> alllinks = driver.findElements(By.tagName("a"));
       alllinks.add(driver.findElement(By.tagName("img")));
       int count = alllinks.size();
       System.out.println("alllinks count " +count);
           
       List<WebElement> activeLinks = new ArrayList<WebElement>();
//       int i = 0;
//       while(i<=count)
//       {
//    	if(alllinks.get(i).getAttribute("href")!= null)
//    		activeLinks.add(alllinks.get(i));    	
//       }
       
       
       
       for(int i=0;i<alllinks.size();i++)
       {
    	if(alllinks.get(i).getAttribute("href")!= null)
    		activeLinks.add(alllinks.get(i));    	
       }
    	int activeLinksCount = activeLinks.size();
    	 System.out.println("activeLinksCount count " +activeLinksCount);
    	
    	 for(int j=0;j<activeLinksCount;j++)
         {
    		 HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
    		 connection.connect();
    		String ResponseMessage= connection.getResponseMessage();
    		 System.out.println("Request code is" +ResponseMessage);
    		 connection.disconnect();
         }

}
}