package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Amazon_SearchProduct;

public class Amazon_SearchProduct_TestCase5 extends Amazon_login_TestCase2
{
	@Test
	
	public void searchproduct()
	{
		
		Amazon_SearchProduct s1= new Amazon_SearchProduct(driver); 
		s1.searchproduct();
		
	}
	
	
	
	
	

}
