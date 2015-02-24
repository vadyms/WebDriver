package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TDEMenu {

	public WebElement mJobs(WebDriver driver) {
		return driver.findElement(By.linkText("Jobs"));	
	}
	public WebElement mTestCases(WebDriver driver) {
		return driver.findElement(By.linkText("TestCases"));	
	}
	public WebElement mEnterprises(WebDriver driver) {
		return driver.findElement(By.linkText("Enterprises"));	
	}
	public WebElement mTestSuite(WebDriver driver) {
		return driver.findElement(By.linkText("Test Suites"));	
	}
}
