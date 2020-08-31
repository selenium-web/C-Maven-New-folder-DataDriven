package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
	
	WebDriver driver;
	
	@Test
	public void SugarLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	//	driver.manage().window().maximize();
	//	Thread.sleep(19878);
	//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	 driver.findElement(By.xpath("//td[@data-month='5']//child::a[text()='25']")).click();  //-- working 
		Thread.sleep(9878);
//		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover'][contains(.,'9')]")).click();
	//	driver.findElement(By.xpath("//span[@class='ui-datepicker-month' and text()='July']"));
		 driver.findElement(By.xpath("//td[@data-month='7']//child::a[text()='25']")).click(); // -- working 
		
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[4]/td[5]
		
		 
	}
}
