package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC003";
		testCaseDescription="To verify Irctc saloon mandatory check";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}

	
	@Test
	public void irctcSaloonMandatoryCheck()
	{
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.waitingTime(4000)
		.clickOnMenuIcon()
		.clickOnCharterLink()
		.moveToLastWindow()
		.waitingTime(4000)
		.clickOnEnquiryForm()
		.enterApplicantName("Radha")
		.enterOrganizationName("Zaviour Technology")
		.enterAddress("9,Vallarai street")
		.enterMobileNum("998076564")//entered less than 10 number as per test case
		.enterEmail("Radha66@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation("Trichy")
		.enterDestinationStation("Ooty")
		.clickOnDateOfDepartureField()
		.clickOnDateOfDepartureNextMonthArrow()
		.clickOnDateOfDepartureDate("6")
		.clickOnDateOfArrivalField()
		.clickOnDateOfArrivalNextMonthArrow()
		.clickOnDateOfArrival("10")
		.enterDurationOfTour("4")
		.enterNumberAndTypeOfCoaches("2")
		.enterNumberOfPassengers("20")
		.enterPurposeOfCharter("Vacation")
		.enterAdditionalServicesRequired("Double Sanitized")
		.clickOnSubmit()
		.verifyErrorMessageForInvalidMobileNumber()
		;
	}

}
