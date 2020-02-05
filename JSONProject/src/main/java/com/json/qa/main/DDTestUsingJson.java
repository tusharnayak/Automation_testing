package com.json.qa.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTestUsingJson {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	@Test(dataProvider = "dp")
	void login(String data) throws InterruptedException {
		String users[]=data.split(",");
		System.out.println(users[0]);
		System.out.println(users[1]);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(users[0]);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(users[1]);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
		
		
		
	}
	
	
	@DataProvider(name="dp")
	public String[] readJson() throws IOException, ParseException {
		JSONParser parser=new JSONParser();
		FileReader reader=new FileReader("/home/admin1/Desktop/Automation/JSONProject/JsonFiles/testData.json");
		Object obj=parser.parse(reader);
		JSONObject userLoginjsonObject=(JSONObject)obj;
		JSONArray array=(JSONArray) userLoginjsonObject.get("userlogins");
		String arr[]=new String[array.size()];
		for(int i=0;i<array.size();i++) {
			JSONObject users=(JSONObject) array.get(i);
			String user=(String) users.get("username");
			String password=(String) users.get("password");
			arr[i]=user+","+password;
			
		}
		
		return arr;
	}
}




















