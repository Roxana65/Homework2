package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class PlaceAnOrderRegisteredCustomerTest extends BaseTest {

	@Test
	public void placeOrder() throws InterruptedException {
		page.home.clickOn(page.home.myAccountButton);
		page.myAccount.loginMethod("customer", "customer@123");
		Thread.sleep(2000);
		page.home.searchProduct("pretzels");
		Thread.sleep(2000);
		page.home.clickOn(page.product.addToCartButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.product.cartMessage));

		assertTrue(page.product.cartMessage.isDisplayed());

		page.home.clickOn(page.cart.cartIcon);
		page.home.clickOn(page.cart.plusButton);
		Thread.sleep(4000);
		assertEquals(page.cart.subtotal.getText(), page.cart.total.getText());
		page.home.clickOn(page.cart.checkoutButton);
		page.home.clickOn(page.cart.conditionsButton);
		page.home.clickOn(page.cart.placeOrderButton);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(page.cart.confirmationMessage));

		assertTrue(page.cart.confirmationMessage.isDisplayed());
		assertTrue(page.cart.orderNumber.isDisplayed());

	}
}
