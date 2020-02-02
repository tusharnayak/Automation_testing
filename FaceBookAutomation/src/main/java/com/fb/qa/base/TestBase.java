package com.fb.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fb.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"/home/admin1/Desktop/Automation/FaceBookAutomation/src/main/java/com/fb/qa/config/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(option);
			driver.manage().window().maximize();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/home/admin1/Downloads/geckodriver_linux64/geckodriver");
			driver=new FirefoxDriver();
	}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	}
	
	
	public void failed(String testMethod) throws IOException
	{
	Date date1 = new Date();
	String date2 = date1.toString();
	System.out.println(date1);
	String date3 = date2.replaceAll(":", "_");

	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("/home/admin1/Desktop/Automation/FaceBookAutomation/Screenshot/"+date3+"FailedTest.png");
	FileUtils.copyFile(srcFile, destFile);
	}
	
	

}
