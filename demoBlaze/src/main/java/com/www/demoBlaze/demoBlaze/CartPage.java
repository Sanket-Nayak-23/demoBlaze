package com.www.demoBlaze.demoBlaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CartPage extends TestBase {
	 public CartPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//button[contains(text(),'Place Order')]")
	 private WebElement place_order_button;
	 
	 public void clickOnPlaceOrderbtn() {
		 place_order_button.click();
	 }
}
