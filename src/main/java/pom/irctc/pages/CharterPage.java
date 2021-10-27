package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage(RemoteWebDriver driver, ExtentTest test) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public CharterPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public CharterPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}

	public CharterPage clickOnEnquiryForm()
	{
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		return this;
	}
	
	public CharterPage enterApplicantName(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.ApplicantName.XPath"), data);
		return this;
	}
	
	public CharterPage enterOrganizationName(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.OrganizationName.XPath"), data);
		return this;
	}
	
	public CharterPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Address.XPath"), data);
		return this;
	}
	
	public CharterPage enterMobileNum(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.MobileNumber.XPath"), data);
		return this;
	}
	
	public CharterPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Email.XPath"), data);
		return this;
	}
	
	public CharterPage selectRequestFor(String data)
	{
		selectVisibileTextByXpath(prop.getProperty("CharterPage.RequestFor.XPath"), data);
		return this;
	}
	
	public CharterPage enterOriginatingStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.OriginatingStation.XPath"), data);
		return this;
	}
	
	public CharterPage enterDestinationStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.DestinationStation.XPath"), data);
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureField()
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfDeparture.XPath"));
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureNextMonthArrow()
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfDepartureNextMonthArrow.XPath"));
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureDate(String data)
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfDepartureDate.XPath"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrivalField()
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfArrivalField.XPath"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrivalNextMonthArrow()
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfArrivalNextMonthArrow.XPath"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrival(String data)
	{
		clickByXpath(prop.getProperty("CharterPage.DateOfArrival.XPath"));
		return this;
	}
	
	public CharterPage enterDurationOfTour(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.DurationOfTour.XPath"), data);
		return this;
	}
	
	public CharterPage enterNumberAndTypeOfCoaches(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.NumberAndTypeOfCoaches.XPath"), data);
		return this;
	}
	
	public CharterPage enterNumberOfPassengers(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.NumberOfPassengers.XPath"), data);
		return this;
	}
	
	public CharterPage enterPurposeOfCharter(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.PurposeOfCharter.XPath"), data);
		return this;
	}
	
	public CharterPage enterAdditionalServicesRequired(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.AdditionalServicesRequired.XPath"), data);
		return this;
	}
	
	public CharterPage clickOnSubmit()
	{
		clickByXpath(prop.getProperty("CharterPage.Submit.XPath"));
		return this;
	}
	
	public CharterPage verifyErrorMessageForInvalidMobileNumber()
	{
		verifyTextByXpath(prop.getProperty("CharterPage.ErrorMessageForInvalidMobileNumber.XPath"), "Mobile no not valid.");
		return this;
	}

}
