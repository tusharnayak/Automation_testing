package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		String toolKitText=checkBox.getAttribute("title");
		System.out.println(toolKitText);
		
	}

}
