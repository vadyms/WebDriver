package Test;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import TDE.Admin;
import TDE.Jobs;
import TDE.NewJob;
import TDE.TDE;

public class JobTests1 {
	TDE tde;
	Admin admin; // admin window object
	Jobs jobs;	// Jobs window object
	NewJob NJob; // NewJobs window object
	TestJob job; // Job object
	
	@BeforeMethod
	public void beforeMethod() {
		tde=new TDE();
		admin=new Admin(tde.driver);
		jobs=new Jobs(tde.driver);	// Jobs window object
		NJob=new NewJob(tde.driver); // NewJobs window object
		job=new TestJob(); // Job object
	}
  @Test(dataProvider = "dp")
  public void f(Integer n, String jName, String jDesc, String jProduct, String jEnt, String jSuite, String jMax, String jRevert) {
		// initialize required object
		// main class for TDE testing and driver initialization
		  
		admin.ebxUserName().sendKeys(tde.userName);
		admin.ebxUserPassword().sendKeys(tde.userPassword);
		admin.ebxUserPassword().sendKeys(Keys.ENTER);
		System.out.println("Login done!");
	
		tde.jClick(tde.mJobs(tde.driver));
		System.out.println("Job page invoked!");
		  
		tde.jClick(jobs.btnNewJob());
		System.out.println("Create New Job selected.");
			  
		// New Job definition
		NJob.tbName().sendKeys(jName);
		NJob.tbDescription().sendKeys(jDesc);
		NJob.selectVersionList(jProduct);
		NJob.selectEnterpriseList(jEnt);
		NJob.selectSuiteList(jSuite);
		NJob.selectMaxRetryList(jMax);
		NJob.selectForceSnapshotRevertList(jRevert);
		NJob.btSave().click();
		System.out.println("New Job created.");
  }
	@AfterMethod
	public void afterMethod() {
		tde.driver.close();
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "FullyAutomatedSmokeTest", "PS360SmokeTest", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 2, "ExplorerScreenPlan", "PS360 ExplorerScreen", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 4, "AccountsVerification", "PS360 AccountsVerification", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 5, "VocabularyMngr", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 6, "LoginPlan", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 7, "Config", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 8, "InfrastractureChecks", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 9, "AdminUserVerification", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 10, "Audit", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 11, "PhysicianVerification", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 12, "PatientVerification", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 13, "PeerReview", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 14, "SitePreferences", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 15, "SpeechFormattingOptions", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 16, "SystemPreferences", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 17, "UserPreferences", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 18, "UserVerification", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
      new Object[] { 19, "WorkflowsTest", "PS360 ", "PS360 Trunk", "ES 1 VadymS", "ReportEditorScreenSmoke - SmokeReportEditorScreen", "1", "Y" },
    };
  }
}
