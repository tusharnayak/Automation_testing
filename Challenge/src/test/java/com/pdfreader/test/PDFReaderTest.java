package com.pdfreader.test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest {
	@Test
	public void readPdfTest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://foersom.com/net/HowTo/data/OoPdfFormExample.pdf");
		String currentUrl=driver.getCurrentUrl();
		
		URL url=new URL(currentUrl);
		InputStream is=url.openStream();
		BufferedInputStream fileParse=new BufferedInputStream(is);
		PDDocument document=null;
		document=PDDocument.load(fileParse);
		String pdfContent=new PDFTextStripper().getText(document);// it is not necessary
		System.out.println(pdfContent);
		
		Assert.assertTrue(pdfContent.contains("Given Name:"));
		Assert.assertTrue(pdfContent.contains("Address 2:"));
		Assert.assertTrue(pdfContent.contains("Country:"));

		
		
	}
}








