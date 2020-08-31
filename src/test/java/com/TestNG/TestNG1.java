package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG1 {
	

    @BeforeTest
    public void beforeTest(){
        System.out.println("From BeforeTest annotation in SampleTestngUsage class ..");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("From BeforeSuite annotation in SampleTestngUsage class ..");
    }
    
    @AfterTest
    public void afterTest()
    {
        System.out.println("From AfterTest annotation in AnnotationsTest class ....");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("From AfterSuite annotation in AnnotationsTest class ....");
    }

}


