package com.www.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Util extends TestBase{
	
	public Util () {
		PageFactory.initElements(driver, this);
	}
	
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void takess(String filename)  {
		String path="D:\\GitHubProject\\demoBlaze\\demoBlaze\\screenShots\\";
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path+filename+".png");
			FileHandler.copy(source, des);
		} catch (IOException e) {
			System.out.println("please provide currect file path.");
			e.printStackTrace();
		}
		
	}

}
