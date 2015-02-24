package TDE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewSuites {
	public WebDriver drv;
	public NewSuites (WebDriver driver) {
		drv=driver;
	}
	
	public WebElement tbName () {
		return drv.findElement(By.id("name"));
	}
	
	public WebElement tbDescription () {
		return drv.findElement(By.id("description"));
	}
	
	public WebElement lbProductVersBuild () {
		return drv.findElement(By.id("version"));
	}
	public void selectProductVersBuildList(String sItem) {
		Select sel=new Select(this.lbProductVersBuild());
		sel.selectByVisibleText(sItem);
	}

	public WebElement lbProduct () {
		return drv.findElement(By.id("filter1"));
	}
	public void selectProduct(String sItem) {
		Select sel=new Select(this.lbProductVersBuild());
		sel.selectByVisibleText(sItem);
	}

	
	
	public WebElement lbTest() {
		return drv.findElement(By.id("filter2"));//(By.name("TCFileName"));
	}
	public void selectTestList(String sItem) {
		Select sel=new Select(this.lbTest());
		sel.selectByVisibleText(sItem);
		
	}
	
	
	/*
	public WebElement lbTestFileName (WebDriver driver) {
		return driver.findElement(By.id("test"));
	}
	public void selectTestFileNameList(WebElement TestFileNameList, String sItem) {
		Select sel=new Select(TestFileNameList);
		sel.selectByVisibleText(sItem);
	}
	*/
	
	
	public WebElement btAddAll (WebDriver driver) {
		return driver.findElement(By.linkText("Add All"));
	}
	
	public WebElement btSave (WebDriver driver) {
		return driver.findElement(By.linkText("Save"));
	}
	
	
}	


