package pom.panind.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panind.pages.PanIndApplyPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC008";
		testCaseDescription="To verify the pancard registration";
		author="Prithi";
		category="smoke";
		browserName="chrome";
		appName="pancard";
	}
	
	@Test	
	public void panind()
	{
		new PanIndApplyPage(driver,test)
		.selectTitle("MRS.")
		.enterFirstName("Sangeetha")
		.enterMiddleName("Nil")
		.enterLastName("Subbu")
		.enterFatherFirstName("Subbura")
		.enterFatherMiddleName("Nil")
		.enterFatherLastName("Shanmuga")
		.enterMobileNum("8809345672")
		.enterEmail("Sangee12@gmail.com")
		.selectSourceOfIncome("Salary")
		.clickOnOffice()
		.waitingTime(4000)
		.enterDOB("26101993")
		.waitingTime(4000)
		.enterResidenceAddressNum("10")
		.enterResidenceAddressStreet("VGM street")
		.enterResidenceAddressCity("Chennai")
		.selectResidenceAddressState("Tamil Nadu")
		.scrollPageDown()
		.enterResidenceAddressPincode("600005")
		.selectResidenceAddressCountry("INDIA")
		.enterOffName("Zoho Technology")
		.enterOffAddressNum("14A")
		.enterOffAddressStreet("Zaffir street")
		.enterOffAddressCity("Kanchipuram")
		.selectOffAddressState("Tamil Nadu")
		.enterOffAddressPincode("603306")
		.scrollPageDown()
		.selectOffAddressCountry("INDIA")
		.selectIdentityProof("4")
		.selectAddressProof("5")
		.selectDOBProof("6")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOffAddressProof("Credit Card statement carrying Office Address")
		.clickOnAgreeTermsAndConditions()
		.clickOnReset()
		;
	}

}
