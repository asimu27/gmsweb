package com.pacom.gmsweb.tests;

import org.testng.annotations.Test;

import com.pacom.gmsweb.pages.HomePage;

public class CreateNewCardTestSuite extends BaseTestSuite{

	
	@Test
	public void verifyNewCardCreatedSuccessfully()
	{
		
		HomePage homePage = new HomePage(driver);
		homePage.clickNewCardLink();
		
	}
	
	
	
}
