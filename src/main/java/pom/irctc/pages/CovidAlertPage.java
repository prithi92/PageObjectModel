package pom.irctc.pages;



import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{
	
	public CovidAlertPage (RemoteWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
	}
	public CovidAlertPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	public HomePage clickOnOK() {
		clickByXpath(prop.getProperty("CovidAlertPage.OkButton.XPath"));
		return  new HomePage(driver,test);
	}
	
	

}
