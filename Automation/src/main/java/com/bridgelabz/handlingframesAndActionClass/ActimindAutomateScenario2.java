package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActimindAutomateScenario2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");
		WebElement element=driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		WebElement msOfficePl=driver.findElement(By.xpath("//a[contains(text(),'MS Office Plug-ins')]"));
		action.moveToElement(msOfficePl).click().perform();
	}
}
