package com.qa.hs.keyword.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.hs.keyword.base.Base;

public class KeyWordEngine extends Base{
//	public WebDriver driver;
	public Properties prop;

	public static Workbook book;
	public static Sheet sheet;
	public Base base;

	public final String SCENARIO_SHEET_PATH = "/home/admin1/Desktop/Automation/KeyWordDrivenFaceBook/src/main/java/com/qa/hs/keyword/scenario/keyWord.xlsx";

	public void startExecution(String sheetName) {
		String locatorName = null;
		String locatorValue = null;
		FileInputStream file = null;

		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		int k = 0;

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			try {
				String locatorColValue = sheet.getRow(i + 1).getCell(k + 1).toString().trim(); // id=userName
				if (!locatorColValue.equalsIgnoreCase("NA")) {
					locatorName = locatorColValue.split("=")[0].trim();// 0 means the 1st value e.g:(id="pass"..id=0
																		// pass=1)
					locatorValue = locatorColValue.split("=")[1].trim();// 1 means the second value
				}
				String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
				String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();

				System.out.println("actions::"+action);
				System.out.println("value::"+value);
				System.out.println("locator name::"+locatorName);
				System.out.println("locator value::"+locatorValue);
				
				
				switch (action) {
				case "openbrowser":
					base = new Base();
					
						prop = base.init_properties();

					
					if (value.isEmpty() || value.equals("NA")) {
						driver = base.init_driver(prop.getProperty("browser"));
					} else {
						driver = base.init_driver(value);
					}
					break;

				case "enterurl":

					if (value.isEmpty() || value.equals("NA")) {
						driver.get(prop.getProperty("url"));
					} else {
						driver.get(value);
					}
					break;

				case "quit":
					driver.quit();
					break;

				default:
					break;
				}

				switch (locatorName) {
				case "id":
					System.out.println("0");
					Thread.sleep(3000);
					System.out.println("1");
					WebElement element = driver.findElement(By.id(locatorValue));
					Thread.sleep(3000);
					System.out.println("2");
					if (action.equalsIgnoreCase("sendKeys")) {
						element.clear();
						element.sendKeys(value);
					} 
					
						else if (action.equalsIgnoreCase("click")) 
						{
						element.click();
						}
					//locatorName = null;

					break;

				default:
					break;
				}

			} catch (Exception e) {

			}
		}

	}

}
