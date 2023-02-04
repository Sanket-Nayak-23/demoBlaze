package com.www.demoBlaze.demoBlaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class PlaceOrderPage extends TestBase {
	public PlaceOrderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='name']")
	private WebElement name_textbox;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country_textbox;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city_textbox;
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement credit_cart_textbox;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement month_textbox;

	@FindBy(xpath="//input[@id='year']")
	private WebElement year_textbox;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	private WebElement purchase_button;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement orderConfirmMsg;
	
	public void fillDetails(String name, String country, String city, String cartnum, String month, String year) {
		name_textbox.sendKeys(name);
		country_textbox.sendKeys(country);
		city_textbox.sendKeys(city);
		credit_cart_textbox.sendKeys(cartnum);
		month_textbox.sendKeys(month);
		year_textbox.sendKeys(year);
		purchase_button.click();
	}
	public String verifyorderConfirmMsg() {
		String confirm_msg=orderConfirmMsg.getText();
		return confirm_msg;
	}
	
}
