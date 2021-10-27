package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC005";
		testCaseDescription="To verify Irctc book hotels GST validation";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void irctcBookHotelsGSTValidation()
	{
		
		new CovidAlertPage(driver,test)
		.waitingTime(15000)
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.waitingTime(5000)
		.clickOnHotelsIcon()
		.moveToLastWindow()
		.waitingTime(5000)
		.clickOnLogin()
		.waitingTime(4000)
		.clickOnGuestUserLogin()
		.enterEmail("prithiaus92@gmail.com")
		.enterMobileNum("9976568723")
		.clickOnLogin()
		.waitingTime(5000)
		.enterCityOrHotelName("Bangalore")
		.waitingTime(4000)
		.clickOnCityOrHotelLink()
		.clickOnStartDateField()
		.clickOnStartDateYearArrow()
		.clickOnStartDateYear("2022")
		.clickOnStartDateMonth("Jan")
		.clickOnStartDate("9")
		.clickOnEndDateField()
		.clickOnEndDate("13")
		.clickOnRoomOrGuestsField()
		.selectAdultCount("3")
		.clickOnDoneButton()
		.waitingTime(4000)
		.clickOnFindHotel()
		.waitingTime(5000)
		.clickOnFirstListedHotel()
		.moveToLastWindow()
		.waitingTime(5000)
		.selectedHotelNameText()
		.selectedHotelPriceText()
		.waitingTime(5000)
		.clickOnContinueToBook()
		.waitingTime(4000)
		.selectTitle("2")
		.enterFirstName("Mari")
		.enterLastName("Velu")
		.selectCountry("India")
		.selectState("TN")
		.enterMobileNum("9878652543")
		//.enterEmail("Sunil93@gmail.com")//this field is populated with login email
		.waitingTime(4000)
		.selectGST("Yes")
		.enterGSTNum("11101")//Entered invalid GST number as per the test case
		.enterCompanyName("Roche")
		.enterCompanyAddress("7,Sgaula street")
		.pageDown()
		.waitingTime(5000)
		.clickOnContinueButton()
		.verifyErrorMessageForInvalidGST("Please Enter Valid GST Number")
		
		;
	}

}
