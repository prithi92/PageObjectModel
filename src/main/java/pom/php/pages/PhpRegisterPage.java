package pom.php.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpRegisterPage extends GenericWrappers{
	
	public PhpRegisterPage(RemoteWebDriver driver, ExtentTest test) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
	}

	public PhpRegisterPage enterFirstName(String data)
	{
		enterByXpath("//input[@id='inputFirstName']", data);
		return this;
	}
	
	public PhpRegisterPage enterLastName(String data)
	{
		enterByXpath("//input[@id='inputLastName']", data);
		return this;
	}
	
	public PhpRegisterPage enterEmail(String data)
	{
		enterByXpath("//input[@id='inputEmail']", data);
		return this;
	}
	
	public PhpRegisterPage clickOnDialCodeField()
	{
		clickByXpath("//div[@class='iti-arrow']");
		return this;
	}
	
	public PhpRegisterPage clickOnDialCode(String data)
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public PhpRegisterPage enterPhoneNumber(String data)
	{
		enterByXpath("//input[@id='inputPhone']", data);
		return this;
	}
	
	public PhpRegisterPage enterCompanyName(String data)
	{
		enterByXpath("//input[@id='inputCompanyName']", data);
		return this;
	}
	
	public PhpRegisterPage enterStreetAddressOne(String data)
	{
		enterByXpath("//input[@id='inputAddress1']", data);
		return this;
	}
	
	public PhpRegisterPage enterStreetAddressTwo(String data)
	{
		enterByXpath("//input[@id='inputAddress2']", data);
		return this;
	}
	
	public PhpRegisterPage enterCity(String data)
	{
		enterByXpath("//input[@id='inputCity']", data);
		return this;
	}
	
	public PhpRegisterPage enterState(String data)
	{
		enterByXpath("//input[@id='stateinput']", data);
		return this;
	}
	
	public PhpRegisterPage enterPostcode(String data)
	{
		enterByXpath("//input[@id='inputPostcode']", data);
		return this;
	}
	
	public PhpRegisterPage selectCountry(String data)
	{
		selectValueByXpath("//select[@id='inputCountry']", data);
		return this;
	}
	
	public PhpRegisterPage enterMobile(String data)
	{
		enterByXpath("//input[@id='customfield2']", data);
		return this;
	}
	
	public PhpRegisterPage enterPassword(String data)
	{
		enterByXpath("//input[@id='inputNewPassword1']", data);
		return this;
	}
	
	public PhpRegisterPage enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return this;
	}
	
	public GeneratePasswordPage clickOnGeneratePassword()
	{
		clickByXpath("//button[@class='btn btn-default btn-sm btn-xs-block generate-password']");
		return new GeneratePasswordPage(driver,test);
	}
	
	public PhpRegisterPage clickOnRegister()
	{
		clickByXpath("//input[@value='Register']");
		return this;
	}

}
