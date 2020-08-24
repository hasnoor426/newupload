package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LandingPage;
import pageObject.PracticePage;

public class ValidatePractice  extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());	
	
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
	public void validatePracticePage()
	{
		LandingPage l = new LandingPage(driver);
		l.getPractice().click();
		PracticePage pp= new PracticePage(driver);
		pp.getText().sendKeys("ABC");
	}
	

}
