package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	public static WebDriver driver;
	
	@Test
	public void uploadFile() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
//		String workingDir = System.getProperty("user.dir");
		String filepath = "D:\\working\\DataDriven\\pom.xml";
//		driver.get(filepath);

		WebElement fileInput = driver.findElement(By.id("myFile"));
		fileInput.sendKeys(filepath);
}
}
