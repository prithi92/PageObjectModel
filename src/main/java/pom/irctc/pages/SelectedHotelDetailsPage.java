package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SelectedHotelDetailsPage extends GenericWrappers {
	
	public static String hotelName,hotelPrice;
	
	public SelectedHotelDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public SelectedHotelDetailsPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public SelectedHotelDetailsPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}

	public SelectedHotelDetailsPage selectedHotelNameText()
	{
		hotelName = getTextByXpath("//div[@class='mid-searchpack']/child::h5");
		return this;
	}
	
	public SelectedHotelDetailsPage selectedHotelPriceText()
	{
		hotelPrice = getTextByXpath("//div[@class='standard-price mt-2']//following::strong");
		return this;
	}
	
	public static Float price;
	public SelectedHotelDetailsPage selectedHotelPriceInNumOnly()
	{
		String priceWithoutAnyText = subStringByIndex(hotelPrice, 2);
		price = stringToFloatAndMultiplyByThree(priceWithoutAnyText);
		return this;
	}
	
	public HotelBookingPassengerDetailPage clickOnContinueToBook()
	{
		clickByXpath("//b[text()='Continue to Book']");
		return new HotelBookingPassengerDetailPage(driver,test);
	}

}
