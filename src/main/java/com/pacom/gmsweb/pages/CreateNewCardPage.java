package com.pacom.gmsweb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pacom.gmsweb.base.Base;

public class CreateNewCardPage extends Base {

	//TextBoxes
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpPersonalDetails_tbLastName']")
	WebElement txtPersonalDetails_LastName;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpPersonalDetails_tbFirstName']")
	WebElement txtPersonalDetails_FirstName;
	
	@FindBy(how = How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpPersonalDetails_tbWorkPhone']")
	WebElement txtPersonalDetails_WrokPhone;
	
	@FindBy(how= How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpCardDetails_cardCodeTextBox']")
	WebElement txtCardDetails_Cardcode;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpCardDetails_issueNoTextBox']")
	WebElement txtIssueNo;
	
	@FindBy(how = How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpCardDetails_facilityTextBox']")
	WebElement txtCardDetails_FacilityCode;
	
	@FindBy(how = How.XPATH, using="//*[@id='//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpCardDetails_printedNoTextBox']")
	WebElement txtPrintedNo;
	
	//Tabs
	
	@FindBy(how= How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpCardDetails_lblHeaderCardDetails']")
	WebElement tabCardDetails;
	
	
	//Button Elements 
	
	@FindBy(how= How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_tabsAccessLevel_tpReadersAccess_ucReadersAccessControl_btnChangeGAG']")
	WebElement btnAssignGRG;
	
	
	//Link Elements
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbCardAccess']")
	WebElement lnkAccessLevel;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_NavigationPlaceHolder_lbSave']")
	WebElement lnkSaveCard;
	
	
	//Drop down elements
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpPersonalDetails_dlTitle']")
	WebElement dropDownTitle;
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_bodyPlaceHolder_ucCardAndHolderDetails_tabsCardDetails_tpPersonalDetails_dlDepartment']")
	WebElement dropDownDepartment;
	
	public CreateNewCardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setLastName(String lastName) {
		txtPersonalDetails_LastName.sendKeys(lastName);
	}

	public void setFirstName(String firstName) {
		txtPersonalDetails_FirstName.sendKeys(firstName);
	}

	
	public void txtPrintedNo(String personalID) {
		txtPrintedNo.sendKeys(personalID);
	}
	
	/*public void setMiddleName(String middleName) {

		txtBoxMiddleName.sendKeys(middleName);
	}*/

	

	/*public void setDOB(String dob) {
		txtDob.sendKeys(dob);
	}
*/
	public void setDropDownTitle(String title) {

		Select selTitle = new Select(dropDownTitle);
		selTitle.selectByVisibleText(title);
	}

	public void setDropDownDepartment(String departmentName) {

		
		Select selDepartment = new Select(dropDownDepartment);
		selDepartment.selectByVisibleText(departmentName);
		
	}
	
	public void clickCardDetailsTab()
	{
		
		tabCardDetails.click();
	}

	public void setCardNo(String cardNumber)
	{
		txtCardDetails_Cardcode.sendKeys(cardNumber);
	}
	
	public void setIssueNo(String issueNumber)
	{
		txtIssueNo.sendKeys(issueNumber);
	}
	
	public void setFacilityCode(String facilityCode)
	{
		
		txtCardDetails_FacilityCode.sendKeys(facilityCode);
	}
	
	public void setPrintedNo(String printedNo)
	{
		
		txtPrintedNo.sendKeys(printedNo);
	}

	public void clickCardAccessLink()
	{
		
		lnkAccessLevel.click();
	}
	
	public void clickChangeGAG()
	{
		
		
		btnAssignGRG.click();
	}
	
	public void clickSaveCard()
	{
		
		lnkSaveCard.click();
	}
	

	
	
	
	
}
