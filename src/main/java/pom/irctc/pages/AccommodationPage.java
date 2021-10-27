package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test)
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		this.test = test;
	}

	
	public AccommodationPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelPage clickOnHotelsIcon()
	{
		clickByXpath(prop.getProperty("AccomodationPage.HotelsIcon.XPath"));
		return new HotelPage(driver,test);
	}
	
	public AccommodationPage clickOnMenuIcon()
	{
		clickByXpath(prop.getProperty("AccomodationPage.MenuIcon.XPath"));
		return this;
	}
	
	public FtrHomePage clickOnBookYourCoachOrTrain()
	{
		clickByXpath(prop.getProperty("AccomodationPage.BookYourCoachOrTrain.XPath"));
		return new FtrHomePage(driver,test);
	}
	
	public CharterPage clickOnCharterLink()
	{
		clickByXpath(prop.getProperty("AccomodationPage.CharterLink.XPath"));
		return new CharterPage(driver,test);
	}

}
