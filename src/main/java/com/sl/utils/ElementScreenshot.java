package com.sl.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.tika.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import ru.yandex.qatools.allure.annotations.Attachment;

import com.sl.conf.ConfigBase;

public class ElementScreenshot extends TestListenerAdapter{
//	WebDriver driver;
//	
//	public ElementScreenshot(WebDriver driver){
//		this.driver = driver;
//	}
	@Override
	public void onTestFailure(ITestResult tr){
		
		
		Object currentClass = tr.getInstance();
		WebDriver driver = ((ConfigBase) currentClass).getDriver();
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh_mm_ss");
		String value = sdf.format(date);
		File file = new File("target\\snapshot\\"+value+".png");
		File srcFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] srcByte =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		takeScreenshot(srcByte);
		File log = new File("target\\logs\\log.txt");
		takeLog(log);
//		takeLog();
//		Reporter.log("<a href='../"+result.getName()+".jpg' <img src='../"+result.getName()+".jpg' hight='100' width='100'/> </a>"); 
		try {
			FileUtils.copyFile(srcFile, file);
			Reporter.log("Screenshot saved at "+file.getAbsolutePath()+" - ");
			Reporter.log("<a href='"+file.getAbsolutePath()+"' <img src='"+file.getAbsolutePath()+"' hight='100' width='100'/>"+value+"</a><br>"); 
			Reporter.log("Log saved at <a href='"+log.getAbsolutePath()+"'>"+log.getName()+"</a>");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
	}
	
	@Attachment(value="logs")
	private byte[] takeLog(File file){	
		
		InputStream fis;
		byte[] log = null;
		try {
			fis = new FileInputStream(file);
			log = IOUtils.toByteArray(fis);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		return log;
			
	}
	
	@Attachment(value="Screenshot",type="image/png")
	private byte[] takeScreenshot(byte [] screenshot){
		return screenshot;
	}
	
	
}
