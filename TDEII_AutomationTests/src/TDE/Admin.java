package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin {
	public WebDriver drv;	
	public Admin(WebDriver driver) {
		drv=driver;
	}

	public WebElement ebxUserName() {
		return drv.findElement(By.id("usernameInput"));
	}
	public WebElement ebxUserPassword() {
		return drv.findElement(By.id("passwordInput"));
	}
}
