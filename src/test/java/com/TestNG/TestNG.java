package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("From BeforeClass annotation test in AnnotationsTest class....");
    }
    

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("From BeforeMethod annotation in AnnotationsTest....");
    }
    
	 @Test(priority=2,groups="appale")
	    public void firstTest ()
	    {
	       System.out.println("From first test annotated in AnnotationsTest....");
	    }

	 @Test(priority=1,groups="appale")
	    public void secondTest ()
	    {
	       System.out.println("From first test annotated in AnnotationsTest....");
	    }
	    
	    @org.testng.annotations.AfterMethod
	    public void AfterMethod()
	    {
	        System.out.println("From AfterMethod annotation in AnnotationsTest....");
	    }

	 
    @AfterClass
    public void afterClass()
    {
        System.out.println("From AfterClass annotation test in AnnotationsTest class....");
    }
	



	   

	}


