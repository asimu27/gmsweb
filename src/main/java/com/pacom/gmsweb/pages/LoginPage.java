package com.pacom.gmsweb.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pacom.common.WebDriverExtensions;
import com.pacom.gmsweb.base.Base;

public class LoginPage  extends Base{
	
	WebDriverExtensions webDriverExtensions;
	
	@FindBy(how=How.XPATH, using="//*[@id='GMSMasterPage_bodyPlaceHolderLogin_webVersion']")
	WebElement lblGMSVersion;

	@FindBy(how = How.XPATH , using="//*[@id='GMSMasterPage_bodyPlaceHolderLogin_tbUserName']")
	WebElement txtUserName;
	
	@FindBy(how = How.XPATH , using="//*[@id='GMSMasterPage_bodyPlaceHolderLogin_txtPwd']")
	WebElement txtPassword;
	
	
	@FindBy(how= How.XPATH, using="//*[@id='GMSMasterPage_bodyPlaceHolderLogin_btnSubmit']")
	WebElement btnLogin;
	
	public LoginPage(WebDriver driver)
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getGMSVersion()
	{
		
		return lblGMSVersion.getText();
		
	}
	
	public void enterUserName(String userName)
	{
		
		txtUserName.sendKeys(userName);
		
	}
	
	
	public void enterPassword(String password)
	{
		
		
		txtPassword.sendKeys(password);
	}
	
	
	public HomePage clickLogin()
	{
		btnLogin.click();
		
		return new HomePage(driver);
		
	}
}
