
package genricUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriverutility {
/*This method is used to launch the browser
 * @param browser
 * @return
 */

WebDriver dri;

 public WebDriver launchBrowser(String browser) {



switch(browser) {
case "chrome":
WebDriverManager.chromedriver().setup();
dri=new ChromeDriver();
break;
case "firefox":
WebDriverManager.firefoxdriver().setup();
dri=new FirefoxDriver();
default:
System.out.println("YOU ENTERED WRONG KEYS");
break;

}
return dri;

 }
 
 

/* This method is used to maximize the browser
 * @param driver
 */

public static  void maximizeBrowser(WebDriver driver) {
driver.manage().window().maximize();

}

public static void waitTillPageLoad(WebDriver driver,long Timeout) {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
/*/This method is used to open the application
 * @param browser
 * @param longTimeout
 * @param url
 *
 */

public static void navigateApplication (WebDriver driver,String url) {
driver.get(url);
}
/*/This method is used to launch browser,maximize browser,wait page implicitly,navigate application
 * @param browser
 * @ @param longTimeout
 * @param url
 * @return
 *
 *
 */

public  WebDriver openBrowserWithApplication(String browser,long longTimeout,String url)
{
launchBrowser(browser);
maximizeBrowser(dri);
waitTillPageLoad(dri,longTimeout);
navigateApplication(dri,url);
return dri;
}

/*/this method is used to MouseHoverAction
 *
 *
 *
 */

public WebDriver MouseHoverAction(WebDriver driver,WebElement element)
{
new Actions(driver).moveToElement(element).perform();
return driver;



}

public WebDriver doubleclick(WebDriver driver,WebElement element)
{
new Actions(driver).doubleClick(element).perform();
return driver;
}

public void closeBrowser(WebDriver driver)
{
driver.quit();
}
 
public  void handlingdropdown( WebElement element, String text)
{
	Select sec = new Select(element);
	sec.selectByVisibleText(text);
	
}

public void handlingpopul(WebDriver driver)
{
	 Alert pop1= driver.switchTo().alert();
     pop1.accept();

}

public void closingapplication(WebDriver driver) 
{
	driver.close();
	
}
public WebElement  convertdyamicelementtowebelement( String dynamicname,WebDriver dri)
{
String requriedname = null;
	
	 WebElement element = dri.findElement(By.name(requriedname));
	return element;
}
}



	







































































































































































































































































































































































































































































































































































































































































































































