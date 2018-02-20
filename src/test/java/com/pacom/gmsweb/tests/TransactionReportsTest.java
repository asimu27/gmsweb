package com.pacom.gmsweb.tests;

import javax.management.DescriptorKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.pacom.gmsweb.helpers.DateHelpers;
import com.pacom.gmsweb.helpers.ExcelHelpers;
import com.pacom.gmsweb.pages.HomePage;
import com.pacom.gmsweb.pages.TransactionReportPage;

public class TransactionReportsTest extends BaseTestSuite {
	
	@Test
	public void setupTestData() throws Exception
	{
		
		ExcelHelpers.setExcelFileSheet("TransactionReports");
		
	}
	
	@Test (priority=0, description= "generate  valid cards report for last 7 days ")
	//@Severity(SeverityLevel.BLOCKER)
	//@Description("Valid test for generating reports for valid cards")
	public void generateValidCardReportTest()
	{
		
		
		
		HomePage homePage = new HomePage(driver);
		homePage.clickTransactionReportLink();
		
		TransactionReportPage transactionReportPage = new TransactionReportPage(driver);
		
		transactionReportPage.clickFromDate();
		
		String monthYear = transactionReportPage.getFromMonthYear();
		
		//System.out.println("Value of From Day " +fromDay);
		//String monthYear = driver.findElement(By.xpath("//*[@id='ctl00_bodyPlaceHolder_reportFromDateCE_title']")).getText();
		//Thread.sleep(10000);
		
		//WebElement element = driver.findElement(By.xpath("//div[@class='ajax__calendar_day' and contains(text(),'"+fromDay+"')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		
		
	
	}

}
