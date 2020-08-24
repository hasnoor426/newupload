package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class PracticePage {
	public WebDriver driver;
	
	public PracticePage (WebDriver driver)
	{
		this.driver= driver;
	}
	
	By TextBox= By.id("name");
	public WebElement getText()
	{
		return driver.findElement(TextBox);
	}
	
	
	
}
