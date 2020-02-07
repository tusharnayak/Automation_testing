package com.bridgelabz.popuphandling;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FileDownloadPopUp {

	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");

		// Create Hashmap object and assign the profile settings
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "/home/admin1/Desktop/FileDownload");

		// Assign this chromePrefs object with ChromeOptions object
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		// Create Capability object and assign to the option object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
	}

}
