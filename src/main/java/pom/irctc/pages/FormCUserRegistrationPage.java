package pom.irctc.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCUserRegistrationPage extends GenericWrappers{
	
	public FormCUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public  FormCUserRegistrationPage enterUserID(String data)
	{
		enterByXpath("//input[@id='u_id']", data);
		return this;
		
	}
	
	public FormCUserRegistrationPage enterPassword(String data)
	{
		enterByXpath("//input[@name='u_pwd']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath("//input[@name='u_repwd']", data);
		return this;
	}
	
	public FormCUserRegistrationPage waitingTime(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public FormCUserRegistrationPage selectSecurityQus(String data)
	{
		selectValueByXpath("//select[@id='u_secques']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterSecurityAns(String data)
	{
		enterByXpath("//input[@id='u_secans']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserName(String data)
	{
		enterByXpath("//input[@id='u_name']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectUserGender(String data)
	{
		selectValueByXpath("//select[@id='u_gender']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserDOB(String data)
	{
		enterByXpath("//input[@id='u_dob']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserDesignation(String data)
	{
		enterByXpath("//input[@id='u_designation']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserEmailID(String data)
	{
		enterByXpath("//input[@id='u_emailid']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserMobileNum(String data)
	{
		enterByXpath("//input[@id='u_mobile']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterUserPhoneNum(String data)
	{
		enterByXpath("//input[@id='u_phone']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectUserNationality(String data)
	{
		selectValueByXpath("//select[@id='u_nationality']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterName(String data)
	{
		enterByXpath("//input[@id='name']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterCapacity(String data)
	{
		enterByXpath("//input[@id='capacity']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterAddress(String data)
	{
		enterByXpath("//textarea[@id='address']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectState(String data)
	{
		selectValueByXpath("//select[@id='state']", data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectCity(String data)
	{
		selectValueByXpath("//select[@id='city_distr']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectfrroData(String data)
	{
		selectVisibileTextByXpath("//select[@name='frrodata']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectAccomodationType(String data)
	{
		selectValueByXpath("//select[@id='acco_type']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectAccomodationGrade(String data)
	{
		selectValueByXpath("//select[@id='star_rat']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterEmailID(String data)
	{
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterMobileNum(String data)
	{
		enterByXpath("//input[@id='mcontact']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterPhoneNum(String data)
	{
		enterByXpath("//input[@id='contact']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerName(String data)
	{
		enterByXpath("//input[@name='name_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerAddress(String data)
	{
		enterByXpath("//input[@name='address_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectOwnerState(String data)
	{
		selectValueByXpath("//select[@id='state_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage selectOwnerCity(String data)
	{
		selectValueByXpath("//select[@name='citydistr_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerEmailID(String data)
	{
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerPhoneNum(String data)
	{
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerMobileNum(String data)
	{
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
	}
	
	public FormCUserRegistrationPage clickOnAdd()
	{
		clickByXpath("//input[@name='add']");
		return this;
	}
	
	

}
