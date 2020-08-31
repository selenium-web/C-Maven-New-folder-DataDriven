package com.test;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
public static WebDriver driver;
	
	/**
	 * methid 1
	 */
	@Test
	public void dropDownHandle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));
//		List <WebElement> selectList = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
//		System.out.println("dropdown first list size is " +selectList.size());
		select.selectByValue("bg");
		Thread.sleep(3666);
		List<WebElement> allDropdownValues = select.getOptions();
		int size = allDropdownValues.size();
		System.out.println("dropdown second list size is " +allDropdownValues.size());
		
		for(int i=0;i<=56;i++)
		{
			WebElement value =allDropdownValues.get(i);
			String valueText=value.getText();
			System.out.println("dropdown value is " +valueText);
		}
		driver.quit();
		
	}	
	
	
	/**
	 * methid two
	 */
	
	@Test
	public void dropDownHandle1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));
		List <WebElement> selectList = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		System.out.println("dropdown first list size is " +selectList.size());
		
		for(int i=0;i<=56;i++)
		{
			WebElement value =selectList.get(i);
			String valueText=value.getText();
			System.out.println("dropdown value is " +valueText);
		}
		driver.quit();
	}

}
