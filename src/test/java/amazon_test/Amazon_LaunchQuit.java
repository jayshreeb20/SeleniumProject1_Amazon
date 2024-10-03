package amazon_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(amazon_test.Listeners_Test.class)

public class Amazon_LaunchQuit extends Listeners_Test
{
	//WebDriver driver;
	
	@BeforeMethod
	
	public void amazon_launch() throws InterruptedException
	{
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/*@AfterMethod
	
	public void amazon_quit()
	{
		driver.quit();
	}*/
	
	
	
	
	
	
	
	
	

}
