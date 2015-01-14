package com.sl.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeElementScreenshot extends TestWatcher{
	WebDriver driver;
	
	public TakeElementScreenshot(WebDriver driver){
		this.driver = driver;
	}
	@Override
	public void failed(Throwable e, Description description){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh_mm_ss");
		File srcFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("target\\snapshot\\"+sdf.format(date)+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	
	
	

}
