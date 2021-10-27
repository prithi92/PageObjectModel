package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrCreateNewUserProfile extends GenericWrappers {
	
	public FtrCreateNewUserProfile(RemoteWebDriver driver, ExtentTest test)
	{
		
		this.driver = driver;
		this.test = test;
	}
	
	public FtrCreateNewUserProfile waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public FtrCreateNewUserProfile pageDown()
	{
		pageDownByXpath();
		return this;
	}
	
	public FtrCreateNewUserProfile enterUserId(String data)
	{
		enterByXpath("//input[@id='userId']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterPassword(String data)
	{
		enterByXpath("//input[@id='password']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='cnfPassword']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectSecurityQus(String data)
	{
		selectValueByXpath("//select[@id='secQstn']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterSecurityAns(String data)
	{
		enterByXpath("//input[@id='secAnswer']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnDOBField()
	{
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
	}
	
	public FtrCreateNewUserProfile selectDOBMonth(String data)
	{
		selectValueByXpath("//select[@data-handler='selectMonth']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectDOBYear(String data)
	{
		selectValueByXpath("//select[@data-handler='selectYear']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnDOBDate(String data)
	{
		clickByXpath("//a[text()='"+data+"']");
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnGender(String data)
	{
		clickByXpath("//input[@id='"+data+"']");
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnMaritalStatus(String data)
	{
		clickByXpath("//input[@id='"+data+"']");
		return this;
	}
	
	public FtrCreateNewUserProfile enterEmail(String data)
	{
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectOccupation(String data)
	{
		selectValueByXpath("//select[@id='occupation']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterFirstName(String data)
	{
		enterByXpath("//input[@id='fname']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterMiddleName(String data)
	{
		enterByXpath("//input[@id='mname']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterLastName(String data)
	{
		enterByXpath("//input[@id='lname']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectNationality(String data)
	{
		selectVisibileTextByXpath("//select[@id='natinality']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterFlatNum(String data)
	{
		enterByXpath("//input[@id='flatNo']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterStreet(String data)
	{
		enterByXpath("//input[@id='street']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterArea(String data)
	{
		enterByXpath("//input[@id='area']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='country']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterIsd(String data)
	{
		enterByXpath("//input[@id='isdPrefix']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterMobileNum(String data)
	{
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterPincode(String data)
	{
		enterByXpath("//input[@id='pincode']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile tabKeyUsingId(String id)
	{
		tabKeyById(id);
		return this;
		
	}
	
	public FtrCreateNewUserProfile selectCity(String data)
	{
		selectValueByXpath("//select[@id='city']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectState(String data)
	{
		selectValueByXpath("//select[@id='state']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectPostoffice(String data)
	{
		selectVisibileTextByXpath("//select[@id='postOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnNoForSameAddress()
	{
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffFlatNum(String data)
	{
		enterByXpath("//input[@id='flatNoOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffStreet(String data)
	{
		enterByXpath("//input[@id='streetOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffArea(String data)
	{
		enterByXpath("//input[@id='areaOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectOffCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='countryOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffIsd(String data)
	{
		enterByXpath("//input[@id='isdPrefixOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffMobileNum(String data)
	{
		enterByXpath("//input[@id='mobileOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile enterOffPincode(String data)
	{
		enterByXpath("//input[@id='pincodeOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectOffCity(String data)
	{
		selectValueByXpath("//select[@id='cityOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectOffState(String data)
	{
		selectValueByXpath("//select[@id='stateOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile selectOffPostoffice(String data)
	{
		selectVisibileTextByXpath("//select[@id='postOfficeOffice']", data);
		return this;
	}
	
	public FtrCreateNewUserProfile clickOnResetForm()
	{
		clickByXpath("//input[@type='reset']");
		return this;
	}
	
	
	

}
