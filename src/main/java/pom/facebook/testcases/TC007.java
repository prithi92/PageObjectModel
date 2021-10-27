package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookLoginPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Sign up for the new user";
		author="Prithi";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
		sheetName = "TC007";
	}
	
	@Test(dataProvider = "fetchData")
	public void facebookSignup(String userName, String lastname, String phone, String password, String dobDate,String dobMonth,String dobYear,
			String sex)
	{
		new FacebookLoginPage(driver,test)
		.clickOnEnglishLink()
		.clickOnCreateNewAccount()
		.enterFirstName(userName)
		.enterLastName(lastname)
		.enterMobileOrEmail(phone)
		.enterPassword(password)
		.selectDOBDay(dobDate)
		.selectDOBMonth(dobMonth)
		.selectDOBYear(dobYear)
		.clickOnSex(sex)
		;
	}

}
