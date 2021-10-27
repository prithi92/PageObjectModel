package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public  RemoteWebDriver driver;

	public static Properties prop;
	
	public void loadObjects() {
		 try {
			prop = new Properties();
			 
			 prop.load(new FileInputStream("./src/test/java/object.properties"));
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void unloadObjects() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
	
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the given "+url+" successfully", "pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to the session ID is not created for the application");
			reportStep("The browser "+browser+" is not launched due to the session ID is not created for the application", "fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not getting launched due to missing of http/https in the given URL");
			reportStep("The browser "+browser+" is not getting launched due to missing of http/https in the given URL", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not getting launched due to an unkown error");
			reportStep("The browser "+browser+" is not getting launched due to an unkown error", "fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with the id "+idValue+" is entered with the data "+data+" in the application");
			reportStep("The element with the id "+idValue+" is entered with the data "+data+" in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element visible in the application");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element stable in the application");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to no such element stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to unknown error present in the application");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" in the application due to unknown error present in the application", "fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with the name "+nameValue+" is entered with the data "+data+" in the application");
			reportStep("The element with the name "+nameValue+" is entered with the data "+data+" in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element visible in the application");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element stable in the application");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to no such element stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to unknown error present in the application");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" in the application due to unknown error present in the application", "fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with the xpath "+xpathValue+" is entered with the data "+data+" in the application");
			reportStep("The element with the xpath "+xpathValue+" is entered with the data "+data+" in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element visible in the application");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element stable in the application");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to no such element stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to unknown error present in the application");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" in the application due to unknown error present in the application", "fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title))
				//System.out.println("The given title of the page "+title+" is exactly matched with the actual page title "+actualTitle);
				reportStep("The given title of the page "+title+" is exactly matched with the actual page title "+actualTitle, "pass");
			else
				//System.out.println("The given title of the page "+title+" is not exactly matched with the actual page title "+actualTitle);
				reportStep("The given title of the page "+title+" is not exactly matched with the actual page title "+actualTitle, "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page is not displayed due to unknown error in the application");
			reportStep("The title of the page is not displayed due to unknown error in the application", "fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		String textVal = null;
		try {
			textVal = driver.findElementById(id).getText();
			if(textVal.equals(text))
				//System.out.println("The element with the id "+id+" text is displayed as "+textVal+" is exactly matched with the given text "+text);
				reportStep("The element with the id "+id+" text is displayed as "+textVal+" is exactly matched with the given text "+text, "pass");
			else
				//System.out.println("The element with the id "+id+" text is displayed as "+textVal+" is not exactly matched with the given text "+text);
				reportStep("The element with the id "+id+" text is displayed as "+textVal+" is not exactly matched with the given text "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" text is not getting displayed due to no such element present in the DOM");
			reportStep("The element with the id "+id+" text is not getting displayed due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" text is not getting displayed due to no such element visible in the application");
			reportStep("The element with the id "+id+" text is not getting displayed due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" text is not getting displayed due to no such element interactable in the application");
			reportStep("The element with the id "+id+" text is not getting displayed due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" text is not getting displayed due to no such element stable in the application");
			reportStep("The element with the id "+id+" text is not getting displayed due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" text is not getting displayed due to unknown error present in the application");
			reportStep("The element with the id "+id+" text is not getting displayed due to unknown error present in the application", "fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		String textVal = null;
		try {
			textVal = driver.findElementByXPath(xpath).getText();
			if(textVal.equals(text))
				//System.out.println("The element with the xpath "+xpath+" text is displayed as "+textVal+" is exactly matched with the given text "+text);
				reportStep("The element with the xpath "+xpath+" text is displayed as "+textVal+" is exactly matched with the given text "+text, "pass");
			else
				//System.out.println("The element with the xpath "+xpath+" text is displayed as "+textVal+" is not exactly matched with the given text "+text);
				reportStep("The element with the xpath "+xpath+" text is displayed as "+textVal+" is not exactly matched with the given text "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element visible in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element stable in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to unknown error present in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to unknown error present in the application", "fail");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		String textValue=null;
		try {
			textValue = driver.findElementByXPath(xpath).getText();
			if(textValue.contains(text))
				//System.out.println("The element with the xpath "+xpath+" text is displayed as "+textValue+" is matched with the given text "+text);
				reportStep("The element with the xpath "+xpath+" text is displayed as "+textValue+" is matched with the given text "+text, "pass");
			else
				//System.out.println("The element with the xpath "+xpath+" text is displayed as "+textValue+" is not matched with the given text "+text);
				reportStep("The element with the xpath "+xpath+" text is displayed as "+textValue+" is not matched with the given text "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element visible in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to no such element stable in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" text is not getting displayed due to unknown error present in the application");
			reportStep("The element with the xpath "+xpath+" text is not getting displayed due to unknown error present in the application", "fail");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with the id "+id+" is succesfully clicked in the application");
			reportStep("The element with the id "+id+" is succesfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the id "+id+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the id "+id+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the id "+id+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the id "+id+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the id "+id+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the id "+id+" is not successfully clicked due to unknown error present in the application", "fail");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with the class name "+classVal+" is successfully clicked in the application");
			reportStep("The element with the class name "+classVal+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the class name "+classVal+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the class name "+classVal+" is not successfully clicked due to unknown error present in the application", "fail");
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with the name "+name+" is successfully clicked in the application");
			reportStep("The element with the name "+name+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+name+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the name "+name+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the name "+name+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the name "+name+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the name "+name+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the name "+name+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the name "+name+" is not successfully clicked due to unknown error present in the application", "fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with the link "+name+" is successfully clicked in the application");
			reportStep("The element with the link "+name+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to unknown error present in the application", "fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with the link "+name+" is successfully clicked in the application");
			reportStep("The element with the link "+name+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the link "+name+" is not successfully clicked due to unknown error present in the application", "fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with the xpath "+xpathVal+" is successfully clicked in the application");
			reportStep("The element with the xpath "+xpathVal+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to unknown error present in the application", "fail");
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the xpath "+xpathVal+" is successfully clicked in the application");
			reportStep("The element with the xpath "+xpathVal+" is successfully clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to click intercepted in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to click intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not successfully clicked due to unknown error present in the application");
			reportStep("The element with the xpath "+xpathVal+" is not successfully clicked due to unknown error present in the application", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String textVal=null;
		try {
			 textVal = driver.findElementById(idVal).getText();
			 //System.out.println("The element with the id "+idVal+" text is displayed as "+textVal+" in the application");
			 reportStep("The element with the id "+idVal+" text is displayed as "+textVal+" in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+idVal+" text is not getting displayed due to no such element present in the DOM");
			reportStep("The element with the id "+idVal+" text is not getting displayed due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" text is not getting displayed due to no such element visible in the application");
			reportStep("The element with the id "+idVal+" text is not getting displayed due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" text is not getting displayed due to no such element interactable in the application");
			reportStep("The element with the id "+idVal+" text is not getting displayed due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" text is not getting displayed due to no such element stable in the application");
			reportStep("The element with the id "+idVal+" text is not getting displayed due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" text is not getting displayed due to unknown error present in the application");
			reportStep("The element with the id "+idVal+" text is not getting displayed due to unknown error present in the application", "fail");
		}
		
		return textVal;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String textValue = null;
		try {
			textValue = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with the xpath "+xpathVal+" text is displayed as "+textValue+" in the application");
			reportStep("The element with the xpath "+xpathVal+" text is displayed as "+textValue+" in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element present in the DOM");
			reportStep("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element visible in the application");
			reportStep("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element stable in the application");
			reportStep("The element with the xpath "+xpathVal+" text is not getting displayed due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" text is not getting displayed due to unknown error present in the application");
			reportStep("The element with the xpath "+xpathVal+" text is not getting displayed due to unknown error present in the application", "fail");
		}
		return textValue;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement dropdown = driver.findElementById(id);
			Select dropdownVal = new Select(dropdown);
			dropdownVal.selectByVisibleText(value);
			//System.out.println("The element dropdown with the id "+id+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the id "+id+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		}
		
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement idxVal = driver.findElementById(id);
			Select indexValue = new Select(idxVal);
			indexValue.selectByIndex(value);
			//System.out.println("The element dropdown with the id "+id+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the id "+id+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		} 
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> parentWin = driver.getWindowHandles();
			for(String eachId:parentWin) {
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("Successfully switched to the parent window from the current window");
			reportStep("Successfully switched to the parent window from the current window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not switched to the parent window due to no such window present in the application");
			reportStep("Not switched to the parent window due to no such window present in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Not switched to the parent window due to unkown error present in the application");
			reportStep("Not switched to the parent window due to unkown error present in the application", "fail");
		}
		
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub		
		try {
			Set<String> lastWin = driver.getWindowHandles();
			for(String eachId:lastWin)
			{
				driver.switchTo().window(eachId);
			}
			//System.out.println("Successfully switched to the last window from the current window");
			reportStep("Successfully switched to the last window from the current window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not switched to the last window due to no such window present in the application");
			reportStep("Not switched to the last window due to no such window present in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Not switched to the last window due to unkown error present in the application");
			reportStep("Not switched to the last window due to unkown error present in the application", "fail");
		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted successfully");
			reportStep("The alert is accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is not getting accepted due to no alert present in the application");
			reportStep("The alert is not getting accepted due to no alert present in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not getting accepted due to unknown error present in the application");
			reportStep("The alert is not getting accepted due to unknown error present in the application", "fail");
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is cancelled successfully");
			reportStep("The alert is cancelled successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is not getting cancelled due to no alert present in the application");
			reportStep("The alert is not getting cancelled due to no alert present in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not getting cancelled due to unknown error present in the application");
			reportStep("The alert is not getting cancelled due to unknown error present in the application", "fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String getAlert = null;
		try {
			getAlert = driver.switchTo().alert().getText();
			//System.out.println("The text is "+getAlert+" displayed in the alert");	
			reportStep("The text is "+getAlert+" displayed in the alert", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not getting displayed due to no alert present in the application");
			reportStep("The alert text is not getting displayed due to no alert present in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not getting displayed due to unknown error present in the application");
			reportStep("The alert text is not getting displayed due to unknown error present in the application", "fail");
		} 
		return getAlert;
	}
	

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=0;
		try {
			
		number=	(long) (Math.floor(Math.random()*100000000)+100000);
			
			File source = driver.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The screenshots are not taken due to unknown error");
			reportStep("The screenshots are not taken due to unknown error", "fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("The screenshots are not taken due to Input/Output error");
			reportStep("The screenshots are not taken due to Input/Output error", "fail");
		}
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
			//System.out.println("The browser is closed successfully");
			reportStep("The browser is closed successfully", "pass",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not getting closed due to unknown error");
			reportStep("The browser is not getting closed due to unknown error", "fail",false);
		} 
		
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers are closed successfully");
			reportStep("All the browsers are closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("All the browsers are not getting closed due to unknown error ");
			reportStep("All the browsers are not getting closed due to unknown error ", "fail", false);
		}
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement val = driver.findElementById(id);
			Select selValue = new Select(val);
			selValue.selectByValue(value);
			//System.out.println("The element dropdown with the id "+id+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the id "+id+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the id "+id+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		}
		
	}


	public void pageDownByXpath() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The element with the Xpath- //html/body is successfully scrolled down the page in the application");
			reportStep("The element with the Xpath- //html/body is successfully scrolled down the page in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the Xpath- //html/body is not found due to no such element present in the application");
			reportStep("The element with the Xpath- //html/body is not found due to no such element present in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath- //html/body is not visible in the application");
			reportStep("The element with the Xpath- //html/body is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath- //html/body is not interactable in the application");
			reportStep("The element with the Xpath- //html/body is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath- //html/body is not stable in the application");
			reportStep("The element with the Xpath- //html/body is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath- //html/body is having unknown error in the application");
			reportStep("The element with the Xpath- //html/body is having unknown error in the application", "fail");
		}
	}

	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement idxVal = driver.findElementByXPath(xpath);
			Select indexValue = new Select(idxVal);
			indexValue.selectByIndex(value);
			//System.out.println("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		} 
		
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement dropdown = driver.findElementByXPath(xpath);
			Select dropdownVal = new Select(dropdown);
			dropdownVal.selectByVisibleText(value);
			//System.out.println("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		}
		
	}

	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement val = driver.findElementByXPath(xpath);
			Select selValue = new Select(val);
			selValue.selectByValue(value);
			//System.out.println("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the xpath "+xpath+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the xpath "+xpath+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		} 
	}

	public void tabKeyById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).sendKeys(Keys.TAB);
			//System.out.println("The element with the id "+id+" focus is moved to the next field in the application with the help of tab keys");
			reportStep("The element with the id "+id+" focus is moved to the next field in the application with the help of tab keys", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" is not found due to no such element present in the application");
			reportStep("The element with the id "+id+" is not found due to no such element present in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not interactable in the application");
			reportStep("The element with the id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is having unknown error in the application");
			reportStep("The element with the id "+id+" is having unknown error in the application", "fail");
		}
	}

	public void tabKeyByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).sendKeys(Keys.TAB);
			//System.out.println("The element with the name "+name+" focus is moved to next field in the application with the help of tab keys");
			reportStep("The element with the name "+name+" focus is moved to next field in the application with the help of tab keys", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+name+" is not found due to no such element present in the application");
			reportStep("The element with the name "+name+" is not found due to no such element present in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not visible in the application");
			reportStep("The element with the name "+name+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not interactable in the application");
			reportStep("The element with the name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not stable in the application");
			reportStep("The element with the name "+name+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is having unknown error in the application");
			reportStep("The element with the name "+name+" is having unknown error in the application", "fail");
		}
		}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement val = driver.findElementByName(name);
			Select selVal = new Select(val);
			selVal.selectByValue(value);
			//System.out.println("The element dropdown with the name "+name+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the name "+name+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		} 
		
	}

	public void selectIndexByName(String name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement val = driver.findElementByName(name);
			Select selVal = new Select(val);
			selVal.selectByIndex(value);
			//System.out.println("The element dropdown with the name "+name+" is successfully selected with the value "+value);
			reportStep("The element dropdown with the name "+name+" is successfully selected with the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element present in the DOM");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element visible in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element interactable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element selectable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element stable in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to no such element stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to unknown error present in the application");
			reportStep("The element dropdown with the name "+name+" is not successfully selected with the value "+value+" due to unknown error present in the application", "fail");
		} 
	}

	public void verifyTextByValues(String val, Float text) {
		// TODO Auto-generated method stub
		Float value = Float.parseFloat(val);
		try {
			if(value.equals(text))
				//System.out.println("The "+value+" value is matched with the "+text);
				reportStep("The "+value+" value is matched with the "+text, "pass");
			else
				//System.out.println("The "+value+" value is not matched with the "+text);
				reportStep("The "+value+" value is not matched with the "+text, "pass");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("There is an unknown error present in the application");
			reportStep("There is an unknown error present in the application", "fail");
		}
	}

	public void forLoop(int number, String xpath) {
		// TODO Auto-generated method stub
		
			try {
				for(int i=0;i<=number;i++)
				{
				driver.findElementByXPath(xpath).click();
				System.out.println("The element with the xpath "+xpath+" is successfully clicked in the application");
				reportStep("The element with the xpath "+xpath+" is successfully clicked in the application", "pass");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to no such element present in the DOM");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to no such element present in the DOM", "fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to no such element visible in the application");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to no such element visible in the application", "fail");
			} catch (ElementClickInterceptedException e) {
				// TODO: handle exception
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to click intercepted in the application");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to click intercepted in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to no such element interactable in the application");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to no such element interactable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to no such element stable in the application");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to no such element stable in the application", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with the xpath "+xpath+" is not successfully clicked due to unknown error present in the application");
				reportStep("The element with the xpath "+xpath+" is not successfully clicked due to unknown error present in the application", "fail");
			}
		}

	public String subStringByIndex(String value, int beginIndex) {
		// TODO Auto-generated method stub
		try {
			value=value.substring(beginIndex);
			//System.out.println("The given value "+value+" is successfully splitted based on the given index "+beginIndex);
			reportStep("The given value "+value+" is successfully splitted based on the given index "+beginIndex, "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The given value "+value+" is not getting splitted based on the given index "+beginIndex+" due to unknown error present in the application");
			reportStep("The given value "+value+" is not getting splitted based on the given index "+beginIndex+" due to unknown error present in the application", "fail");
		}
		return value;
	}

	public Float stringToFloatAndMultiplyByThree(String value) {
		// TODO Auto-generated method stub
		Float val = null;		
		try {
			val = Float.parseFloat(value);
			val = val*3;
			//System.out.println("The given string is converted into Float and its value "+value+" is successfully multiplied by three "+val);
			reportStep("The given string is converted into Float and its value "+value+" is successfully multiplied by three "+val, "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The given string is not converted into Float due to unknown error present in the application");
			reportStep("The given string is not converted into Float due to unknown error present in the application", "fail");
		}
		return val;
	}



	
		
	}

	

	


