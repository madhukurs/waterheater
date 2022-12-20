package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class Youtube {
	WebDriver driver;
	@Test
	
	public void searchsce()
	{
		
		Webdriverutility web = new Webdriverutility();
		
		driver=web.openBrowserWithApplication("chrome", 10, "https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("termi meri");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//a[contains(.,'\"Teri Meri Prem Kahani Bodyguard\" (Video Song) ') and @id='video-title']")).click();
		//driver.close();
	}

	
	
}
