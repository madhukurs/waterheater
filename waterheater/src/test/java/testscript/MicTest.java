package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class MicTest {
	WebDriver driver;
	@Test
	public void mictestint123()
	{
		Webdriverutility web =new Webdriverutility();
		//ChromeDriver driver = new ChromeDriver();
		driver=web.openBrowserWithApplication("chrome", 10, "https://mictests.com/");
		driver.findElement(By.xpath("//button[contains(.,'Test my mic')]")).click();
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("--disable Notification");
		//driver.close();
	}

}
