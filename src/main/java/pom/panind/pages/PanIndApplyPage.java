package pom.panind.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanIndApplyPage extends GenericWrappers {
	
	public PanIndApplyPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	
	
	public PanIndApplyPage selectTitle(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_title']", data);
		
		return this;
	}
	
	public PanIndApplyPage enterFirstName(String data)
	{
		enterByXpath("//input[@id='pan_firstname']", data);
		return this;
	}
	
	public PanIndApplyPage enterMiddleName(String data)
	{
		enterByXpath("//input[@id='pan_middlename']", data);
		return this;
	}
	
	public PanIndApplyPage enterLastName(String data)
	{
		enterByXpath("//input[@id='pan_lastname']", data);
		return this;
	}
	
	public PanIndApplyPage enterFatherFirstName(String data)
	{
		enterByXpath("//input[@id='pan_fatherfirstname']", data);
		return this;
	}
	
	public PanIndApplyPage enterFatherMiddleName(String data)
	{
		enterByXpath("//input[@id='pan_fathermiddlename']", data);
		return this;
	}
	
	public PanIndApplyPage enterFatherLastName(String data)
	{
		enterByXpath("//input[@id='pan_fatherlastname']", data);
		return this;
	}
	
	public PanIndApplyPage enterMobileNum(String data)
	{
		enterByXpath("//input[@name='pan_mobilenumber']", data);
		return this;
	}
	
	public PanIndApplyPage enterEmail(String data)
	{
		enterByXpath("//input[@name='pan_email']", data);
		return this;
	}
	
	public PanIndApplyPage selectSourceOfIncome(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_sourceofincome']", data);
		return this;
	}
	
	public PanIndApplyPage clickOnOffice() 
	{
		clickByXpath("//input[@id='office']");
		return this;
	}
	
	public PanIndApplyPage enterDOB(String data)
	{
		enterByXpath("//input[@id='pan_dob']", data);
		return this;
	}
	
	public PanIndApplyPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public PanIndApplyPage scrollPageDown()
	{
		pageDownByXpath();
		return this;
	}
	
		
	public PanIndApplyPage enterResidenceAddressNum(String data)
	{
		enterByXpath("//input[@name='pan_addressline1']", data);
		return this;
	}
	
	public PanIndApplyPage enterResidenceAddressStreet(String data)
	{
		enterByXpath("//input[@name='pan_addressline2']", data);
		return this;
	}
	
	public PanIndApplyPage enterResidenceAddressCity(String data)
	{
		enterByXpath("//input[@name='pan_cityname']", data);
		return this;
	}
	
	public PanIndApplyPage selectResidenceAddressState(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_state']", data);
		return this;
	}
	
	public PanIndApplyPage enterResidenceAddressPincode(String data)
	{
		enterByXpath("//input[@name='pan_pincode']", data);
		return this;
	}
	
	public PanIndApplyPage selectResidenceAddressCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_country']", data);
		return this;
	}
	
	public PanIndApplyPage enterOffName(String data)
	{
		enterByXpath("//input[@name='pan_officename']", data);
		return this;
	}
	
	public PanIndApplyPage enterOffAddressNum(String data)
	{
		enterByXpath("//input[@name='pan_officeaddressline1']", data);
		return this;
	}
	
	public PanIndApplyPage enterOffAddressStreet(String data)
	{
		enterByXpath("//input[@name='pan_officeaddressline2']", data);
		return this;
	}
	
	public PanIndApplyPage enterOffAddressCity(String data)
	{
		enterByXpath("//input[@name='pan_officecityname']", data);
		return this;
	}
	
	public PanIndApplyPage selectOffAddressState(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_officestate']", data);
		return this;
	}
	
	public PanIndApplyPage enterOffAddressPincode(String data)
	{
		enterByXpath("//input[@name='pan_officepincode']", data);
		return this;
	}
	
	public PanIndApplyPage selectOffAddressCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_officecountry']", data);
		return this;
	}
	
	public PanIndApplyPage selectIdentityProof(String data)
	{
		selectValueByXpath("//select[@id='pan_identityproof']", data);
		return this;
	}
	
	public PanIndApplyPage selectAddressProof(String data)
	{
		selectValueByXpath("//select[@id='pan_addressproof']", data);
		return this;
	}
	
	public PanIndApplyPage selectDOBProof(String data)
	{
		selectValueByXpath("//select[@id='pan_DOBproof']", data);
		return this;
	}
	
	public PanIndApplyPage selectAadhaarProof(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']", data);
		return this;
	}
	
	public PanIndApplyPage selectOffAddressProof(String data)
	{
		selectVisibileTextByXpath("//select[@id='pan_officeaddressproof']", data);
		return this;
	}
	
	
	public PanIndApplyPage clickOnAgreeTermsAndConditions()
	{
		clickByXpath("//input[@id='pan_source']");
		return this;
	}
	
	public PanIndApplyPage clickOnReset()
	{
		clickByXpath("//input[@type='reset']");
		return this;
	}
	
}
