package com.test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyBoardEvents {
	
	
	WebDriver driver;
	
	@Test
	public void keyBoardEvents() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chillyfacts.com/sun-net-www-protocol-http-httpurlconnection-cannot-be-cast-to-javax-net-ssl-httpsurlconnection/"); 
		// driver.get("https://www.activelink.ie/"); //https://www.amazon.com/
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(46,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(9566);
		driver.findElement(By.xpath("//a[@class='btn  btn-primary' and  @href='https://chillyfacts.com/sun-net-www-protocol-http-httpurlconnection-cannot-be-cast-to-javax-net-ssl-httpsurlconnection/#respond']")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(9566);
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java");
	Thread.sleep(9566);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(4566);
	// driver.findElement(By.xpath("//a[text()='Back']")).sendKeys(Keys.BACK_SPACE);
	driver.navigate().back();
	
	
	}	

}
