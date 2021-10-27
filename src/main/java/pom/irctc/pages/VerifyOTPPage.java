package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class VerifyOTPPage extends GenericWrappers{
	
	public VerifyOTPPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public VerifyOTPPage clickOnVerify()
	{
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	
	public VerifyOTPPage verifyErrorMessageForInvalidOTP(String expectedText)
	{
		verifyTextByXpath("(//span[@class='ERR2'])[5]",expectedText);
		return this;
	}

}
