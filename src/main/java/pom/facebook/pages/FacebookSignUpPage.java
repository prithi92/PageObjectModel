package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers {
	
	public FacebookSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FacebookSignUpPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterMobileOrEmail(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.MobileOrEmail.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage selectDOBDay(String data)
	{
		selectValueByXpath(prop.getProperty("FacebookSignUpPage.DOBDay.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage selectDOBMonth(String data)
	{
		selectValueByXpath(prop.getProperty("FacebookSignUpPage.DOBMonth.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage selectDOBYear(String data)
	{
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.DOBYear.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage clickOnSex(String data)
	{
		clickByXpath(prop.getProperty("FacebookSignUpPage.Sex.XPath"));
		return this;
	}
	
	public FacebookCodeVerificationPage clickOnSignUp()
	{
		clickByXpath(prop.getProperty("FacebookSignUpPage.SignUp.XPath"));
		return new FacebookCodeVerificationPage();
	}

}
