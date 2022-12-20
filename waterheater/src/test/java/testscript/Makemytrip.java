package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class Makemytrip {
	WebDriver driver;
	@Test
	public void mamemytriponline()
	{
		Webdriverutility web = new Webdriverutility();
		String a ="BLR";

		driver=web.openBrowserWithApplication("chrome", 10, "https://www.makemytrip.com/");
		
		   driver.findElement(By.xpath("//input[@data-cy='fromCity']")).click();
		  
		  
		List <WebElement> lists1 = driver.findElements(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/div/div/ul/li[contains(.,'"+a+"')]"));
		for(int i=0;i<lists1.size();i++)
		{
			String text = lists1.get(i).getText();
			System.out.println(text);
			if(text.contains("BLR"))
				
			{
				lists1.get(i).click();
				
			}
		}
		driver.close();
		
	}
	
}
