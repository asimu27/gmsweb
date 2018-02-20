package com.pacom.gmsweb.base;

import org.openqa.selenium.WebDriver;

public abstract class Base {

	
	protected WebDriver driver ;
	
	public Base(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
}
