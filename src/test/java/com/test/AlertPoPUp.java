package com.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPoPUp {
	
	WebDriver driver;
	
	@Test
	public void handlePopUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(3655);
         Alert alert = driver.switchTo().alert();
         Thread.sleep(1456);
         String alertText=alert.getText();
         System.out.println("alert text is "+alertText);
         if(alertText.equals("Please enter a valid user name"))
         {
        	 System.out.println("alert text messsage is correct");
         }
         else
         {
        	 System.out.println("alert text messsage is wrong");
         }
         Thread.sleep(1456);
         alert.accept();
	}

}
