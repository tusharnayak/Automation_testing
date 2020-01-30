package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement drag1=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		WebElement drag2=driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.dragAndDrop(drag1, drag2).perform();
	}
}
