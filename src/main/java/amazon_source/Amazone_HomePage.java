package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazone_HomePage 
{
	     WebDriver driver;
		//locate each element using @FindBy
		
		@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
		WebElement account;
		
		@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
		WebElement signin ;
		
		public void accounthover(WebDriver driver)
		{
			Actions a1= new Actions(driver);
			a1.moveToElement(account).perform();
			//account.click();
		}
		
		public void signinbtn()
		{
			signin.click();
		}
	
		//initializing elements using pagefactory class inside constructor
		
			public Amazone_HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
	

}
