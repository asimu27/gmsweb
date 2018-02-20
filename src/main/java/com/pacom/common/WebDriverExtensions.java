package com.pacom.common;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WebDriverExtensions  {

	
	public static WebElement refreshObject(WebDriver driver, WebElement element)
	{
		
		
		int counter = 0;
		
		try {
			
			counter = counter +1; 
			return element;
		}
		
		catch(StaleElementReferenceException e) {
			
			
			return refreshObject(driver, element);
		}
			
			
	}
}
