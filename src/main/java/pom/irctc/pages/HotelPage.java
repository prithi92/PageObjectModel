package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{
	
	public HotelPage(RemoteWebDriver driver, ExtentTest test)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public HotelPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public IrctcAndUserLoginPage clickOnLogin()
	{
		clickByXpath("//a[text()='Login']");
		return new IrctcAndUserLoginPage(driver,test);
	}
	
	public HotelPage enterCityOrHotelName(String data)
	{
		enterByXpath("//input[@id='filterText']", data);
		return this;
	}
	
	public HotelPage clickOnCityOrHotelLink()
	{
		clickByXpath("(//div[@class='right_type']/child::strong[1])[1]");
		return this;
	}
	
	public HotelPage clickOnStartDateField() 
	{
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	
	public HotelPage clickOnStartDateYearArrow() 
	{
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		return this;
	}
	
	public HotelPage clickOnStartDateYear(String data)
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public HotelPage clickOnStartDateMonth(String data)
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public HotelPage clickOnStartDate(String data)
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public HotelPage clickOnEndDateField() 
	{
		clickByXpath("//input[@name='dt13']");
		return this;
	}
	
	public HotelPage clickOnEndDate(String data) //need to be check
	{
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public HotelPage clickOnRoomOrGuestsField() 
	{
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	
	public HotelPage selectAdultCount(String data) 
	{
		selectValueByXpath("//select[@name='hotelAdult']", data);
		return this;
	}
	
	public HotelPage clickOnDoneButton() 
	{
		clickByXpath("(//button[@type='button'])[2]");
		return this;
	}
	
	public ListOfHotelsPage clickOnFindHotel() 
	{
		clickByXpath("//button[text()='Find Hotel ']");
		return new ListOfHotelsPage(driver,test);
	}
	

}
