package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public abstract class BasePage {
public WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver,10);

public BasePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void verifyTitle(String eTitle)
{
	try{
		wait.until(ExpectedConditions.titleContains(eTitle));
		Reporter.log("title is matching");
	}
	catch(Exception e)
	{
		Reporter.log("Title is not matching");
		Assert.fail();
	}
}
public void verifyElementIsPresent(WebElement element)
{
	try{
wait.until(ExpectedConditions.visibilityOf(element));
Reporter.log("title is matching");
	}
	catch(Exception e)
	{
		Reporter.log("Title is not matching");
		Assert.fail();
	}
}
}
