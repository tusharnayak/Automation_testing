package com.bridgelabz.handlingframesAndActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drag2=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action =new Actions(driver);
		action.dragAndDrop(drag1, drag2).perform();
	}
}
