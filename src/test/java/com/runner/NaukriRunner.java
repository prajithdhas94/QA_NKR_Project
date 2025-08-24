package com.runner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listener.ExtentReport_Test;
import com.listener.ITestListenerClass;

import pageObjectManager.PageObjectManager;
@Listeners(ITestListenerClass.class)
public class NaukriRunner extends BaseClass {
	
	
	@BeforeTest
	private void propertySetup() throws IOException {
		browserLaunch(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
		
	}
	@Test(priority = -4)
	private void Loginpage() throws IOException {
		ExtentReport_Test.extenttest=extentReports.createTest("Naukri Test" + " : " + Thread.currentThread()
		.getStackTrace()[1].getMethodName().toString()).info("valid Login Test");
		Assert.assertTrue(PageObjectManager.getPageObjectManager().getLoginpage().validLogin(ExtentReport_Test.extenttest));
	}
	@Test(priority = -3)
	private void ProfilePage() throws IOException {
		PageObjectManager.getPageObjectManager().getProfilepage().profilepage();
	}
	@Test(priority = -2)
	private void ResumeUploadPage() throws AWTException {
		PageObjectManager.getPageObjectManager().getResumepage().resumeUpdate();
	}
	@Test(priority = -1)
	private void ResumeHeadlinePage() throws IOException {
		PageObjectManager.getPageObjectManager().getHeadlinePage().headlinePage();
	}
	
	@Test(priority = 0)
	private void keySkillsPage() throws IOException {
		PageObjectManager.getPageObjectManager().getSkillspage().skillsPage();
	}
	
	@Test(priority = 1)
	private void EmployementPage() throws IOException {
		PageObjectManager.getPageObjectManager().getEmployementpage().employmentpage();
	}
	
	@Test(priority = 2)
	private void EducationPage() throws IOException {
		PageObjectManager.getPageObjectManager().getEducationpage().educationpage();
	}
	@Test(priority = 3)
	private void ITSkillPage() throws IOException {
		PageObjectManager.getPageObjectManager().getItskillpage().ITpage();
	}
	@Test(priority = 4)
	private void ProjectPage() throws IOException {
		PageObjectManager.getPageObjectManager().getProjectpage().projectpage();
	}
	@Test(priority = 5)
	private void ProfileSummaryPage() throws IOException {
		PageObjectManager.getPageObjectManager().getSummarypage().profilesummarypage();
	}
	@Test(priority = 6)
	private void careerpage() {
		PageObjectManager.getPageObjectManager().getCareerpage().careerpage();
	}
	@Test(priority = 7)
	private void personaldetailspage() {
		PageObjectManager.getPageObjectManager().getPersonaldetailspage().personaldetailspage();
	}
	@AfterTest
	private void logoutpage() {
		PageObjectManager.getPageObjectManager().getLogoutpage().logoutpage();
	}
	
	@AfterMethod
	private void termination() {
		close();
	}
	@BeforeSuite
	private void extentStart() throws IOException {
		extentReportStart(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("start"));
	}
	
	@AfterSuite
	private void extentEnd() throws IOException {
		extentReportEnd(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("end"));
	}

}
