package com.pacom.gmsweb.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTestSuite {

	
	
	protected static WebDriver driver;
	public String webUrl = "http://localhost:88/GMSWeb"; 
	public static final String testDataExcelFileName = "Web_Data.xlsx";

	@BeforeTest
	public void initializeDriver()
	{
		
		
		String localPath = System.getProperty("user.dir");
		System.out.println(localPath);
		
		
		
		System.setProperty("webdriver.ie.driver", localPath+"\\resources\\browserdrivers\\IEDriverServer.exe");
		DesiredCapabilities cap =DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(cap);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void  tearDown()
	{
		
		driver.quit();
	}
	
	
}
