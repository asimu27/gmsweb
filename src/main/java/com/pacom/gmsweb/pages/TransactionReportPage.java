package com.pacom.gmsweb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pacom.gmsweb.base.Base;
import com.pacom.gmsweb.helpers.DateHelpers;

public class TransactionReportPage extends Base{
	
	
	String fromDay= null;
	
	@FindBy(how=How.XPATH, using="//input[@name='ctl00$bodyPlaceHolder$reportFromDate']")
	WebElement txtReportFromDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_reportFromDateCE_title']")
	WebElement calMonthYearTxt;
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_bodyPlaceHolder_reportToTime']")
	WebElement txtReportToTime;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_reportFromDateCE_day_0_1']")
	WebElement dtFromDate;
	
	@FindBy(how=How.XPATH, using = "//*[@id='ctl00_bodyPlaceHolder_reportToDateCE_day_0_5']")
	WebElement dtToDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_rbtnGmsTime']")
	WebElement radioBtnGmsTime;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_lbTransactionStatus']/option[4]")
	WebElement selectTransactionStatus;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_btnGenerateReport]")
	WebElement btnGenerateReport;
	
	//@FindBy(how=How.XPATH,using="//div[@class='ajax__calendar_day' and contains(text(),'"+fromDay+"')]")
	@FindBy(xpath="//div[@class='ajax__calendar_day' and contains(text(),'fromDay')]")
	WebElement calDay;
	
	
	
	public TransactionReportPage(WebDriver driver)
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickFromDate()
	{
		
		txtReportFromDate.click();
	}
	
	public String getFromMonthYear()
	{
		
		return calMonthYearTxt.getText();
	}
	
	public void getFromDay()
	{
		
		String fromDate = DateHelpers.getAWeekAgoDate();
		String fromMonthYear = fromDate.substring(2);
		String fromDay = fromDate.substring(0,2);
		WebElement element = driver.findElement(By.xpath("//div[@class='ajax__calendar_day' and contains(text(),'"+fromDay+"')]"));
		
		
	}
	
	
	
	
	
	

}
