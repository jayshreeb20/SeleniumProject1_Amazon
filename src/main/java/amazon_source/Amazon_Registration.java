package amazon_source;

import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration 
{
	WebDriver driver ;
	Scanner sc= new Scanner(System.in);
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	WebElement createAccount;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileno;
	
	@FindBy(id="ap_password")
	WebElement pswd;
	
	@FindBy(id="continue")
	WebElement verifyno;
	
	@FindBy(xpath="//input[@id='auth-pv-enter-code']")
	WebElement otpcode;
	
	@FindBy(xpath="//input[@id='auth-verify-button']")
	WebElement accountconfirm;
	
	public void createaccount_btn()
	{
		createAccount.click();
	}
	
	public void mobileno()
	{
		mobileno.sendKeys("9004978911" + Keys.ENTER);
	}
	
	public void name()
	{
		name.sendKeys("jayshree");
	}
	
	public void password()
	{
		pswd.sendKeys("test123");
	}
	
	public void verify()
	{
		verifyno.click();
	}
	
	public void otpcodeInput()
	{
		System.out.println("Enter OTP");
		String otp= sc.next();
		otpcode.sendKeys(otp);
		
		
	}
	
	public void createAccountbtn()
	{
		accountconfirm.click();
	}
	
	//initializing elements using pagefactory class inside constructor
	
			public Amazon_Registration(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


