package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Suites {
	public WebElement btnNewSuites;
	public WebElement lblNewSuitesName;
	public WebElement lblNewSuitesDescription;
	
	public Suites(WebDriver driver) {
	}
	
	public WebElement btnNewSuites (WebDriver driver) {
		return driver.findElement(By.linkText("Create New TestSuite"));
	}
}
