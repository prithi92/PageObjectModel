package wrappers;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DP;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	
	public String appName;
	
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "http://www.facebook.com");
			break;
		case "irctc":
			invokeApp(browserName, "https://www.irctc.co.in");
			break;
		case "pancard":
			invokeApp(browserName, "http://panind.com/india/new_pan/");
			break;
		case "formC":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		case "phpTravels":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
		default:
			System.err.println("Invalid Application ! ! !");
			break;
		}
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTestCase();
	}
	
	@AfterTest
	public void afterTest() {
		unloadObjects();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	@DataProvider(name="fetchData")
	public String[][] dataProvider() {
		return DP.getData(sheetName);
	}

}
