package testscript;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genricUtility.SearchBox;
import genricUtility.Webdriverutility;

public class GoogleSearch  {
	WebDriver driver;
	@Test
	public void searchname() throws InterruptedException
	{
		Webdriverutility web= new Webdriverutility();
		SearchBox ser= new SearchBox(driver);
		driver=web.openBrowserWithApplication("chrome", 3, "https://www.google.co.in/");
		Thread.sleep(10);
		driver.findElement(By.name("q")).sendKeys("madhuk");

		List<WebElement> listt = driver.findElements(By.xpath("//span[text()=\"K. Madhukar Shetty\"]"));
		
		TreeSet<Object> tr = new TreeSet<Object>();
		for(WebElement st:listt)
		{
		      tr.add(st.getText())  ;
		      System.out.println(tr);
		}
		//System.out.println(tr);

	}
}
