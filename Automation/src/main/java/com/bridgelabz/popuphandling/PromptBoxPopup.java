package com.bridgelabz.popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBoxPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		WebElement promptBox=driver.findElement(By.xpath("//input[@name='B3']"));
		promptBox.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		alert.sendKeys("tusharnayak");
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();    //to cancel the pop up
	}
}
