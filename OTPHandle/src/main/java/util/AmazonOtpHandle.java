package util;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOtpHandle {

	public static final String ACCOUNT_SID = "*****************************";
	public static final String AUTH_TOKEN = "*******************************";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']//a[@class='nav-a'][contains(text(),'Start here.')]")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("tushar nayak");
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//ul[@role='application']//li//a[text()='United States +1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("*******");
		driver.findElement(By.id("ap_password")).sendKeys("*******");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody=getMessage();
		System.out.println("the OTP is:"+smsBody);
		
		driver.findElement(By.id("auth-pv-enter-code")).sendKeys(smsBody);
	}
	public static String getMessage() {
		return getMessages().filter(m->m.getDirection().compareTo(Message.Direction.INBOUND)==0).filter(m->m.getTo().equals("+17205864759")).map(Message::getBody).findFirst().orElseThrow(IllegalStateException::new);
				}
	
	
	private static Stream<Message>getMessages(){
		ResourceSet<Message>messages=Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}
}

















