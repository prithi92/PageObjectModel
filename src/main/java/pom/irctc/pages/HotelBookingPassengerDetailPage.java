package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookingPassengerDetailPage extends GenericWrappers{
	
	public HotelBookingPassengerDetailPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
	}
	
	public HotelBookingPassengerDetailPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelBookingPassengerDetailPage pageDown()
	{
		pageDownByXpath();
		return this;
	}
	
	public HotelBookingPassengerDetailPage selectTitle(String data)
	{
		selectValueByXpath("//select[@name='title']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterFirstName(String data)
	{
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterLastName(String data)
	{
		enterByXpath("//input[@name='lastName']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage selectCountry(String data)
	{
		selectValueByXpath("//select[@name='country']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage selectState(String data)
	{
		selectValueByXpath("//select[@name='state']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterMobileNum(String data)
	{
		enterByXpath("(//input[@name='mobileNo'])[2]", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterEmail(String data)
	{
		enterByXpath("(//input[@name='email'])[2]", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage selectGST(String data)
	{
		selectValueByXpath("//select[@name='gst']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterGSTNum(String data)
	{
		enterByXpath("//input[@name='gstNumber']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterCompanyName(String data)
	{
		enterByXpath("//input[@name='companyName']", data);
		return this;
	}
	
	public HotelBookingPassengerDetailPage enterCompanyAddress(String data)
	{
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
	}
	
	public SummaryPage clickOnContinue()
	{
		clickByXpath("//button[text()='Continue']");
		return new SummaryPage(driver,test);
	}
	
	public HotelBookingPassengerDetailPage verifyErrorMessageForInvalidGST(String expectedText)
	{
		verifyTextByXpath("(//span[@class='ERR2'])[12]", expectedText);
		return this;
	}
	
	public HotelBookingPassengerDetailPage clickOnContinueButton()
	{
		clickByXpath("//button[text()='Continue']");
		return this;
	}
	
	public HotelBookingPassengerDetailPage verifyHotelName()
	{
		verifyTextByXpath("//div[@class='mid-searchpack']/child::h5", SelectedHotelDetailsPage.hotelName);
		return this;
	}
	
	public static String finalAmount,finalAmt;
	public HotelBookingPassengerDetailPage HotelTotalAmountText()
	{
		finalAmount = getTextByXpath("//div[@class='faredetails-in faredetails-in-total']/child::strong");
		return this;
	}
	
	public HotelBookingPassengerDetailPage HotelTotalAmountInNumOnly()
	{
		finalAmt = subStringByIndex(finalAmount, 2);
		return this;
	}
	
	public HotelBookingPassengerDetailPage compareHotelPrice()
	{
		verifyTextByValues(finalAmt, SelectedHotelDetailsPage.price);
		return this;
	}

}
