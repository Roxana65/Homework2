package utils;

import pages.BeveragesPage;
import pages.BillingDetailsPage;
import pages.BlogPage;
import pages.CartPage;
import pages.FrozenFoodsPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductPage;

public class BasePage extends BaseTest {

	public HomePage home = new HomePage(driver);
	public MyAccountPage myAccount = new MyAccountPage(driver);
	public ProductPage product = new ProductPage(driver);
	public CartPage cart = new CartPage(driver);
	public FrozenFoodsPage frozenFoods = new FrozenFoodsPage(driver);
	public BeveragesPage beverages = new BeveragesPage(driver);
	public BillingDetailsPage billingDetails = new BillingDetailsPage(driver);
	public BlogPage blog = new BlogPage(driver);

}
