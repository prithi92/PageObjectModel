package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ListOfHotelsPage extends GenericWrappers {
	
	public ListOfHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
		
	}
	
	public ListOfHotelsPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public ListOfHotelsPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}

	public SelectedHotelDetailsPage clickOnFirstListedHotel()
	{
		clickByXpath("(//div[@class='row no-gutters'])[1]");
		return new SelectedHotelDetailsPage(driver,test);
	}

}
