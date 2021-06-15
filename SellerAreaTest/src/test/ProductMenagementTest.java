package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Edit;
import pages.Home;
import pages.LogIn;
import pages.Products;

public class ProductMenagementTest extends TestUtility{
	
	@BeforeMethod
	public void logIn() {
		String userName = "Marko1234";
		String password = "urfia@35#VpWbWT";
		
		LogIn.logIn(userName, password, driver);
		
	}

	@Test (priority = 1)
	public void addProducts() {
		int numProducts = 5;
		Home.goToProductsTab(driver);
		Products.goToAddNewProduct(driver);
		Products.addMultipleNewProducts(numProducts, driver);
		
		Assert.assertEquals(Products.productsCount(driver), numProducts+"");
	}
	
	@Test (priority = 2)
	public void priceChange() {
		int num = 5;
		int priceRise = 100;
		Home.goToProductsTab(driver);
		Products.goToEdit(driver);
		Assert.assertTrue(Edit.priceChange(num, priceRise, driver));
		
	}
}
