package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrHomePage extends GenericWrappers{
	
	public FtrHomePage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public FtrHomePage(RemoteWebDriver driver, ExtentTest test)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public FtrCreateNewUserProfile clickOnNewUser()
	{
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrCreateNewUserProfile(driver,test);
	}

}
