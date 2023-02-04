package com.www.demoBlaze.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.www.demoBlaze.demoBlaze.PlaceOrderPage;

import testBase.TestBase;

public class BuyFunctionalityWithoutLoginTest extends TestBase	 {
	
	@Test(dataProvider="placeOrderDatails", dataProviderClass=DataProvideClass.class)
	public void buyFunctionalityWithoutLoginTes(String name,String country,String city,String cartnum,String month,String year) throws InterruptedException {
		String expected_output="Thank you for your purchase!";
		Thread.sleep(5000);
		homePage_obj.clickOnSamsungGalaxyS6Link();
		Thread.sleep(2000);
		product_page_obj.clickOnAddtoCartButton();
		Thread.sleep(2000);
		util_obj.handleAlert();
		Thread.sleep(2000);
		product_page_obj.clickOnCartLink();
		Thread.sleep(2000);
		cart_page_obj.clickOnPlaceOrderbtn();
		Thread.sleep(2000);
		placeOrder_obj.fillDetails(name, country, city, cartnum, month, year);
		Thread.sleep(2000);
		String actual_output=placeOrder_obj.verifyorderConfirmMsg();
		Assert.assertEquals(actual_output, expected_output);
	}

}
