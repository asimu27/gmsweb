package com.pacom.gmsweb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pacom.gmsweb.pages.CardSearchPage;
import com.pacom.gmsweb.pages.HomePage;
import com.pacom.gmsweb.pages.LoginPage;

public class LoginPageTest extends BaseTestSuite {
	
	
	
	@Test
	public void verifyGmsVersion()
	{
		
		String expectedVersionNumber = "3.2.0.12";
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertEquals(expectedVersionNumber,loginPage.getGMSVersion());
		
	}
	
	
	@Test
	public void verifyLoginSuccessful()
	{
		String expectedOperatorName = "Operator-1 (Administrator)";
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUserName("a");
		loginPage.enterPassword("1");
		HomePage homePage = loginPage.clickLogin();
		Assert.assertEquals(expectedOperatorName, homePage.getOperatorName());
	}
	
	@Test
	public void verifyIncorrectLogin()
	{
		
		
		
	}
}

