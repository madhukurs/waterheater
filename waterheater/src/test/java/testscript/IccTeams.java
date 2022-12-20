package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class IccTeams {
	WebDriver driver;
	@Test
	public void team()
	{
		 Webdriverutility web = new Webdriverutility();
			
			driver=web.openBrowserWithApplication("chrome", 10, "https://www.icc-cricket.com");
			driver.findElement(By.xpath("//a[contains(text(),'ICC RANKINGS')]")).click();
			Set<String> dt = driver.getWindowHandles();
		      Iterator<String> win = dt.iterator();
		    String parentid = win.next();
		  String childid = win.next();
			
			driver.switchTo().window(childid);
			driver.get("https://www.icc-cricket.com/teams/men");
			
			driver.findElement(By.xpath("(//a[contains(.,'Teams')])[1]")).click();
			
	}

}
