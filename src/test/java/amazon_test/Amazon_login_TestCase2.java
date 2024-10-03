package amazon_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon_source.Amazon_login;

public class Amazon_login_TestCase2 extends Amazon_LaunchQuit
{
	
	//@Test
	@BeforeMethod
	
	public void login() throws InterruptedException
	{
		Amazon_login l1= new Amazon_login(driver);
		l1.accounthover(driver);
		l1.signinbtn();
		l1.emailid();
		l1.button();
		l1.password();
		l1.signin();
	
	
	
	
	
	
	
	
	

}
}
