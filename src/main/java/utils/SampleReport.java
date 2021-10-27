package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// Start Report
		
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		
		// Start Test
		
		ExtentTest test = report.startTest("TC004", "To verify irctc registration for the new user");
		
		test.assignAuthor("Prithi");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}
	

}
