package genricUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseClass1  
{
	
	WebDriver dri;
	@Test()
	
	public void filpcart()
	{
	Webdriverutility web =new Webdriverutility();
	Excelfile fil= new Excelfile();
	
	WebDriver dri;
	dri=web.openBrowserWithApplication("chrome",10,"https://www.flipkart.com/");
	dri.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	dri.findElement(By.name("q")).sendKeys("waterheater");
	dri.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	dri.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	dri.findElement(By.xpath(("(//div[@class='_4rR01T'])[1]"))).click();
	
	
	
}
}
