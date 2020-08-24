package Academy.E2EProject;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.ContactPage;
import pageObject.LandingPage;

public class ValidateContactForm extends base {
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());			
	//public Properties prop= new Properties();
	
	@BeforeTest
	public void StartUp() throws IOException 
	{
		driver=initializeDriver();
		log.info("Driver is initialize");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void validateContact() throws InterruptedException 
	{
		LandingPage l = new LandingPage(driver);
		l.getContactUs().click();
		
		log.info("Contact Page is Displayed");
		ContactPage cp= new ContactPage(driver);
		cp.getContact().click();
		Thread.sleep(2000);
		cp.getUserName().sendKeys(prop.getProperty("UserName"));
		Thread.sleep(1000);
		cp.getMobileNo().sendKeys(prop.getProperty("MobileNo"));
		Thread.sleep(1000);
		cp.getCountry().sendKeys(prop.getProperty("Country"));
		Thread.sleep(1000);
		cp.getEmail().sendKeys(prop.getProperty("Email"));
		Thread.sleep(1000);
		cp.getMessage().sendKeys(prop.getProperty("Message"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
