package pom.php.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GeneratePasswordPage extends GenericWrappers {
	
	public GeneratePasswordPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	
	public GeneratePasswordPage clickOnGenerateNewPassword()
	{
		clickByXpath("//button[@class='btn btn-default btn-sm']");
		return this;
	}
	
	public PhpRegisterPage clickOnCopyToClipboardAndInsert()
	{
		clickByXpath("//button[@id='btnGeneratePasswordInsert']");
		return new PhpRegisterPage(driver,test);
	}

}
