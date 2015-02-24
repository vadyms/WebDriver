package TDE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDE {
	public String userName="admin";
	public String userPassword="Nuance";
	public WebDriver driver = TDE();
	public WebDriver TDE() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/TDEII");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	// Generic actions with controls
	public void jClick(WebElement element) {
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);
	}
	
	
	public void sleep(int iTime) {
		
	}
	
	public WebElement mJobs(WebDriver driver) {
		return driver.findElement(By.linkText("Jobs"));	
	}
	public WebElement mTestSuite(WebDriver driver) {
		return driver.findElement(By.linkText("Test Suites"));	
	}
	/*
	public void Invoke( WebDriver driver, WebElement element) {
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);
	}
	*/
}
