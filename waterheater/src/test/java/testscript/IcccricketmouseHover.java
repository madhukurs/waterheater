package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class IcccricketmouseHover {
	WebDriver driver;
	@Test
	public void WomenCricket()
	{
		Webdriverutility web = new Webdriverutility();
		driver=web.openBrowserWithApplication("chrome", 3, "https://www.icc-cricket.com/");
		WebElement moouseHover = driver.findElement(By.xpath("//a[contains(.,' ICC RANKINGS')]"));
		web.MouseHoverAction(driver, moouseHover);
		moouseHover.click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> itret = handle.iterator();
		String parent = itret.next();
		String child = itret.next();

		driver.switchTo().window(child);
		driver.findElement(By.xpath("//a[text()=\"Women's\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
	}

}
