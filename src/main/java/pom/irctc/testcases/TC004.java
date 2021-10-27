package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC004";
		testCaseDescription="To verify Irctc book hotels OTP validation";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void irctcBookHotelsOTPValidation()
	{
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.waitingTime(4000)
		.clickOnHotelsIcon()
		.moveToLastWindow()
		.waitingTime(5000)
		.clickOnLogin()
		.waitingTime(4000)
		.clickOnGuestUserLogin()
		.waitingTime(5000)
		.enterEmail("prithiaus92@gmail.com")
		.enterMobileNum("9976568723")
		.clickOnLogin()
		.waitingTime(5000)
		.moveToLastWindow()
		.waitingTime(5000)
		.enterCityOrHotelName("Bangalore")
		.waitingTime(4000)
		.clickOnCityOrHotelLink()
		.clickOnStartDateField()
		.clickOnStartDateYearArrow()
		.clickOnStartDateYear("2022")
		.clickOnStartDateMonth("Jul")
		.clickOnStartDate("10")
		.clickOnEndDateField()
		.clickOnEndDate("13")
		.clickOnRoomOrGuestsField()
		.selectAdultCount("3")
		.clickOnDoneButton()
		.waitingTime(4000)
		.clickOnFindHotel()
		.waitingTime(4000)
		.clickOnFirstListedHotel()
		.moveToLastWindow()
		.waitingTime(4000)
		.selectedHotelNameText()
		.selectedHotelPriceText()
		.selectedHotelPriceInNumOnly()
		.waitingTime(5000)
		.clickOnContinueToBook()
		.waitingTime(4000)
		.selectTitle("2")
		.enterFirstName("Sunila")
		.enterLastName("Mara")
		.selectCountry("India")
		.selectState("TN")
		.enterMobileNum("9878652543")
		//.enterEmail("Sunil93@gmail.com") //email is auto generated which one is used to login
		.waitingTime(4000)
		.selectGST("No")
		.waitingTime(4000)
		.verifyHotelName() //compare the Hotel Name
		.HotelTotalAmountText()
		.HotelTotalAmountInNumOnly()
		.compareHotelPrice() //compare the hotel price
		.waitingTime(5000)
		.clickOnContinue()
		.waitingTime(7000)
		.clickOnTermsAndConditions()
		.waitingTime(4000)
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyErrorMessageForInvalidOTP("OTP Field Is Required")
		;
		
	}

}
