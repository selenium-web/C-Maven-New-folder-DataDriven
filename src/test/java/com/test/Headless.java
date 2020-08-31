package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {
	
WebDriver driver;
	
	@Test
	public void headless() throws InterruptedException
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
