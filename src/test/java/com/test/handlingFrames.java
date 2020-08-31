package com.test;


import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;





public class handlingFrames {

	@Test
	public void testGoogle(){

      
		
		//firefox.exe -profilemanager
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("selenium");
	    profile.setAcceptUntrustedCertificates(true);
	    profile.setAssumeUntrustedCertificateIssuer(false);
	    
	    // OR
		
		FirefoxProfile profilenew = new FirefoxProfile();
		profilenew.setAcceptUntrustedCertificates(true);
		profilenew.setAssumeUntrustedCertificateIssuer(false);

	    
	    //1st
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.firstcry.com/");
		
		
		
	
		Set<Cookie> cook = driver.manage().getCookies();
		System.out.println(cook.size());
		
		Iterator<Cookie> iteratecook = cook.iterator();
		while(iteratecook.hasNext()){
			
			Cookie cuk = iteratecook.next();
			System.out.println("Cookie Names ----" + cuk.getName());
			System.out.println("Cookie Values ----" + cuk.getValue());
		}
		
		
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
		
		String mainwindow = iterate.next(); //first window(main)
		
		driver.switchTo().frame("iframeCode");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Raman");
		
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//*[@id='modal']/div[1]/div[1]/div/img")).click();
		driver.manage().deleteAllCookies();
	}

}


