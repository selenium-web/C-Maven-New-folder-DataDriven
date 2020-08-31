package com.test;


import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllLinkOfpage {
	
	public static WebDriver driver=null;
	
	@Test
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

}
