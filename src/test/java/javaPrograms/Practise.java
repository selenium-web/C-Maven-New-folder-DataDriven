package javaPrograms;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	
	WebDriver driver;
	WebDriverWait driverWait;
	
	@Test
	public void ActiveLinks()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://makemysushi.com/404"); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6666, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7777, TimeUnit.SECONDS);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		alllinks.addAll(driver.findElements(By.tagName("img")));
		
	List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		for(int i=0;i<=alllinks.size();i++)
		{
			if(alllinks.get(i).getAttribute("href")!= null)
				activeLinks.add(alllinks.get(i));
			String link= activeLinks.get(i).getText();
		System.out.println("active link is "  + link);	
			
		}
		
	
		
		
	}
	
	

}
