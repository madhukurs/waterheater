package testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {
	@Test

	public void traln()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver diver=new ChromeDriver();

		diver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		diver.manage().window().maximize();
		diver.navigate().to("https://www.irctc.co.in/nget/train-search");
		diver.findElement(By.id("journeyQuota")).click();

	List<WebElement >drop = diver.findElements(By.xpath("//li[@aria-label='LADIES']/span"));
		System.out.println(drop);
//		for(WebElement dr:drop)
//		{System.out.println(dr.getText().trim());
//		if(dr.getText().trim().equals("LADIES"))
//		{
//			dr.click();
//			System.out.println("passed");
//			break;
//		}
		
		WebElement checkbox = diver.findElement(By.xpath("//label[text()='Flexible With Date']"));
		boolean check = checkbox.isSelected();
		if(check==false)
		{
			checkbox.click();
		}
		diver.findElement(By.id("origin")).click();
		diver.findElement(By.xpath("//span[text()='MYSURU JN - MYS']")).click();
		
		List<WebElement> frames = diver.findElements(By.xpath("//iframe"));
		System.out.println(frames.size());
		             for(WebElement fr:frames)
		             {
		              	 System.out.println(fr.getAttribute("id"));
		             }


		//diver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
	}
}


