package com.www.utilities;

import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Util extends TestBase{
	
	public Util () {
		PageFactory.initElements(driver, this);
	}
	
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}

}
