package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.XlsReader;

public class ParameterizeTest {
	public static void main(String[] args) throws InterruptedException {
		XlsReader reader = new XlsReader(
				"/home/admin1/Desktop/Automation/Automation/src/main/java/com/test/data/ebayTestData.xlsx");
		int rowCount=reader.getRowCount("RegdTestData");
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		Thread.sleep(3000);
		reader.addColumn("RegdTestData", "status");
		for(int row=2;row<=rowCount;row++) {
			System.out.println("====================");
			String firstName=reader.getCellData("RegdTestData", " firstName", row);
			System.out.println(firstName);
			String lastName = reader.getCellData("RegdTestData", "lastName", row);
			System.out.println(lastName);
			String email = reader.getCellData("RegdTestData", "email", row);
			System.out.println(email);
			String password = reader.getCellData("RegdTestData", "password", row);
			System.out.println(password);
			
			//enter the data
			driver.findElement(By.xpath("//input[@id='firstname']")).clear();
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='lastname']")).clear();
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
			Thread.sleep(1000);
			reader.setCellData("RegdTestData", "status", row, "pass"); //write data into cell
		} 
	}
}