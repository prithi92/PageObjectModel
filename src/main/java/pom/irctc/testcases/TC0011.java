package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify Irctc Sign up for the new user";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void ftrBookYourCoach()
	{
		new CovidAlertPage(driver,test)
		.waitingTime(15000)
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoachOrTrain()
		.moveToLastWindow()
		.clickOnNewUser()
		.enterUserId("ABcd123")
		.enterPassword("Sairam123@")
		.enterConfirmPassword("Sairam123@")
		.selectSecurityQus("0")
		.enterSecurityAns("Nitu")
		.clickOnDOBField()
		.selectDOBMonth("2")
		.selectDOBYear("1997")
		.clickOnDOBDate("26")
		.clickOnGender("gender1")
		.clickOnMaritalStatus("maritalStatus0")
		.enterEmail("Sairam12@gmail.com")
		.selectOccupation("Government")
		.enterFirstName("Ragavi")
		.enterMiddleName("Nil")
		.enterLastName("Suban")
		.selectNationality("Indian")
		.enterFlatNum("12A")
		.enterStreet("Muthuraman street")
		.enterArea("Chepauk")
		.selectCountry("India")
		.enterIsd("+91")
		.enterMobileNum("9967897645")
		.enterPincode("600005")
		.tabKeyUsingId("pincode")		
		.selectCity("Chennai")
		.selectState("TAMIL NADU")
		.waitingTime(5000)
		.selectPostoffice("Tiruvallikkeni S.O")
		.pageDown()
		.waitingTime(4000)
		.clickOnNoForSameAddress()
		.waitingTime(4000)
		.enterOffFlatNum("12/4")
		.enterOffStreet("Car street")
		.enterOffArea("Madurantakam")
		.selectOffCountry("India")
		.enterOffIsd("+91")
		.enterOffMobileNum("9978652435")
		.enterOffPincode("603306")
		.tabKeyUsingId("pincodeOffice")
		.selectOffCity("Kanchipuram")
		.selectOffState("TAMIL NADU")
		.selectOffPostoffice("Madurantakam S.O")
		.pageDown()
		.clickOnResetForm()
		;
		
	}
	
	

}
