package com.test;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class ChatPopUp {

WebDriver driver;
	
	@Test
	public void handlePopUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.comm100.com/platform/livechat/personalization/live-chat-window/");
		driver.manage().window().maximize();
		Thread.sleep(39648);
		driver.findElement(By.xpath("//div[@id='comm100-container']"));
//	driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='comm100-container']")));
	driver.findElement(By.xpath("//div[text()='Not all chat is created equal! Ask me anything about the Comm100 digital customer engagement solution.']"));
		driver.findElement(By.xpath("//button[@class='invitation__close']")).click();
	
}
}
