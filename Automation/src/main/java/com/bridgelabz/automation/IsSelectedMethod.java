package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();

		if(checkBox.isSelected()) {
			System.out.println("checkbox has already selected");
		}
		else {
			System.out.println("check box is not selected");
//			checkBox.click();
		}
	}
}