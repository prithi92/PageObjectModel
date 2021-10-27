package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCMenuUserRegistrationPage extends GenericWrappers{
	
	public FormCMenuUserRegistrationPage(RemoteWebDriver driver, ExtentTest test)
	{
		
		this.driver = driver;
		this.test = test;
	}
	
	public  FormCUserRegistrationPage clickOnSignupRegistration()
	{
		clickByXpath(prop.getProperty("FormCMenuUserRegistrationPage.SignupRegistration.XPath"));
		return new FormCUserRegistrationPage(driver,test);
	}

}
