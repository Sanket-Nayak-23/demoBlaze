package com.www.demoBlaze.demoBlaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ProductPage extends TestBase{
	public ProductPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;
	
	@FindBy(xpath="//a[@id='cartur']")
	private WebElement cart_link;
	
	public void clickOnAddtoCartButton() {
		add_to_cart_btn.click();
	}
	
	public void clickOnCartLink() {
		 cart_link.click();
	}
	
}
