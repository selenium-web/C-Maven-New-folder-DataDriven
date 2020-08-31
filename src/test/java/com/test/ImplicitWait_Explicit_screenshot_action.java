package com.test;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait_Explicit_screenshot_action {
	
		
		WebDriver driver;
		WebDriverWait webDriverWait;
		
		@Test(enabled=false)
		public void SugarLogin() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://in.ebay.com/");
			driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(46,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts");
	      clickOn(driver, driver.findElement(By.xpath("//td[@class='gh-td gh-sch-btn']//child::input[@id='gh-btn']")), 13);		
	      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(src, new File("D:\\working\\DataDriven\\screenshot\\test.jpg"));
			
		}
		 // Explicit wait
		// this method for link, button, dependent dropdown elemnts
		public void clickOn(WebDriver driver, WebElement locator,int timeout)
		{
			new WebDriverWait(driver, 19).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			locator.click();
		}
		
		
		@Test(enabled=false)
		public void screenShot() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://in.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(46,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts");;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				// wrong xpath
				clickOn(driver, driver.findElement(By.xpath("//td[@class='gh-td gh-sch-btn']//child::input[@id='gh']")), 13);	
			}
			catch(Throwable t)
			{
				 try {
					FileUtils.copyFile(src, new File("D:\\working\\DataDriven\\screenshot\\test.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		@Test
		public void mouseMomentsActionClass() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Actions action = new Actions(driver);

	      Thread.sleep(4444);
	      WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	      Thread.sleep(4444);
	      WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
	      Thread.sleep(4444);
	      
	      action.clickAndHold(source).moveToElement(target).release().build().perform();
   // action.dragAndDrop(image, target);
		
		
		}
		
		
		
		
}
