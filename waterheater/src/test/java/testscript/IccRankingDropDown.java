package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class IccRankingDropDown {
	
	WebDriver driver;
	@Test
	public void IccCricket()
	{
       Webdriverutility web = new Webdriverutility();
		
		driver=web.openBrowserWithApplication("chrome", 10, "https://www.icc-cricket.com");
		driver.findElement(By.xpath("//a[contains(text(),'ICC RANKINGS')]")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> checking = handle.iterator();
		String parent = checking.next();
		String child = checking.next();
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("(//button[contains(.,'Rankings')])[1]")).click();
	}
}
