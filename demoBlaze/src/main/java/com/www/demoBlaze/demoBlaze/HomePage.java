package com.www.demoBlaze.demoBlaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
//	----------object repository--------
	@FindBy(xpath="//a[@id='login2']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement login_status;
	
//	-------action methods------
	
	public void clickOnLoginLink() {
		login_link.click();
	}
	
	
	public String loginStatus() {
		String msg=login_status.getText();
		return msg;
	}
	

}
