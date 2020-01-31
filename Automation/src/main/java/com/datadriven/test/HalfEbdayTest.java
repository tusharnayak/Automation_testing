package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;
public class HalfEbdayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testData=TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	
	@Test(dataProvider = "getTestData")
	public void halfEbayTest(String firstname,String lastname,String emailId,String passWord) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(passWord);
		Thread.sleep(1000);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}