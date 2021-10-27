package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public HomePage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
	}

	public RegistrationPage clickOnRegister()
	{
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationPage(driver,test);
	}
	
	public HomePage clickOnHolidays()
	{
		clickByXpath(prop.getProperty("HomePage.Holidays.XPath"));
		return this;
	}
	
	public HomePage clickOnStays()
	{
		clickByXpath(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge()
	{
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new AccommodationPage(driver,test);
	}
	
	
	
	
	
	
}
