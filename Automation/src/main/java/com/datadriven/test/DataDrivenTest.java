package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.XlsReader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {
		//Getting test data from excel sheet
		XlsReader reader = new XlsReader(
				"/home/admin1/Desktop/Automation/Automation/src/main/java/com/test/data/ebayTestData.xlsx");
		String firstName = reader.getCellData("RegdTestData", "firstName", 2);
		System.out.println(firstName);
		String lastName = reader.getCellData("RegdTestData", "lastName", 2);
		System.out.println(lastName);
		String email = reader.getCellData("RegdTestData", "email", 2);
		System.out.println(email);
		String password = reader.getCellData("RegdTestData", "password", 2);
		System.out.println(password);
		
		//Web driver code
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
		Thread.sleep(2000);
		
		
		
		

	}

}
