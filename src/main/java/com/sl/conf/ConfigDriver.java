package com.sl.conf;

import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Rule;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import ru.stqa.selenium.factory.WebDriverFactory;
import uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4J;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

import com.sl.data.UserData;
import com.sl.utils.TakeElementScreenshot;

public class ConfigDriver {
	@Rule
	public TakeElementScreenshot takeElementScreenshot = new TakeElementScreenshot(driver);

	protected static Capabilities firefox = DesiredCapabilities.firefox();
	protected static WebDriver driver = WebDriverFactory.getDriver(firefox);
	
	protected UserData userData = new UserData(ConfigProperties.getProperty("login"),ConfigProperties.getProperty("password"));
	
static{
		
		Logger.getLogger("").setLevel(Level.ALL);
		for(Handler h: Logger.getLogger("").getHandlers()){
			Logger.getLogger("").removeHandler(h);
		}
		SysOutOverSLF4J.sendSystemOutAndErrToSLF4J();
		SLF4JBridgeHandler.install();
		StatusPrinter.print((LoggerContext) LoggerFactory.getILoggerFactory()) ;
	}

	public static WebDriver open () {
		
								
//			System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
			
			driver.get(ConfigProperties.getProperty("url")); 
//			WebDriverFactory.setMode(WebDriverFactoryMode.SINGLETON);
//			driver = WebDriverFactory.getDriver(firefox);
			
			
																
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			return driver;
			

	}
	
}
