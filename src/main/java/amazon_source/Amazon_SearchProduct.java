package amazon_source;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_SearchProduct
{		WebDriver driver;
	//locate each element using @FindBy
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public void searchproduct()
	{
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("shoes" + Keys.ENTER);
	}
	
	//initializing elements using pagefactory class inside constructor
	
			public Amazon_SearchProduct(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
	
	

}
