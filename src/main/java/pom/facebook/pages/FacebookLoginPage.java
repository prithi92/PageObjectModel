package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookLoginPage extends GenericWrappers{
	
	public FacebookLoginPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	
	
	
	public FacebookLoginPage clickOnEnglishLink()
	{
		clickByXpath(prop.getProperty("FacebookLoginPage.EnglishLink.XPath"));
		return this;
	}
	
	
	public FacebookSignUpPage clickOnCreateNewAccount()
	{
		clickByXpath(prop.getProperty("FacebookLoginPage.CreateNewAccount.XPath"));
		return new FacebookSignUpPage(driver,test);
		
	}


}