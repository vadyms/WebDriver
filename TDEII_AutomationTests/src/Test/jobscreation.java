package Test;

import org.openqa.selenium.Keys;

import TDE.Admin;
import TDE.Jobs;
import TDE.NewJob;
import TDE.TDE;

public class jobscreation {
	public static void main(String[] args) {
		// initialize required object
		TDE tde=new TDE();				// main class for TDE testing and driver initialization
		Admin admin=new Admin(tde.driver); // admin window object
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
		
		tde.driver.close();
	 }
}
