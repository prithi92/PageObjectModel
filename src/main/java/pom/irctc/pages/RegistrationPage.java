package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	

	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
		
	}
	
	public RegistrationPage pageDown()
	{
		pageDownByXpath();
		return this;
	}

	public RegistrationPage enterUserName(String data) 
	{
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) 
	{
		enterByXpath("//input[@name='usrPwd']", data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) 
	{
		enterByXpath("//input[@name='cnfUsrPwd']", data);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLangField()
	{
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
	
	public RegistrationPage clickOnPreferredLang(String data)
	{ 
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestionField()
	{
		clickByXpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-15 pi pi-chevron-down']");
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestion(String data) 
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public RegistrationPage enterSecurityAns(String data) 
	{
		enterByXpath("//input[@placeholder='Security Answer']", data);
		return this;
	}
	
	public RegistrationPage clickOnContinueButton() 
	{
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) 
	{
		enterByXpath("//input[@id='firstName']", data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) 
	{
		enterByXpath("//input[@id='middleName']", data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) 
	{
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	
	public RegistrationPage clickOnOccupationField() 
	{
		clickByXpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-16 pi pi-chevron-down']");
		return this;
	}
	
	public RegistrationPage clickOnOccupation(String data) //need to be check
	{ 
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public RegistrationPage clickOnDOBField()
	{
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}
	
	public RegistrationPage selectDOBMonth(String data) 
	{
		selectValueByXpath("(//select[@tabindex='0'])[1]", data);
		return this;
	}
	
	public RegistrationPage selectDOBYear(String data)
	{
		selectValueByXpath("(//select[@tabindex='0'])[2]", data);
		return this;
	}
	
	public RegistrationPage clickOnDOBDate(String data)
	{ 
		clickByXpath("//a[text()='"+data+"']");
		return this;
	}
	
	public RegistrationPage clickOnMarried() 
	{
		clickByXpath("(//span[@class='ui-radiobutton-icon ui-clickable'])[1]");
		return this;
	}
	
	public RegistrationPage selectCountry(String data) 
	{
		selectVisibileTextByXpath("//select[@formcontrolname='resCountry']", data);
		return this;
	}
	
	public RegistrationPage clickOnFemale() 
	{
		clickByXpath("//span[text()='Female']");
		return this;
	}
	
	public RegistrationPage enterEmail(String data)
	{
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public RegistrationPage enterISDCode(String data) 
	{
		enterByXpath("//input[@id='isd']", data);
		return this;
	}
	
	public RegistrationPage enterMobile(String data) 
	{
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public RegistrationPage selectNationality(String data) 
	{
		selectVisibileTextByXpath("//select[@formcontrolname='nationality']", data);
		return this;
	}
	
	public RegistrationPage enterResAddressNumber(String data) 
	{
		enterByXpath("//input[@id='resAddress1']", data);
		return this;
	}
	
	public RegistrationPage enterResAddressStreet(String data)
	{
		enterByXpath("//input[@id='resAddress2']", data);
		return this;
	}
	
	public RegistrationPage enterResAddressArea(String data) 
	{
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
	}
	
	public RegistrationPage enterResAddressPincode(String data) 
	{
		enterByXpath("(//input[@name='resPinCode'])[1]", data);
		return this;
	}
	
	public RegistrationPage enterResAddressState(String data) 
	{
		enterByXpath("//input[@id='resState']", data);
		return this;
	}
	
	public RegistrationPage selectResAddressCity(String data) 
	{
		selectVisibileTextByXpath("//select[@formcontrolname='resCity']", data);
		return this;
	}
	
	public RegistrationPage selectResAddressPostoffice(String data) 
	{
		selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", data);
		return this;
	}
	
	public RegistrationPage enterResAddressPhone(String data) 
	{
		enterByXpath("//input[@id='resPhone']", data);
		return this;
	}
	
	public RegistrationPage clickOnNoForCopyResidence() 
	{
		clickByXpath("(//span[@class='ui-radiobutton-icon ui-clickable'])[3]");
		return this;
	}
	
	public RegistrationPage enterOffAddressNumber(String data) 
	{
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressStreet(String data) 
	{
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressArea(String data) 
	{
		enterByXpath("//input[@id='offAddress3']", data);
		return this;
	}
	
	public RegistrationPage clickOnCountryField() 
	{ 
		clickByXpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-18 pi pi-chevron-down']");
		return this;
	}
	
	public RegistrationPage clickOnCountry(String data)
	{ 
		clickByXpath("//li[@aria-label='India']");
		return this;
	}
	
	public RegistrationPage enterOffAddressPincode(String data)
	{
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressState(String data)
	{
		enterByXpath("//input[@id='offState']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressCity(String data) 
	{
		enterByXpath("//input[@id='offCity']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressPostoffice(String data)
	{
		enterByXpath("//input[@id='offPostOff']", data);
		return this;
	}
	
	public RegistrationPage enterOffAddressPhone(String data)
	{
		enterByXpath("//input[@id='offPhone']", data);
		return this;
	}
	
	public RegistrationPage clickOnTermsAndConditions()
	{ 
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
	}
	
	public RegistrationPage clickOnRegister() 
	{ 
		clickByXpath("//button[@label='Register']");
		return this;
	}
	
	public RegistrationPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	
	
	
	
	
}
