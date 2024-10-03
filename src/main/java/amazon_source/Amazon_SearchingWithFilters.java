package amazon_source;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amazon_SearchingWithFilters
{	WebDriver driver;
	
	//locate each element using @FindBy
		@FindBy(id="searchDropdownBox")
		WebElement dropdownAll;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement searchbox;
		
		@FindBy(xpath="//div[@class='a-section s-range-input-container s-lower-bound aok-relative']")
		WebElement priceslider;
		
		@FindBy(xpath="//div[@class='a-section sf-submit-range-button']")
		WebElement go;
		
		public void selectcategory()
		{
			//WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(15));
			//w1.until(ExpectedConditions.visibilityOf(dropdownAll));
			Select s1=new Select(dropdownAll);
			s1.selectByVisibleText("Books");
		}
		
		public void searchpercategory()
		{
			searchbox.sendKeys("mythological books" + Keys.ENTER);
			/*String u1=driver.getCurrentUrl();
			boolean b1 = u1.contains("books");
			Assert.assertEquals(b1, true, "result is not displayed as per category selected and search text");*/
		}
		
		public void selectprice(WebDriver driver) throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", priceslider);
			Thread.sleep(20000);
			Actions a1=new Actions(driver);
			a1.dragAndDropBy(priceslider, 90, 0).perform();
			go.click();
			String u1=driver.getCurrentUrl();
			boolean b1 = u1.contains("books");
			Assert.assertEquals(b1, true, "result is not displayed as per category selected and search text");
		}
		
		//initializing elements using pagefactory class inside constructor
		
			public Amazon_SearchingWithFilters(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
