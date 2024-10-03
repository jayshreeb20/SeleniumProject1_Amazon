package amazon_source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class Amazon_login extends Amazon_DDT
{
	//ChromeDriver driver;
	
	//locate each element using @FindBy
	@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
	WebElement account;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signin ;
	
	@FindBy(name="email")
	WebElement enterid;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[1]")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement finalsignin;
	
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
	
	
	public void emailid()
	{
		
		//enterid.sendKeys(usn);
		enterid.sendKeys("9820116221");
	}
	
	public void button()
	{
		continuebutton.click();
	}
	
	public void password()
	{
		//pwd.sendKeys(pass);
		pwd.sendKeys("ojal@2011");
	}
	
	public void signin()
	{
		finalsignin.click();
	}
	
	//initializing elements using pagefactory class inside constructor
	
		public Amazon_login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	
	
	
	
	
	
	

}
