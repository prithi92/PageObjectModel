package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcAndUserLoginPage extends GenericWrappers {
	
	public IrctcAndUserLoginPage(RemoteWebDriver driver, ExtentTest test) {
	
		this.driver = driver;
		this.test = test;
	}
	
	public IrctcAndUserLoginPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public IrctcAndUserLoginPage clickOnGuestUserLogin()
	{
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}
	
	public IrctcAndUserLoginPage enterEmail(String data)
	{
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public IrctcAndUserLoginPage enterMobileNum(String data)
	{
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}
	
	public HotelPage clickOnLogin()
	{
		clickByXpath("(//button[text()='Login'])[2]");
		return new HotelPage(driver,test);
	}
	
	

}
