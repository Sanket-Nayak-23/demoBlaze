package com.www.utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test execution started.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed.");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution complete.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Util.takess(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test execution is skipped.");
	}





}
