package com.www.demoBlaze.testLayer;

import org.testng.annotations.DataProvider;

import testBase.TestBase;

public class DataProvideClass extends TestBase {
	@DataProvider(name="loginData")
	public Object[][] getData(){
		Object[][] data= {{"testacc3","test"}};
		return data;
	}

}
