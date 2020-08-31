package com.test;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class iFrame {
	
WebDriver driver;

//https://www.techbeamers.com/handle-iframe-selenium/
	
	@Test(enabled=false)
	public void handleIFrame() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/"); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	      
	       try {
	    	   WebDriverWait waitX = new WebDriverWait(driver, 15);
	    	   waitX.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("a077aa5e")));
	    	   driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	    	   } catch (NoSuchFrameException ex) {
	              ex.getStackTrace();
	    	   } catch (Exception ex) {
	                ex.getStackTrace();
	    	   }
	       WebDriverWait waitY = new WebDriverWait(driver, 15);
	       waitY.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/a/img")));
	       driver.findElement(By.xpath("html/body/a/img")).click();
   		
   	//	To move back to the parent frame, you can either use switchTo().parentFrame() or if you want 
   		// to get back to the main (or most parent) frame, you can use switchTo().defaultContent();
	       

	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();

}
	
	@Test(enabled=false)
	public void handleIFrame1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.tutorialrepublic.com/"); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	      
//	       try {
//	    	   WebDriverWait waitX = new WebDriverWait(driver, 15);
//	    	   waitX.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//a[@href='/jquery-tutorial/']")));
//	    	   driver.switchTo().frame("a077aa5e"); //switching the frame by ID
//	    	   } catch (NoSuchFrameException ex) {
//	              ex.getStackTrace();
//	    	   } catch (Exception ex) {
//	                ex.getStackTrace();
//	    	   }
	       WebDriverWait waitY = new WebDriverWait(driver, 15);
	       waitY.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/jquery-tutorial/']")));
	       driver.findElement(By.xpath("//a[@href='/jquery-tutorial/']")).click();
   		
   	//	To move back to the parent frame, you can either use switchTo().parentFrame() or if you want 
   		// to get back to the main (or most parent) frame, you can use switchTo().defaultContent();
	       

	//    driver.switchTo().parentFrame();
	//    driver.switchTo().defaultContent();

}
	@Test(enabled=true)
	public void handleIFrame3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.tutorialrepublic.com/"); 
		 List<WebElement> list = driver.findElements(By.tagName("iFrame"));
		 System.out.println("total frame available  "+list.size());
         int frameSize=list.size();
		 
		 for(int i=0; i<=6;i++)
		 {
			 WebElement frame = list.get(i);
			 String id = frame.getAttribute("id");
			 String name = frame.getAttribute("name");
			 System.out.println("id of link "+id);
			 System.out.println("name of link "+name);
			 
		 }
	}
	
}
