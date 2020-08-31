package com.test;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testGoogle(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.quit();
		
}
}
