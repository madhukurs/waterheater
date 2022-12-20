package interview;
//nhv
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class Irctc {

	WebDriver driver;
	@Test
	public void train()
	{
		//WebDriver driver;

		Webdriverutility web = new Webdriverutility();
		driver = web.openBrowserWithApplication("chrome", 10, "https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("madhukurs@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("password")).sendKeys("9964508269");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
	}

}
