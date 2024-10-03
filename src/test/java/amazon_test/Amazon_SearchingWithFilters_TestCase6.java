package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Amazon_SearchingWithFilters;

public class Amazon_SearchingWithFilters_TestCase6 extends Amazon_login_TestCase2

{
	@Test
	
	public void searchbycategory() throws InterruptedException
	{
	Amazon_SearchingWithFilters a2 = new Amazon_SearchingWithFilters(driver);
	a2.selectcategory();
	a2.searchpercategory();
	//a2.selectprice(driver);
	
	}
	
	
	
	
	
	
	

}
