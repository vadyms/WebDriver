package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewJob {
	public WebDriver drv;
	public NewJob(WebDriver driver) {
		drv=driver;	
	}
	
	public WebElement tbName () {
		return drv.findElement(By.id("name"));
	}
	public WebElement tbDescription () {
		return drv.findElement(By.id("description"));
	}
	public WebElement lbVersion () {
		return drv.findElement(By.id("version"));
	}
	public void selectVersionList(String sItem) {
		Select sel=new Select(this.lbVersion());
		sel.selectByVisibleText(sItem);
	}
	
	public WebElement lbEnterprise () {
		return drv.findElement(By.id("esd"));
	}
	public void selectEnterpriseList(String sItem) {
		Select sel=new Select(this.lbEnterprise());
		sel.selectByVisibleText(sItem);
	}

	public WebElement lbSuite() {
		return drv.findElement(By.id("TestSuite"));
	}
	public void selectSuiteList(String sItem) {
		Select sel=new Select(this.lbSuite());
		sel.selectByVisibleText(sItem);
	}
	
	public WebElement lbMaxRetry () {
		return drv.findElement(By.id("Maxretry"));
	}
	public void selectMaxRetryList(String sItem) {
		Select sel=new Select(this.lbMaxRetry());
		sel.selectByVisibleText(sItem);
	}
	
	public WebElement lbForceSnapshotRevert () {
		return drv.findElement(By.id("ForceSnapshotRevert"));
	}
	public void selectForceSnapshotRevertList(String sItem) {
		Select sel=new Select(this.lbForceSnapshotRevert());
		sel.selectByVisibleText(sItem);
	}
	
	public WebElement btSave () {
		return drv.findElement(By.linkText("Save"));
	}
}
