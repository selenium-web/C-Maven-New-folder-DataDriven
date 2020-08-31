package com.w2a.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase{
	
	
	@Test (dataProvider="getData")
	public void addCustomer(String FirstName, String LastNmae, String PostCode)
	{
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return null;
		
	}

}
