package Test;

import java.util.concurrent.TimeUnit;

import org.junit.runners.Suite;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import TDE.Admin;
import TDE.Suites;
import TDE.NewSuites;
import TDE.TDE;

public class suitescreation {
	 
	
	 public static void main(String[] args) {
		  TDE tde=new TDE();                   // main class for TDE testing and driver initialization
		  Admin admin=new Admin(tde.driver);   // admin window object
		  Suites suites=new Suites(tde.driver); // Suite window object
		  NewSuites NSuites=new NewSuites(tde.driver); // NewSuite window object
		  TestSuites suite=new TestSuites();   //Suite object
			 
		  admin.ebxUserName().sendKeys(tde.userName);
		  admin.ebxUserPassword().sendKeys(tde.userPassword);
		  admin.ebxUserPassword().sendKeys(Keys.ENTER);
		  System.out.println("Login done!");

		 
		  tde.jClick(tde.mTestSuite(tde.driver));
		 System.out.println("Test Suites page invoked!");
		  
		  
		  tde.jClick(suites.btnNewSuites(tde.driver));
		  System.out.println("Create New Suite selected.");
		  
		  // New Suites Test definition
		  
		 //NJob.tbName().sendKeys(job.jName);
		  System.out.println(suite.sName);
		  NSuites.tbName().sendKeys(suite.sName);
		 System.out.println(suite.sDescription);
		 NSuites.tbDescription().sendKeys(suite.sDescription);
		 System.out.println(suite.sProductVerBuild);
		 NSuites.selectProductVersBuildList(suite.sProductVerBuild); 
		 System.out.println(suite.sTestFileName);
		 NSuites.selectTestList(suite.sTestFileName);
		 NSuites.btAddAll(tde.driver).click();
		 NSuites.btSave(tde.driver).click();
		  tde.driver.close();
		 }
}
