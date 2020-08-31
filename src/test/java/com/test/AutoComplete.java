package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class AutoComplete {
	
WebDriver driver;
Logger log = Logger.getLogger(AutoComplete.class);
	
	@Test
	public void handlePopUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
	   ChromeOptions option = new ChromeOptions();
	   option.addArguments("window-size=1400,800");
	   option.addArguments("headless");
	   
		
		driver = new ChromeDriver(option);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(19878);
		driver.findElement(By.id("tags")).sendKeys("admin");
	}
}
