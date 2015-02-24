package Test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import TDE.Admin;
import TDE.Jobs;
import TDE.NewJob;
import TDE.TDE;

public class JobTests {
	TDE tde;
	Admin admin; // admin window object
	@BeforeMethod
	public void beforeMethod() {
		tde=new TDE();
		admin=new Admin(tde.driver);
	}
	
	@Test(description="Login to the TDE action") 
	
	public void test001() {
		admin.ebxUserName().sendKeys(tde.userName);
		admin.ebxUserPassword().sendKeys(tde.userPassword);
		admin.ebxUserPassword().sendKeys(Keys.ENTER);
		System.out.println("Login done!");
	}
	@Test(description="Create new test Job action")
	public void test002() {
	
		// initialize required object
		// main class for TDE testing and driver initialization
		Jobs jobs=new Jobs(tde.driver);	// Jobs window object
		NewJob NJob=new NewJob(tde.driver); // NewJobs window object
		TestJob job=new TestJob(); // Job object
		  
		admin.ebxUserName().sendKeys(tde.userName);
		admin.ebxUserPassword().sendKeys(tde.userPassword);
		admin.ebxUserPassword().sendKeys(Keys.ENTER);
		System.out.println("Login done!");
	
		tde.jClick(tde.mJobs(tde.driver));
		System.out.println("Job page invoked!");
		  
		tde.jClick(jobs.btnNewJob());
		System.out.println("Create New Job selected.");
			  
		// New Job definition
		NJob.tbName().sendKeys(job.jName);
		NJob.tbDescription().sendKeys(job.jDescription);
		NJob.selectVersionList(job.jProduct);
		NJob.selectEnterpriseList(job.jEnterprise);
		NJob.selectSuiteList(job.jTestSuite);
		NJob.selectMaxRetryList(job.jMaxRetry);
		NJob.selectForceSnapshotRevertList(job.jRevert);
		NJob.btSave().click();
		System.out.println("New Job created.");
	  }
	@AfterMethod
	public void afterMethod() {
		tde.driver.close();
	}
}
