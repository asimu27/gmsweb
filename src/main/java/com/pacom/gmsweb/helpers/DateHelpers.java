package com.pacom.gmsweb.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.pacom.gmsweb.pages.LoginPage;

public class DateHelpers {

	
		//String fromDate = getAWeekAgoDate();
		//System.out.println("from date" +fromDate);
		
		//String fromMonthYear = fromDate.substring(2); //get month & year
		//String fromDay = fromDate.substring(0,2); // get day
		//System.out.print("From day: " +fromDay);
	/*	String toDate = getTodaysDate();
		String toMonthYear = toDate.substring(2);
		char toDay  = toDate.charAt(0);
	*/	
		
		//System.out.println("Value of From Day " +fromDay);
		//String monthYear = driver.findElement(By.xpath("//*[@id='ctl00_bodyPlaceHolder_reportFromDateCE_title']")).getText();
		//Thread.sleep(10000);
		
	//	WebElement element = driver.findElement(By.xpath("//div[@class='ajax__calendar_day' and contains(text(),'"+fromDay+"')]"));
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		
		
	public static String getTodaysDate()
	{
		
		Date today = Calendar.getInstance().getTime();
		
		SimpleDateFormat formatter = new SimpleDateFormat("d MMMM, yyyy");
		
		return formatter.format(today);
		
	}
	
	
	public static String getAWeekAgoDate()
	{
		
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat formatter = new SimpleDateFormat("d MMMM, yyyy");
		cal.add(Calendar.DATE, -7);
		Date date = cal.getTime();
			
		return formatter.format(date);
	}
	
	
	
}
