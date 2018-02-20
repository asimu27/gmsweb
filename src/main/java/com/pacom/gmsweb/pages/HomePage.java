package com.pacom.gmsweb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pacom.common.WebDriverExtensions;
import com.pacom.gmsweb.base.Base;

public class HomePage extends Base{
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbCardSearch']")
	WebElement lnkCardSearch; 
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbTransactionReport']")
	WebElement lnkTransactionReport;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbStandardReports']")
	WebElement lnkStandardReport;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_hlCreateNewCard']")
	WebElement lnkCreateNewCard;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbReaders']")
	WebElement lnkReadersCtrl;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbGRGsGAGs']")
	WebElement lnkGRGEdits;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbLogout']")
	WebElement lnklogout;
		
	@FindBy(how= How.XPATH, using="//*[@id='ctl00_lblUserNameValue']")
	WebElement lblOperatorName;
	
	//Default Constructor
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getOperatorName()
	{
		WebDriverExtensions.refreshObject(driver, lblOperatorName);
		
		return lblOperatorName.getText();
	}
	
	public void clickNewCardLink()
	{
		
		lnkCreateNewCard.click();
	}
	
	public void clickTransactionReportLink()
	{
		
		lnkTransactionReport.click();
	}
	
	
	
}
