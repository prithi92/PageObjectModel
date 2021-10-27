package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PhpRegisterPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC009";
		testCaseDescription="To verify the php travel registration";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="phpTravels";
	}
	
	@Test	
	public void phpTravels()
	{
		new PhpRegisterPage(driver,test)
		.enterFirstName("Raita")
		.enterLastName("Seera")
		.enterEmail("Raita36@gmail.com")
		.clickOnDialCodeField()
		.clickOnDialCode("+91")
		.enterPhoneNumber("9976562341")
		.enterCompanyName("Zoho tech")
		.enterStreetAddressOne("4A")
		.enterStreetAddressTwo("Pillai street")
		.enterCity("Chennai")
		.enterState("Tamil Nadu")
		.enterPostcode("603306")
		.selectCountry("IN")
		.enterMobile("9978654231")
		.enterPassword("Abcdef12!")
		.enterConfirmPassword("Abcdef12!")
		.clickOnGeneratePassword()
		.clickOnGenerateNewPassword()
		.clickOnCopyToClipboardAndInsert()
		.clickOnRegister()
		;
		
	}
	
	

}
