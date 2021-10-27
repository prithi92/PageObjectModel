package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers{
	
	public SummaryPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public SummaryPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}

	public SummaryPage clickOnTermsAndConditions()
	{
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public VerifyOTPPage clickOnMakePayment()
	{
		clickByXpath("//button[text()='Make Payment']");
		return new VerifyOTPPage(driver,test);
	}

}
