package com.test;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript_Pop_Up_And_Alert {
	
	WebDriver driver=null;
		
		public class alertPopUp {
			
			@Test
			public void testGoogle() throws InterruptedException{
				
				System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				Thread.sleep(3366);
//				List<WebElement> alllinks = driver.findElements(By.tagName("a"));
//				int size=alllinks.size();
//				for(int i=0;i<=13;i++)
//				{
//					WebElement link = alllinks.get(i);
//					String linktext = link.getText();
//					System.out.println("Text of link is"  +linktext);
//				}
				
				driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Abhi");
			//	driver.findElement(By.name("login")).sendKeys("Abhi");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("raj");
				
				WebElement checkbox =	driver.findElement(By.xpath("//input[@id='remember']"));
				// if checkbox is not selected then click the checkbox
			      if( !checkbox.isSelected() ){
			    	  checkbox.click();
			      }
				Thread.sleep(1456);
				driver.findElement(By.xpath("//input[@value='Sign in']")).click();
				Thread.sleep(6456);
				Alert alert = driver.switchTo().alert();
				Thread.sleep(4456);
				alert.accept();
				driver.navigate().forward();
						
				
				
				
			//	driver.quit();
				
				// <input type="text" id="login1" maxlength="30" name="login" value="" tabindex="1">
			//	<input type="password" id="password" name="passwd" value="" tabindex="2">
				// ()
				//input[@name='login']
				//input[@id='login1']
				//input[@type='text']
				//input[@value='']
				//input[@tabindex='1']
				//input[@name='login' and @type='text']
				//input[contains(@name.'login')]
				
		}
			
	}
		

}
