package com.bridgelabz.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverMethod 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String title=driver.getTitle();
        System.out.println("title ="+title);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("current url="+currentUrl);
//        String pageSource=driver.getPageSource();
//        System.out.println("page source ="+pageSource);
        Thread.sleep(2000);
        driver.close();
    }
}
