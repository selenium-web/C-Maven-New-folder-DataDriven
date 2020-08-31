package com.test;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTable {
	
	
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	
	
	public class AutoComplete {
		
		WebDriver driver;
			
			@Test
			public void handleWebTable() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			//	String BeforexPath = "//*[@id=\"customers\"]/tbody/tr[" ;
				String BeforexPath = "//*[@id='customers']/tbody/tr[" ;
				String AfterxPath = "]/td[1]";
				List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			int rowsize=row.size();
				System.out.println(" number of row is "+ rowsize);
				
				for(int i=2;i<=rowsize;i++)
				{
					WebElement rowValue = driver.findElement(By.xpath(BeforexPath+i+AfterxPath));
			//		System.out.println(" name of row value are "+ rowValue.getText());	
					if(rowValue.getText().equalsIgnoreCase("Ernst Handel"))
					{
						System.out.println(" name of row value is "+ rowValue.getText() + " is found at position" +(i-1));
					}
				}

			}			
	}
}
