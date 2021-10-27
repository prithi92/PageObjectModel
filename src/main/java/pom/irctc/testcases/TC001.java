package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify Irctc Sign up for the new user";
		author="Prithi";
		category="Unit";
		browserName="chrome";
		appName="irctc";
		sheetName="TC001";
	}
	

	@Test(dataProvider="fetchData")
	public void irctcSignUp(String userName,String password,String cnfPassword,String favGame,String name,String middleName,String lastName,String dobYear,
			String dobMonth,String country,String email,String isd,String number,String nationality,String address1,String address2,String address3,String pincode,String state,
			String city,String postOffice,String resnum,String offAddress1,String offAddess2,String offAddress3,String offPincode,String offState,String offCity,
			String offPostOffice,String offNumber) {
		
		new CovidAlertPage(driver,test)
		.waitingTime(15000)
		.clickOnOK()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfirmPassword(cnfPassword)
		.waitingTime(4000)
		.clickOnPreferredLangField()
		.clickOnPreferredLang("English")
		.waitingTime(7000)
		.clickOnSecurityQuestionField()
		.waitingTime(3000)
		.clickOnSecurityQuestion("What is your pet name?")
		.enterSecurityAns("Nitu")
		.pageDown()
		.waitingTime(15000)
		.clickOnContinueButton()
		.enterFirstName("Prithi")
		.enterMiddleName("Nil")
		.enterLastName("Mani")
		.waitingTime(5000)
		.clickOnOccupationField()
		.waitingTime(3000)
		.clickOnOccupation("PROFESSIONAL")
		.clickOnDOBField()
		.selectDOBMonth("1")
		.selectDOBYear("1992")
		.clickOnDOBDate("10")
		.clickOnMarried()
		.selectCountry("India")
		.clickOnFemale()
		.enterEmail("Prithi93@gmail.com")
		//.enterISDCode("+91")//Need to create condition if the country value is not equal to India
		.enterMobile("9987675645")
		.selectNationality("India")
		.waitingTime(5000)
		.clickOnContinueButton()
		.enterResAddressNumber("10A")
		.enterResAddressStreet("Muthuraga street")
		.enterResAddressArea("Triplicane")
		.enterResAddressPincode("600005")
		.enterResAddressState("Tamil Nadu")
		.waitingTime(4000)
		.selectResAddressCity("Chennai")
		.waitingTime(4000)
		.selectResAddressPostoffice("Madras University S.O")
		.enterResAddressPhone("28486757")
		.waitingTime(5000)
		.clickOnNoForCopyResidence()
		.enterOffAddressNumber("11")
		.enterOffAddressStreet("VKM street")
		.enterOffAddressArea("Mylapore")
		.waitingTime(7000)
		.clickOnCountryField()
		.clickOnCountry("India")
		.enterOffAddressPincode("600008")
		.enterOffAddressState("Tamil Nadu")
		.enterOffAddressCity("Chennai")
		.enterOffAddressPostoffice("Mylapore")
		.enterOffAddressPhone("44248671")
		.pageDown()
		.waitingTime(5000)
		;	
	}

}
