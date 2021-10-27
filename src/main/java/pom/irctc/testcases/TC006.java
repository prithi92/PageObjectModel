package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCMenuUserRegistrationPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC006";
		testCaseDescription="To verify FormC registration";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="formC";
	}
	
	@Test
	public void frroFormC()
	{
		new FormCMenuUserRegistrationPage(driver,test)
		.clickOnSignupRegistration()
		.enterUserID("Abcdef123")
		.enterPassword("ABcdef12@")
		.enterConfirmPassword("ABcdef12@")
		.waitingTime(4000)
		.selectSecurityQus("2")
		.enterSecurityAns("Kalaivani hospital")
		.enterUserName("Bhava")
		.selectUserGender("F")
		.enterUserDOB("12/11/1998")
		.enterUserDesignation("Engineer")
		.enterUserEmailID("Bhava35@gmail.com")
		.enterUserMobileNum("8897865741")
		.enterUserPhoneNum("44284876")
		.selectUserNationality("IND")
		.enterName("Mala")
		.enterCapacity("1550")
		.enterAddress("Malaigai street")
		.selectState("28")
		.waitingTime(4000)
		.selectCity("2D")//Need to set the condition if the city is not having frro field
		.waitingTime(5000)
		.selectfrroData("FRO COIMBATORE URBAN")
		.selectAccomodationType("GH")
		.selectAccomodationGrade("5s")
		.enterEmailID("Malasri12@gmail.com")
		.enterMobileNum("9876561432")
		.enterPhoneNum("44284867")
		.enterOwnerName("Sri")//First Owner set of data
		.enterOwnerAddress("Sukkai street")
		.selectOwnerState("28")
		.waitingTime(4000)
		.selectOwnerCity("4C")
		.enterOwnerEmailID("Sriram44@gmail.com")
		.enterOwnerPhoneNum("28486756")
		.enterOwnerMobileNum("8907675612")
		.clickOnAdd()
		.enterOwnerName("viji")//second owner set of data
		.enterOwnerAddress("vellar street")
		.selectOwnerState("9")
		.waitingTime(4000)
		.selectOwnerCity("15C")
		.enterOwnerEmailID("Vijirack44@gmail.com")
		.enterOwnerPhoneNum("22486756")
		.enterOwnerMobileNum("9907675612")
		.clickOnAdd()
		.enterOwnerName("Zara")//Third owner set of data
		.enterOwnerAddress("Car street")
		.selectOwnerState("28")
		.waitingTime(4000)
		.selectOwnerCity("31D")
		.enterOwnerEmailID("Zarafahil4@gmail.com")
		.enterOwnerPhoneNum("23386756")
		.enterOwnerMobileNum("8917675612")
		.clickOnAdd()
		;
				
		
	}

}
