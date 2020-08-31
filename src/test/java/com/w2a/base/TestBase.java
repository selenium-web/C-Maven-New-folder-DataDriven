package com.w2a.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.utilities.ExcelReader;

public class TestBase {

	/*
	 * Initialization of WebDriver - done Properties - done Logs - log4j jar,
	 * .log,log4j.properties, Logger class
	 * 
	 * 
	 * 
	 * 
	 * ExtentReports DB Excel Mail ReportNG, ExtentReports Jenkins Jenkins
	 * 
	 */

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader("D:\\working\\DataDriven\\src\\test\\resources\\excel\\testdata.xlsx");

	@BeforeMethod
	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			try {
				// fis= new FileInputStream(System.getProperty("user.dir")+
				// "\\src\test\\resources\\properties\\Config.properties");

				fis = new FileInputStream(
						"D:\\working\\DataDriven\\src\\test\\resources\\properties\\Config.properties");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				config.load(fis);
				log.debug("config file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream("D:\\working\\DataDriven\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				OR.load(fis);
				log.debug("OR file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("chrome")) {
				// System.setProperty("webdriver.chrome.driver","D:\\working\\DataDriven\\src\\test\\resources\\executable\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched");
			}

			driver.get(config.getProperty("testsite"));
			log.debug("TestURL Launched");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			// driver.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);

		}
	}
	
	public boolean isElementPresent(By by)
	{
		try {
			
			driver.findElement(by);
			return true;
			
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}

	@AfterMethod
	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

		log.debug("Test execusion completed");
	}
}
