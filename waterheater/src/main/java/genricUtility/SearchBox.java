package genricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchBox {

	@FindBy(name="q")
	private WebElement search;
	
	public SearchBox(WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	
	public void serach(String text)
	{
		search.sendKeys(text);
		
	}
	

}
