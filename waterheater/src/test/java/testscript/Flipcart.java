package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genricUtility.Webdriverutility;

public class Flipcart {
	
		WebDriver driver;
		@Test
		public void main() throws InterruptedException
		{
			Webdriverutility web = new Webdriverutility();
			driver=web.openBrowserWithApplication("chrome", 10, "https://www.flipkart.com/");
			
		
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("winter heater");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//a[.='Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Hea...']")).click();
			Set<String> ids = driver.getWindowHandles();
			for(String s:ids)
			{
				driver.switchTo().window(s); 
			}
			String protext = driver.findElement(By.xpath("//span[text()=\"Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater\"]")).getText();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			Thread.sleep(3000);
			
			String protext1 = driver.findElement(By.xpath("//a[text()=\"Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater\"]")).getText();
			Assert.assertEquals(protext, protext1);
			System.out.println("Testcase is pass");
			driver.quit();
		}

	}

