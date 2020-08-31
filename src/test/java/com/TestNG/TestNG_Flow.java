package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Flow {
	
	 @BeforeSuite
	    public void BeforeSuit()
	    {
	        System.out.println("TestNG Flow From BeforeSuit annotation test in AnnotationsTest class TestNG Flow....");
	    }
	
	 @BeforeTest
	    public void beforeTest()
	    {
	        System.out.println("TestNG Flow From BeforeTest annotation test in AnnotationsTest class....");
	    }
	
	 @BeforeGroups
	    public void beforeGroups()
	    {
	        System.out.println("TestNG Flow From BeforeGroups annotation test in AnnotationsTest class....");
	    }
	
	 @BeforeClass
	    public void beforeClass()
	    {
	        System.out.println("TestNG Flow From BeforeClass annotation test in AnnotationsTest class....");
	    }
	    

	    @BeforeMethod
	    public void beforeMethod()
	    {
	        System.out.println("TestNG Flow From BeforeMethod annotation in AnnotationsTest....");
	    }
	    
	    @Test(enabled = true)               // without priority test cases run first before priority tests.
	    public void testPrintMessage() {
	       System.out.println("Inside enabled=false()");
	 
	    }
	    
		 @Test(priority=2,groups = { "functest", "checkintest" },enabled=true)
		    public void firstTest ()
		    {
		       System.out.println("TestNG Flow functest and checkintest From first test annotated in AnnotationsTest....");
		    }
		 @Test(priority=3,groups = { "checkintest" })
		    public void thirdTest ()
		    {
		       System.out.println("TestNG Flow checkintest From third test annotated in AnnotationsTest....");
		    }
		 @Test(priority=1,groups = { "functest" })
		    public void secondTest ()
		    {
		       System.out.println("TestNG Flow functest From second test annotated in AnnotationsTest....");
		    }
		 @Test(priority=4,groups="orange")
		    public void forthTest ()
		    {
		       System.out.println("TestNG Flow orange From forth test annotated in AnnotationsTest....");
		    }
		    
		    @org.testng.annotations.AfterMethod
		    public void AfterMethod()
		    {
		        System.out.println("TestNG Flow From AfterMethod annotation in AnnotationsTest....");
		    }
		    
			 @AfterGroups
			    public void afterGroups()
			    {
			        System.out.println("TestNG Flow  From AfterGroups annotation test in AnnotationsTest class....");
			    }
  
			 @AfterSuite
			    public void AfterSuite()
			    {
			        System.out.println("TestNG Flow From AfterSuite annotation test in AnnotationsTest class....");
			    }
		 
	    @AfterClass
	    public void afterClass()
	    {
	        System.out.println(" TestNG Flow From AfterClass annotation test in AnnotationsTest class....");
	    }
	    
		 @AfterTest
		    public void afterTest()
		    {
		        System.out.println("TestNG Flow From afterTest annotation test in AnnotationsTest class....");
		    }

}
