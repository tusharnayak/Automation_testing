package com.bridgelabz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("trainee");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("trainee");
		Thread.sleep(3000);
		
		WebElement image=driver.findElement(By.xpath("//td[@id='logoContainer']"));
		String widthValue=image.getAttribute("width");
		System.out.println("the width="+widthValue);
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		Thread.sleep(3000);
//		WebElement login= driver.findElement(By.xpath("//a[@id='loginButton']"));
//		login.click();
		WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
		
		
		
	}

}
