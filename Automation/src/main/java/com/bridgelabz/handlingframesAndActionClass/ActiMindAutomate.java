package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiMindAutomate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");
		WebElement element = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		WebElement cloudApplication = driver.findElement(By.linkText("Cloud Applications"));
		action.moveToElement(cloudApplication).click().perform();
	}
}
