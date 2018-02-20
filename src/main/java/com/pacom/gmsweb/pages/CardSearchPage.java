package com.pacom.gmsweb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pacom.common.WebDriverExtensions;
import com.pacom.gmsweb.base.Base;

public class CardSearchPage extends Base {

	WebDriverExtensions webDriverExtensions;
	

	public CardSearchPage(WebDriver driver)
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	
	
}
