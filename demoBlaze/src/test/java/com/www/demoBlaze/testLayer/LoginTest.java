package com.www.demoBlaze.testLayer;



import org.testng.Assert;
import org.testng.annotations.Test;


import testBase.TestBase;

public class LoginTest extends TestBase{
	@Test (dataProvider="loginData", dataProviderClass=DataProvideClass.class)
	public void verifyLogin(String username, String password) throws InterruptedException {
		homePage_obj.clickOnLoginLink();
		loginPage_obj.enterUsername(username);
		Thread.sleep(2000);
		loginPage_obj.enterPassword(password);
		Thread.sleep(2000);
		loginPage_obj.clickOnLoginButton();
		Thread.sleep(2000);
//		util_obj.handleAlert();
		Thread.sleep(10000);
		String status =homePage_obj.loginStatus();
		Assert.assertEquals(status, "Welcome testacc3");
	}

}
