package com.w2a.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		log.debug("Inside login test");
		
		// driver.findElement(By.id("email")).sendKeys("abhi@crossbrowsertesting.com");
//		driver.findElement(By.cssSelector("div > div:last-child >.btn.btn-primary.btn-lg")).click();
	 driver.findElement(By.cssSelector(OR.getProperty("btn"))).click();
	 
	 Thread.sleep(9699);
	
  //   AssertJUnit.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), " Login not successfully");
		log.debug("Login completed successfully");
		
		
	}
}
	


