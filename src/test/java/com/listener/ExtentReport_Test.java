package com.listener;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseClass;

public class ExtentReport_Test {
	public static ExtentTest extenttest;
	
	@BeforeSuite
	public void extentTestReportStartUp() {
		BaseClass base = new BaseClass() {
			
		};
		base.extentReportStart(null);
	}
	
	public void extentTestReportEnd() throws IOException {
       BaseClass base = new BaseClass() {
			
		};
		base.extentReportEnd(null);
	}

}
