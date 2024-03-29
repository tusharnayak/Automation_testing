package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyErrorMessageAndColor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(3000);
//		WebElement errorMessage=driver.findElement(By.xpath("//span[@class='errormsg']"));
		WebElement errorMessage = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String errMsg = errorMessage.getText();
		System.out.println(errMsg);
		String color = errorMessage.getCssValue("color");
		System.out.println(color);
		String colorHexadecimal = Color.fromString(color).asHex();
		System.out.println("color hexadecimal format=" + colorHexadecimal);
		if (colorHexadecimal.equals("#ce0100")) {
			System.out.println("the color is in red");

		} else {
			System.out.println("color is not in red");
		}
		String fontSize=errorMessage.getCssValue("font-size");
		System.out.println("font size="+fontSize);
		String fontWeight=errorMessage.getCssValue("font-weight");
		System.out.println("font weight ="+fontWeight);
		
		
		
		
		
		
		
		
		
		
	}
}
