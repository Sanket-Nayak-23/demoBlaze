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
	
	@FindBy(xpath="//a[@href='prod.html?idp_=1']")
	private WebElement samsung_galaxyS6_link;
	
//	-------action methods------
	
	public void clickOnLoginLink() {
		login_link.click();
	}
	
	
	public String loginStatus() {
		String msg=login_status.getText();
		return msg;
	}

	public void clickOnSamsungGalaxyS6Link() {
		samsung_galaxyS6_link.click();
	}

}
