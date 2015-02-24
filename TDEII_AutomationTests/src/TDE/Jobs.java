package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jobs {
	public WebElement btnNewJob;
	public WebElement lblNewJobName;
	public WebElement lblNewJobDescription;
	public WebDriver drv;
	
	public Jobs(WebDriver driver) {
		drv=driver;
	}
	
	public WebElement btnNewJob () {
		return drv.findElement(By.linkText("Create New Job"));
	}
}
